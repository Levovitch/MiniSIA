
package Data;

import java.util.Date;


public class Profesor {
private Long ID;
private String nombre;
private String apellido;
private Date fechaNacimiento;
private Estudiante nombreTutoreado;
private Grupo gruposquedicta;
private Finanzas salario;
private CalificacionDocente calificacion; 
 
public String getNombre(){
    return this.nombre;
}
public void setNombre(String Nombre){
    this.nombre=Nombre;
}
public Long getID(){
    return this.ID;
}
public void setID(Long setID){
    this.ID= setID;
}
public String getApellido(){
    return this.apellido;
}
public void setApellido(String setApellido){
    this.apellido = setApellido;
}
public Date getFechaDeNacimiento(){
    return this.fechaNacimiento;
}
public void setFechaDeNacimiento(Date setFechaDeNacimiento){
    this.fechaNacimiento = setFechaDeNacimiento;
}
public Estudiante getEstudiantes(){
    return this.nombreTutoreado;
}
public void setEstudiantes(Estudiante setNombretutoreado){
    this.nombreTutoreado = setNombretutoreado;
}
public Grupo getGruposQueDicta(){
    return this.gruposquedicta;
}
public void setGruposQueDicta(Grupo setGruposQueDicta){
    this.gruposquedicta = setGruposQueDicta; 
}
public Finanzas getSalario(){
    return this.salario;
}
public void setSalario(Finanzas setSalario){
    this.salario = setSalario;
}
public CalificacionDocente getCalificacion() {
    return calificacion;
    }
public void setCalificacion(CalificacionDocente calificacion) {
    this.calificacion = calificacion;
    }

public Profesor(Long ID, String nombre, String apellido, Date fechaNacimiento, Estudiante nombreTutoreado, Grupo gruposquedicta, Finanzas salario, CalificacionDocente calificacion) {
   this.ID = ID;
   this.nombre = nombre;
   this.apellido = apellido;
   this.fechaNacimiento = fechaNacimiento;
   this.nombreTutoreado = nombreTutoreado;
   this.gruposquedicta = gruposquedicta;
   this.salario = salario;
   this.calificacion = calificacion;
    }
public Profesor(Long ID, String nombre, String apellido, Date fechaNacimiento) {
   this.ID = ID;
   this.nombre = nombre;
   this.apellido = apellido;
   this.fechaNacimiento = fechaNacimiento;
   this.nombreTutoreado = null;
   this.gruposquedicta = null;
   this.salario = null;
    }

    @Override
    public String toString() {
        return "Profesor" + "\nID =" + this.getID() + "\nNombre = " + this.getNombre() + "\nApellido = " + this.getApellido() + "\nFechaNacimiento = " + this.getFechaDeNacimiento() + "\nNombreTutoreado = " + this.getEstudiantes() + "\nGruposquedicta = " + this.getGruposQueDicta() + "\nSalario = " + this.getSalario() + "\nCalificacion = " + this.getCalificacion();
    }



 }

