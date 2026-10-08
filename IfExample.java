import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        int edad = input.nextInt();
// Se le pone primero 65 años ya que la funcion de 18 años tambien la cumpliria y por lo tanto si su edad es mayor a 65 años me pondria que es mayor de edad y no jubilado.
        if (edad >= 65) {
            System.out.println("Usted está jubilado");
        } else if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }
}
