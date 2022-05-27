/**
 * 
 */
package br.com.paulo.domain.pessoal;
import	java.io.Serializable;
/**
 * Classe menores
 * 
 * @author paulo.4904
 *
 */
public class Menores implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Boolean AutorizacaoPassagem;
	
	private Passageiro responsavel;

	/**
	 * 
	 */
	public Menores() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boolean getAutorizacaoPassagem() {
		return AutorizacaoPassagem;
	}

	public void setAutorizacaoPassagem(Boolean autorizacaoPassagem) {
		AutorizacaoPassagem = autorizacaoPassagem;
	}

	public Passageiro getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Passageiro responsavel) {
		this.responsavel = responsavel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AutorizacaoPassagem == null) ? 0 : AutorizacaoPassagem.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
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
		Menores other = (Menores) obj;
		if (AutorizacaoPassagem == null) {
			if (other.AutorizacaoPassagem != null)
				return false;
		} else if (!AutorizacaoPassagem.equals(other.AutorizacaoPassagem))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		return true;
	}

	
	
	

}
