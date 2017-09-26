package parcial;
import java.util.ArrayList;

public class Banco {
    private String codigo;
    private ArrayList<Tipo> tipos;
    private ArrayList<Cuenta> cuentas;
    private Cuenta cuenta;
    
    public Banco(){
        this.codigo = "";
        this.tipos = new ArrayList();
        this.cuentas = new ArrayList();
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public void addCuenta(Cuenta cuenta){
        cuentas.add(this.cuenta);        
    }    
}
