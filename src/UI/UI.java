
package UI;
import java.util.Scanner;
import Data.*;
import java.util.ArrayList;
import java.util.List;

public class UI {
    public static void imprimirBienvenida(){
        System.out.println("------ MINISIA ------");
    }
        
    public static void imprimirMenu(){
        System.out.print("1. Ver estudiantes \n2. Ver profesores \n3. Ver asignaturas \n4. Ver calificaciones \n5. Calificación docente \nPor favor marque la opción que desee: ");
    }   
    public static int leerOpcion(){
        Scanner lector = new Scanner(System.in);
        int opcion = lector.nextInt();
        return opcion;
    }
    public static long leerOpcionL(){
        Scanner lector = new Scanner(System.in);
        long opcion = lector.nextLong();
        return opcion;
    }
    public static Double leerOpcionD(){
        Scanner lector = new Scanner(System.in);
        double opcion = lector.nextDouble();
        return opcion;
    }
    //ESTUDIANTE
    public static void MenuEstudiantes(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){
        System.out.println("LISTA DE ESTUDIANTES ");
        System.out.println("1. " + estudiante1.getNombre() + estudiante1.getApellido() + "\n 2. " + 
                estudiante2.getNombre() +  estudiante2.getApellido() +  
                "\n 3. " + estudiante3.getNombre() + estudiante3.getApellido() + "\nSeleccione el número del estudiante: ");
    }
    
    public static void imprimirEstudiante1(Estudiante estudiante1){
        System.out.println(estudiante1);
    }
    public static void imprimirEstudiante2(Estudiante estudiante2){
        System.out.println(estudiante2);
    }
    public static void imprimirEstudiante3(Estudiante estudiante3){
        System.out.println(estudiante3);
    }
    public static void imprimirError2(){
        System.out.println("Opcion no valida");
    }
    //PROFESOR
     public static void MenuProfesores(Profesor profesor1, Profesor profesor2, Profesor profesor3){
        System.out.println("LISTA DE PROFESORES ");
        System.out.println("1. " + profesor1.getNombre() + profesor1.getApellido() + "\n2. " + 
                profesor2.getNombre() +  profesor2.getApellido() +  
                "\n3. " + profesor3.getNombre() + profesor3.getApellido() + "\nSeleccione el número del profesor: ");
    }
   
    public static void imprimirProfesor1(Profesor profesor1){
        System.out.println(profesor1);
    }
    public static void imprimirProfesor2(Profesor profesor2){
        System.out.println(profesor2);
    }
    public static void imprimirProfesor3(Profesor profesor3){
        System.out.println(profesor3);
    }
     public static void imprimirError3(){
        System.out.println("Opcion no valida");
    }
    //CALIFICACIÓN
    
    public static void menuCalificaciones(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){
        System.out.println("------ LISTA DE ESTUDIANTES ------ ");
        System.out.print("1. " + estudiante1.getNombre() + " " + estudiante1.getApellido() + "\n2. " + 
                estudiante2.getNombre() + " " +  estudiante2.getApellido() +  
                "\n3. " + estudiante3.getNombre() + " " + estudiante3.getApellido() + "\nSeleccione el número del estudiante: ");
    }
    
    public static List<Calificacion> anadirCalificaciones(Calificacion cal1, Calificacion cal2, Calificacion cal3){
        List<Calificacion> Calificaciones = new ArrayList<Calificacion>();
        Calificaciones.add(cal1);
        Calificaciones.add(cal2);
        Calificaciones.add(cal3);
        
        return Calificaciones;
    }
    
