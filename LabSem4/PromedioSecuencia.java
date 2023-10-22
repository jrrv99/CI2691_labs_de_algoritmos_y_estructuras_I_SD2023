class PromedioSecuencia {
    public static void main(String[] args){
        double[] sec = new double[args.length];
        int i = 0;

        while(i < args.length) {
            sec[i] = Double.parseDouble(args[i]);

            i++;
        }

        System.out.println(promedioSecuencia(sec));
    }

    public static double promedioSecuencia(double[] sec) {
        int i = 0;
        double sum = 0;

        while (i < sec.length) {
            sum += sec[i];

            i++;
        }

        return sum / sec.length;
    }
}