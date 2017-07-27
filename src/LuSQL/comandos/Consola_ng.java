package LuSQL.comandos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Consola_ng {

    static String tipo;
    static String ruta;
    static String puerto;
    static String base;
    static String usuario;
    static String contrasena;
    static Scanner teclado = new Scanner(System.in);

    public static void init() {
        System.out.println("Seleccione el tipo de base de datos:");
        System.out.println("1 - SQLServer");
        System.out.println("2 - MySQL");
        System.out.println("3 - PostgreSQL");
        boolean salir = false;
        while (salir) {
            String n = teclado.nextLine();
            try {
                int num = Integer.parseInt(n);
                switch (num) {
                    case 1:
                        base = "SQLServer";
                        salir = true;
                        break;
                    case 2:
                        base = "MySQL";
                        salir = true;
                        break;
                    case 3:
                        base = "PostgreSQL";
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo se aceptan número dentro del rango, vuelva a intentarlo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Solo se aceptan números, vuelva a intentarlo.");
            }
        }
        System.out.println("Escriba la ruta de la base de datos (host):");
        ruta = teclado.nextLine();
        System.out.println("Escriba el puerto (sin nada se coge por defecto):");
        puerto = teclado.nextLine();
        System.out.println("Escriba el nombre de la base de datos:");
        base = teclado.nextLine();
        System.out.println("Escriba el usuario:");
        usuario = teclado.nextLine();
        System.out.println("Escriba la contraseña:");
        contrasena = teclado.nextLine();
    }

    public static void menu() {
        while (true) {
        System.out.println("Elija una opción:");
        System.out.println("1 - Hacer consulta/s");
        System.out.println("2 - Salir");
        System.out.println("3 - Ayuda");
            String n = teclado.nextLine();
            try {
                int num = Integer.parseInt(n);
                switch (num) {
                    case 1:
                        hacer();
                        break;
                    case 2:
                        System.exit(0);
                    case 3:
                        Ayuda_ng.menu(teclado);
                        break;
                    default:
                        System.out.println("Solo se aceptan números dentro del rango, vuelva a intentarlo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Solo se aceptan números, vuelva a intentarlo.");
            }
        }
    }
    
    public static void hacer() {
        
    }

    //el rango va de 1 a rango - 1.
    public static int entradaN(int rango) {
        while (true) {
            String n = teclado.nextLine();
            try {
                int num = Integer.parseInt(n);
                for (int i = 1; i < rango; i++) {
                    if (i == num) {
                        return num;
                    }
                }
                System.out.println("Solo se aceptan número dentro del rango, vuelva a intentarlo.");
            } catch (NumberFormatException e) {
                System.out.println("Solo se aceptan números, vuelva a intentarlo.");
            }
        }
    }
}
