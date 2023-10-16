class SonNumerosCoprimos {
    public static boolean sonCoprimos;
    //@ requires num1 > 0 && num2 > 0;
    //@ ensures sonCoprimos == true || sonCoprimos == false;
    public static void sonNumerosCoprimos(int num1, int num2) {
        //@ assert num1 > 0 && num2 > 0;
        
        int MCD = num1, pivot = num2, temp;
        
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("[ERROR]: Ambos números deben ser enteros positivos.");
            return;
        }
        
        //@ assert num1 > 0 && num2 > 0;

        //@ maintaining pivot >= 0 && MCD >= 0;
        //@ decreases pivot;
        while (pivot != 0) {
            //@ assert pivot >= 0 && MCD >= 0;
            
            temp = pivot;
            pivot = MCD % pivot;
            MCD = temp;
        }
        
        //@ assert pivot == 0;
        //@ assert MCD >= 0;
        
        if (MCD == 1) {
            System.out.println(num1 + " y " + num2 + " son números coprimos.");
            sonCoprimos = true;
            return;
        }

        sonCoprimos = false;
        System.out.println(num1 + " y " + num2 + " no son números coprimos.");
    } 
}