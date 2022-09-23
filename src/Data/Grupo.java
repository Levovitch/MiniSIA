
package Data;
import java.util.List;

public class Grupo {
    private long numero;
    private String semana;
    private String horas;
    private String semestre;
    private Curso curso;
    private Profesor profesor;
    private List<Estudiante> esAsistentes;
    private List<Calificacion> notasF;
    
public long getnumero(){
    return this.numero;
}
public void setnumero(long numero){
    this.numero=numero;
}
public String getsemana(){
    return this.semana;
}
public void setsemana(String semana){
    this.semana=semana;
}
public String gethoras(){
    return this.horas;
}
public void sethoras(String horas){
    this.horas=horas;
}
public String getsemestre(){
    return this.semestre;
}
public void setSemestre(String semestre){
    this.semestre=semestre;
}
public Curso getmateria(){
    return this.curso;
}
public void setMateria(Curso materia){
    this.curso = materia;
}
public Profesor getProfesor(){
    return this.profesor;
}
public void setProfesor(Profesor cursosdictados){
    this.profesor = cursosdictados;
}
public List<Estudiante> getEasistentes(){
    return this.esAsistentes;
}
public void setEasistentes(List<Estudiante> Easistentes){
    this.esAsistentes=Easistentes;
}
public List<Calificacion> getCalificacion(){
    return this.notasF;
}
public void setCalificacion(List<Calificacion> notasF){
    this.notasF=notasF;
}

public Grupo(long numero, String semana, String horas, String semestre, Curso curso, Profesor cursosdictados, List<Estudiante> esAsistentes, List<Calificacion> notasF) {
this.numero = numero;
this.semana = semana;
this.horas = horas;
this.semestre = semestre;
this.curso = curso;
this.profesor = cursosdictados;
this.esAsistentes = esAsistentes;
this.notasF = notasF;
}
public Grupo(long numero, String semana, String horas, String semestre, Curso curso, Profesor cursosdictados, List<Estudiante> estudiantes ) {
this.numero = numero;
this.semana = semana;
this.horas = horas;
this.semestre = semestre;
this.curso = curso;
this.profesor = cursosdictados;
this.esAsistentes = estudiantes;
this.notasF = null;
}

@Override
public String toString() {
return "GRUPO: /n" + "Numero = " + this.getnumero()+ "/n Semana = " + this.getsemana() + "/n Horas = " + this.gethoras() + "/n Semestre = " + this.getsemestre() + "/n Curso = " + this.getmateria() + "/n Cursos dictados = " + this.getProfesor() + ", Estudiantes Asistentes = " + this.getEasistentes() + ", Notas F = " + this.getCalificacion();
    }

}
