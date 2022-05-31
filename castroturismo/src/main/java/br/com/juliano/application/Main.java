package br.com.juliano.application;

import br.com.paulo.local.Cidade;
import br.com.paulo.local.Estado;
import br.com.paulo.local.Pais;
import br.com.paulo.seguranca.Login;
import br.com.paulo.domain.pessoal.Pessoa;

import java.util.Date;

import br.com.paulo.domain.pessoal.Funcionario;
import br.com.paulo.domain.pessoal.Motorista;
import br.com.paulo.domain.pessoal.PessoaFisica;
import br.com.paulo.domain.pessoal.Rodoviaria;
import br.com.paulo.domain.pessoal.Passageiro;
import br.com.paulo.veiculo.Onibus;
import br.com.paulo.veiculo.Seguradora;
import br.com.paulo.viagem.Passagem;
import br.com.paulo.viagem.Rotas;
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
				
				
			//Passageiro
				Passageiro passageiro = new Passageiro();
				
					passageiro.setNome("Ricardo");
				
					passageiro.setId(2);
				
					passageiro.setCPF(113475667);
				
					passageiro.setTelefoneCelular("98804-3545");
				
				System.out.println(passageiro);
				
				
			//Rodoviaria
				
				Rodoviaria rodoviaria = new Rodoviaria();
			
					rodoviaria.setId(3);
			
					rodoviaria.setTaxaEmbarque(3.20);
			
					rodoviaria.setCNPJ(1477);
			
					rodoviaria.setCidade("Ponta Grossa");
			
				System.out.println(rodoviaria);		
				
				
			//Onibus
				Onibus onibus = new Onibus();
			
					onibus.setCombustivel("DieselS10");
					
					onibus.setEstaSegurado(true);
					
					onibus.setId(4);
				
					onibus.setNumeroEixos(3);
				
					onibus.setPoltrona(45);
					
					onibus.setPlaca("CDE-4597");
				
					onibus.setRenavam(41414);

					onibus.setQuilometragem(1000);
				
					onibus.setApolice("12347");
					
				
				
				System.out.println(onibus);
				
				
			//Seguradora
				Seguradora seguradora = new Seguradora();
				
					seguradora.setCorretor("Carlos");
				
					seguradora.setId(5);
					seguradora.setNome("Anatel");
					seguradora.setTelefone("4002-8922");
				
				System.out.println(seguradora);
				
				
			//Login
				Login login = new Login();
					login.setId(0);
					login.setSenha("xxxxx");
					login.setLogin("P4uloOsta");
					
					System.out.println(login);
				
				
			//Rotas
				
				Rotas rotas = new Rotas();
				
					rotas.setId(6);
					
					rotas.setOnibus(onibus);
				
					rotas.setOrigem(rodoviaria);
				
					rotas.setPrecoPassagem(5.50);
				
					rotas.setQuilometragem(1.20);
					
					rotas.setDestino("Bahia");
					
					rotas.setMotorista(motorista);
				
				System.out.println(rotas);
				
				
			//Passagem
				Passagem passagem = new Passagem();
				
				passagem.setId(7);
				
				passagem.setFormaPagamento("PIX");
				
				passagem.setNumeroPassagem(10);
				
				passagem.setNumeroCartao(100);
				
				passagem.setNumeroPoltrona(32);
				
				passagem.setPassageiro(passageiro);
				
				passagem.setPossuiBagagem(true);
				
				passagem.setRota(rotas);
				
				
				
				
				
				
	}

}
