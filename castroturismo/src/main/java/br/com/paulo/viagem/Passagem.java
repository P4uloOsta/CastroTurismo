/**
 * 
 */
package br.com.paulo.viagem;
import java.io.Serializable;

import br.com.paulo.domain.pessoal.Passageiro;
/**
 * Classe Passagem
 * @author paulo.4904
 *
 */
public class Passagem extends Passageiro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer NumeroPassagem;
	
	private String FormaPagamento;
	
	private Boolean PossuiBagagem;
	
	private Integer NumeroPoltrona;
	
	private Rotas rota;
	
	private Passageiro passageiro;

	/**
	 * 
	 */
	public Passagem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNumeroPassagem() {
		return NumeroPassagem;
	}

	public void setNumeroPassagem(Integer numeroPassagem) {
		NumeroPassagem = numeroPassagem;
	}

	public String getFormaPagamento() {
		return FormaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		FormaPagamento = formaPagamento;
	}

	public Boolean getPossuiBagagem() {
		return PossuiBagagem;
	}

	public void setPossuiBagagem(Boolean possuiBagagem) {
		PossuiBagagem = possuiBagagem;
	}

	public Integer getNumeroPoltrona() {
		return NumeroPoltrona;
	}

	public void setNumeroPoltrona(Integer numeroPoltrona) {
		NumeroPoltrona = numeroPoltrona;
	}

	public Rotas getRota() {
		return rota;
	}

	public void setRota(Rotas rota) {
		this.rota = rota;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FormaPagamento == null) ? 0 : FormaPagamento.hashCode());
		result = prime * result + ((NumeroPassagem == null) ? 0 : NumeroPassagem.hashCode());
		result = prime * result + ((NumeroPoltrona == null) ? 0 : NumeroPoltrona.hashCode());
		result = prime * result + ((PossuiBagagem == null) ? 0 : PossuiBagagem.hashCode());
		result = prime * result + ((passageiro == null) ? 0 : passageiro.hashCode());
		result = prime * result + ((rota == null) ? 0 : rota.hashCode());
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
		Passagem other = (Passagem) obj;
		if (FormaPagamento == null) {
			if (other.FormaPagamento != null)
				return false;
		} else if (!FormaPagamento.equals(other.FormaPagamento))
			return false;
		if (NumeroPassagem == null) {
			if (other.NumeroPassagem != null)
				return false;
		} else if (!NumeroPassagem.equals(other.NumeroPassagem))
			return false;
		if (NumeroPoltrona == null) {
			if (other.NumeroPoltrona != null)
				return false;
		} else if (!NumeroPoltrona.equals(other.NumeroPoltrona))
			return false;
		if (PossuiBagagem == null) {
			if (other.PossuiBagagem != null)
				return false;
		} else if (!PossuiBagagem.equals(other.PossuiBagagem))
			return false;
		if (passageiro == null) {
			if (other.passageiro != null)
				return false;
		} else if (!passageiro.equals(other.passageiro))
			return false;
		if (rota == null) {
			if (other.rota != null)
				return false;
		} else if (!rota.equals(other.rota))
			return false;
		return true;
	}
	
	

}
