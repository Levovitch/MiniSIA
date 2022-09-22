
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
public Profesor(Long ID, String nombre, String apellido, Date fechaNacimiento, Estudiante nombreTutoreado, Grupo gruposquedicta, Finanzas salario) {
   this.ID = ID;
   this.nombre = nombre;
   this.apellido = apellido;
   this.fechaNacimiento = fechaNacimiento;
   this.nombreTutoreado = nombreTutoreado;
   this.gruposquedicta = gruposquedicta;
   this.salario = salario;
    }

    @Override
public String toString() {
        return "PROFESOR:/n" + "ID = " + ID + "/n Nombre = " + nombre + "/n Apellido = " + apellido + "/n Fecha de Nacimiento = " + fechaNacimiento + "/n Nombre Tutoreado = " + nombreTutoreado +  "/n Grupos  = " + gruposquedicta + "/n Salario = " + salario +'}';
    }

}
