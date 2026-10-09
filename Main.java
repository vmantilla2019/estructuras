package javaapplication8;

public class Main {

    public static void main(String[] args) {

        Maquillaje maquillaje1 = new Maquillaje(
                "Maybelline", "Labial", "Rojo", 25000, 2
        );

        Maquillaje maquillaje2 = new Maquillaje(
                "Vogue", "Polvo", "Beige", 35000, 1
        );

        Maquillaje maquillaje3 = new Maquillaje(
                "MAC", "Base"
        );

        System.out.println("MAQUILLAJE 1");
        System.out.println("Marca: " + maquillaje1.getMarca());
        System.out.println("Producto: " + maquillaje1.getProducto());

        System.out.println();

        System.out.println("MAQUILLAJE 2");
        System.out.println("Marca: " + maquillaje2.getMarca());
        System.out.println("Producto: " + maquillaje2.getProducto());

        System.out.println();

        System.out.println("MAQUILLAJE 3");
        System.out.println("Marca: " + maquillaje3.getMarca());
        System.out.println("Producto: " + maquillaje3.getProducto());

        System.out.println();

        maquillaje1.mostrarInformacion();
        System.out.println("Precio con descuento: "
                + maquillaje1.calcularPrecioTotal(10));

        maquillaje2.cambiarColor("Marrón");
        maquillaje2.aumentarCantidad(2);
        maquillaje2.mostrarInformacion(true);

        System.out.println("¿Es costoso? " + maquillaje3.esCostoso());
    }
}
