class ClienteDiagonal {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3},
        };
        int[][] matrizD = {
            {1, 0, 0},
            {0, 2, 0},
            {0, 0, 3},
        };

        System.out.println(EsMatrizDiagonal.esMatrizDiagonal(matriz1));
        System.out.println(EsMatrizDiagonal.esMatrizDiagonal(matrizD));
    }
}