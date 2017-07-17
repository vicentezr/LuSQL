package LuSQL;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Iniciar {

    public static void main(String[] args) {
        Iniciar.initMessage();
        new Consola();
    }

    public static void desplegarAyuda() {
        JOptionPane.showMessageDialog(null, "LuSQL v1.5 es sencillísima de usar, simplemente introduzca los datos\n"
                + "relativos a la base de datos a usar y dele a siguiente. Luego podrá\n "
                + "ejecutar sus consultas fácilmente además de disponer de ayuda en caso\n;"
                + "de errores en las consultas.\n\n"
                + "CONECTAR CON LA BASE DE DATOS:\n"
                + "Introduzca los datos en los campos de la ventana de conexión y dele a\n"
                + "siguiente; LuSQL se encargará de conectarse con la base de datos e\n"
                + "informarle de errores de conexión. Una vez conectado, se abrirá\n"
                + "automáticamente la ventana de consola donde podrá realizar sus consultas.\n\n"
                + "CONSOLA DE CONSULTAS:\n"
                + "Simplemente haga las consultas que desee a la base de datos, comenzando\n"
                + "por '<' si produce una entrada de datos (ejemplo: <SELECT * FROM oficinas )\n"
                + "o comenzando por '>' si la consulta produce una escritura en la base\n"
                + "de datos (ejemplo: >drop OFICINAS ). Para hacer comentarios, simplemente\n"
                + "no utilice '<' ni '>' al principio de ese tramo de texto.\n"
                + "Para separar las consulta hay que usar al final de cada una ';' (también\n"
                + "al final de los comentarios); esto significa que las consultas pueden\n"
                + "hacerse partidas en varias lineas (los saltos de linea serán equivalentes\n"
                + "a dejar un espacio en blanco.\n\n\n"
                + "LuSQL v1.5   COMPILACIÓN Nº: 2\n"
                + "FECHA: 08/05/2017 ESTADO DE DESARROYO: En proceso\n\n\n"
                + "¡¡¡ATENCIÓN!!!; VERSIÓN EN PRUEBAS E INCOMPLETA, NO SE GARANTIZA EL CORRECTO\n"
                + "FUNCIONAMIENTO Y PUEDE CONTENER GRAN CANTIDAD DE BUGS."
                + "¡¡LAS CONSULTAS QUE RETORNAN DATOS NO RETORNARÁN DATOS (EJEMPLO: SELECT )\n"
                + "EN ESTA VERSIÓN DE LuSQL, SOLO VALIDARÁ QUE ESTE BIÉN HECHA; LAS DE\n"
                + "ESCRITURA SÍ QUE FUNCIONAN CORRECTAMENTE (A PARTE DE VALIDAR SI ESTÁN\n"
                + "BIEN HECHAS)!!.",
                "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void desplegarCreditos() {
        JOptionPane.showMessageDialog(null, "COMPILACIÓN: 2  FECHA: 08/05/2017",
                "Créditos", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void initMessage() {
        JOptionPane.showMessageDialog(null, "Esta es una version con funcionalidad reducida o baja\n "
                + "y sin ninguna garantía de buen funcionamiento. Simplemente es de\n "
                + "prueba y tampoco se garantiza que la ayuda estea adecuada a la\n"
                + "realidad. ", "Importante LuSQL v1.5", JOptionPane.WARNING_MESSAGE);
    }
}