    public static void promediarYAsignarCalificaciones(List<Calificacion> calificacion, Estudiante estudiante1){
        double calificacionP = 0; 
        for(int i = 0; i <= calificacion.size()-1; i++){
           calificacionP = calificacionP + calificacion.get(i).getNota();
    }
        calificacionP = calificacionP / calificacion.size();
        
        Calificacion calificacionT = new Calificacion(calificacion.get(1).getEstudiante(), calificacionP);  
        estudiante1.setPAPA(calificacionT.getNota());
    }
    public static void mostrarCalificaciones(Estudiante estudiante1, List<Calificacion> calificaciones){
        String string = "";
        System.out.print("1. " + estudiante1.getNombre() + " " +  estudiante1.getApellido() + " \nPromedio PAPA: " + String.format("%.2f", estudiante1.getPAPA()) + "\nCalificaciones: ");
       
        for(int i = 0; i <= calificaciones.size()-1; i++){
           string += calificaciones.get(i) + " ";
        }
        System.out.println(string);
        }
    
    //EVALUACIÓN DOCENTE
  
    public static void login(Estudiante estudiante1, List<Grupo> grupo){
        System.out.println("LISTA DE PROFESORES");
        for(int i = 0; i < grupo.size(); i++){
            System.out.println((i+1) + ". " +grupo.get(i).getProfesor().getNombre() + " " + grupo.get(i).getProfesor().getApellido());   
       }
        System.out.println("Seleccione el profesor que desea: ");
        int opcionP = UI.leerOpcion();
        System.out.println("Digite la nota correspondiente: ");
        double opcionCP = UI.leerOpcionD();
        CalificacionDocente calD = new CalificacionDocente(estudiante1, opcionCP);
        grupo.get(opcionP-1).getProfesor().setCalificacion(calD);
    }
    //Instaciar objetos
    public static List<Grupo> listaGrupos(Grupo grupo1, Grupo grupo2, Grupo grupo3){
        List<Grupo> lista = new ArrayList<>();
        lista.add(grupo1);
        lista.add(grupo2);
        lista.add(grupo3);
        return lista; 
    }
    public static List<Grupo> listaGrupos(Grupo grupo1, Grupo grupo2){
        List<Grupo> lista = new ArrayList<>();
        lista.add(grupo1);
        lista.add(grupo2);
        return lista; 
    }
    public static List<Grupo> listaGrupos(Grupo grupo1){
        List<Grupo> lista = new ArrayList<>();
        lista.add(grupo1);
        return lista; 
    }
     public static List<Curso> listaCurso(Curso curso1, Curso curso2, Curso curso3){
        List<Curso> lista = new ArrayList<>();
        lista.add(curso1);
        lista.add(curso2);
        lista.add(curso3);
        return lista; 
    }
     public static List<Curso> listaCurso(Curso curso1, Curso curso2){
        List<Curso> lista = new ArrayList<>();
        lista.add(curso1);
        lista.add(curso2);
        return lista; 
    }
     public static List<Curso> listaCurso(Curso curso1){
        List<Curso> lista = new ArrayList<>();
        lista.add(curso1);
        return lista; 
    }
   
    public static void completarInfoEstudiantes(Estudiante estudiante1, Profesor tutor, List<Grupo> grupos, List<Curso> Cursos, Finanzas recibo){
        estudiante1.setNombretutor(tutor);
        estudiante1.setAsistente(grupos);
        estudiante1.setMaterias(Cursos);
        estudiante1.setrecibopago(recibo);
    }
    public static void completarInfoProfesores(Profesor profesor, Estudiante estudiante1, Grupo grupo, Finanzas salario){
        profesor.setEstudiantes(estudiante1);
        profesor.setGruposQueDicta(grupo);
        profesor.setSalario(salario);
        
    }
    //CURSO
    public static void MenuAsignaturas(Curso asignatura1, Curso asignatura2, Curso asignatura3){
        System.out.println("LISTA DE ASIGNATURAS ");
        System.out.println("1. " + asignatura1.getnombre()+"\n2. " + 
        asignatura2.getnombre()+"\n3. " + asignatura3.getnombre());
    }
    
    public static void imprimirAsignatura1(Curso asignatura1){
        System.out.println(asignatura1);
    }
    public static void imprimirAsignatura2(Curso asignatura2){
        System.out.println(asignatura2);
    }
    public static void imprimirAsignatura3(Curso asignatura3){
        System.out.println(asignatura3);
    }
    public static void imprimirError4(){
        System.out.println("Opcion no valida");

    }

}
