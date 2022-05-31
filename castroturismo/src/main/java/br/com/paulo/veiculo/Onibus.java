/**
 * 
 */
package br.com.paulo.veiculo;
import java.io.Serializable;

import lombok.ToString;
/**
 * Classe onibus
 * @author paulo.4904
 *
 */

public class Onibus extends Veiculo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer poltrona;
	
	private Veiculo veiculo;
	
	private Seguradora seguradora; 

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
		int result = super.hashCode();
		result = prime * result + ((poltrona == null) ? 0 : poltrona.hashCode());
		result = prime * result + ((veiculo == null) ? 0 : veiculo.hashCode());
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

	@Override
	public String toString() {
		return String.format(
				"Onibus [poltrona=%s, veiculo=%s, seguradora=%s, getPlaca()=%s, getId()=%s, getRenavam()=%s, getQuilometragem()=%s, getSeguradora()=%s, getEstaSegurado()=%s, getApolice()=%s, getNumeroEixos()=%s, getCombustivel()=%s, getClass()=%s, toString()=%s]",
				poltrona, veiculo, seguradora, getPlaca(), getId(), getRenavam(), getQuilometragem(), getSeguradora(),
				getEstaSegurado(), getApolice(), getNumeroEixos(), getCombustivel(), getClass(), super.toString());
	}



	
	

}
