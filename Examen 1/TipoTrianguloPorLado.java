class TipoTrianguloPorLado {
    //@ requires a > 0 && b > 0 && c > 0;
    //@ ensures \result == 1 <==> (a == b && b == c);
    //@ ensures \result == 2 <==> ((a == b && c != b) || (a == c && b != c) || (b == c && c != a));
    //@ ensures \result == 3 <==> (a != b && a != c && b != c);
    public static int tipoTrianguloPorLado(int a, int b, int c) {
        if (a == b && b == c) return 1; // Equilatero
        if ((a == b && c != b) || (a == c && b != c) || (b == c && c != a)) return 2; // Isoceles
        return 3; // Escaleno
    }
}