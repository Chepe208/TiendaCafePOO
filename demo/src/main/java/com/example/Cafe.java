package com.example;

public class Cafe {

    // Los atributos son las características del objeto
    // Se pone como private para que sea un encapsulamiento
    private String nombre;
    private String region;
    private double precioPorKilo;
    private float cantidadEnKilos;
    

    // El constructor es un método especial que se ejecuta al crear un objeto
    //Inicializa todos los atributos del objeto cuando se crea
    public Cafe(String nombre, String region, double precioPorKilo, float cantidadEnKilos) {
        // this se usa para referenciar los atributos de la instancia actual
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }
    
    // Los métodos definen el comportamiiento del objeto o las acciones que puede realizar
    //Método que muestra la información completa del café
    public void mostrarInformacion() {
        System.out.println("Nombre del cafe: " + this.nombre);
        System.out.println("Region de origen: " + this.region);
        System.out.println("Precio por kilo: $" + String.format("%,.0f", this.precioPorKilo) + " COP");
        System.out.println("Cantidad disponible: " + this.cantidadEnKilos + " kg");
    }
    
    //Método que calcula el valor total del inventario con un método double
    public double calcularPrecioTotal() {
        // Fórmula: precio unitario multiplicado por cantidad
        double precioTotal = this.precioPorKilo * this.cantidadEnKilos;
        return precioTotal;
    }
    
    //Método que actualiza la cantidad disponible del café con un tipo de metodo void
    public void actualizarCantidad(float nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
        System.out.println("Cantidad actualizada a " + nuevaCantidad + " kg");
    }
    
    // Los getters hacen que puedan acceder a los atributos privados desde fuera de la clase
    // Mantieniendo la encapsulacion y el control sobre los datos
    
    //Obtiene el nombre del café y retorna el nombre del café
    public String getNombre() {
        return this.nombre;
    }
    
    //Obtiene la región de origen del café y retorna la región del café
    public String getRegion() {
        return this.region;
    }
    
    //Obtiene el precio por kilogramo del café y retorna el precio por kilo en COP
    public double getPrecioPorKilo() {
        return this.precioPorKilo;
    }
    
    // Obtiene la cantidad disponible del café y retorna la cantidad en kg
    public float getCantidadEnKilos() {
        return this.cantidadEnKilos;
    }
    
    // Establece una nueva región de origen
    public void setRegion(String nuevaRegion) {
        this.region = nuevaRegion;
    }

    public void aplicarDescuento(double porcentaje) {
        // Validación del porcentaje
        if (porcentaje > 0 && porcentaje <= 100) {
            
            // Guardamos el precio original
            double precioAnterior = this.precioPorKilo;
            
            // Calculamos el descuento
            double descuento = this.precioPorKilo * (porcentaje / 100);
            
            // Aplicamos el descuento
            this.precioPorKilo = this.precioPorKilo - descuento;
            
            // Mostramos confirmación
            System.out.println(" El Descuento fue Aplicado");
            System.out.println(" Producto: " + this.nombre);
            System.out.println(" Porcentaje de descuento: " + porcentaje + "%");
            System.out.println(" Precio anterior: $" + String.format("%,.0f", precioAnterior) + " COP");
            System.out.println(" Valor del descuento: $" + String.format("%,.0f", descuento) + " COP");
            System.out.println(" Precio nuevo: $" + String.format("%,.0f", this.precioPorKilo) + " COP");
            
        } else {
            // Error si el porcentaje no es válido
            System.out.println(" ERROR: Porcentaje de descuento invalido");
            System.out.println("  El porcentaje debe estar entre 0 y 100");
            System.out.println("  Valor recibido: " + porcentaje);
        }
    }
}