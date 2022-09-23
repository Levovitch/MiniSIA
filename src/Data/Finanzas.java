
package Data;


public class Finanzas {
    private long recibos;
    private long pagos;

public long getRecibos(){
    return this.recibos;
}
public void setRecibos(long setRecibos){
    this.recibos = setRecibos;
}

public long getPagos(){
    return this.pagos;
}
public void setPagos(long setPagos){
    this.pagos = setPagos;
}

public Finanzas(long recibos, long pagos) {
this.recibos = recibos;
this.pagos = pagos;
}

@Override
public String toString() {
return "FINANZAS:/n " + "/n Recibos=" + this.getRecibos() + "/n Pagos=" + this.getPagos();
}

}

