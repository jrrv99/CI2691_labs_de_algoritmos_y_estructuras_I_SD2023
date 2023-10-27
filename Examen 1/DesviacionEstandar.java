class DesviacionEstandar {
    public static double mediaAritmetica = 0.0;

    //@ requires S != null;
    //@ requires S.length > 0;
    //@ ensures mediaAritmetica == ((\sum int i; 0 <= i && i < S.length; S[i])/S.length);
    //@ ensures \result == Math.sqrt((\sum int i; 0 <= i && i < S.length; Math.pow(S[i] - ((\sum int j; 0 <= j && j < S.length; S[j])/S.length), 2)) / S.length);
    public static double desviacionEstandar (int[] S) {
        int N = S.length, i = 0;
        double desviacionEstandar = 0.0, diferencia;

        //@ maintaining 0 <= i && i <= N;
        //@ maintaining mediaAritmetica == (\sum int j; 0 <= j && j <= i; S[i]);
        //@ decreasing N - i;
        while (i < N) {
            mediaAritmetica += S[i];
            i++;
        }

        mediaAritmetica = mediaAritmetica / N;
        i=0;

        //@ maintaining 0 <= i && i <= N;
        //@ maintaining desviacionEstandar == (\sum int j; 0 <= j && j <= i; Math.pow(diferencia, 2));
        //@ decreasing N - i;
        while (i < N) {
            diferencia = S[i] - mediaAritmetica;
            desviacionEstandar += Math.pow(diferencia, 2);

            i++;
        }

        return Math.sqrt(desviacionEstandar / N);
    }
}

