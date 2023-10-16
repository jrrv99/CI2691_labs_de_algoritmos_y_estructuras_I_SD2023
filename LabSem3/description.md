# Laboratorio de la semana 3

## 1. Descripción de la actividad

Se quiere que haga la implementación en JML de la solución de los problemas presentados en Laboratorio de la semana 2. Su solución debe incluir invariantes y funciones de cotas, en caso de usar iteradores. Observe que en clase se dio una versión del programa EsNumeroPrimo.java. Deben hacer una versión propia. Su solución debe seguir las estrategias de codificación vistas en clase. Se recomienda chequear estáticamente, con la opción --esc de Openjml, todos sus programas. Solo los programas que usen funciones de agregación como sum o prod, no deben ser chequeados, porque esas funciones no están implementadas en el analizador estático.

## 2. Condiciones de entrega

Los programas del laboratorio (solo los archivos .java) y la declaración de autenticidad debidamente firmada, deben estar contenidos en un archivo comprimido, con formato .tar.xz, llamado LabSem3_X.tar.xz, donde X es el número de carné del estudiante. La entrega del archivo LabSem3_X.tar.xz, debe hacerse por medio de la plataforma Classroom antes de las 11:50 PM del día domingo 15 de octubre de 2023.

## Completados

- [ ] AreaPerimetroCirculo
- [ ] MinimoDeCuatro
- [ ] EsAnioBisiesto
- [ ] EsNumeroPrimo
- [ ] SonNumerosCoprimos

## Comando para la entrega del archivo comprimido

```
tar -cvJf LabSem3_<YOUR_CARNET>.tar.xz AreaPerimetroCirculo.java MinimoDeCuatro.java EsAnioBisiesto.java EsNumeroPrimo.java SonNumerosCoprimos.java
```