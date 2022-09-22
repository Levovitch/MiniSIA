
package Data;


public class CalificacionDocente {
    private Estudiante eCalificador;
    private Profesor pCalificado;
    private Double nota;
    
public Estudiante getEcalificador(){
    return this.eCalificador;
}

public void setEcalificador(Estudiante Ecalificador){
    this.eCalificador=Ecalificador;
}

public Profesor getPcalificado(){
    return this.pCalificado;
}

public void setPcalificado(Profesor Pcalificado){
    this.pCalificado=Pcalificado;
}
public Double getnota(){
    return this.nota;
}

public void setnota(Double nota){
    this.nota=nota;
}
public CalificacionDocente(Estudiante eCalificador, Profesor pCalificado, Double nota) {
this.eCalificador = eCalificador;
this.pCalificado = pCalificado;
this.nota = nota;
    }

@Override
public String toString() {
return "CALIFICACIÓN DOCENTE: /n" + "/n Estudiante Calificador = " + eCalificador + "/n Profesor Calificado = " + pCalificado + "/n Nota = " + nota + '}';
    }


}
