public class Utilidades {
    /*@ requires Integer.MIN_VALUE <= n < Integer.MAX_VALUE;
      @ ensures Integer.MIN_VALUE <= \result <= Integer.MAX_VALUE; 
      @ ensures \result == n + 1;
      @*/
    public static /*@ pure @*/  int incremento(int n) {
	    return n + 1;
    }
    
    /*@ requires 1 <= exp < 6;
      @ requires -10 <= base < 10;
      @ ensures Integer.MIN_VALUE <= \result <= Integer.MAX_VALUE;
      @ ensures \result == base * spec_exponenciar(base, exp-1);
      @ also
      @ requires exp == 0;
      @ ensures \result == 1;
      @ public static model pure int spec_exponenciar(int base, int exp) {
      @	if (exp == 0) 
      @	    return 1;
      @	 else 
      @	    return base*spec_exponenciar(base, exp-1);
      @ }

      @ requires 0 <= exp < 6;
      @ requires -10 <= base < 10;
      @ ensures Integer.MIN_VALUE <= \result <= Integer.MAX_VALUE;
      @ ensures \result == spec_exponenciar(base, exp);
      @*/
    public static /*@ pure @*/ int exponenciar(int base, int exp) {
        if (exp == 0)
            return 1;
        int resultado = base;
        int i = 1;

        //@ maintaining 1 <= i <= exp;
        //@ maintaining Integer.MIN_VALUE < resultado < Integer.MAX_VALUE;
        //@ maintaining resultado == spec_exponenciar(base, i);
        //@ decreasing exp - i;
        while (exp > i) {
            i = incremento(i);
            resultado = base * resultado;
        }
        return resultado;
    }

    /*@ requires 0 <= year <= Integer.MAX_VALUE;
      @ ensures \result == (year % 4 == 0 & !(year % 100 == 0 & year % 400 != 0));
      @*/
    public static /*@ pure */ boolean esAnioBisiesto(int year) {
        return (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0));
    }

    /*@ requires 0 < year <= Integer.MAX_VALUE;
      @ requires 1 <= month <= 12;
      @ ensures \result == 29 <== (month == 2) && (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0) == true);
      @ ensures \result == 28 <== (month == 2) && (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0) == false);
      @ ensures \result == 30 <== (month != 2) && (month == 4 || month == 6 || month == 9 || month == 11);
      @ ensures \result == 31 <== (month != 2) && !(month == 4 || month == 6 || month == 9 || month == 11);
      @*/
    public static /*@ pure */ int getLastDayOfMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month == 2 && esAnioBisiesto(year)) {
            return 29;
        }
        
        return daysInMonth[month - 1];
    }

    /*@ requires Integer.MIN_VALUE <= n <= Integer.MAX_VALUE;
      @ requires Integer.MIN_VALUE <= m <= Integer.MAX_VALUE && m != 0;
      @ ensures \result == (n % m == 0);
      @*/
    public static /*@ pure @*/ boolean esDivisor(int n, int m) {
        return n % m == 0;
    }

    /*@ requires 1 < n <= Integer.MAX_VALUE;
      @ ensures \result == (\forall int k; 2 <= k && k < n; n % k != 0);
      @*/
    public static /*@ pure @*/ boolean esPrimo(int n) {
        int i = 2;

        if (n < 2) return false;

        /*@ maintaining 2 <= i <= n;
          @ maintaining (\forall int k; 2 <= k && k < i; n % k != 0);
          @ decreasing n - i;
          @*/
        while (i < n) {
            if (n % i ==0) return false;
            i++;
        }
        return true;
    }

    /*@ requires 0 < year1 <= Integer.MAX_VALUE;
      @ requires 0 < year2 <= Integer.MAX_VALUE;
      @ requires 1 <= month1 <= 12;
      @ requires 1 <= month2 <= 12;
      @ requires 1 <= day1 <= 31;
      @ requires 1 <= day2 <= 31;
      @ requires year1 == year2 ? month2 <= month1 && (month1 == month2 ? day2 <= day1 : true) : true;
      @ ensures \result != null;
      @ ensures \result instanceof int[];
      @ ensures \result.length == 3;
      @*/
    public static /*@ pure */ int[] diferenciaEntreFechas (
        int day1, int month1, int year1,
        int day2, int month2, int year2
    ) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int lastDayOfPreviousMonth;
        int[] diff = new int[3]; // [DD, MM, YYYY]

        diff[0] = year1 - year2;
        diff[1] = month1 - month2;
        diff[2] = day1 - day2;

        if (diff[1] < 0) {
            diff[0]--; // down a year
            diff[1] += 12; // move the cursor 12 months back
        }

        if (diff[2] < 0) {
            diff[1]--; // down a month
            diff[2] += (month1 == 2 && esAnioBisiesto(year1)) ? 29 : daysInMonth[month1 - 1];  // move the cursor the days length of previous month back
        }
        
        return diff;
    }

    //@ requires a.length > 0;
    //@ ensures \result == (\forall int j; 0 <= j && j < (a.length - 1); a[j] <= a[j + 1]);
    public static /*@ pure @*/ boolean estaOrdenadoAscendente(int[] a) {
        int i = 1;

        //@ maintaining 0 < i <= a.length;
        //@ maintaining (\forall int j; 0 < j && j < i; a[j - 1] <= a[j]);
        //@ decreases a.length - i;
        while (i < a.length) {
            if (a[i - 1] > a [i]) return false;
            i = i +1;
        }
        return true;
    }

    //@ requires a.length > 0;
    //@ ensures \result == (\forall int j; 0 <= j && j < (a.length - 1); a[j] >= a[j + 1]);
    public static /*@ pure @*/ boolean estaOrdenadoDescendente(int[] a) {
        int i = 1;

        //@ maintaining 0 < i <= a.length;
        //@ maintaining (\forall int j; 0 < j && j < i; a[j - 1] >= a[j]);
        //@ decreases a.length - i;
        while (i < a.length) {
            if (a[i - 1] < a [i]) return false;
            i = i +1;
        }
        return true;
    }
}
