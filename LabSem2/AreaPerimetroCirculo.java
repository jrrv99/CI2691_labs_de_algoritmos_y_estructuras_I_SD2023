class AreaPerimetroCirculo {
    public static void areaPerimetroCirculo(double radio) {
        double area, perimetro;

        if (radio < 0) {
            System.out.println("[ERROR]: El radio debe ser un número real positivo.");
            return;
        }

        area = Math.PI * Math.sqrt(radio);
        perimetro = 2 * Math.PI * radio;

        System.out.println("Radio: " + radio + " Área: " + area + " Perímetro: " + perimetro);
    }
}