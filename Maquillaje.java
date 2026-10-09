package javaapplication8;

public class Maquillaje {

    private String marca;
    private String producto;
    private String color;
    private double precio;
    private int cantidad;

    public Maquillaje() {
        this.marca = "Genérica";
        this.producto = "Labial";
        this.color = "Rojo";
        this.precio = 15000;
        this.cantidad = 1;
    }

    public Maquillaje(String marca, String producto, String color, double precio, int cantidad) {
        this.marca = marca;
        this.producto = producto;
        this.color = color;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Maquillaje(String marca, String producto) {
        this.marca = marca;
        this.producto = producto;
        this.color = "Rosa";
        this.precio = 20000;
        this.cantidad = 1;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Producto: " + producto);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    public void mostrarInformacion(boolean mostrarPrecio) {
        System.out.println("Producto: " + producto);
        if (mostrarPrecio) {
            System.out.println("Precio: " + precio);
        }
    }

    public double calcularPrecioTotal() {
        return precio * cantidad;
    }

    public double calcularPrecioTotal(double descuento) {
        return (precio * cantidad) * (1 - descuento / 100);
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public void aumentarCantidad(int unidades) {
        this.cantidad += unidades;
    }

    public boolean esCostoso() {
        return precio > 50000;
    }
}
