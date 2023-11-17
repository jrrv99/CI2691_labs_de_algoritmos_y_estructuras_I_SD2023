public class ClientePermutacion {
    public static void main (String[] args) {
        int[] a = {0, 1, 2, 3};
        int[] b = {3, 1, 0, 2};
        int[] c = {3, 1, 0, 1};

        boolean test1 = !EsPermutacion.esPermutacion(a, b);
        boolean test2 = EsPermutacion.esPermutacion(a, c);

        if (test1)
            System.out.println("Test 1 - Failed - ErrorMessage: Es permutacion");
        if (test2)
            System.out.println("Test 2 - Failed - ErrorMessage: No es permutacion");
        
    }
}