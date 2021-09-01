package entities2;

public class PessoaFisica extends Pessoa {
	
	private Double gastosSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}	
	
	@Override
	public Double imposto() {
		double imp;
	    if (getRendaAnual() < 20000.0) {
			      imp = (getRendaAnual() * 0.15) - (getGastosSaude() * 0.5);
		}
		       else {
		    	   imp = (getRendaAnual() * 0.25) - (getGastosSaude() * 0.5);
		       }
	    return imp;
	}
	
	public String toString(){
		return getNome()
			  +": $ "	
			  + imposto();	
	}
}