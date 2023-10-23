class SumaMatriz {
    //@ require matriz != null;
    //@ requires matriz.length >= matriz[0].length >= 0;
	//@ requires (\forall int x; 0 <= x && x < matriz.length; matriz[x].length == matriz[0].length);
	//@ ensures \result == (\sum int i; 0 <= i && i < matriz.length; (\sum int j; 0 <= j && j < matriz[i].length; matriz[i][j]));
    public static int sumaMatriz(int[][] matriz) {
        int row = 0, column, sum = 0;

        //@ maintaining suma == (\sum int j; 0 <= j && j < row; (\sum int k; 0 <= k && k < column; matriz[j][k]));
        //@ decreasing matriz.length - row;
        while(row < matriz.length) {
            column = 0;
            while (column < matriz[row].length) {
                sum += matriz[row][column];

                column++;
            }
            row++;
        }

        return sum;
    }
}