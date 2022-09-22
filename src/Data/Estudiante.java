
package Data;
import java.util.Date;
import java.util.List;


public class Estudiante {
private Long ID;
private String nombre;
private String apellido;
private double PAPA;
private Date fechaNacimiento;
private Profesor nombreTutor;
private List<Grupo> asistente;
private List<Curso> materias;
private List<Calificacion> nota;
private Finanzas recibopago;
private CalificacionDocente evDocente;
//xd 
 
public String getNombre(){
    return this.nombre;
}
public void setNombre(String Nombre){
    this.nombre=Nombre;
}
public String getApellido(){
    return this.apellido;
}
public void setApellido(String Apellido){
    this.apellido=Apellido;
}
public Long getID(){
    return this.ID;
}
public void setID(Long ID){
    this.ID=ID;
}
public double getPAPA(){
    return this.PAPA;
}
public void setPAPA(double PAPA){
    this.PAPA=PAPA;
}
public Date getFechaNacimiento(){
    return this.fechaNacimiento;
}
public void setFechaNacimiento(Date FechaNacimiento){
    this.fechaNacimiento=FechaNacimiento;
}
public Profesor getNombretutor(){
    return this.nombreTutor;
}
public void setNombretutor(Profesor Nombretutor){
    this.nombreTutor=Nombretutor;
}  
public List<Grupo> getAsistente(){
    return this.asistente;
}

public List<Curso> getmaterias(){
    return this.materias;
}
public void setAsistente(List<Curso> materias){
    this.materias=materias;
}
public List<Calificacion> getNota(){
    return this.nota;
}
public void setNota(List<Calificacion> Nota){
    this.nota = Nota;
}
public Finanzas getrecibopago(){
    return this.recibopago;
}
public void setrecibopago(Finanzas getrecibopago){
    this.recibopago = getrecibopago;
}
public CalificacionDocente getevdocente(){
    return this.evDocente;
}
public void setNombre(CalificacionDocente evdocente){
    this.evDocente = evdocente;
}
 public Estudiante(Long ID, String nombre, String apellido, double PAPA, Date fechaNacimiento, Profesor nombreTutor, List<Grupo> asistente, List<Curso> materias, List<Calificacion> nota, Finanzas recibopago, CalificacionDocente evDocente) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.PAPA = PAPA;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreTutor = nombreTutor;
        this.asistente = asistente;
        this.materias = materias;
        this.nota = nota;
        this.recibopago = recibopago;
        this.evDocente = evDocente;
    }
 public Estudiante(Long ID, String nombre, String apellido, double PAPA, Date fechaNacimiento) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.PAPA = PAPA;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreTutor = null;
        this.asistente = null;
        this.materias = null;
        this.nota = null;
        this.recibopago = null;
        this.evDocente = null;
    }


@Override
public String toString() {
        return "ESTUDIANTE:/n" + "ID = " + ID + "/n Nombre = " + nombre + "/n Apellido = " + apellido + "/n PAPA = " + PAPA + "/n Fecha de Nacimiento = " + fechaNacimiento + "/n Nombre Tutor = " + nombreTutor + "/n Asistente = " + asistente + "/n Materias = " + materias + "/n Nota = " + nota + "/n Recibo de pago = " + recibopago + "/n Evaluación Docente = " + evDocente + '}';
    }




}
