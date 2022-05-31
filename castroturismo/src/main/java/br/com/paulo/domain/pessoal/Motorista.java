package br.com.paulo.domain.pessoal;
import java.io.Serializable;

/**
 * Classe motorista
 * @author paulo.4904
 *
 */
public class Motorista extends Funcionario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer CNH;
	
	private String categoriaCNH;
	
	private Boolean EAR;
	
	private Funcionario funcionario;
	/**
	 * 
	 */
	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public Integer getCNH() {
		return CNH;
	}
	public void setCNH(Integer cNH) {
		CNH = cNH;
	}
	public String getCategoriaCNH() {
		return categoriaCNH;
	}
	public void setCategoriaCNH(String categoriaCNH) {
		this.categoriaCNH = categoriaCNH;
	}
	public Boolean getEAR() {
		return EAR;
	}
	public void setEAR(Boolean eAR) {
		EAR = eAR;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNH == null) ? 0 : CNH.hashCode());
		result = prime * result + ((EAR == null) ? 0 : EAR.hashCode());
		result = prime * result + ((categoriaCNH == null) ? 0 : categoriaCNH.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
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
		Motorista other = (Motorista) obj;
		if (CNH == null) {
			if (other.CNH != null)
				return false;
		} else if (!CNH.equals(other.CNH))
			return false;
		if (EAR == null) {
			if (other.EAR != null)
				return false;
		} else if (!EAR.equals(other.EAR))
			return false;
		if (categoriaCNH == null) {
			if (other.categoriaCNH != null)
				return false;
		} else if (!categoriaCNH.equals(other.categoriaCNH))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		return true;
	}
	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return String.format(
				"Motorista [CNH=%s, categoriaCNH=%s, EAR=%s, funcionario=%s, getNumeroRegistro()=%s, getEstaAtivo()=%s, getPessoafisica()=%s, getCPF()=%s, getRG()=%s, getOrgaoEmissor()=%s, getNascimento()=%s, getId()=%s, getNome()=%s, getTelefoneCelular()=%s, getEmail()=%s, getLogradouro()=%s, getComplemento()=%s, getNumero()=%s, getCidade()=%s, getClass()=%s, toString()=%s]",
				CNH, categoriaCNH, EAR, funcionario, getNumeroRegistro(), getEstaAtivo(), getPessoafisica(), getCPF(),
				getRG(), getOrgaoEmissor(), getNascimento(), getId(), getNome(), getTelefoneCelular(), getEmail(),
				getLogradouro(), getComplemento(), getNumero(), getCidade(), getClass(), super.toString());
	}
	

	
	
	

}
