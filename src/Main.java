import builder.Builder;

public class Main {
    public static void main(String[]args){
        if(Persona.getInstance() == Persona.getInstance()){
            System.out.println("Misma persona: " + Persona.getInstance());
        }

        Builder builder = new Builder();
        builder.crearPersona("Pepe", "Gutierrez", 30);
        System.out.println(builder.getPersona());


    }
}
