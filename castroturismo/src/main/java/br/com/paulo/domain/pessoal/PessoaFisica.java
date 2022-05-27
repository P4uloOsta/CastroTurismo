package br.com.paulo.domain.pessoal;
import java.io.Serializable;
import java.util.Date;
/**
 * Classe pessoa fisica
 * @author paulo.4904
 *
 */

public class PessoaFisica implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private	Integer CPF;
	
	private Integer RG;
	
	private String OrgaoEmissor;
	
	private Date nascimento;
	
	public Integer getCPF() {
		return CPF;
	}

	public void setCPF(Integer cPF) {
		CPF = cPF;
	}

	public Integer getRG() {
		return RG;
	}

	public void setRG(Integer rG) {
		RG = rG;
	}

	public String getOrgaoEmissor() {
		return OrgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		OrgaoEmissor = orgaoEmissor;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + ((OrgaoEmissor == null) ? 0 : OrgaoEmissor.hashCode());
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
		result = prime * result + ((nascimento == null) ? 0 : nascimento.hashCode());
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
		PessoaFisica other = (PessoaFisica) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (OrgaoEmissor == null) {
			if (other.OrgaoEmissor != null)
				return false;
		} else if (!OrgaoEmissor.equals(other.OrgaoEmissor))
			return false;
		if (RG == null) {
			if (other.RG != null)
				return false;
		} else if (!RG.equals(other.RG))
			return false;
		if (nascimento == null) {
			if (other.nascimento != null)
				return false;
		} else if (!nascimento.equals(other.nascimento))
			return false;
		return true;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	
	
	/**
	 * 
	 */
	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
