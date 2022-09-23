package Data;


public class CalificacionDocente {
    private Estudiante eCalificador;
    private Double nota;
    
public Estudiante getEcalificador(){
    return this.eCalificador;
}

public void setEcalificador(Estudiante Ecalificador){
    this.eCalificador=Ecalificador;
}
public Double getnota(){
    return this.nota;
}

public void setnota(Double nota){
    this.nota=nota;
}
public CalificacionDocente(Estudiante eCalificador, Double nota) {
    this.eCalificador = eCalificador;
    this.nota = nota;
    }

@Override
public String toString() {
    return "CALIFICACIÓN DOCENTE: /n" + "/n Estudiante Calificador = " + eCalificador + "/n Nota = " + nota;
    }
}