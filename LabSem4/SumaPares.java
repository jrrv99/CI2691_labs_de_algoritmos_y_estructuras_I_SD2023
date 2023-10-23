class SumaPares {
	//@ requires N >= 0;
	//@ ensures \result >= 0;
	//@ ensures \result == (\sum int j; 0 < j && j < N && j % 2 == 0; j);
	public static int sumaPares(int N) {
		int divisor = 0, sum = 0;

		//@ maintaining  0 <= divisor <= N;
		//@ maintaining suma == (\sum int k; 0 < k && k < divisor && k % 2 == 0; k);
		//@ decreasing N - divisor;
		while (divisor <= N) {
			if (divisor % 2 == 0) {
				sum + divisor;
			}

			divisor++;
		}

		return sum;
	}
}