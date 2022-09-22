
package UI;
import java.util.Scanner;
import Data.*;

public class UI {
    public static void imprimirBienvenida(){
        System.out.println("------ MINISIA -------");
    }
        
    public static void imprimirMenu(){
        System.out.print("1. Ver estudiantes \n 2. Ver profesores \n 3. Ver asignaturas \n 4. Ver calificaciones \n 5. Calificación docente \n Por favor marque la opción que desee: ");
    }   
    public static int leerOpcion(){
        Scanner lector = new Scanner(System.in);
        int opcion = lector.nextInt();  
        return opcion;
    }

    //CALIFICACIÓN 

    public static void MenuCalificaciones(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){
        System.out.println("LISTA DE ESTUDIANTES ");
        System.out.println("1. " + estudiante1.getNombre() + estudiante1.getApellido() + "\n2. " + 
                estudiante2.getNombre() +  estudiante2.getApellido() +  
                "\n3. " + estudiante3.getNombre() + estudiante3.getApellido() + "\nSeleccione el número del estudiante: ");
    }
    public static Calificacion Calificaciones(Calificacion[] calificacion){
        double calificacionP = 0; 
        for(int i = 0; i <= calificacion.length-1; i++){
           calificacionP = calificacionP + calificacion[i].getNota();
    }
        calificacionP = calificacionP / calificacion.length;
        
        Calificacion calificacionT = new Calificacion(calificacion[1].getEstudiante(), calificacionP);
        
        return calificacionT;
    }

    //
    
}
