class MinimoDeCuatro {
    public static void minimoDeCuatro(int num1, int num2, int num3, int num4) {
        int min = num1;

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
