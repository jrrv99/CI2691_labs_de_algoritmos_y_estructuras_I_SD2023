class AreaPerimetroCirculo {
    public static double area;
    public static double perimetro;

    //@ requires radio > 0;
    //@ ensures area > 0 && area == (Math.PI * radio * radio);
    //@ ensures perimetro > 0 && perimetro == (2 * Math.PI * radio);
    public static void areaPerimetroCirculo(double radio) {
        if (radio < 0) {
            System.out.println("[ERROR]: El radio debe ser un número real positivo.");
            return;
        }

        area = Math.PI * radio * radio;
        perimetro = 2 * Math.PI * radio;

        System.out.println("Radio: " + radio + " Área: " + area + " Perímetro: " + perimetro);
    }
}