import java.util.*;

public class Main {
    public static void main(String[] args) {
        menu_cuentas();
    }

    public static void menu_cuentas(){
        Scanner opcion = new Scanner(System.in);
        Scanner datos= new Scanner(System.in);

        int opcion_cuenta=0;

        List<Cuenta>lstLista=new ArrayList<>();

        while (opcion_cuenta!=5) {
            Cuenta p1= new Cuenta();
            System.out.println("Que accion desea realizar");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Mostrar Cuentas");
            System.out.println("3. Eliminar cuentas");
            System.out.println("4. Buscar cuenta");
            System.out.println("5. Salir ");
            opcion_cuenta= opcion.nextInt();

            switch (opcion_cuenta){
                case 1 :
                    System.out.println("Ingrese su numero de cuenta");
                    p1.setNumero_cuenta(datos.next());
                    System.out.println("Ingrese su numero de cedula");
                    p1.setCedula_usuario(datos.next());
                    System.out.println("Ingrese su saldo actual");
                    p1.setSaldo(datos.nextDouble());
                    lstLista.add(p1);
                    break;
                case 2:
                    for (Cuenta c :lstLista){
                        System.out.println(c);
                    }
                    break;
                case 3:
                    Scanner eliminar_cuenta =new Scanner(System.in);
                    String eliminar;
                    System.out.println("Ingrese el numero de cuenta que desee eliminar");
                    eliminar= eliminar_cuenta.next();
                    for (Cuenta c :lstLista){
                        if (lstLista.isEmpty()){
                            System.out.println("No hay ninguna cuenta");
                        }else if (c.getNumero_cuenta().equalsIgnoreCase(eliminar)){
                            lstLista.remove(c);
                            System.out.println("La cuenta ha sido eliminada");
                        }
                    }
                    break;
                case 4:
                    Scanner buscar_cuenta =new Scanner(System.in);
                    String buscar;
                    System.out.println("Ingrese el numero de cuenta que desee buscar");
                    buscar = buscar_cuenta.next();
                    Cuenta p=null;
                    for (Cuenta c :lstLista){
                            if (lstLista.isEmpty()){
                                System.out.println("No hay ninguna cuenta");
                            }else if (c.getNumero_cuenta().equalsIgnoreCase(buscar)){
                                p=c;
                            } else if (p != null) {
                                menu(p);
                            }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opccion incorrecta");
            }
        }
    }
    public static void menu(Cuenta p){

        Scanner opcion= new Scanner(System.in);
        int op = 0;
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
                    p.ingresar(ingresar.nextDouble());
                    System.out.println("Saldo actual = " + p.getSaldo());
                    break;
                case 2 :
                    Scanner retirar= new Scanner(System.in);
                    System.out.println("Escriba el monto que desea retirar de la cuenta");
                    p.retirar(retirar.nextDouble());
                    System.out.println("Saldo actual = " + p.getSaldo());
                    break;
                case 3:
                    Scanner retiro_rapido= new Scanner(System.in);
                    p.extraccion_rapida(retiro_rapido.nextDouble());
                    System.out.println("Saldo actual = " + p.getSaldo());
                    break;
                case 4:
                    System.out.println("Saldo actual = " + p.getSaldo());
                    break;
                case 5:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opccion incorrecta");
            }
        }
    }
}