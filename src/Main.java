public class Main {
    public static void main(String[]args){
        if(Persona.getInstance() == Persona.getInstance()){
            System.out.println("Misma persona: " + Persona.getInstance());
        }
    }
}
