
package Data;


public class Curso {
    private int numero;
    private String nombre;
    private byte creditos;
    
public int getnumero(){
    return this.numero;
}

public void setnumero (int numero){
    this.numero=numero;
}

public String getnombre(){
    return this.nombre;
}

public void setnombre(String nombre){
    this.nombre=nombre;
}

public byte getcreditos(){
    return this.creditos;
}
public void setcreditos (byte creditos){
    this.creditos=creditos;
}

public Curso(int numero, String nombre, byte creditos) {
this.numero = numero;
this.nombre = nombre;
this.creditos = creditos;
}

@Override
public String toString() {
return "CURSO: /n " + "/n Numero = " + numero + "/n Nombre = " + nombre + "/n Creditos = " + creditos + '}';
}


}