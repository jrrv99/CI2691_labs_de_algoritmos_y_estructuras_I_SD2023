class ContarDivisores {
    //@ requires number > 0;
    //@ ensures \result >= 0;
    //@ ensures \result <= number;
    //@ ensures \result == (\num_of int i; 0 < i && i <= number; number % i == 0);
    public static int contarDivisores(int number) {
        int divisor = 1, count = 0;
        
        //@ maintaining 1 <= divisor <= number + 1;
        //@ maintaining count <= divisor - 1;
        //@ maintaining count == (\num_of int i; 0 < i & i < divisor; number % i == 0);
        //@ decreases number - divisor + 1;
        while (divisor <= number) {
            if (number % divisor == 0) count++;

            divisor++;
        }

        return count;
    }
}