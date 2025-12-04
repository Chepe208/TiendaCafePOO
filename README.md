# TiendaCafePOO

Este proyecto es una actividad en Java que representa el funcionamiento básico de una tienda de café.
El objetivo es trabajar conceptos de Programación Orientada a Objetos (POO) mediante la creación de una clase que modela un producto de café y una clase principal que realiza acciones sobre esos productos.

Descripción del proyecto

El sistema crea objetos de café con sus características principales, mostrar su información, calcular valores totales, actualizar cantidades y aplicar descuentos.
También se realizan pruebas desde una clase principal para verificar el funcionamiento de los métodos.

Contenido del proyecto
Clase Cafe

La clase Cafe representa un tipo de café dentro de la tienda. Contiene los siguientes elementos:

**Atributos:**

-nombre
-region
-precioPorKilo
-cantidadEnKilos

**Métodos principales:**

**Constructor:** inicializa los datos del café.

-mostrarInformacion(): muestra los detalles del producto.

-calcularPrecioTotal(): calcula el valor total según el precio por kilo y la cantidad disponible.

-actualizarCantidad(float nuevaCantidad): cambia la cantidad disponible del café.

-aplicarDescuento(double porcentaje): disminuye el precio por kilo según un porcentaje indicado.

Métodos getters y setters para consultar o modificar información de forma controlada.

**Clase TiendaCafe**

Esta clase contiene el método main y se encarga de:

-Crear tres objetos de tipo Cafe con datos de diferentes regiones de Colombia.

-Mostrar la información de cada producto.

-Calcular y mostrar el valor total de cada café.

-Actualizar la cantidad de uno de los cafés y mostrar el cambio.

-Aplicar descuentos a los productos y mostrar los resultados.

-Calcular y mostrar el valor total del inventario.

**Uso del proyecto**

El programa se ejecuta desde la clase TiendaCafe.
Al ejecutarlo, se podrán ver en consola todos los datos de los cafés registrados, sus valores totales, actualizaciones de inventario y la aplicación de descuentos.

**Rama de mejoras**

Además de la rama principal, se creó una rama llamada mejoras donde se agregó el método aplicarDescuento a la clase Cafe. Esta rama contiene el cambio adicional solicitado en la actividad.
