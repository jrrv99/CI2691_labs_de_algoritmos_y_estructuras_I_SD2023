class EsMatrizDiagonal {
    //@ requires matriz != null;
    //@ requires (\forall int i; 0 <= i && i < matriz.length; matriz[i].length == matriz.length);
    //@ ensures \result == (\forall int i; 0 <= i && i < matriz.length; (\forall int j; 0 <= j && j < matriz.length; ((i == j) ==> matriz[i][j] != 0) && ((i != j) ==> matriz[i][j] == 0)));
    public static boolean esMatrizDiagonal(int[][] matriz) {
        int row = 0, column;

        //@ maintaining 0 <= row && row <= matriz.length;
        //@ maintaining (\forall int i; 0 <= i && i < row; (\forall int j; 0 <= j && j < matriz.length; (i != j) ==> matriz[i][j] == 0 && (i == j) ==> matriz[i][j] != 0));
        //@ decreasing matriz.length - row;
        while (row < matriz.length) {
            column = 0;

            //@ maintaining 0 <= column && column <= matriz.length;
            //@ maintaining (\forall int j; 0 <= j && j < column; (row != j) ==> matriz[row][j] == 0 && (row == j) ==> matriz[row][j] != 0);
            //@ decreasing matriz.length - column;
            while (column < matriz.length) {
                if (row == column && matriz[row][column] == 0) return false; // Diagonal numbers
                if (row != column && matriz[row][column] != 0) return false; // No diagonal numbers

                column++;
            }

            row++;
        }

        return true; // After all its diagonal
    }
}
