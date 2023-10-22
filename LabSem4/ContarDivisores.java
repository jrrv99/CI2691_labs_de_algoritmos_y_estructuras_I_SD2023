class ContarDivisores {
    public static int contarDivisores(int number) {
        int divisor = 1, count = 0;

        while(divisor <= number) {
            if(number % divisor == 0) count++;

            divisor++;
        }

        return count;
    }
}