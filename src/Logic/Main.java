
package Logic;

import Data.*;
import UI.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        //Fechas de Nacimiento
        Date carlosFN = new Date(13, 04, 2001);
        Date davidFN = new Date(1, 03, 2004);
        Date sofiaFN = new Date(26, 06, 2003);
        Date LigiaFN = new Date(2, 12, 1967);
        Date SandraFN = new Date(7, 11, 1989);
        Date MauricioFN = new Date(17, 01, 1981);
        //CURSOS
        Curso calculoDif = new Curso(1000009, "Cálculo Diferencial", 4);
        Curso algebraLin = new Curso(1000004, "Álgebra Lineal", 4);
        Curso calculoInt = new Curso(1000003, "Cálculo Integral", 4);
        //ESTUDIANTES
        Estudiante carlos = new Estudiante(101497238l, "Carlos", "García", carlosFN);
        Estudiante david = new Estudiante(102634582l, "David", "Díaz", davidFN);
        Estudiante sofia = new Estudiante(1016345612l, "Sofía", "Jiménez", sofiaFN);
        //PROFESORES
        Profesor Ligia = new Profesor(274567312l, "Ligia", "Torres", LigiaFN);
        Profesor Sandra = new Profesor(43569766l, "Sandra", "Montoya", SandraFN);
        Profesor Mauricio = new Profesor(34126340l, "Mauricio", "Oviedo", MauricioFN);
        //GRUPOS
        List<Estudiante> estudiantesCD = new ArrayList<>();
        estudiantesCD.add(david);
        List<Estudiante> estudiantesAL = new ArrayList<>();
        estudiantesAL.add(sofia);
        estudiantesAL.add(carlos);
        List<Estudiante> estudiantesCI = new ArrayList<>();
        estudiantesCI.add(sofia);
        estudiantesCI.add(carlos);
        
        Grupo grupoCD = new Grupo(1, "Semana 16", "4", "2022-2", calculoDif, Ligia, estudiantesCD);
        Grupo grupoAL = new Grupo(1, "Semana 16", "4", "2022-2", algebraLin, Sandra, estudiantesAL);
        Grupo grupoCI = new Grupo(1, "Semana 16", "4", "2022-2", calculoInt, Mauricio, estudiantesCI);
        //CALIFICACIONES
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
        
         //ESTUDIANTES (COMPLETAR INFORMACIÓN)
         //Carlos
        Finanzas reciboC = new Finanzas(345672l, 0);
        UI.completarInfoEstudiantes(carlos, Mauricio, UI.listaGrupos(grupoCI, grupoAL), UI.listaCurso(calculoInt, algebraLin), reciboC);
        //David
        Finanzas reciboD = new Finanzas(3560678l, 0);
        UI.completarInfoEstudiantes(david, Sandra, UI.listaGrupos(grupoCD), UI.listaCurso(calculoDif), reciboD);
        //Sofia
        Finanzas reciboS = new Finanzas(1547890, 0);
        UI.completarInfoEstudiantes(sofia, Ligia, UI.listaGrupos(grupoCI, grupoAL), UI.listaCurso(calculoInt, algebraLin), reciboS);
        //PROFESORES (COMPLETAR INFORMACIÓN)
        //Ligia
        Finanzas reciboL = new Finanzas(0, 3400000l);
        UI.completarInfoProfesores(Ligia, sofia, grupoCD, reciboL);
        //Sandra
        Finanzas reciboSA = new Finanzas(0, 3400000l);
        UI.completarInfoProfesores(Sandra, david, grupoAL, reciboSA);
        //Mauricio
        Finanzas reciboM = new Finanzas(0, 3400000l);
        UI.completarInfoProfesores(Mauricio, carlos, grupoCI, reciboM);   
        //MAIN
        boolean key= true;
        while(key == true){ 
            UI.imprimirBienvenida();
            UI.imprimirMenu();
            int opcion = UI.leerOpcion();
            switch(opcion){
                case 1:
                    UI.MenuEstudiantes(carlos, david, sofia);
                    int opcion2=UI.leerOpcion();
                    switch(opcion2){
                        case 1:
                            UI.imprimirEstudiante1(carlos);
                            break;
                        case 2:
                            UI.imprimirEstudiante2(david);
                            break;
                        case 3:
                            UI.imprimirEstudiante3(sofia);
                            break;
                        default:
                            UI.imprimirError2();
                            break;
                    }
                    break;
                case 2:
                    UI.MenuProfesores(Ligia,Sandra,Mauricio);
                    int opcion3= UI.leerOpcion();
                    switch(opcion3){
                        case 1:
                            UI.imprimirProfesor1(Ligia);
                            break;
                        case 2:
                            UI.imprimirProfesor2(Sandra);
                            break;
                        case 3:
                            UI.imprimirProfesor2(Mauricio);
                            break;
                        default:
                            UI.imprimirError3();
                            break;
                    }
                    break;
                case 3:
                    UI.MenuAsignaturas(calculoDif,algebraLin,calculoInt);
                    int opcion4= UI.leerOpcion();
                    switch(opcion4){
                        case 1:
                            UI.imprimirAsignatura1(calculoDif);
                            break;
                        case 2:
                            UI.imprimirAsignatura2(algebraLin);
                            break;
                        case 3:
                            UI.imprimirAsignatura3(calculoInt);
                            break;
                        default:
                            UI.imprimirError4();
                            break;
                    }
                    break;
                       
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
                        if(usuario == 1014972381){
                            UI.login(carlos, carlos.getAsistente());
                            break;
                        }else if(usuario == 102634582l){
                            UI.login(david, david.getAsistente());
                            break;
                        }else if(usuario == 1016345612l){
                            UI.login(sofia, sofia.getAsistente());
                            break;
                        }else{
                            while(ID.contains(usuario) == false){
                                System.out.println("ID equivocado, escríbalo unevamente: ");
                                usuario = UI.leerOpcionL();
                            } 
                        }
                    }
                    break;   
                case 0:
                    System.out.println("Desea salir?\nPresione 0");
                    int opcion5 = UI.leerOpcion();
                    if (opcion5 == 0 ){
                        key= false;
                        System.out.println("Vuelva pronto");
                    }
                                        
                break;    
                    
            } 
        }
    }
}
