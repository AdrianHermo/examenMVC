import java.util.Scanner;

public class View {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        Controller.engadirCochesProba();
        int d = 1;
        while (d!=0) {
            System.out.println("Coches");
            System.out.println("0. Salir");
            System.out.println("1. Crea Coche");
            System.out.println("2. Modifica velocidad");
            System.out.println("3. Mostrar los coches");
            System.out.println("4. Echar gasofa");
            System.out.println("5. Avanzar");
            d = sc.nextInt();
            switch (d) {
                case 1 -> Controller.crearCoche();
                case 2 -> Controller.modificaVelocidad();
                case 3 -> System.out.println(Controller.listaCoches());
                case 4 -> Controller.echarGasolina();
                case 5 -> Controller.avanzar();

            }
        }
    }

    /**
     * Pide la matricula
     * @return
     */
    public static String pedirMatricula() {
        System.out.println("Introduce matricula: ");
        String mat = sc.next();
        return mat;
    }
    /**
     * Pide el modelo
     * @return
     */
    public static String pedirModelo() {
        System.out.println("Introduce modelo: ");
        return sc.next();
    }
    /**
     * Pide la velocidad
     * @return
     */
    public static int pedirVelocidad() {
        System.out.println("Introduce velocidad : ");
        return sc.nextInt();
    }

    /**
     * Pide gasolina
     */
    public static int pedirGasolina() {
        System.out.println("Introduce litros ");
        return sc.nextInt();
    }

    /**
     * Pide distancia
     */
    public static int pedirDistancia() {
        System.out.println("Introduce distancia");
        return sc.nextInt();
    }

    public static void msg(String t) {
        System.out.println("[+] MSG: " + t);
    }

}