import java.util.Scanner;

public class Prueba{

public static void main(String[] args) {
// Constante  del IVA
final double IVA=0.21;
// Variables para guardar los datos introducidos
            Scanner sc = new Scanner(System.in);
        // Variables para guardar los datos introducidos
        String nombreCliente;
        char codigoSeccion;
        int numeroArticulos;
        double precioUnitario;
        // Pedir datos al usuario
        System.out.print("Nombre del cliente: ");
        nombreCliente = sc.nextLine();
        
        System.out.print("Codigo de seccion: ");
        codigoSeccion = sc.next().charAt(0);
        
        System.out.print("Numero de articulos: ");
        numeroArticulos = sc.nextInt();
        
        System.out.print("Precio unitario: ");
        precioUnitario = sc.nextDouble();
        // Calcular el subtotal
        double subtotal = numeroArticulos * precioUnitario;
        // Calcular el total con IVA
        double totalConIva = subtotal + (subtotal * IVA);
        // Comprobar si se cumplen las dos condiciones para aplicar el descuento
        boolean descuentoAplicable = numeroArticulos > 5 && totalConIva > 50.0;
        // Convertir el total a entero eliminando los decimales
        int puntosAcumulados = (int) totalConIva;
        // Mostrar los resultados
        System.out.println();
        System.out.println("Cliente: " + nombreCliente
                + " | Seccion: " + codigoSeccion);
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("Total con IVA: %.2f%n", totalConIva);
        System.out.println("Descuento aplicable: " + descuentoAplicable);
        System.out.println("Puntos acumulados: " + puntosAcumulados);
// Cerrar Scanner
sc.close();
    }
}
