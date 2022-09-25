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
public Calificacion(Estudiante estudiante, double nota) {
        this.estudiante = estudiante;
        this.nota = nota;
}
    
@Override
public String toString() {
    return "Estudiante = " + this.getEstudiante() + "\nNota = " + getNota();
    }


}