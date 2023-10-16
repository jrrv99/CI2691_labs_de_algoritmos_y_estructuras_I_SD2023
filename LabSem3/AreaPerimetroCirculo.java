class AreaPerimetroCirculo {
    // @requires radio > 0
    // @ensures area > 0 area && == Math.PI * radio * radio
    // @ensures perimetro > 0 perimetro && perimetro == 2 * Math.PI * radio
    public static /*@ pure @*/ void areaPerimetroCirculo(double radio) {
        double area, perimetro;

        if (radio < 0) {
            System.out.println("[ERROR]: El radio debe ser un número real positivo.");
            return;
        }

        area = Math.PI * radio * radio;
        perimetro = 2 * Math.PI * radio;

        System.out.println("Radio: " + radio + " Área: " + area + " Perímetro: " + perimetro);
    }
}