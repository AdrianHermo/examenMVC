import java.util.ArrayList;

public class Model {
    public static ArrayList<Coche> aparcamiento = new ArrayList<>();

    /**
     * Añade un coche
     * @param modelo
     * @param matricula
     * @return
     */
    public static Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(modelo, matricula);
        aparcamiento.add(aux);
        return aux;
    }

    /**
     * Busca un coche por matricula
     * @param matricula
     * @return
     */
    public static Coche getCoche(String matricula) {
        for (Coche c: aparcamiento) {
            if (c.getMatricula().equals(matricula)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Aumenta la velocidad
     * @param matricula
     * @param velocidad
     */
    public static void cambiarVelocidad(String matricula, int velocidad) {
        Coche aux = getCoche(matricula);
        aux.setVelocidad(aux.getVelocidad() + velocidad);
    };

    /**
     * Añade gasolina
     * @return
     */
    public static boolean echarGasolina(String matricula, int litros) {
        Coche c = getCoche(matricula);
        c.gasolina += litros;
        return true;
    }

    public static boolean avanzar(String matricula, int m) {
        Coche c = getCoche(matricula);
        c.avanzar(m);
        return true;
    }
}