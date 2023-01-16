public abstract class Conta {
    private double saldo;
    private int agencia;
    private int numero;


    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

}
