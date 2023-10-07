public class Cliente {
    public static void main(String[] args) {
        int[] aniosBisiestos = {2000, 2004, 2008, 2012, 2016, 2020};
        int[] aniosNoBisiestos = {1900, 2001, 2003, 2010, 2018, 2022};

        /**
         * AreaPerimetroCirculo
         */
        AreaPerimetroCirculo.areaPerimetroCirculo(10);
        AreaPerimetroCirculo.areaPerimetroCirculo(-10);

        /**
         * MinimoDeCuatro
         */
        MinimoDeCuatro.minimoDeCuatro(1, 2, 3, 4);
        MinimoDeCuatro.minimoDeCuatro(4, 3, 2, 1);
        MinimoDeCuatro.minimoDeCuatro(2, 3, 2, 1);
        MinimoDeCuatro.minimoDeCuatro(2, -3, 2, 1);

        /**
         * EsAnioBisiesto
         */
        for (int year: aniosBisiestos) {
            EsAnioBisiesto.esAnioBisiesto(year);
        }

        for (int year: aniosNoBisiestos) {
            EsAnioBisiesto.esAnioBisiesto(year);
        }

        /**
         * EsNumeroPrimo
         */
        EsNumeroPrimo.esNumeroPrimo(10);
        EsNumeroPrimo.esNumeroPrimo(3);
        EsNumeroPrimo.esNumeroPrimo(7);
        EsNumeroPrimo.esNumeroPrimo(2);

        /**
         * SonNumerosCoprimos
         */

        SonNumerosCoprimos.sonNumerosCoprimos(2, 1)
        SonNumerosCoprimos.sonNumerosCoprimos(2, 7);
        SonNumerosCoprimos.sonNumerosCoprimos(10, 5);
    }
}
