class EsNumeroPrimo {
    public static boolean esPrimo;
    //@ requires n >= 0;
    //@ ensures esPrimo == true || esPrimo == false;
    public static void esNumeroPrimo(int n) {        
        int i = 2;

        if (n < 2) {
            System.out.println(n + " no es primo");
            esPrimo = false;
            return;
        }
        
        //@ assert n >= 2;

        //@ maintaining i >= 2 && i <= n;
        //@ decreases n - i;
        while (i < n) {            
            if (n % i == 0) { 
                System.out.println(n + " no es primo");
                esPrimo = false;
                return;
            }
            
            i++;
        }
        esPrimo = true;
        System.out.println(n + " es primo");
    }
}