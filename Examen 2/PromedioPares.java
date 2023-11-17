public class PromedioPares {
    /*@ requires arr.length > 0;
      @ requires (\forall int k; 0 <= k && k < arr.length; arr[k] > 0);
      @ ensures ((\num_of int k; 0 <= k && k < arr.length; arr[k]%2 == 0) == 0 && \java_math(Math.abs((\result - 0.0)*1.0) < 0.001)) || ((\num_of int k; 0 <= k && k < arr.length; arr[k]%2 == 0) != 0 && \java_math(Math.abs(\result - (\sum int k; 0 <= k && k < arr.length && arr[k]%2 == 0; arr[k])/((\num_of int k; 0 <= k && k < arr.length; arr[k]%2 == 0)*1.0)) < 0.001));
      @*/
    public static /*@ pure @*/ double promedioPares(int[] arr) {
        int i = 0,
            evens_sum = 0,
            evens_count = 0;

        /*@ maintaining 0 <= i <= arr.length;
          @ maintaining 0 <= evens_count <= i;
          @ maintaining evens_sum == (\sum int k;  0 <= k && k < i && arr[k]%2==0; arr[k]);
          @ maintaining evens_count == (\num_of int k; 0 <= k && k < i; arr[k]%2==0);
          @ decreasing arr.length - i;
          @*/
        while (i < arr.length) {
            if (arr[i] % 2 == 0) {
                evens_count++;
                evens_sum += arr[i];
            }

            i++;
        }

        if (evens_count == 0) return 0.0;

        return (evens_sum/(evens_count*1.0));
    }
}