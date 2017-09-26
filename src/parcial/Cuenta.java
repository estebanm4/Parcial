package parcial;
import java.util.ArrayList;
import java.util.Date;

public class Cuenta {
    private int numeroCuenta;
    private double saldoCuenta;
    private String fechaCreacion;
    private String nomCliente;
    private Movimiento movimiento;
    private ArrayList<Movimiento> movimientos;

    public Cuenta() {
        this.numeroCuenta = 0;
        this.saldoCuenta = 0.0;
        this.fechaCreacion = "";
        this.nomCliente = "";
        this.movimiento = new Movimiento();
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldoCuenta() {
        return saldoCuenta;
    }
    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    public String getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getNomCliente() {
        return nomCliente;
    }
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }
    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }
    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
      
    Movimiento consignacion = new Movimiento();
    cosignacion.set
    
}
