class Cliente  {
    public static void main(String[] args) {
        System.out.println("\nesDivisor - START TEST");
        assert Utilidades.esDivisor(234567, 3) : "Error, 234567 es divisible por 3";
        assert !Utilidades.esDivisor(234568, 7) : "Error, 234568 no es divisible por 7";
        System.out.println("esDivisor - END TEST");

        System.out.println("\nesPrimo - START TEST");
        assert Utilidades.esPrimo(7993) : "Error, 7993 es primo";
        assert Utilidades.esPrimo(7019) : "Error, 7019 es primo";
        assert !Utilidades.esPrimo(7020) : "Error, 7020 no es primo";
        assert !Utilidades.esPrimo(-3) : "Error, -3 no es primo, El número debe ser positivo";
        System.out.println("esPrimo - END TEST");
    }
}