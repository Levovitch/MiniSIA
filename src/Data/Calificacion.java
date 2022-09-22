
package Data;

public class Calificacion {
    private Estudiante estudiante;
    private double nota;
   
    
public Estudiante getEstudiante(){
    return this.estudiante;
}
public void setEstudiante(Estudiante setEstudiante){
    this.estudiante = setEstudiante;
}
public Double getNota(){
    return this.nota;
}
public void setNota(Double setNota){
    this.nota = setNota;
}
//HOLA COMO ESTÁn
public Calificacion(Estudiante estudiante, double nota) {
        this.estudiante = estudiante;
        this.nota = nota;
}

@Override
public String toString() {
return "CALIFICACIÓN: /n" + "/n Estudiante=" + estudiante + "/n Nota=" + nota + '}';
    }


}
