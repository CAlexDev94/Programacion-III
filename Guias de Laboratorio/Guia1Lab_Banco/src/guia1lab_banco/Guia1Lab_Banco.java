package guia1lab_banco;

/**
 * Guia de Laboratorio 1 - Ejercicio 1
 *
 * @author CarlosAlex
 */
public class Guia1Lab_Banco {

    public static void main(String[] args) {
        // Declarando objetos de tipo CuentaCorriente
        CuentaCorriente cuenta1 = new CuentaCorriente();

        CuentaCorriente cuenta2 = new CuentaCorriente("Sara Granadino", "2206-9510", 1500);
        CuentaCorriente cuenta3 = new CuentaCorriente("Adriana Padilla", "2285-7741", 6000);

        // Asignando un nombre a cuenta1
        cuenta1.setNombre("Alberto Fernandez");

        // Asignando un telefono a cuenta1
        cuenta1.setTelefono("2216-1917");

        // cargando a cuenta1
        cuenta1.cargo(600);

        // Abonando a cuenta3
        cuenta3.abono(75);

        // Cargando a cuenta1
        cuenta1.cargo(55);

        // Transfiriendo de cuenta2 a cuenta1
        cuenta2.transferencia(cuenta1, 100);

        // Transfiriendo de cuenta1 a cuenta3
        cuenta1.transferencia(cuenta3, 250);

        // Transfiriendo de cuenta3 a cuenta1
        cuenta1.transferencia(cuenta1, 22);

        // Mostrando todos los moevimientos de cuenta1
        cuenta1.movimientos();

    }

}
