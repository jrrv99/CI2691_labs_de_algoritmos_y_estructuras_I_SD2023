public class CuentaElementoPosicion {
    /*@ requires arr.length > 0;
      @ requires 0 <= K < arr.length;
      @ ensures \result == (\num_of int k; 0 <= k && k < arr.length; arr[k] == arr[K]);
      @*/
    public static /*@ pure @*/ int cuentaElementoPosicion(int[] arr, int K) {
        int i = 0,
            count = 0; // occurrence counter

        /*@ maintaining 0 <= i <= arr.length;
          @ maintaining count == (\num_of int k; 0 <= k && k < i; arr[k] == arr[K]);
          @ decreasing arr.length - i;
          @*/
        while (i < arr.length) {
            if (arr[i] == arr[K]) {
                count++;
            }

            i++;
        }

        return count;
    }
}