package LuSQL.comandos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ayuda_ng {

    public static void menu(Scanner teclado) {
        boolean salir = false;
        while (salir == false) {
            System.out.println("Elija una opción:");
            System.out.println("1 - General.");
            System.out.println("2 - Entorno gráfico.");
            System.out.println("3 - Consola de comandos.");
            System.out.println("4 - Volver.");
            String respuesta = teclado.nextLine();
            try {
                int num = Integer.parseInt(respuesta);
                switch (num) {
                    case 1:
                        System.out.println(general());
                        break;
                    case 2:
                        System.out.println(grafico());
                    case 3:
                        System.out.println(comandos());
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo se aceptan números dentro del rango, vuelva a intentarlo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Solo se aceptan números, vuelva a intentarlo.");
            }
        }
    }

    public static String general() {
        return "LuSQL v1.5 es sencillísima de usar, simplemente introduzca los datos\n"
                + "relativos a la base de datos a usar y dele a siguiente. Luego podrá\n "
                + "ejecutar sus consultas fácilmente además de disponer de ayuda en caso\n;"
                + "de errores en las consultas.\n\n"
                + "Par ainformación más detallada seleccione la ayuda específica.\n\n\n"
                + "LuSQL v1.5   COMPILACIÓN Nº: 2\n"
                + "FECHA: 08/05/2017 ESTADO DE DESARROYO: En proceso\n\n\n"
                + "¡¡¡ATENCIÓN!!!; VERSIÓN EN PRUEBAS E INCOMPLETA, NO SE GARANTIZA EL CORRECTO\n"
                + "FUNCIONAMIENTO Y PUEDE CONTENER GRAN CANTIDAD DE BUGS.";
    }

    public static String grafico() {
        return "CONECTAR CON LA BASE DE DATOS:\n"
                + "Desde la ventana para hacer consultas, vaya al la barra de menús > Nuevo >\n"
                + "> Trabajar con nueva base de datos para que se le abra la ventana de conexión\n"
                + "Introduzca los datos en los campos de la ventana de conexión y dele a\n"
                + "siguiente; LuSQL se encargará de conectarse con la base de datos e\n"
                + "informarle de errores de conexión. Una vez conectado, se abrirá\n"
                + "automáticamente la ventana para hacer consultas desde donde podrá realizar\n"
                + "sus consultas.\n\n"
                + "CONSOLA DE CONSULTAS:\n"
                + "Simplemente haga las consultas que desee a la base de datos, comenzando\n"
                + "por '<' si la consulta produce una entrada de datos (ejemplo: <SELECT *\n"
                + "FROM oficinas ) o comenzando por '>' si la consulta produce una escritura\n"
                + "en la base de datos (ejemplo: >drop OFICINAS ).\n"
                + "Para hacer comentarios, simplemente no utilice '<' ni '>' al principio de\n"
                + "ese tramo de texto.\n"
                + "Para separar las consulta hay que usar al final de cada una ';' (también\n"
                + "al final de los comentarios); esto significa que las consultas pueden\n"
                + "hacerse partidas en varias lineas (los saltos de linea serán equivalentes\n"
                + "a dejar un espacio en blanco.\n\n\n";
    }

    public static String comandos() {
        return "Información no disponible.";
    }
}
