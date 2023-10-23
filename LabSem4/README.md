# Laboratorio de la semana 4

## 1. Descripción de la actividad

1. **Descripción:** Contar el número de divisores de un número entero dado.

   > **Programas:** ContarDivisores.java y ClienteContarDivisores.java.

2. **Descripción:** Dado un número entero positivo _N_ , se debe computar la suma de
   todos los números pares en el intervalo `[0..N )`.

   > **Programas:** SumaPares.java y ClienteSumaPares.java.

3. **Descripción:** Dado un número entero positivo, se quiere saber si es o no un número perfecto. Un número es perfecto si la suma de sus divisores menores que él, es igual al número. Por ejemplo, el número 6 es perfecto, porque `6 = 3 + 2 + 1`.

   > **Programas:** EsPerfecto.java y ClienteEsPerfecto.java.

4. **Descripción:** Dada una secuencia de números reales, se quiere computar el promedio de los valores de la secuencia.

   > **Programas:** PromedioSecuencia.java y ClientePromedioSecuencia.java.

5. **Descripción:** Dada una secuencia de números enteros positivo, Contar el número de números primos.

   > **Programas:** ContarPrimos.java y ClienteContarPrimos.java.

6. **Descripción:** Dada una secuencia de caracteres que representa a una palabra, se quiere saber si la misma es palíndromo o no.

   > **Programas:** EsPalindromo.java y CienteEsPalindromo.java.

7. **Descripción:** Dada una secuencia de números enteros, se debe retornar la posición en la secuencia de cualquier número cuatro. En caso de que la secuencia no
   tenga un número cuatro se debe retornar -1.

   > **Programas:** EncontrarCuatro.java y CienteEncontrarCuatro.java.

8. **Descripción:** Dada una matriz _M × N_ de números enteros, se quiere computar la suma de todos los valores de la matriz.

   > **Programas:** SumaMatriz.java y ClienteSumaMatriz.java.

9. **Descripción:** Dada una matriz _N × N_ de números enteros, se quiere determinar si la matriz es diagonal o no.
   > **Programas:** EsMatrizDiagonal.java y ClienteEsMatrizDiagonal.java.

Para cada uno de los programas en JML, debe realizar un cliente en JAVA que demuestre el correcto funcionamiento del mismo. Recuerede que sus soluciones, deben usar el subconjunto del lenguaje Java y las estrategias de codificación, vistas en clase. Se recomienda chequear estáticamente, con la opción `--esc` de openjml, todos sus programas, a menos que no sea posible efectuarlo porque alguna función no es implementada por el analizador. Solo debe hacer entrega unicamente de los archivos fuentes .java.

## 2. Condiciones de entrega

Los códigos del laboratorio y la declaración de autenticidad debidamente firmada, deben estar contenidos en un archivo comprimido, con formato tar.xz, llamado LabSem4 X.tar.xz, donde X es el número de carn é del estudiante. La entrega del archivo LabSem4 X.tar.xz, debe hacerse por medio de la plataforma Classroom antes de las 11:50 pm del día domingo 22 de octubre 2023.

## Comando para la entrega del archivo comprimido

```bash
tar -cvJf LabSem4_<YOUR_CARNET>.tar.xz ContarDivisores.java SumaPares.java EsPerfecto.java PromedioSecuencia.java ContarPrimos.java EsPalindromo.java EncontrarCuatro.java SumaMatriz.java EsMatrizDiagonal.java
```

## Completados

| Programa          | Solución |   JML   |
| ----------------- | :------: | :-----: |
| ContarDivisores   | &#9745;  | &#9745; |
| SumaPares         | &#9745;  | &#9745; |
| EsPerfecto        | &#9745;  | &#9745; |
| PromedioSecuencia | &#9745;  | &#9745; |
| ContarPrimos      | &#9745;  | &#9745; |
| EsPalindromo      | &#9745;  | &#9745; |
| EncontrarCuatro   | &#9745;  | &#9745; |
| SumaMatriz        | &#9745;  | &#9744; |
| EsMatrizDiagonal  | &#9745;  | &#9744; |

