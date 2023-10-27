class DesviacionEstandar {
    public static double desviacionEstandar (int[] S) {
        int N = S.length, i = 0;
        double desviacionEstandar = 0.0, mediaAritmetica = 0.0, diferencia;

        while (i < N) {
            mediaAritmetica += S[i];
            i++;
        }

        mediaAritmetica = mediaAritmetica / N;
        i=0;

        while (i < N) {
            diferencia = S[i] - mediaAritmetica;
            desviacionEstandar += Math.pow(diferencia, 2);

            i++;
        }

        return Math.sqrt(desviacionEstandar / N);

    }
}