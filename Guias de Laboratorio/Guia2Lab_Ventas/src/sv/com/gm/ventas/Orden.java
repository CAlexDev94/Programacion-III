package sv.com.gm.ventas;

/**
 *
 * @author CarlosAlex
 */
public class Orden {

    int idOrden;
    Producto productos[];
    static int contadorOrdenes;
    int contadorProductos;
    static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.printf("Se ha superado el maximo" + "de productos:" + Orden.MAX_PRODUCTOS);
        }

    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Id Orden:" + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden: $" + totalOrden);
        System.out.println("Productos de la Orden:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }

}
