package br.com.paulo.domain.pessoal;
import java.io.Serializable;
import java.util.Date;
/**
 * Classe para a pessoa Juridica
 * @author paulo.4904
 *
 */
public class PessoaJuridica extends Pessoa implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer CNPJ;
	
	private Integer InscricaoAtual;
	
	private Date dataAbertura;
	
	private Pessoa pessoa;

	/**
	 * 
	 */
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(Integer cNPJ) {
		CNPJ = cNPJ;
	}

	public Integer getInscricaoAtual() {
		return InscricaoAtual;
	}

	public void setInscricaoAtual(Integer inscricaoAtual) {
		InscricaoAtual = inscricaoAtual;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNPJ == null) ? 0 : CNPJ.hashCode());
		result = prime * result + ((InscricaoAtual == null) ? 0 : InscricaoAtual.hashCode());
		result = prime * result + ((dataAbertura == null) ? 0 : dataAbertura.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
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
		PessoaJuridica other = (PessoaJuridica) obj;
		if (CNPJ == null) {
			if (other.CNPJ != null)
				return false;
		} else if (!CNPJ.equals(other.CNPJ))
			return false;
		if (InscricaoAtual == null) {
			if (other.InscricaoAtual != null)
				return false;
		} else if (!InscricaoAtual.equals(other.InscricaoAtual))
			return false;
		if (dataAbertura == null) {
			if (other.dataAbertura != null)
				return false;
		} else if (!dataAbertura.equals(other.dataAbertura))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}
	
}
