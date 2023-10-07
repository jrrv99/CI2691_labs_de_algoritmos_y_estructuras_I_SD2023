class SonNumerosCoprimos {
    public static void sonNumerosCoprimos(int num1, int num2) {
        int MCD = num1, pivot = num2, temp;
        
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("[ERROR]: Ambos números deben ser enteros positivos.");
            return;
        }

        // Calcular MCD
        while (pivot != 0) {
            temp = pivot;
            pivot = MCD % pivot;
            MCD = temp;
        }

        if (MCD == 1) {
            System.out.println(num1 + " y " + num2 + " son números coprimos.");
            return;
        }

        System.out.println(num1 + " y " + num2 + " no son números coprimos.");
    } 
}