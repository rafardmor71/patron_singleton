public class Persona {

    private static final Persona instance = new Persona();

    private String nombre;

    private Persona() {}

    public static Persona getInstance() {
        return instance;
    }
}
