package LuSQL.comandos;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Iniciar {

    public static void main(String[] args) {
        try {
            switch (args[0]) {
                case "-c":
                    initMessage(false);
                    System.out.println("Función no disponible.");
                    break;
                case "-ng":
                    initMessage(false);
                    Consola_ng.init();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            initMessage(true);
            new LuSQL.grafica.Consola();
        }

    }

    public static void desplegarAyuda() {
        JOptionPane.showMessageDialog(null, Ayuda_ng.general(), "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void desplegarCreditos() {
        JOptionPane.showMessageDialog(null, "COMPILACIÓN: 2  FECHA: 08/05/2017",
                "Créditos", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void initMessage(boolean m) {
        String mess = "Esta es una version con funcionalidad reducida o baja\n"
                + "y sin ninguna garantía de buen funcionamiento. Simplemente es de\n"
                + "prueba y tampoco se garantiza que la ayuda estea adecuada a la\n"
                + "realidad.";
        if (m == false) {
            System.out.println("----------"
                    + "IMPORTANTE\n"
                    + mess + "\n"
                    + "----------");            

        } else {
            JOptionPane.showMessageDialog(null, mess, "Importante LuSQL v1.5", JOptionPane.WARNING_MESSAGE);
        }
    }
}
