/**
 * 
 */
package br.com.paulo.veiculo;
import java.io.Serializable;
/**
 * Classe onibus
 * @author paulo.4904
 *
 */
public class Onibus implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer poltrona;
	
	private Veiculo veiculo;

	/**
	 * 
	 */
	public Onibus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(Integer poltrona) {
		this.poltrona = poltrona;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((poltrona == null) ? 0 : poltrona.hashCode());
		result = prime * result + ((veiculo == null) ? 0 : veiculo.hashCode());
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
		Onibus other = (Onibus) obj;
		if (poltrona == null) {
			if (other.poltrona != null)
				return false;
		} else if (!poltrona.equals(other.poltrona))
			return false;
		if (veiculo == null) {
			if (other.veiculo != null)
				return false;
		} else if (!veiculo.equals(other.veiculo))
			return false;
		return true;
	}
	
	

}
