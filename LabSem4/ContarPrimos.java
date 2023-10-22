class ContarPrimos {
    public static void main(String[] args){
        int[] sec = new int[args.length];
        int i = 0;

        while(i < args.length) {
            sec[i] = Integer.parseInt(args[i]);
            i++;
        }

        System.out.println(contarPrimos(sec));
    }
    
    public static int contarPrimos (int[] sec) {
        int i = 0, divider = 2, count = 0;

        while (i < sec.length){
            if (sec[i] <= 1) continue; // No es primo

            while (divider < sec[i]) {
                if (sec[i] % divider == 0) { // No es primo
                    divider = -1;
                    break;
                }

                divider++;
            }
            if (divider != -1) count++; // Es Primo
            divider = 2; // reset

            i++;
        }

        return count;
    }
}