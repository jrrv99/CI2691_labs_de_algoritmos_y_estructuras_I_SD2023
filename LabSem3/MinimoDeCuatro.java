class MinimoDeCuatro {
    public static int min;

    //@ requires Integer.MIN_VALUE <= num1 && num1 <= Integer.MAX_VALUE;
    //@ requires Integer.MIN_VALUE <= num2 && num2 <= Integer.MAX_VALUE;
    //@ requires Integer.MIN_VALUE <= num3 && num3 <= Integer.MAX_VALUE;
    //@ requires Integer.MIN_VALUE <= num4 && num4 <= Integer.MAX_VALUE;
    //@ ensures min <= num1 && min <= num2 && min <= num3 && min <= num4;
    //@ ensures min == Math.min(Math.min(num1, num2), Math.min(num3, num4));
    //@ ensures Integer.MIN_VALUE <= min && min <= Integer.MAX_VALUE;
    public static void minimoDeCuatro(int num1, int num2, int num3, int num4) {
        min = num1;

        if (num2 < min) {
            min = num2;
        }
        
        if (num3 < min) {
            min = num3;
        }
        
        if (num4 < min) {
            min = num4;
        }

        System.out.println("MinDeCuatro: " + min);
    }
}
