class EsNumeroPrimo {
    public static void esNumeroPrimo(int n) {
        int i = 2;

        if (n < 2) {
            System.out.println(n + " no es primo");
            return;
        }

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