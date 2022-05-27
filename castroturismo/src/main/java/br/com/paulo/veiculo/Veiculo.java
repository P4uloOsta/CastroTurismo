package br.com.paulo.veiculo;
import java.io.Serializable;
/**
 * classe veiculo
 * @author paulo.4904
 *
 */
public abstract class Veiculo implements Serializable {

	/**
	 * 
	 */
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String placa;
	
	private Integer id;
	
	private Integer Renavam;
	
	private Integer quilometragem;
	
	private Seguradora seguradora;
	
	private Boolean	EstaSegurado;
		
	private String	apolice;
	
	private Integer NumeroEixos;
	
	private String Combustivel;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRenavam() {
		return Renavam;
	}

	public void setRenavam(Integer renavam) {
		Renavam = renavam;
	}

	public Integer getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}

	public Seguradora getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

	public Boolean getEstaSegurado() {
		return EstaSegurado;
	}

	public void setEstaSegurado(Boolean estaSegurado) {
		EstaSegurado = estaSegurado;
	}

	public String getApolice() {
		return apolice;
	}

	public void setApolice(String apolice) {
		this.apolice = apolice;
	}

	public Integer getNumeroEixos() {
		return NumeroEixos;
	}

	public void setNumeroEixos(Integer numeroEixos) {
		NumeroEixos = numeroEixos;
	}

	public String getCombustivel() {
		return Combustivel;
	}

	public void setCombustivel(String combustivel) {
		Combustivel = combustivel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Combustivel == null) ? 0 : Combustivel.hashCode());
		result = prime * result + ((EstaSegurado == null) ? 0 : EstaSegurado.hashCode());
		result = prime * result + ((NumeroEixos == null) ? 0 : NumeroEixos.hashCode());
		result = prime * result + ((Renavam == null) ? 0 : Renavam.hashCode());
		result = prime * result + ((apolice == null) ? 0 : apolice.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((quilometragem == null) ? 0 : quilometragem.hashCode());
		result = prime * result + ((seguradora == null) ? 0 : seguradora.hashCode());
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
		Veiculo other = (Veiculo) obj;
		if (Combustivel == null) {
			if (other.Combustivel != null)
				return false;
		} else if (!Combustivel.equals(other.Combustivel))
			return false;
		if (EstaSegurado == null) {
			if (other.EstaSegurado != null)
				return false;
		} else if (!EstaSegurado.equals(other.EstaSegurado))
			return false;
		if (NumeroEixos == null) {
			if (other.NumeroEixos != null)
				return false;
		} else if (!NumeroEixos.equals(other.NumeroEixos))
			return false;
		if (Renavam == null) {
			if (other.Renavam != null)
				return false;
		} else if (!Renavam.equals(other.Renavam))
			return false;
		if (apolice == null) {
			if (other.apolice != null)
				return false;
		} else if (!apolice.equals(other.apolice))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (quilometragem == null) {
			if (other.quilometragem != null)
				return false;
		} else if (!quilometragem.equals(other.quilometragem))
			return false;
		if (seguradora == null) {
			if (other.seguradora != null)
				return false;
		} else if (!seguradora.equals(other.seguradora))
			return false;
		return true;
	}
	
	
	
	

	

}
