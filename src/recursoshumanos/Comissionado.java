package recursoshumanos;

public class Comissionado extends Empregado{
    private double totalVendas;
    private double taxaComissao;

    public Comissionado(double totalVendas, double taxaComissao, String nome, String sobreNome, String cpf) {
        super(nome, sobreNome, cpf);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    @Override
    public String toString() {
        return "Comissionado{" + "totalVendas=" + totalVendas + ", taxaComissao=" + taxaComissao + '}';
    }

    @Override
    public double vencimento() {
        return this.getTotalVendas() * (this.getTaxaComissao()/100);
    }
    
}
