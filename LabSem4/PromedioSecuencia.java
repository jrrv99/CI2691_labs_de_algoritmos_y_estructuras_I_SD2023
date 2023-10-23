class PromedioSecuencia {
    //@ requires sec != null && sec.length > 0;
    //@ ensures \java_math(\result == (\sum int i; 0 <= i && i < sec.length; sec[i]) / sec.length);
    public static double promedioSecuencia(double[] sec) {
        int i = 0;
        double sum = 0;

        //@ maintaining 0 <= i && i <= sec.length;
        //@ maintaining \java_math(sum == (\sum int j; 0 <= j && j < i; sec[j]));
        //@ decreasing sec.length - i; 
        while (i < sec.length) {
            sum += sec[i];

            i++;
        }

        return sum / sec.length;
    }
}