package BO;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.sql.SQLException;
import DTO.*;
import Conexao.Conexao;
import DAO.*;
import VIEW.*;

public class DogInserir extends JFrame {
	
	Scanner entrada = new Scanner(System.in);
	DadosCao dl = new DadosCao();
	Pai p = new Pai();
	Mae m = new Mae();
	
	public void funcaoInserir() {
		
		String resposta;
		
		System.out.println("+-----------------------------------+");
		System.out.println("|         DADOS DO CACHORRO         |");
		System.out.println("------------------------------------+");
		System.out.print("Nome: ");
		resposta = entrada.next();
		dl.setNomeCao(resposta);
		
		System.out.print("Raca: ");
		resposta = entrada.next();	
		dl.setRaca(resposta);
		
		System.out.print("RegistroStudBook: ");
		resposta = entrada.next();	
		dl.setRegistroStudBook(resposta);
		
		System.out.print("Cor: ");
		resposta = entrada.next();	
		dl.setCor(resposta);
		
		System.out.print("Origem Raca: ");
		resposta = entrada.next();	
		dl.setOrigemRaca(resposta);
		
		System.out.print("Sexo: ");
		resposta = entrada.next();
		dl.setSexo(resposta);
		
		System.out.print("Criador : ");
		resposta = entrada.next();	
		dl.setCriador(resposta);
	
		System.out.println("+-----------------------------------+");
		System.out.println("|  CACHORRO ADICIONADO COM SUCESSO  |");
		System.out.println("+-----------------------------------+");
			
		System.out.println("+-----------------------------------+");
		System.out.println("|      DADOS DO PAI DO CACHORRO     |");
		System.out.println("------------------------------------+");
		
		System.out.print("Nome: ");
		resposta = entrada.next();
		p.setNomePai(resposta);
				
		System.out.print("RegistroStudBook");
		resposta = entrada.next();
		p.setRegistrostudbook(resposta);
		
		System.out.println("+-----------------------------------+");
		System.out.println("|    PAI ADICIONADO COM SUCESSO     |");
		System.out.println("+-----------------------------------+");

		System.out.println("+-----------------------------------+");
		System.out.println("|      DADOS DO MAE DO CACHORRO       |");
		System.out.println("------------------------------------+");
			
		System.out.print("Nome: ");
		resposta = entrada.next();
		m.setNomemae(resposta);
				
		System.out.print("RegistroStudBook");
		resposta = entrada.next();
		m.setRegistrostudbook(resposta);
			
		System.out.println("+-----------------------------------+");
		System.out.println("|    MAE ADICIONADO COM SUCESSO     |");
		System.out.println("+-----------------------------------+");
			
			if(true) {
				DadosCaoDAO d = new DadosCaoDAO();
				d.inserir(dl);
				PaiDAO Pdao = new PaiDAO();
				Pdao.inserir(p);
				MaeDAO Mdao = new MaeDAO();
				Mdao.inserir(m);			
			}	
		}
	}
	


