class EsNumeroPrimo {
    public static void esNumeroPrimo(int n) {
        int i = 2;

        while (i < n) {
            if (n%i == 0){ 
                System.out.println(n + " no es primo");
                return;
	        }
            i++;
        }

        System.out.println(n + " es primo");
    }
}