
package Logic;

import Data.*;
import UI.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        Estudiante carlos = new Estudiante(101497238l, "Carlos", "García");
        Estudiante david = new Estudiante(102634582l, "David", "Díaz");
        Estudiante sofia = new Estudiante(1016345612l, "Sofía", "Jiménez");
        
        Calificacion cal1c = new Calificacion(carlos, 4.1);
        Calificacion cal2c = new Calificacion(carlos, 4.3);
        Calificacion cal3c = new Calificacion(carlos, 4.5);
        
        Calificacion cal1d = new Calificacion(david, 4.1);
        Calificacion cal2d = new Calificacion(david, 5.0);
        Calificacion cal3d = new Calificacion(david, 4.7);
        
        Calificacion cal1s = new Calificacion(david, 5.0);
        Calificacion cal2s = new Calificacion(david, 5.0);
        Calificacion cal3s = new Calificacion(david, 4.9);
        
        //PAPA
        carlos.setNota(UI.anadirCalificaciones(cal1c, cal2c, cal3c));
        david.setNota(UI.anadirCalificaciones(cal1d, cal2d, cal3d));
        sofia.setNota(UI.anadirCalificaciones(cal1s, cal2s, cal3s));
        
        UI.promediarYAsignarCalificaciones(carlos.getNota(), carlos);
        UI.promediarYAsignarCalificaciones(david.getNota(), david);
        UI.promediarYAsignarCalificaciones(sofia.getNota(), sofia);
        //ID
         List<Long> ID = new ArrayList<>();
         ID.add(carlos.getID());
         ID.add(david.getID());
         ID.add(sofia.getID());
        
         
        UI.imprimirBienvenida();
        UI.imprimirMenu();
        int opcion = UI.leerOpcion();
        switch(opcion){
            case 4: 
                UI.menuCalificaciones(carlos, david, sofia);
                int opcionE = UI.leerOpcion();
                switch(opcionE){
                    case 1:
                        UI.mostrarCalificaciones(carlos, carlos.getNota());
                        break;
                    case 2:
                        UI.mostrarCalificaciones(david, david.getNota());
                        break;
                    case 3:
                        UI.mostrarCalificaciones(sofia, sofia.getNota());
                        break;
                }
                break;
            case 5:
                System.out.println("Digite su ID: ");
                long usuario = UI.leerOpcionL();
                while (true){
                    if(usuario == 101497238l){
                        UI.login(carlos, ID, usuario);
                        break;
                    }else if(usuario == 102634582l){
                        UI.login(david, ID, usuario);
                        break;
                    }else if(usuario == 1016345612l){
                        UI.login(sofia, ID, usuario);
                        break;
                    }else{
                        while(ID.contains(usuario) == false){
                            System.out.println("ID equivocado, escríbalo unevamente: ");
                            usuario = UI.leerOpcionL();
                        }
                    }
                }
                break;   
        }
    }
}
