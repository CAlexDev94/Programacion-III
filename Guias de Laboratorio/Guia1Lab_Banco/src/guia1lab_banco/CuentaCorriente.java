package guia1lab_banco;

import java.util.ArrayList;

/**
 * @author CarlosAlex
 */
public class CuentaCorriente {

    //Atributos de la clase CuentaCorriente
    private String numero = "";
    private double saldo;
    private String nombre;
    private String telefono;
    private ArrayList<String> movimientos = new ArrayList<String>();

    // Metodo para abonar dinero a una cuenta. El movimiento se guarda en la coleccion
    public void abono(int dinero) {
        saldo += dinero;
        movimientos.add("Abono de $" + dinero + "Saldo $" + String.format("%.2f", saldo));
    }

    // Metodo para sacar dinero a una cuenta. El movimiento se guarda en la coleccion
    public void cargo(int dinero) {
        saldo -= dinero;
        movimientos.add("Abono de $" + dinero + "Saldo $" + String.format("%.2f", saldo));
    }

    // Metodo genera numeros aleatorios
    public void transferencia(CuentaCorriente cuentaDestino, int dinero) {
        saldo -= dinero;
        cuentaDestino.saldo += dinero;
        movimientos.add("Transf. emitida de $" + dinero + "a la cuenta" + cuentaDestino.numero
                + "Saldo : $" + String.format("%.2f", saldo));
        cuentaDestino.movimientos.add("Trans. recibida de $" + dinero + "de la cuenta" + numero
                + "Saldo $" + String.format("%.2f", cuentaDestino.saldo));
    }

    // Metodo que lista los movimientos que se hicieron en una cuenta
    public void movimientos() {
        System.out.println("!********************!");
        System.out.println("Movimientos de la cuenta" + numero);
        System.out.println("Cuenta a nombre de:" + nombre);
        System.out.println("Telefono" + telefono);
        System.out.println("!---------------------!");
        for (String movimiento : movimientos) {
            System.out.println(movimiento);
        }

    }
    // Metodo genera numeros aleatorios

    public void generaNumero() {
        for (int i = 0; i < 10; i++) {
            numero += (int) (Math.random());
        }
    }

    //Constructor sin parametros
    public CuentaCorriente() {
        this.generaNumero();
    }
//Constructor con parametros

    public CuentaCorriente(String nombre, String telefono, double saldo) {
       
        this.saldo = saldo;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<String> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<String> movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return "Numero de cta:" + numero + "Saldo: $" + String.format("%.2f", saldo);
    }

}
