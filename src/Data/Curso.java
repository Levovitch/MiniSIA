

package Data;


public class Curso {
    private int numero;
    private String nombre;
    private int creditos;
    
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

public int getcreditos(){
    return this.creditos;
}
public void setcreditos (int creditos){
    this.creditos = creditos;
}

public Curso(int numero, String nombre, int creditos) {
    this.numero = numero;
    this.nombre = nombre;
    this.creditos = creditos;
}
public Curso(int numero, int creditos) {
    this.numero = numero;
    this.nombre = null;
    this.creditos = creditos;
}

@Override
public String toString() {
return "\n------ASIGNATURA------\n" + "Nombre: " + this.getnombre() + "\nNumero: " + this.getnumero() + "\nCreditos: " + this.getcreditos()+"\n";
}


}
