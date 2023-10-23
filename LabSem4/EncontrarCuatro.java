class EncontrarCuatro {
    private static final int NUMBER_TO_FIND = 4;

    // requires sec != null;
    //@ ensures \result >= -1 && \result < sec.length;
    public static int encontrarCuatro(int[] sec) {
        int index = 0;
        
        //@ maintaining 0 <= index && index <= sec.length;
        //@ decreasing sec.length - index;
        while(index < sec.length) {
            if (sec[index] == NUMBER_TO_FIND) return index;
            index++;
        }

        return -1;
    }
}