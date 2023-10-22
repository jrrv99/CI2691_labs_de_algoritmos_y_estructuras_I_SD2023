class EncontrarCuatro {
    private static final int NUMBER_TO_FIND = 4;

    public static void main (String[] args) {
        int i = 0;
        int[] sec = new int[args.length];

        while (i < args.length) {
            sec[i] = Integer.parseInt(args[i]);
            i++;
        }
        
        System.out.println(encontrarCuatro(sec));
    }

    public static int encontrarCuatro(int[] sec) {
        int index = 0;

        while(index < sec.length) {
            if (sec[index] == NUMBER_TO_FIND) return index;
            index++;
        }

        return -1;
    }
}