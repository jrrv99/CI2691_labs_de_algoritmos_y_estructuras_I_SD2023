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

    /*@ requires 0 <= sec.length <= Integer.MAX_VALUE;
      @ requires (\forall int k; 0 <= k && k < sec.length; 0 <= sec[k] && sec[k] < sec.length);
      @ ensures \result == true <== (\forall int k; 0 <= k && k < sec.length; (\exists int j; 0 <= j && j < sec.length; sec[j] == k));
      @*/
    public static /*@ pure @*/ boolean esPermutacion(int[] sec) {
        boolean[] is = new boolean[sec.length];
        int i = 0;

        //@ maintaining 0 <= i <= sec.length;
        //@ maintaining (\forall int k; 0 <= k && k < sec.length; is[k] == (\exists int j; 0 <= j && j < i; sec[j] == k));
        //@ decreasing sec.length - i;
        while (i < sec.length) {
            int num = sec[i];
            if (num < 0 || num >= sec.length) {
                return false;
            }
            is[num] = true;

            i++;
        }

        return true;
    }

    public static int startSumaMaxima = 0; // p
    public static int endSumaMaxima = 0; //q
    /*@ ensures sec != null;
      @ ensures 0 < sec.length <= Integer.MAX_VALUE;
      @ ensures \result == (\sum int i; startSumaMaxima <= i && i < endSumaMaxima; sec[i]);
      @*/
    public static /*@ pure @*/ int sumaMaxima(int[] sec) {
        int currentSum = 0,
            maxSum = 0,
            i = 0;

        //@ maintaining 0 <= i <= sec.length;
        //@ maintaining maxSum == (\sum int k; startSumaMaxima <= k && k < endSumaMaxima; sec[k]);
        //@ decreasing sec.length - i;
        while (i < sec.length) {
            currentSum += sec[i];

            if (currentSum < 0) {
                currentSum = 0;
                startSumaMaxima = incremento(i);
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                endSumaMaxima = incremento(i);
            }

            i++;
        }

        //@ assume maxSum >= 0;
        return maxSum;
    }

    /*@ requires matriz != null;
      @ requires 0 < matriz.length <= Integer.MAX_VALUE;
      @ requires (\forall int k; 0 <= k && k < matriz.length; matriz[k].length == matriz.length);
      @ ensures \result == true <== (\forall int i; 0 <= i && i < matriz.length; (\forall int j; 0 <= j && j <= matriz.length; matriz[i][j] == matriz[j][i]));
      @*/
    public static /*@ pure @*/ boolean esMatrizSimetrica(int[][] matriz) {
        int row = 0, column = 0;

        //@ maintaining 0 <= row <= matriz.length;
        //@ maintaining true <== (\forall int i; 0 <= i && i < row; (\forall int j; 0 <= j && j <= column; matriz[i][j] == matriz[j][i]));
        // decreasing matriz.length - row;
        while (row < matriz.length) {
            column = 0;

            //@ maintaining 0 <= column <= matriz[row].length;
            //@ maintaining true <== (\forall int j; 0 <= j && j <= column; matriz[row][j] == matriz[j][row]);
            //@ decreasing matriz[row].length - column;
            while (column < matriz.length) {
                if (matriz[row][column] != matriz[column][row]) return false;
                column++;
            }
            row++;
        }

        return true;
    }

    public static /*@ pure @*/ boolean esMatrizTrigangularSuperior(int[][] matriz) {
        int row = 0, column;
        while (row < matriz.length) {
            column = row;
            while (column < matriz.length) {
                if (row == column && matriz[row][column] == 0) return false;
                if (row == column) continue;

                if ((matriz[row][column] == 0) || (matriz[column][row] != 0)) {
                    return false;
                }
                column++;
            }
            row++;
        }

        return true;
    }

    public static /*@ pure @*/ boolean esMatrizTrigangularInferior(int[][] matriz) {
        int row = 0, column;
        while (row < matriz.length) {
            column = row;
            while (column < matriz.length) {
                if (row == column && matriz[row][column] == 0) return false;
                if (row == column) continue;

                if ((matriz[row][column] != 0) || (matriz[column][row] == 0)) {
                    return false;
                }
                column++;
            }
            row++;
        }

        return true;
    }
}
