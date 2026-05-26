public class Controller {

    /**
     * Añade  coches de prueba
     * @return
     */
    public static boolean engadirCochesProba() {
        Model.crearCoche("Ferrari", "312");
        Model.crearCoche("BMW", "246");
        Model.crearCoche("Fiat", "479");
        return true;
    }
    /**
     * Añade un coche
     * @return
     */
    public static boolean crearCoche() {
        String modelo = View.pedirModelo();
        String matricula = View.pedirMatricula();
        Model.crearCoche(
                matricula,
                modelo);
        return true;
    };

    /**
     * Modifica la velocidad
     * @return
     */
    public static boolean modificaVelocidad() {
        String mat = View.pedirMatricula();
        int v = View.pedirVelocidad();
        Model.cambiarVelocidad(mat, v);
        return true;
    }

    /**
     * Hace una lista de coches
     * @return
     */
    public static String listaCoches() {
        StringBuilder aux = new StringBuilder("\n+++ Lista de coches:\n");
        for (Coche c: Model.aparcamiento) {
            aux.append("\nModelo ").append(c.getModelo())
                    .append(" Matricula ").append(c.getMatricula())
                    .append("\nDistancia: ").append(c.distancia)
                    .append(" Gasolina ").append(c.gasolina)
                    .append(" Velocidad ").append(c.getVelocidad())
                    .append("\n");
        }

        return aux.toString();
    }

    /**
     * Añade gasolina a un coche
     * @return
     */
    public static boolean echarGasolina() {
        String mat = View.pedirMatricula();
        int l = View.pedirGasolina();
        Model.echarGasolina(mat, l);
            View.msg("Se echo " + l + " l de gasolina en la matricula: " + mat);

        return true;
    }

    /**
     * Avanza metros
     * @return
     */
    public static boolean avanzar() {
        String mat = View.pedirMatricula();
        int m = View.pedirDistancia();
        Model.avanzar(mat, m);
        View.msg("Se avanzo " + m + " con la matriucla " + mat);
        return true;
    }

}