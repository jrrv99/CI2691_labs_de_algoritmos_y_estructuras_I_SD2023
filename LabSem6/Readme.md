# Laboratorio Semana 6

## Descripción de la actividad

> Se quiere que agregue a la librería Utilidades.java los siguientes métodos en JML:

1. Un método llamado `esDivisor` que recibe como entrada dos números enteros `n` y `m` y retorna true si `m` divide a `n`, y false en caso contrario.

2. Un método llamado `esPrimo` que dado un número entero positivo `n`, retorne true si el número es primo y false si no.

3. Un método llamado `diferenciaEntreFechas` que dada una `fecha1` y una `fecha2`, donde `fecha1 ≥ fecha2` indique el número de años y meses y días que separan a la fecha menor de la mayor. La entrada del método son seis enteros que representan las fechas en el orden de día, mes y año. Primero se ingresa los datos de la `fecha1` y luego los de la `fecha2`.

4. Se quiere un método que dado un arreglo de enteros, llamado `estaOrdenadoAscendente`, que retorne true si los elementos del arreglo están ordenados ascendentemente, y false en caso contrario.

5. Se quiere un método que dado un arreglo de enteros, llamado `estaOrdenadoDescendente`, que retorne true si los elementos del arreglo están ordenados descendentemente, y false en caso contrario.

6. Debe implementar un método, llamado `esPremutacion`, que dado un arreglo de números naturales de longitud `n`, se quiere determinar si los elementos del arreglo corresponden a una permutación de la secuencia `⟨0, 1, 2, . . . , n − 1⟩`.

7. Debe crear un método, llamado `sumaMaxima`, que dado un arreglo de números enteros de longitud `N` , se quiere encontrar el segmento $[p..q)$ en $a[0..N)$, tal que su suma sea la máxima posible. El método debe retornar el valor de la suma.

8. Se quiere que implemente un método llamado `esMatrizSimetrica`, que recibe como entrada una matriz cuadrada de números enteros, y retorna true si la matriz es simétrica, o false en caso contrario.

9. Se quiere que implemente un método llamado `esMatrizTrigangularSuperior`, que recibe como entrada una matriz cuadrada de números enteros, y retorna true si la matriz es triangular superior, o false en caso contrario.

10. Se quiere que implemente un método llamado `esMatrizTrigangularInferior`, que recibe como entrada una matriz cuadrada de números enteros, y retorna true si la matriz es triangular inferior, o false en caso contrario.

11. Se quiere que implemente un método llamado `esMatrizDiagonal`, que recibe como entrada una matriz cuadrada de números enteros, y retorna true si la matriz es diagonal, o false en caso contrario.

12. Debe implementar un método llamado `sumaSecuencia`, que dada una secuencia de números reales, retorne la suma de los valores de la secuencia.

13. Debe crear un método llamado `promedioSecuencia`, que dada una secuencia de números reales, retorne el promedio de los valores de la secuencia.

14. Se quiere agregar a la librería un método llamado `desvStdSecuencia`, que dada una secuencia de números reales, retorne el valor de la desviación estándar de los elementos de la misma. El cálculo de la desviación estándar debe realizar mediante la fórmula $\sqrt{\dfrac{1}{N}\sum_{i=0}^{N}{(S[i] - μ)^2}}$ donde μ es el promedio de la secuencia.

## Condiciones de entrega

Los códigos del laboratorio y la declaración de autenticidad debidamente firmada, deben estar contenidos en un archivo comprimido, con formato tar.xz, llamado LabSem6 X.tar.xz, donde X es el n ́umero de carné del estudiante. La entrega del archivo LabSem6_X.tar.xz, debe hacerse por medio de la plataforma Classroom antes de las 11:50 PM del día domingo
05 de noviembre de 2023.

## Terminados

- [ ] 1. esDivisor
- [ ] 2. esPrimo
- [ ] 3. diferenciaEntreFechas
- [ ] 4. estaOrdenadoAscendente
- [ ] 5. estaOrdenadoDescendente
- [ ] 6. esPremutacion
- [ ] 7. sumaMaxima
- [ ] 8. esMatrizSimetrica
- [ ] 9. esMatrizTrigangularSuperior
- [ ] 10. esMatrizTrigangularInferior
- [ ] 11. esMatrizDiagonal
- [ ] 12. sumaSecuencia
- [ ] 13. promedioSecuencia
- [ ] 14. desvStdSecuencia

## Comando para la Entrega del tar.xz

```bash
tar -cvJf LabSem6_1710526.tar.xz Utilidades.java ../../Declaración\ de\ Autenticidad\ \(Firmada\).pdf
```