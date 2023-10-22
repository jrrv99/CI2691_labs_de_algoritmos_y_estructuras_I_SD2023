class SumaMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(sumaMatriz(matriz));
    }
    public static int sumaMatriz(int[][] matriz) {
        int row = 0, column, sum = 0;

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