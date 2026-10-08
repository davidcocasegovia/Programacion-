import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        int edad = input.nextInt();

        if (edad >= 65) {
            System.out.println("Usted está jubilado");
        } else if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }
}

