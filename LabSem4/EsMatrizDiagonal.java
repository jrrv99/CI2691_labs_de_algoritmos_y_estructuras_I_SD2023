class EsMatrizDiagonal {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 0, 0},
            {0, 5, 0},
            {0, 0, 9}
        };
        int[][] matriz2 = {
            {1, 0, 0},
            {0, 5, 0},
            {0, 1, 9}
        };

        System.out.println(esMatrizDiagonal(matriz));
        System.out.println(esMatrizDiagonal(matriz2));
    }

    public static boolean esMatrizDiagonal(int[][] matriz) {
        int row = 0, column, sum = 0;

        while(row < matriz.length) {
            column = 0;
            while (column < matriz.length) {
                if (row != column && matriz[row][column] != 0) return false;

                column++;
            }
            row++;
        }

        return true;
    }
}