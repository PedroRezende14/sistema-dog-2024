package VIEW;

import java.util.Scanner;

import javax.swing.JOptionPane;

import DTO.DadosCao;
import DTO.Mae;
import DTO.Pai;

public class PaineisVIEW {
	
	
	public void Login() {
		System.out.println("------------------------------------+");
		System.out.println("              Bem Vindo             |");
		System.out.println("------------------------------------|");
		System.out.println("1 - Entrar como Adim				|");
		System.out.println("2 - Entrar como User                |");
		System.out.println("3 - Registrar                       |");
		System.out.println("3 - sair                            |");
		System.out.println("------------------------------------+");
	}
	
	public void PainelAdim() {
		System.out.println("------------------------------------+");
		System.out.println("            Painel Adm              |");
		System.out.println("------------------------------------|");
		System.out.println("1 - Cadastrar Novo Cachorro         |");
		System.out.println("2 - Deletar Cadastro                |");
		System.out.println("3 - Procurar Cadastro por ID        |");
		System.out.println("4 - Alterar Informaçoes do Cachorro |");
		System.out.println("5 - Ver todos os Cadastros          |");
		System.out.println("8 - Sair                            |");
		System.out.println("------------------------------------+");
	}
	
	public void PainelUser() {
		System.out.println("------------------------------------+");
		System.out.println("            Painel Usuario          |");
		System.out.println("------------------------------------|");
		System.out.println("1 - Cadastrar Novo Cachorro         |");
		System.out.println("2 - Procurar Cadastro por ID        |");
		System.out.println("3 - Sair                            |");
		System.out.println("------------------------------------+");
	}
	
	public void SpanDados() {
		// JOptionPane.showMessageDialog( null, "Dados salvos com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void PainelJSON() {
		System.out.println("------------------------------------+");
		System.out.println("            Painel JSON             |");
		System.out.println("------------------------------------|");
		System.out.println("1 - Cadastrar Novo Cachorro         |");
		System.out.println("2 - Lista todos Cadastro (JSON)     |");
		System.out.println("3 - Excluir Cadastros               |");
		System.out.println("2 - Sair                            |");
		System.out.println("------------------------------------+");
	}
	
	public void PainelXML() {
		System.out.println("------------------------------------+");
		System.out.println("            Painel XML              |");
		System.out.println("------------------------------------|");
		System.out.println("1 - Cadastrar Novo Cachorro         |");
		System.out.println("2 - Lista Todos Cadastros           |");
		System.out.println("3 - Excluir Cadastros               |");
		System.out.println("4 - Sair                            |");
		System.out.println("------------------------------------+");
	}
	
	public void InvalidaOpc() {
		
		System.out.println("------------------------------------+");
		System.out.println("          Opcao Invalida            |");
		System.out.println("------------------------------------|");
		
	}
	

}
