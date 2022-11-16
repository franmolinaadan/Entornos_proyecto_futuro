import java.util.Scanner;

public class Entornos {
    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + ":" + veredicto("5", "4"));
    }
    static String veredicto(String modu, String h){

        if (modu.equals(h)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(h) < Integer.valueOf(modu)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
}
