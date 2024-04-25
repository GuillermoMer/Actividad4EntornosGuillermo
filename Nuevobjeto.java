/*dos objetos, un rombo y un trapecio*/ 
package nuevobjeto;
public class Nuevobjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
            System.out.println("Yo soy Alfarius y este print es una mentira");
        miCuenta = new CCuenta("Marta Ruiz", "1000-2365-85-123456789", 4000, 0);
        try {
            miCuenta.retirar(3600);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(995);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);
    }

}