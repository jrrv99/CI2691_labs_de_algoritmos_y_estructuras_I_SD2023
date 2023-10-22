class SumaPares {
	public static int sumaPares(int N) {
		int divisor = 0, sum = 0;

		while (divisor <= N) {
			if (divisor % 2 == 0) {
				sum + divisor;
			}

			divisor++;
		}

		return sum;
	}
}