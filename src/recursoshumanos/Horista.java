/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos;

public class Horista extends Empregado {
    private int horasTrabalhadas;
    private double precoHora;

    public Horista(int horasTrabalhadas, double precoHora, String nome, String sobreNome, String cpf) {
        super(nome, sobreNome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.precoHora = precoHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public String toString() {
        return "Horista{" + "horasTrabalhadas=" + horasTrabalhadas + ", precoHora=" + precoHora + '}';
    }
    
    @Override
    public double vencimento() {
        return this.getPrecoHora()*this.getHorasTrabalhadas();
    }
    
}
