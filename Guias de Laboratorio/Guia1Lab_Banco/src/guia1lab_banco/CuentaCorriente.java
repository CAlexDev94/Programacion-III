package guia1lab_banco;

import java.util.ArrayList;

/**
 *
 * @author CarlosAlex
 */
public class CuentaCorriente {

    //Atributos de la clase CuentaCorriente
    private String numero = "";
    private double saldo;
    private String nombre;
    private String telefono;
    private ArrayList<String> movimientos = new ArrayList<String>();

    //Constructor sin parametros
    public CuentaCorriente() {
    }
//Constructor con parametros

    public CuentaCorriente(double saldo, String nombre, String telefono) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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

    public ArrayList<String> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<String> movimientos) {
        this.movimientos = movimientos;
    }

    // Metodo genera numeros aleatorios
    public void generaNumero() {
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "numero=" + numero + ", saldo=" + saldo + ", nombre=" + nombre + ", telefono=" + telefono + ", movimientos=" + movimientos + '}';
    }

}
