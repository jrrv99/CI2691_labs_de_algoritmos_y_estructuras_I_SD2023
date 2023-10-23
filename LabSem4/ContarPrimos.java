class ContarPrimos {
    //@ requires sec != null;
    //@ requires (\forall int k; 0 <= k && k < sec.length; sec[k] > 0);
    //ensures \result == (\num_of int i; 0 < i && i <= sec.length; (\forall int k; 2 < k && k < sec[i]; sec[i]%k != 0));
    public static int contarPrimos (int[] sec) {
        int i = 0, divider = 2, count = 0;

        //@ maintaining 0 <= i && i <= sec.length;
        //@ decrease sec.length - i
        while (i < sec.length){
            if (sec[i] <= 1) continue; // No es primo

            //@ maintaining 2 <= divider && divider <= sec[i] + 1;
            //@ maintaining (\forall int k; 1 < k && k < i; sec[i]%k != 0);
            //@ decrease sec[i] - divider;
            while (divider < sec[i]) {
                if (sec[i] % divider == 0) { // No es primo
                    divider = -1;
                    break;
                }

                divider++;
            }
            if (divider != -1) count++; // Es Primo
            divider = 2; // reset

            i++;
        }

        return count;
    }
}