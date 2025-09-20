import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();


    }

    public static void menu(){
        Scanner opcion= new Scanner(System.in);
        int op = 0;


        Scanner datos= new Scanner(System.in);
        Cuenta p1= new Cuenta();

        System.out.println("Ingrese su numero de cuenta");
        p1.setNumero_cuenta(datos.next());
        System.out.println("Ingrese su numero de cedula");
        p1.setCedula_usuario(datos.next());
        System.out.println("Ingrese su saldo actual");
        p1.setSaldo(datos.nextDouble());


        while (op !=5){

            System.out.println("Bienvenido a su cuenta");
            System.out.println("Que accion desea realizar");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extraccion Rapida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Salir ");
            op= opcion.nextInt();

            switch (op){
                case 1 :
                    Scanner ingresar= new Scanner(System.in);
                    System.out.println("Escriba el monto que desea añadir a la cuenta");

                    p1.ingresar(ingresar.nextDouble());
                    System.out.println("Saldo actual = " + p1.getSaldo());
                    break;
                case 2 :
                    Scanner retirar= new Scanner(System.in);
                    System.out.println("Escriba el monto que desea retirar de la cuenta");

                    p1.retirar(retirar.nextDouble());
                    System.out.println("Saldo actual = " + p1.getSaldo());
                    break;
                case 3:
                    Scanner retiro_rapido= new Scanner(System.in);
                    p1.extraccion_rapida(retiro_rapido.nextDouble());

                    System.out.println("Saldo actual = " + p1.getSaldo());
                    break;
                case 4:
                    System.out.println("Saldo actual = " + p1.getSaldo());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opccion incorrecta");

            }
        }
    }
}