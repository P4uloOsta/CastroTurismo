package br.com.paulo.domain.pessoal;
import java.io.Serializable;
/**
 * Classe Passageiro
 * @author paulo.4904
 *
 */
public class Passageiro  extends PessoaFisica  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer NumeroCartao;
	
	private String vencimento;
	
	private Integer seguranca;

	private PessoaFisica pessoafisica;

	/**
	 * 
	 */
	public Passageiro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNumeroCartao() {
		return NumeroCartao;
	}

	public void setNumeroCartao(Integer numeroCartao) {
		NumeroCartao = numeroCartao;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public Integer getSeguranca() {
		return seguranca;
	}

	public void setSeguranca(Integer seguranca) {
		this.seguranca = seguranca;
	}

	public PessoaFisica getPessoafisica() {
		return pessoafisica;
	}

	public void setPessoafisica(PessoaFisica pessoafisica) {
		this.pessoafisica = pessoafisica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NumeroCartao == null) ? 0 : NumeroCartao.hashCode());
		result = prime * result + ((pessoafisica == null) ? 0 : pessoafisica.hashCode());
		result = prime * result + ((seguranca == null) ? 0 : seguranca.hashCode());
		result = prime * result + ((vencimento == null) ? 0 : vencimento.hashCode());
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
		Passageiro other = (Passageiro) obj;
		if (NumeroCartao == null) {
			if (other.NumeroCartao != null)
				return false;
		} else if (!NumeroCartao.equals(other.NumeroCartao))
			return false;
		if (pessoafisica == null) {
			if (other.pessoafisica != null)
				return false;
		} else if (!pessoafisica.equals(other.pessoafisica))
			return false;
		if (seguranca == null) {
			if (other.seguranca != null)
				return false;
		} else if (!seguranca.equals(other.seguranca))
			return false;
		if (vencimento == null) {
			if (other.vencimento != null)
				return false;
		} else if (!vencimento.equals(other.vencimento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"Passageiro [NumeroCartao=%s, vencimento=%s, seguranca=%s, pessoafisica=%s, getCPF()=%s, getRG()=%s, getOrgaoEmissor()=%s, getNascimento()=%s, getId()=%s, getNome()=%s, getTelefoneCelular()=%s, getEmail()=%s, getLogradouro()=%s, getComplemento()=%s, getNumero()=%s, getCidade()=%s, getClass()=%s, toString()=%s]",
				NumeroCartao, vencimento, seguranca, pessoafisica, getCPF(), getRG(), getOrgaoEmissor(),
				getNascimento(), getId(), getNome(), getTelefoneCelular(), getEmail(), getLogradouro(),
				getComplemento(), getNumero(), getCidade(), getClass(), super.toString());
	}

	
	
	
}
