package sv.com.gm.ventas.test;

import sv.com.gm.ventas.Orden;
import sv.com.gm.ventas.Producto;

/**
 * Guia 2 - Ejercicio 1
 *
 * @author CarlosAlex
 */
public class Ventas {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

    }

}
