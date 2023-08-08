
package mavenproject.manejodeenumeraciones;

/**
 *
 * @author SG702-03
 */
public class ManejoDeEnumeraciones {

    /**
     * @param args the command line arguments
     */
    // Definición de la enumeración
    enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        // Acceso a los valores de la enumeración
        DiaSemana dia = DiaSemana.MIERCOLES;

        // Switch para manejar los valores de la enumeración
        switch (dia) {
            case LUNES:
                System.out.println("Es lunes, ánimo!");
                break;
            case MIERCOLES:
                System.out.println("Mitad de semana!");
                break;
            case VIERNES:
                System.out.println("Viernes, fin de la semana laboral!");
                break;
            default:
                System.out.println("Es otro día de la semana.");
        }

        // Recorrido de todos los valores de la enumeración
        System.out.println("Días de la semana:");
        for (DiaSemana d : DiaSemana.values()) {
            System.out.println(d);
        }
    }
}
