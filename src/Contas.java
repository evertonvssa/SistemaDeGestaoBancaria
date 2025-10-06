public class Contas {
    private String numero;
    private String titular;
    private double saldo;

    public Contas(String numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarDados(){
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }

    public void mostrarDados(double projecaoMensal){
        double saldoProjetado = this.saldo * (1 + (projecaoMensal/100));
        System.out.println(" PROJEÇÃO DE SALDO ");
        mostrarDados();
        System.out.printf("Saldo projetado (%.2f% a.m.): R$ %.2f\n", projecaoMensal, saldoProjetado);
    }
}
