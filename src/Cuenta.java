public class Cuenta {
    private String numero_cuenta;
    private String cedula_usuario;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String numero_cuenta, String cedula_usuario, double saldo) {
        this.numero_cuenta = numero_cuenta;
        this.cedula_usuario = cedula_usuario;
        this.saldo = saldo;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(String cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero_cuenta='" + numero_cuenta + '\'' +
                ", cedula_usuario='" + cedula_usuario + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public double ingresar (double monto){
        if (monto<0){
            System.out.println("Valores no validos");
        }else {
            System.out.println("Saldo actual= ");
        }
        return this.saldo +=monto;
    }

    public double retirar (double monto_retiro){
        if (monto_retiro<0){
            System.out.println("Valores no validos");
        }else {
            System.out.println("Saldo actual= ");
        }
        return this.saldo -= monto_retiro;
    }

    public double extraccion_rapida (double monto){
        double descuento=0;
        if (this.saldo < 10000){
            System.out.println("No tiene saldo");
        } else {
            descuento= this.saldo* 0.2;
        }
        return this.saldo -=descuento;
    }
}
