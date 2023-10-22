class EsPerfecto {
    public static void main(String[] args){
        System.out.println(esPerfecto(Integer.parseInt(args[0])));
    }

    public static boolean esPerfecto(int N) {
        int divisor = 1, suma = 0;

        while(divisor < N) {
            if (N % divisor == 0) suma += divisor;
            if (suma > N) return false;

            divisor++;
        }

        return suma == N;
    }
}