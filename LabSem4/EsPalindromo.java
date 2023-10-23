class EsPalindromo {
    //@ requires sec != null;
    //@ ensures \result == (\forall int j; 0 <= j && j < (sec.length / 2); sec[j] == sec[(sec.length - 1) - j]);
    public static boolean esPalindromo(char[] sec) {
        int i = 0;

        //@ maintaining 0 <= i <= ((sec.length)/ 2);
		//@ maintaining (\forall int j; 0 <= j && j <= i; sec[i] == sec[(sec.length - 1) - j]);
        //@ decreases sec.length/2 - i;
        while(i < sec.length / 2) {
            if (sec[i] != sec[(sec.length - 1) - i]) return false;

            i++;
        }

        return true;
    }
}