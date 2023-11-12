class Cliente  {
    public static void testEsDivisor() {
        assert Utilidades.esDivisor(234567, 3) : "Error, 234567 es divisible por 3";
        assert !Utilidades.esDivisor(234568, 7) : "Error, 234568 no es divisible por 7";
    }

    public static void testEsPrimo() {
        assert Utilidades.esPrimo(7993) : "Error, 7993 es primo";
        assert Utilidades.esPrimo(7019) : "Error, 7019 es primo";
        assert !Utilidades.esPrimo(7020) : "Error, 7020 no es primo";
        assert !Utilidades.esPrimo(-3) : "Error, -3 no es primo, El número debe ser positivo";
    }

    public static void testDiferenciaEntreFechas() {
        int[] correcto = new int[3];
        int[] resultado = new int[3];
        
        resultado = Utilidades.diferenciaEntreFechas(30,04,1996,27,02,1996);
        correcto[0] = 0; 
        correcto[1] = 2;
        correcto[2] = 3;
        assert checkFechas(correcto, resultado) : "Error en la primera prueba de diferencia de fechas";

        resultado = Utilidades.diferenciaEntreFechas(02,03,1996,27,02,1996);
        correcto[0] = 0; 
        correcto[1] = 0;
        correcto[2] = 4;
        assert checkFechas(correcto, resultado) : "Error en la segunda prueba de diferencia de fechas";
        
        resultado = Utilidades.diferenciaEntreFechas(03,03,2022,01,01,2020);
        correcto[0] = 2; 
        correcto[1] = 2;
        correcto[2] = 2;
        assert checkFechas(correcto, resultado) : "Error en la tercera prueba de diferencia de fechas";
    }

    public static void main(String[] args) {
        System.out.println("\nesDivisor - START TEST");
        testEsDivisor();
        System.out.println("esDivisor - END TEST");

        System.out.println("\nesPrimo - START TEST");
        testEsPrimo();
        System.out.println("esPrimo - END TEST");

        System.out.println("\ndiferenciaEntreFechas - START TEST");
        testDiferenciaEntreFechas();
        System.out.println("diferenciaEntreFechas - END TEST");
    }

    private static boolean checkFechas(int[] fcorrecta, int[] fobtenida) {
        if ((fcorrecta[0] != fobtenida[0]) && (fcorrecta[1] != fobtenida[1]) && (fcorrecta[2] != fobtenida[2]) ) {
            System.out.println("\nDiscrepancia\n, diferencia correcta: "+fcorrecta[0]+" anios, "+fcorrecta[1]+" meses, "+fcorrecta[2]+" dias");
            System.out.println("\nDiscrepancia\n, diferencia dada: "+fobtenida[0]+" anios, "+fobtenida[1]+" meses, "+fobtenida[2]+" dias");
            return false;
        }
        return true;
    }
}