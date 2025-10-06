public class ContaInvestimento extends Contas {
    private double taxaAdministracao; // Em percentual

    public ContaInvestimento(String numero, String titular, double saldo, double taxaAdministracao) {
        super(numero, titular, saldo);
        this.taxaAdministracao = taxaAdministracao;
    }

    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }

    public void setTaxaAdministracao(double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Taxa de Administração: %.2f%%\n", this.taxaAdministracao);
    }

    public void mostrarDados(boolean considerarTaxa) {
        mostrarDados();
        if (considerarTaxa) {
            double valorTaxa = getSaldo() * (this.taxaAdministracao / 100.0);
            double saldoLiquido = getSaldo() - valorTaxa;
            System.out.printf(">>> Saldo Líquido (após taxa de adm.): R$ %.2f\n", saldoLiquido);
        }
    }
}