package br.com.paulo.domain.pessoal;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * Classe Funcionario
 * @author paulo.4904
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Funcionario extends PessoaFisica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer NumeroRegistro;
	
	private Boolean EstaAtivo;
	
	private PessoaFisica pessoafisica;

	

}
