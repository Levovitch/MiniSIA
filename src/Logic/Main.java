
package Logic;
import Data.*;
import UI.*;

public class Main {
    
    public static void main(String[] args) {
        Estudiante carlos = new Estudiante(101497238l, "Carlos", "García", 4.5f);
        Estudiante david = new Estudiante(102634582l, "David", "Díaz", 4.7f);
        Estudiante sofia = new Estudiante(1016345612l, "Sofía", "Jiménez", 4.7f);
        
        Calificacion cal1c = new Calificacion(carlos, 4.1);
        Calificacion cal2c = new Calificacion(carlos, 4.3);
        Calificacion cal3c = new Calificacion(carlos, 4.5);
        
        Calificacion cal1d = new Calificacion(david, 4.1);
        Calificacion cal2d = new Calificacion(david, 5.0);
        Calificacion cal3d = new Calificacion(david, 4.7);
        
        Calificacion cal1s = new Calificacion(david, 5.0);
        Calificacion cal2s = new Calificacion(david, 5.0);
        Calificacion cal3s = new Calificacion(david, 4.9);
        
    
        carlos.setNota(UI.anadirCalificaciones(cal1c, cal2c, cal3c));
        david.setNota(UI.anadirCalificaciones(cal1d, cal2d, cal3d));
        sofia.setNota(UI.anadirCalificaciones(cal1s, cal2s, cal3s));

        UI.imprimirBienvenida();
        UI.imprimirMenu();
        int opcion = UI.leerOpcion();
      
        switch(opcion){
            case 4: 
                UI.menuCalificaciones(carlos, david, sofia);
                int opcionE = UI.leerOpcion();
                switch(opcionE){
                    case 1:
                        UI.promediarYAsignarCalificaciones(carlos.getNota(), carlos);
                        UI.mostrarCalificaciones(carlos, carlos.getNota());
                        break;
                    case 2: 
                        UI.promediarYAsignarCalificaciones(david.getNota(), david);
                        UI.mostrarCalificaciones(david, david.getNota());
                        break;
                    case 3: 
                        UI.promediarYAsignarCalificaciones(sofia.getNota(), sofia);
                        UI.mostrarCalificaciones(sofia, sofia.getNota());
                        break;
                }
                break;
        }
    }
}
