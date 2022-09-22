
package Data;
import java.util.List;

public class Grupo {
    private long numero;
    private String[] semana;
    private String[] horas;
    private String semestre;
    private Curso curso;
    private Profesor cursosdictados;
    private List<Estudiante> esAsistentes;
    private List<Calificacion> notasF;
    
public long getnumero(){
    return this.numero;
}
public void setnumero(long numero){
    this.numero=numero;
}
public String[] getsemana(){
    return this.semana;
}
public void setsemana(String[] semana){
    this.semana=semana;
}
public String[] gethoras(){
    return this.horas;
}
public void sethoras(String[] horas){
    this.horas=horas;
}
public String getsemestre(){
    return this.semestre;
}
public void setNombre(String semestre){
    this.semestre=semestre;
}
public Curso getmateria(){
    return this.curso;
}
public void setNombre(Curso materia){
    this.curso = materia;
}
public Profesor getcursosdictados(){
    return this.cursosdictados;
}
public void setNombre(Profesor cursosdictados){
    this.cursosdictados=cursosdictados;
}
public List<Estudiante> getEasistentes(){
    return this.esAsistentes;
}
public void setNombre(List<Estudiante> Easistentes){
    this.esAsistentes=Easistentes;
}
public List<Calificacion> getNombre(){
    return this.notasF;
}
public void setnotasF(List<Calificacion> notasF){
    this.notasF=notasF;
}

public Grupo(long numero, String[] semana, String[] horas, String semestre, Curso curso, Profesor cursosdictados, List<Estudiante> esAsistentes, List<Calificacion> notasF) {
this.numero = numero;
this.semana = semana;
this.horas = horas;
this.semestre = semestre;
this.curso = curso;
this.cursosdictados = cursosdictados;
this.esAsistentes = esAsistentes;
this.notasF = notasF;
}
public Grupo(long numero, String[] semana, String[] horas, String semestre, Curso curso, Profesor cursosdictados ) {
this.numero = numero;
this.semana = semana;
this.horas = horas;
this.semestre = semestre;
this.curso = curso;
this.cursosdictados = cursosdictados;
this.esAsistentes = null;
this.notasF = null;
}

@Override
public String toString() {
return "GRUPO: /n" + "Numero = " + numero + "/n Semana = " + semana + "/n Horas = " + horas + "/n Semestre = " + semestre + "/n Curso = " + curso + "/n Cursos dictados = " + cursosdictados + ", Estudiantes Asistentes = " + esAsistentes + ", Notas F = " + notasF + '}';
    }

}
