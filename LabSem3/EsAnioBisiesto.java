class EsAnioBisiesto {
    private static final int MIN_YEAR = 1900;
    private static final int MAX_YEAR = 2200;

    public static void esAnioBisiesto(int year) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            System.out.println("[ERROR]: El año debe estar en el rango [1900, 2200]");
            return;
        }

        if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)) {
            System.out.println("El año " + year + " es biciesto");
            return;
        }
        
        System.out.println("El año " + year + " no es biciesto");
    }
}
