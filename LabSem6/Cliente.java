class Cliente  {
    public static void main(String[] args) {
        System.out.println("START esDivisor TEST");
        assert Utilidades.esDivisor(234567, 3) : "Error, 234567 es divisible por 3";
        assert !Utilidades.esDivisor(234568, 7) : "Error, 234568 no es divisible por 7";
        System.out.println("END esDivisor TEST");
    }
}