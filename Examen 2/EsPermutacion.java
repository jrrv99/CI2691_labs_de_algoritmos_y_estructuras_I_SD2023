public class EsPermutacion {
    /*@ requires 0 < arr1.length && arr1.length <= 100000;
      @ requires 0 < arr2.length && arr2.length <= 100000;
      @ requires arr1.length == arr2.length;
      @ requires (\forall int k; 0 <= k && k < arr1.length; 0 <= arr1[k] && arr1[k] < arr1.length);
      @ requires (\forall int k; 0 <= k && k < arr2.length; 0 <= arr2[k] && arr2[k] < arr2.length);
      @ ensures \result == true <==> (\forall int z; 0 <= z && z < arr1.length; (\num_of int k; 0 <= k && k < arr1.length; arr1[k] == z) == (\num_of int k; 0 <= k && k < arr2.length; arr2[k] == z));
      @*/
    public static boolean esPermutacion(int[] arr1, int[] arr2) {
        int i = 0;
        int[] occurrencePivot = new int[arr1.length];

        /*@ maintaining 0 <= i <= arr2.length;
          @ maintaining (\forall int k; 0 <= k && k < i; occurrencePivot[k] == 0);
          @ decreasing arr2.length - i;
          @*/
        while (i < arr1.length) {
            occurrencePivot[i] = 0;
            i++;
        }

        i=0;

        /*@ maintaining 0 <= i <= arr2.length;
          @ maintaining (\forall int k; 0 <= k && k < i; occurrencePivot[arr1[k]] == (\num_of int j; 0 <= j && j < arr1.length; arr1[j] == arr1[k]));
          @ decreasing arr2.length - i;
          @*/
        while (i < arr1.length) {
            occurrencePivot[arr1[i]] = CuentaElementoPosicion.cuentaElementoPosicion(arr1, i);
            i++;
        }

        i=0;

        /*@ maintaining 0 <= i <= arr2.length;
          @ maintaining (\forall int k; 0 <= k && k < i; occurrencePivot[arr2[k]] == ((\num_of int j; 0 <= j && j < arr1.length; arr1[j] == arr1[k]) - (\num_of int j; 0 <= j && j < arr2.length; arr2[j] == arr2[k])));
          @ decreasing arr2.length - i;
          @*/
        while (i < arr1.length) {
           occurrencePivot[arr2[i]] -= CuentaElementoPosicion.cuentaElementoPosicion(arr2, i);

           if (occurrencePivot[arr2[i]] != 0) return false;

            i++;
        }

        return true;
    }
}