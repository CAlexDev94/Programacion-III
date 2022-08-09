package sv.edu.ues.ventas;

/**
 *
 * @author CarlosAlex
 */
public class Producto {

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int aContadorProductos) {
        contadorProductos = aContadorProductos;
    }
    final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    public Producto(int idProducto) {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(int idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

    
    
    
    

}
