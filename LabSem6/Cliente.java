class Cliente  {

    public static void main(String[] args) {

        double[] S = {1, 2, 3, 4};
        System.out.println(Utilidades.desvStdSecuencia(S));

        // System.out.println("\nesDivisor - START TEST");
        // testEsDivisor();
        // System.out.println("esDivisor - END TEST");

        // System.out.println("\nesPrimo - START TEST");
        // testEsPrimo();
        // System.out.println("esPrimo - END TEST");

        // System.out.println("\ndiferenciaEntreFechas - START TEST");
        // testDiferenciaEntreFechas();
        // System.out.println("diferenciaEntreFechas - END TEST");

        // System.out.println("\nestaOrdenadoDescendente - START TEST");
        // testOrdenamiento();
        // System.out.println("estaOrdenadoDescendente - END TEST");

        // System.out.println("\nesPermutacion - START TEST");
        // testEsPermutacion();
        // System.out.println("esPermutacion - END TEST");

        // System.out.println("\nsumaMaxima - START TEST");
        // testSumaMaxima();
        // System.out.println("sumaMaxima - END TEST");

        // System.out.println("\nesMatrizSimetrica - START TEST");
        // testEsMatrizSimetrica();
        // System.out.println("esMatrizSimetrica - END TEST");

        // System.out.println("\nesMatrizTrigangularSuperior - START TEST");
        // testEsMatrizTrigangularSuperior();
        // System.out.println("esMatrizTrigangularSuperior - END TEST");

        // System.out.println("\nesMatrizTrigangularInferior - START TEST");
        // testEsMatrizTrigangularInferior();
        // System.out.println("esMatrizTrigangularInferior - END TEST");

        // System.out.println("\nesMatrizDiagonal - START TEST");
        // testEsMatrizDiagonal();
        // System.out.println("esMatrizDiagonal - END TEST");

        // System.out.println("\nsumaSecuencia - START TEST");
        // testSumaSecuencia();
        // System.out.println("sumaSecuencia - END TEST");

        // System.out.println("\npromedioSecuencia - START TEST");
        // testPromedioSecuencia();
        // System.out.println("promedioSecuencia - END TEST");
    }

    // private static boolean checkFechas(int[] fcorrecta, int[] fobtenida) {
    //     if ((fcorrecta[0] != fobtenida[0]) && (fcorrecta[1] != fobtenida[1]) && (fcorrecta[2] != fobtenida[2]) ) {
    //         System.out.println("\nDiscrepancia\n, diferencia correcta: "+fcorrecta[0]+" anios, "+fcorrecta[1]+" meses, "+fcorrecta[2]+" dias");
    //         System.out.println("\nDiscrepancia\n, diferencia dada: "+fobtenida[0]+" anios, "+fobtenida[1]+" meses, "+fobtenida[2]+" dias");
    //         return false;
    //     }
    //     return true;
    // }

    // public static void testEsDivisor() {
    //     if (Utilidades.esDivisor(234567, 3)) System.out.println("Error, 234567 es divisible por 3");
    //     if (!Utilidades.esDivisor(234568, 7)) System.out.println("Error, 234568 no es divisible por 7");
    // }

    // public static void testEsPrimo() {
    //     if (Utilidades.esPrimo(7993)) System.out.println("Error, 7993 es primo");
    //     if (Utilidades.esPrimo(7019)) System.out.println("Error, 7019 es primo");
    //     if (!Utilidades.esPrimo(7020)) System.out.println("Error, 7020 no es primo");
    //     if (!Utilidades.esPrimo(-3)) System.out.println("Error, -3 no es primo, El número debe ser positivo");
    // }

    // public static void testDiferenciaEntreFechas() {
    //     int[] correcto = new int[3];
    //     int[] resultado = new int[3];
        
    //     resultado = Utilidades.diferenciaEntreFechas(30,04,1996,27,02,1996);
    //     correcto[0] = 0; 
    //     correcto[1] = 2;
    //     correcto[2] = 3;
    //     if (checkFechas(correcto, resultado)) System.out.println("Error en la primera prueba de diferencia de fechas");

    //     resultado = Utilidades.diferenciaEntreFechas(02,03,1996,27,02,1996);
    //     correcto[0] = 0; 
    //     correcto[1] = 0;
    //     correcto[2] = 4;
    //     if (checkFechas(correcto, resultado)) System.out.println("Error en la segunda prueba de diferencia de fechas");
        
    //     resultado = Utilidades.diferenciaEntreFechas(03,03,2022,01,01,2020);
    //     correcto[0] = 2; 
    //     correcto[1] = 2;
    //     correcto[2] = 2;
    //     if (checkFechas(correcto, resultado)) System.out.println("Error en la tercera prueba de diferencia de fechas");
    // }

    // public static void testOrdenamiento() {
    //     int[] prueba = new int[] {
    //         3, 1, 2, 4, 67, 1, 9, 7, 3, 4, 2, 4, 78, 12, 33, 4, 6, 7, 9, 888, 23,
    //         1, 4, 5, 6, 5, 5, 5, 5, 1, 1, 3, 567, 23, 4, 5, 6, 23, 47, 89, 57, 12,
    //         78
    //     };
    //     if (!Utilidades.estaOrdenadoDescendente(prueba)) System.out.println("Error, el arreglo no esta ordenado");

    //     prueba = new int[] {
    //         1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6,
    //         6, 7, 7, 9, 9, 12, 12, 23, 23, 23, 33, 47, 57, 67, 78, 78, 89, 567, 888
    //     };
    //     if (Utilidades.estaOrdenadoAscendente(prueba)) System.out.println("Error, el arreglo si esta ordenado");
    // }

    // public static void testEsPermutacion() {
    //     int[] prueba = new int[] {
    //         28, 9, 6, 22, 13, 20, 31, 23, 36, 27, 32, 39, 30, 7, 1, 34, 15, 29,
    //         0, 33, 21, 17, 24, 25, 8, 2, 37, 3, 18, 5, 19, 4, 12, 35, 38, 11,
    //         14, 10, 16, 26
    //     };
    //     if (Utilidades.esPermutacion(prueba)) System.out.println("Error, si es una permutacion");

    //     prueba = new int[] {
    //         28, 9, 6, 22, 13, 20, 31, 23, 36, 27, 32, 34, 15, 29, 0, 33, 21,
    //         17, 24, 25, 8, 2, 37, 3, 18, 5, 19, 4, 12, 35, 38, 11, 14, 10,
    //         16, 26
    //     };
    //     if (!Utilidades.esPermutacion(prueba)) System.out.println("Error, si no es una permutacion");
    // }

    // public static void testSumaMaxima() {
    //     int[] test = {-1, -8, 3, 2, -1};
    //     if (Utilidades.sumaMaxima(test) != 5) System.out.println("Error, la suma maxima es 5");

    //     int[] test2 = {-1, -8, 3, 2, -1, 6};
    //     if (Utilidades.sumaMaxima(test2) != 10) System.out.println("Error, la suma maxima es 10");
    // }

    // public static void testEsMatrizSimetrica() {
    //     int[][] matrizSim = {
    //         {1, 2, 3},
    //         {2, 6, 4},
    //         {3, 4, 5}
    //     };
    //     int[][] matrizNoSim = {
    //         {1, 2, 3},
    //         {2, 6, 7},
    //         {3, 4, 5}
    //     };

    //     if (!Utilidades.esMatrizSimetrica(matrizSim)) System.out.println("Error, la matriz es Simetrica");
    //     if (Utilidades.esMatrizSimetrica(matrizNoSim)) System.out.println("Error, la matriz no es Simetrica");
    // }

    // public static void testEsMatrizTrigangularSuperior() {
    //     int[][] matrizTriSup = {
    //         {1, 2, 3},
    //         {0, 6, 4},
    //         {0, 0, 5}
    //     };
    //     int[][] matrizNoTriSup = {
    //         {1, 2, 3},
    //         {2, 6, 7},
    //         {3, 4, 5}
    //     };

    //     if (!Utilidades.esMatrizTrigangularSuperior(matrizTriSup)) System.out.println("Error, la matriz sí es Triangular Superior");
    //     if (Utilidades.esMatrizTrigangularSuperior(matrizNoTriSup)) System.out.println("Error, la matriz no es Triangular Superior");
    // }

    // public static void testEsMatrizTrigangularInferior() {
    //     int[][] matrizTriInf = {
    //         {1, 0, 0},
    //         {2, 6, 0},
    //         {3, 4, 5}
    //     };
    //     int[][] matrizNoTriInf = {
    //         {1, 2, 3},
    //         {2, 6, 7},
    //         {3, 4, 5}
    //     };

    //     if (!Utilidades.esMatrizTrigangularInferior(matrizTriInf)) System.out.println("Error, la matriz sí es Triangular Inferior");
    //     if (Utilidades.esMatrizTrigangularInferior(matrizNoTriInf)) System.out.println("Error, la matriz no es Triangular Inferior");
    // }

    // public static void testEsMatrizDiagonal() {
    //     int[][] matrizDiagonal = {
    //         {1, 0, 0},
    //         {0, 6, 0},
    //         {0, 0, 5}
    //     };
    //     int[][] matrizNoDiagonal = {
    //         {1, 2, 3},
    //         {2, 6, 7},
    //         {3, 4, 5}
    //     };

    //     if (!Utilidades.esMatrizDiagonal(matrizDiagonal)) System.out.println("Error, la matriz sí es Diagonal");
    //     if (Utilidades.esMatrizDiagonal(matrizNoDiagonal)) System.out.println("Error, la matriz no es Diagonal");
    // }

    // public static void testSumaSecuencia() {
    //     double[] sec = {1.2, 1.8, 1.2};
    //     double result = Utilidades.sumaSecuencia(sec), sum = 4.2;
    //     if (Math.abs(result - sum) >= 0.001) System.out.println("Error, el resultado correccto es: "+sum+", y el obtenido fue: "+result);
    // }

    // public static void testPromedioSecuencia() {
    //     double[] sec = {1.2, 1.8, 1.2};
    //     double result = Utilidades.sumaSecuencia(sec), promedio = 100/(sec.length * 1.0);
    //     if (Math.abs(result - promedio) >= 0.001) System.out.println("Error, el resultado correccto es: "+promedio+", y el obtenido fue: "+result);
    // }
}