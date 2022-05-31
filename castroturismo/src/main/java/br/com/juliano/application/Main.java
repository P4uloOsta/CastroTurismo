package br.com.juliano.application;

import br.com.paulo.local.Cidade;
import br.com.paulo.local.Estado;
import br.com.paulo.local.Pais;
import br.com.paulo.domain.pessoal.Pessoa;

import java.util.Date;

import br.com.paulo.domain.pessoal.Funcionario;
import br.com.paulo.domain.pessoal.Motorista;
import br.com.paulo.domain.pessoal.PessoaFisica;
import br.com.paulo.domain.pessoal.Passageiro;
public class Main {
	public static void main(String[] args) {
		
		
		//Pais
				Pais pais = new Pais();
				
				pais.setId(1);
				
				pais.setNome("Brasil");
				
				System.out.println(pais);
				
				Estado estado = new Estado();
				
				estado.setId(1);
				
				estado.setNome("Parana");
				
				System.out.println(estado);
				
				//Estado
				Estado sp = new Estado();
				
				sp.setId(1);
				sp.setNome("São Paulo");
				sp.setPais(pais);
				
				System.out.println(sp);
				
				//Cidade
				Cidade cst = new Cidade();
				
				cst.setNome("Castro");
				
				cst.setEstado(estado);
				
				System.out.println(cst);
				
				//Pessoa
				
				Motorista motorista = new Motorista();
				
				motorista.setNome("Tubarão da 151");
				
				motorista.setTelefoneCelular("42 98895-4040");
				
				motorista.setEmail("tubarao151@castroturismo.com.br");
				
				
				motorista.setLogradouro("Paina");
				
				motorista.setCPF(1450178992);
				
				motorista.setNumeroRegistro(44);
				
				motorista.setCategoriaCNH("D");
				
				motorista.setCidade("Castro");
				
				motorista.setEAR(null);
				
				motorista.setEstaAtivo(null);
				
				motorista.setRG(14142000);
				
				motorista.setId(10);
				
				motorista.setOrgaoEmissor("cartao");
				
				motorista.setCNH(15454554);
				
				Date dataNascimento = new Date();
				motorista.setNascimento(dataNascimento);
				
				System.out.println(motorista);
				
				
	}

}
