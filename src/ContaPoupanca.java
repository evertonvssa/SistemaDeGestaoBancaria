public class ContaPoupanca extends Contas{
    private double taxaRedimentoMensal;

    public ContaPoupanca(String numero, String titular, double saldo, double taxaRedimentoMensal) {
        super(numero, titular, saldo);
        this.taxaRedimentoMensal = taxaRedimentoMensal;
    }

    public double getTaxaRedimentoMensal() {
        return taxaRedimentoMensal;
    }

    public void setTaxaRedimentoMensal(double taxaRedimentoMensal) {
        this.taxaRedimentoMensal = taxaRedimentoMensal;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Sua taxa de rendimento é: " + this.taxaRedimentoMensal);
    }

    public void mostrarDados(boolean emTaxaAnual){
        mostrarDados();
        if(emTaxaAnual){
            double taxaAnual = this.taxaRedimentoMensal * 12;
            System.out.printf("Sua Taxa anual aproximada é de: %.2f%%\n", taxaAnual);
        }else{
            System.out.printf("Sua taxa de rendimento mensal é: R$ %.2f%%\n", this.taxaRedimentoMensal);
        }
    }
}
