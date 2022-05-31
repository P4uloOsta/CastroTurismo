package br.com.paulo.domain.pessoal;
import java.io.Serializable;
/**
 * Classe Funcionario
 * @author paulo.4904
 *
 */

public class Funcionario extends PessoaFisica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer NumeroRegistro;
	
	private Boolean EstaAtivo;
	
	private PessoaFisica pessoafisica;

	/**
	 * 
	 */
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNumeroRegistro() {
		return NumeroRegistro;
	}

	public void setNumeroRegistro(Integer numeroRegistro) {
		NumeroRegistro = numeroRegistro;
	}

	public Boolean getEstaAtivo() {
		return EstaAtivo;
	}

	public void setEstaAtivo(Boolean estaAtivo) {
		EstaAtivo = estaAtivo;
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
		result = prime * result + ((EstaAtivo == null) ? 0 : EstaAtivo.hashCode());
		result = prime * result + ((NumeroRegistro == null) ? 0 : NumeroRegistro.hashCode());
		result = prime * result + ((pessoafisica == null) ? 0 : pessoafisica.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (EstaAtivo == null) {
			if (other.EstaAtivo != null)
				return false;
		} else if (!EstaAtivo.equals(other.EstaAtivo))
			return false;
		if (NumeroRegistro == null) {
			if (other.NumeroRegistro != null)
				return false;
		} else if (!NumeroRegistro.equals(other.NumeroRegistro))
			return false;
		if (pessoafisica == null) {
			if (other.pessoafisica != null)
				return false;
		} else if (!pessoafisica.equals(other.pessoafisica))
			return false;
		return true;
	}
	

}
