class EsMatrizDiagonal {
    //@ requires (\forall int x; 0 < x && x < matriz.length; matriz[x].length > 0);
    //@ ensures \result == (\forall int i; 0 <= i && i < matriz.length; (\forall int j; 0 <= j && j < matriz[i].length; (i != j) ==> matriz[i][j] == 0));
    public static boolean esMatrizDiagonal(int[][] matriz) {
        int row = 0, column;

        //@ maintaining (\forall int i; 0 <= i && i < row; (\forall int j; 0 <= j && j < column; (i != j) ==> matriz[i][j] == 0));
        //@ decreases matriz.length - row;
        while(row < matriz.length) {
            column = 0;
            while (column < matriz.length) {
                if (row == column && matriz[row][column] == 0) return false;
                if (row != column && matriz[row][column] != 0) return false;

                column++;
            }
            row++;
        }

        return true;
    }
}