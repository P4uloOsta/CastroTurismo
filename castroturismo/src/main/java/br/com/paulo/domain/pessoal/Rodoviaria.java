/**
 * 
 */
package br.com.paulo.domain.pessoal;
import	java.io.Serializable;
/**
 * Classe rodoviaria
 * @author paulo.4904
 *
 */
public class Rodoviaria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String HoraAbertura;
	
	private String HoraFechamento;
	
	private Double TaxaEmbarque;
	
	private PessoaJuridica pessoajuridica;

	/**
	 * 
	 */
	public Rodoviaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHoraAbertura() {
		return HoraAbertura;
	}

	public void setHoraAbertura(String horaAbertura) {
		HoraAbertura = horaAbertura;
	}

	public String getHoraFechamento() {
		return HoraFechamento;
	}

	public void setHoraFechamento(String horaFechamento) {
		HoraFechamento = horaFechamento;
	}

	public Double getTaxaEmbarque() {
		return TaxaEmbarque;
	}

	public void setTaxaEmbarque(Double taxaEmbarque) {
		TaxaEmbarque = taxaEmbarque;
	}

	public PessoaJuridica getPessoajuridica() {
		return pessoajuridica;
	}

	public void setPessoajuridica(PessoaJuridica pessoajuridica) {
		this.pessoajuridica = pessoajuridica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((HoraAbertura == null) ? 0 : HoraAbertura.hashCode());
		result = prime * result + ((HoraFechamento == null) ? 0 : HoraFechamento.hashCode());
		result = prime * result + ((TaxaEmbarque == null) ? 0 : TaxaEmbarque.hashCode());
		result = prime * result + ((pessoajuridica == null) ? 0 : pessoajuridica.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rodoviaria other = (Rodoviaria) obj;
		if (HoraAbertura == null) {
			if (other.HoraAbertura != null)
				return false;
		} else if (!HoraAbertura.equals(other.HoraAbertura))
			return false;
		if (HoraFechamento == null) {
			if (other.HoraFechamento != null)
				return false;
		} else if (!HoraFechamento.equals(other.HoraFechamento))
			return false;
		if (TaxaEmbarque == null) {
			if (other.TaxaEmbarque != null)
				return false;
		} else if (!TaxaEmbarque.equals(other.TaxaEmbarque))
			return false;
		if (pessoajuridica == null) {
			if (other.pessoajuridica != null)
				return false;
		} else if (!pessoajuridica.equals(other.pessoajuridica))
			return false;
		return true;
	}
	
	
	

}
