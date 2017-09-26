package parcial;
import java.util.Date;

public class Movimiento {
    private String fecha;
    private double saldoAnterior;
    private double monto;
    private Tipo tipo;

    public Movimiento() {
        this.fecha = "";
        this.saldoAnterior = 0;
        this.monto = 0;
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double getSaldoAnterior() {
        return saldoAnterior;
    }
    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    /*public double consignacion (double saldoAnterior, double monto){
        double nuevoSaldo = saldoAnterior+monto;
        return nuevoSaldo;
    }
    
    public double retiro (double saldoAnterior, double monto){
        double nuevoSaldo = saldoAnterior-monto;
        return nuevoSaldo;
    }
    
    public void movimiento(double saldoAnterior, double monto){
        Tipo tipo = new Tipo();
        tipo.setCodigo(retiro);
        if( tipo == retiro){
            double nuevoSaldo = saldoAnterior - monto;
            //return nuevoSaldo;
        } else if (tipo == consignacion){
            double nuevoSaldo = saldoAnterior + monto;
            //return nuevoSaldo;
        }
    }*/
}
    
   