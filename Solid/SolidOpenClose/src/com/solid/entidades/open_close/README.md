# Ejemplo de Implementación del Principio Open/Closed (OCP) - SOLID

En este proyecto se implementan dos estrategias diferentes para calcular el precio de una oferta utilizando el principio Open/Closed (OCP) del SOLID. La problemática que se aborda es la necesidad de extender el comportamiento de cálculo de precios sin modificar el código existente.

## Problemática
En un sistema de gestión de ofertas, se requiere la capacidad de calcular el precio de una oferta de diferentes maneras, como aplicar un aumento del 10% o un descuento del 10%, sin modificar el código existente. Sin embargo, agregar nuevas estrategias de cálculo de precios directamente en la clase principal podría violar el principio OCP, ya que requeriría modificar la clase existente cada vez que se agregue una nueva estrategia.

## Solución
Para abordar esta problemática y cumplir con el principio OCP, se utilizan dos clases (`CalculadoraAumento` y `CalculadoraDescuento`) que implementan la interfaz `Calculadora`. Cada clase proporciona una estrategia diferente para calcular el precio de una oferta, sin modificar la clase principal que utiliza estas estrategias. Esto se logra mediante la creación de una interfaz común (`Calculadora`) que define el contrato para calcular el precio, permitiendo así la extensión del comportamiento de cálculo de precios sin modificar el código existente.

## Guía para Explorar el Código
- **Clase Principal**: La clase principal que utiliza las estrategias de cálculo de precios se encuentra en `Main.java`.
- **Estrategia de Aumento**: La estrategia de aumento del 10% se implementa en la clase `CalculadoraAumento`.
- **Estrategia de Descuento**: La estrategia de descuento del 10% se implementa en la clase `CalculadoraDescuento`.
- **Interfaz Común**: La interfaz común `Calculadora` se encuentra en `Calculadora.java`.
- **Main**: El punto de entrada del programa se encuentra en la clase `Main.java`.

¡Explora el código y comprueba cómo se cumple el principio OCP en la implementación de las estrategias de cálculo de precios!
