package entities2;

public class PessoaJuridica extends Pessoa {
	
	private Integer numFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	@Override
	public Double imposto() {
		double imp;
		if (numFuncionarios < 10) {
			imp = getRendaAnual() * 0.16; 
		}
		else {
			imp = getRendaAnual() * 0.14;
		}
		return imp;
	}
	
	public String toString() {
		return getNome()
		      + ": $ "
		      + String.format("%.2f",imposto());
	}
}