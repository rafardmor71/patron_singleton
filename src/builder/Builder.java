package builder;

public class Builder {
    PersonaBuilder persona = new PersonaBuilder();
    public void crearPersona(String nombre, String apellidos, int edad){
        persona.setNombre(nombre);
        persona.setApellidos(apellidos);
        persona.setEdad(edad);
    }
    public PersonaBuilder getPersona(){
        return persona;
    }
}
