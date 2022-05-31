/**
 * 
 */
package br.com.paulo.domain.pessoal;
import	java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * Classe rodoviaria
 * @author paulo.4904
 *
 */

public class Rodoviaria extends PessoaJuridica implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String HoraAbertura;
	
	private String HoraFechamento;
	
	private Double TaxaEmbarque;
	
	private String Destino;
	
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

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
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
		int result = super.hashCode();
		result = prime * result + ((Destino == null) ? 0 : Destino.hashCode());
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
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rodoviaria other = (Rodoviaria) obj;
		if (Destino == null) {
			if (other.Destino != null)
				return false;
		} else if (!Destino.equals(other.Destino))
			return false;
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

	@Override
	public String toString() {
		return String.format(
				"Rodoviaria [HoraAbertura=%s, HoraFechamento=%s, TaxaEmbarque=%s, Destino=%s, pessoajuridica=%s, getCNPJ()=%s, getInscricaoAtual()=%s, getDataAbertura()=%s, getPessoa()=%s, getId()=%s, getNome()=%s, getTelefoneCelular()=%s, getEmail()=%s, getLogradouro()=%s, getComplemento()=%s, getNumero()=%s, getCidade()=%s, getClass()=%s, toString()=%s]",
				HoraAbertura, HoraFechamento, TaxaEmbarque, Destino, pessoajuridica, getCNPJ(), getInscricaoAtual(),
				getDataAbertura(), getPessoa(), getId(), getNome(), getTelefoneCelular(), getEmail(), getLogradouro(),
				getComplemento(), getNumero(), getCidade(), getClass(), super.toString());
	}

	/**
	 * 
	 */

	
	
	
	

}
