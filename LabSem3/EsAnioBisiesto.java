class EsAnioBisiesto {
    public static boolean esBisiesto;
    public static final int MIN_YEAR = 1900;
    public static final int MAX_YEAR = 2200;

    //@ requires year >= MIN_YEAR && year <= MAX_YEAR;
    //@ ensures esBisiesto == (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0));
    public static void esAnioBisiesto(int year) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            System.out.println("[ERROR]: El año debe estar en el rango [1900, 2200]");
            return;
        }

        esBisiesto = year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0);

        if (esBisiesto) {
            System.out.println("El año " + year + " es biciesto");
            return;
        }
        
        System.out.println("El año " + year + " no es biciesto");
    }
}
