package com.example;

public class TiendaCafe {
    public static void main(String[] args) {

        System.out.println(" SISTEMA DE GESTION - TIENDA DE CAFE POO ");

        // Un objeto es una instancia específica de una clase
        // La palabra new crea el objeto en memoria y llama al constructor
        System.out.println("Creando objetos de la clase Cafe...\n");
        
        // Objeto 1: Café de Nariño
        // Creamos una instancia de la clase Cafe con datos específicos
        Cafe cafe1 = new Cafe(
            "Cafe Premium de Nariño",
            "Nariño",
            45000.0,
            12.5f
        );
        
        // Objeto 2: Café de Antioquia
        Cafe cafe2 = new Cafe(
            "Cafe Especial de Antioquia",
            "Antioquia",
            38000.0,
            20.0f
        );
        
        // Objeto 3: Café del Eje Cafetero
        Cafe cafe3 = new Cafe(
            "Cafe del Eje Cafetero",
            "Caldas",
            42000.0,
            15.0f
        );
        
        System.out.println("3 objetos creados exitosamente!\n");

        // Los métodos se invocan usando la sintaxis: nombreObjeto.nombreMetodo()
        // Esto es parte del comportamiento del objeto
        System.out.println(" Invetario Actual De los Productos ");
        System.out.println("                                   ");
        
        // Llamamos al método mostrarInformacion() de cada objeto
        // Este es un método void, no retorna valor, solo ejecuta acciones
        System.out.println("PRODUCTO 1:");
        cafe1.mostrarInformacion();
        System.out.println();
        
        System.out.println("PRODUCTO 2:");
        cafe2.mostrarInformacion();
        System.out.println();
        
        System.out.println("PRODUCTO 3:");
        cafe3.mostrarInformacion();
        System.out.println();

        System.out.println(" VALOR TOTAL DEL INVENTARIO POR PRODUCTO ");
        
        // El método calcularPrecioTotal() retorna un valor de tipo double
        // Guardamos el resultado en variables para poder usarlo después
        double totalCafe1 = cafe1.calcularPrecioTotal();
        double totalCafe2 = cafe2.calcularPrecioTotal();
        double totalCafe3 = cafe3.calcularPrecioTotal();
        
        // Usamos los métodos getter para obtener información de los objetos
        // Los getters nos permiten acceder a los atributos privados de forma controlada
        System.out.println("• " + cafe1.getNombre());
        System.out.println("  Cantidad: " + cafe1.getCantidadEnKilos() + " kg");
        System.out.println("  Precio/kg: $" + String.format("%,.0f", cafe1.getPrecioPorKilo()) + " COP");
        System.out.println("  Valor total: $" + String.format("%,.0f", totalCafe1) + " COP\n");
        
        System.out.println("• " + cafe2.getNombre());
        System.out.println("  Cantidad: " + cafe2.getCantidadEnKilos() + " kg");
        System.out.println("  Precio/kg: $" + String.format("%,.0f", cafe2.getPrecioPorKilo()) + " COP");
        System.out.println("  Valor total: $" + String.format("%,.0f", totalCafe2) + " COP\n");
        
        System.out.println("• " + cafe3.getNombre());
        System.out.println("  Cantidad: " + cafe3.getCantidadEnKilos() + " kg");
        System.out.println("  Precio/kg: $" + String.format("%,.0f", cafe3.getPrecioPorKilo()) + " COP");
        System.out.println("  Valor total: $" + String.format("%,.0f", totalCafe3) + " COP\n");
        
        // Calculamos el total sumando los valores individuales
        double valorTotalInventario = totalCafe1 + totalCafe2 + totalCafe3;
        
        System.out.println("  VALOR TOTAL DEL INVENTARIO: $" + 
        String.format("%,.0f", valorTotalInventario) + " COP");

        System.out.println(" Actualizacion De Inventario ");
        
        System.out.println("Se recibió un nuevo lote de " + cafe2.getNombre());
        System.out.println("Cantidad anterior: " + cafe2.getCantidadEnKilos() + " kg");
        
        // Usamos un método setter para modificar el estado del objeto
        // Este método actualiza el atributo cantidadEnKilos
        cafe2.actualizarCantidad(25.0f);
        
        System.out.println("Cantidad nueva: " + cafe2.getCantidadEnKilos() + " kg\n");
        
        // Mostramos la información actualizada
        System.out.println("INFORMACION ACTUALIZADA:");
        cafe2.mostrarInformacion();
        System.out.println();
        
        // Recalculamos el precio total con la nueva cantidad
        System.out.println("Nuevo valor total de este producto: $" + 
        String.format("%,.0f", cafe2.calcularPrecioTotal()) + " COP\n");
    }
}