
package Data;
import java.util.Date;
import java.util.List;
import UI.*;


public class Estudiante {
private Long ID;     //NO olvidar cambiar
private String nombre;
private String apellido;
private double PAPA;
private Date fechaNacimiento;
private Profesor nombreTutor;
private List<Grupo> asistente;
private List<Curso> materias;
private List<Calificacion> nota;
private Finanzas recibopago;

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
public long getID(){
    return this.ID;
}
public void setID(Long ID){
    this.ID = ID;
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
public void setAsistente(List<Grupo> grupos){
    this.asistente= grupos;
}
public List<Curso> getMaterias(){
    return this.materias;
}
public void setMaterias(List<Curso> materias){
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

 public Estudiante(Long ID, String nombre, String apellido, double PAPA, Date fechaNacimiento, Profesor nombreTutor, List<Grupo> asistente, List<Curso> materias, List<Calificacion> nota, Finanzas recibopago) {
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
    }
 public Estudiante(Long ID, String nombre, String apellido, Date fechaNacimiento) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreTutor = null;
        this.asistente = null;
        this.materias = null;
        this.nota = null;
        this.recibopago = null;
    }
@Override
public String toString() {
        return "ESTUDIANTE:/n" + "ID = " + this.getID() + "/nNombre = " + this.getNombre() + "/nApellido = " + this.getApellido() + "/nPAPA = " + this.getPAPA() + "/nFecha de Nacimiento = " + this.getFechaNacimiento().toString() + "/n Nombre Tutor = " + this.getNombretutor().getNombre() + " " + this.getNombretutor().getApellido()
                + "/nAsistente = \n" + UI.mostrarGrupo(this.getAsistente())
                + "/n Nota = " + this.getNota() + "/n Recibo de pago = " + this.getrecibopago();
    }
}
