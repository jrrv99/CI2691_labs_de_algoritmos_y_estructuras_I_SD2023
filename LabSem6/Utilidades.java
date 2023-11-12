public class Utilidades {

    //@ requires Integer.MIN_VALUE <= n < Integer.MAX_VALUE;
    //@ ensures Integer.MIN_VALUE <= \result <= Integer.MAX_VALUE; 
    //@ ensures \result == n + 1;
    public static /*@ pure @*/  int incremento(int n) {
	    return n + 1;
    }
    
    //@ requires 1 <= exp < 6;
    //@ requires -10 <= base < 10;
    //@ ensures Integer.MIN_VALUE <= \result <= Integer.MAX_VALUE;
    //@ ensures \result == base * spec_exponenciar(base, exp-1);
    //@ also
    //@ requires exp == 0;
    //@ ensures \result == 1;
    //@ public static model pure int spec_exponenciar(int base, int exp) {
    //@	if (exp == 0) 
    //@	    return 1;
    //@	 else 
    //@	    return base*spec_exponenciar(base, exp-1);
    //@ }

    //@ requires 0 <= exp < 6;
    //@ requires -10 <= base < 10;
    //@ ensures Integer.MIN_VALUE <= \result <= Integer.MAX_VALUE;
    //@ ensures \result == spec_exponenciar(base, exp);
    public static /*@ pure @*/ int exponenciar(int base, int exp) {
        if (exp == 0)
            return 1;
        int resultado = base;
        int i = 1;

        //@ maintaining 1 <= i <= exp;
        //@ maintaining Integer.MIN_VALUE < resultado < Integer.MAX_VALUE;
        //@ maintaining resultado == spec_exponenciar(base, i);
        //@ decreases exp - i;
        while (exp > i) {
            i = incremento(i);
            resultado = base * resultado;
        }
        return resultado;
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
}
