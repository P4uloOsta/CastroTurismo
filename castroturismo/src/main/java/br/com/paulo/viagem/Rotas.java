package br.com.paulo.viagem;
import java.io.Serializable;

import br.com.paulo.domain.pessoal.Motorista;
import br.com.paulo.domain.pessoal.Rodoviaria;
import br.com.paulo.veiculo.Onibus;
/**
 * Classe rotas
 * @author paulo.4904
 *
 */

public class Rotas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Rodoviaria origem;
	
	private Rodoviaria rodoviaria;
	
	private Double quilometragem;
	
	private Double precoPassagem;
	
	private Motorista motorista;
	
	private Onibus onibus;

	/**
	 * 
	 */
	public Rotas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Rodoviaria getOrigem() {
		return origem;
	}

	public void setOrigem(Rodoviaria origem) {
		this.origem = origem;
	}

	public Rodoviaria getRodoviaria() {
		return rodoviaria;
	}

	public void setRodoviaria(Rodoviaria rodoviaria) {
		this.rodoviaria = rodoviaria;
	}

	public Double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public Double getPrecoPassagem() {
		return precoPassagem;
	}

	public void setPrecoPassagem(Double precoPassagem) {
		this.precoPassagem = precoPassagem;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Onibus getOnibus() {
		return onibus;
	}

	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((motorista == null) ? 0 : motorista.hashCode());
		result = prime * result + ((onibus == null) ? 0 : onibus.hashCode());
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
		result = prime * result + ((precoPassagem == null) ? 0 : precoPassagem.hashCode());
		result = prime * result + ((quilometragem == null) ? 0 : quilometragem.hashCode());
		result = prime * result + ((rodoviaria == null) ? 0 : rodoviaria.hashCode());
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
		Rotas other = (Rotas) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (motorista == null) {
			if (other.motorista != null)
				return false;
		} else if (!motorista.equals(other.motorista))
			return false;
		if (onibus == null) {
			if (other.onibus != null)
				return false;
		} else if (!onibus.equals(other.onibus))
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		if (precoPassagem == null) {
			if (other.precoPassagem != null)
				return false;
		} else if (!precoPassagem.equals(other.precoPassagem))
			return false;
		if (quilometragem == null) {
			if (other.quilometragem != null)
				return false;
		} else if (!quilometragem.equals(other.quilometragem))
			return false;
		if (rodoviaria == null) {
			if (other.rodoviaria != null)
				return false;
		} else if (!rodoviaria.equals(other.rodoviaria))
			return false;
		return true;
	}
	
	
	

}
