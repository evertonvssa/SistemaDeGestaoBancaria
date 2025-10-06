public class ContaCorrente extends Contas{
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String titular, double saldo, double limiteChequeEspecial){
        super(numero, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("O seu limite de cheque especial é: R$ %.2f\n", this.limiteChequeEspecial);
    }

    public void mostrarDados(boolean detalharLimite) {
        mostrarDados();
        if (detalharLimite) {
            double saldoDisponivel = getSaldo() + this.limiteChequeEspecial;
            System.out.printf("O Seu saldo disponível (saldo + limite) é: R$ %.2f\n", saldoDisponivel);
        }
    }
}
