class EsPalindromo {
    public static void main(String[] args) {
        char[] letters = args[0].toCharArray();
        System.out.println(esPalindromo(letters));
    }

    public static boolean esPalindromo(char[] sec) {
        int i = 0;

        while(i < sec.length / 2) {
            if (sec[i] != sec[(sec.length - 1) - i]) return false;

            i++;
        }

        return true;
    }
}