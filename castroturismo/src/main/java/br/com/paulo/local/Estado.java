package br.com.paulo.local;
import java.io.Serializable;
/**
 * Classe que recebe os dados dos paises
 * @author paulo.4904
 *
 */

public class Estado extends Pais implements Serializable {
		private static final long serialVersionUID=1L;
		private Integer id;
		private String nome;
		private Pais pais;
		/**
		 * 
		 */
		public Estado() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Pais getPais() {
			return pais;
		}
		public void setPais(Pais pais) {
			this.pais = pais;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((pais == null) ? 0 : pais.hashCode());
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
			Estado other = (Estado) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (pais == null) {
				if (other.pais != null)
					return false;
			} else if (!pais.equals(other.pais))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return String.format("Estado [id=%s, nome=%s, pais=%s]", id, nome, pais);
		}
		
		
 
}
