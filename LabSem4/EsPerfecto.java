class EsPerfecto {
    //@ requires N > 0; 
    //@ ensures \result == ((\sum int j; 0 < j && j < N && N % j == 0; j) == N);
    public static boolean esPerfecto(int N) {
        int divisor = 1, suma = 0;

        //@ maintaining suma == (\sum int i; 0 < i && i < divisor && N % i == 0; i);
        //@ decreasing N - divisor;
        while(divisor < N) {
            if (N % divisor == 0) suma += divisor;
            if (suma > N) return false;

            divisor++;
        }

        return suma == N;
    }
}