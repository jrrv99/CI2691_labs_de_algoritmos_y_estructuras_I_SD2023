public class PromedioPares {
    public static /*@ pure @*/ double promedioPares(int[] arr) {
        int i = 0,
            evens_sum = 0,
            evens_count = 0;

        while (i < arr.length) {
            if (arr[i] % 2 == 0) {
                evens_count++;
                evens_sum += arr[i];
            }

            i++;
        }

        return (evens_sum/evens_count);
    }
}