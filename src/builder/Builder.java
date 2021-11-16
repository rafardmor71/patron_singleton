package builder;

public class Builder {
    PersonaBuilder persona;

    public PersonaBuilder getPersona(){
        return persona;
    }

    public void crearPersona(String nombre, String apellidos, int edad){
        persona = new PersonaBuilder(nombre, apellidos, edad);
    }
}
