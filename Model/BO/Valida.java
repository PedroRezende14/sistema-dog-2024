package BO;
import java.util.List;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.*;
import SQL.OpcAdimSQL;
import SQL.OpcUserSQL;
import Conexao.Conexao;
import DAO.*;

public class Valida {
	
	public void chek() {
		

		
		
		OpcAdimSQL em = new OpcAdimSQL();
		Login l = new Login();
		LoginDAO ld = new LoginDAO();
		OpcUserSQL uem = new OpcUserSQL();
		em.Opc();
		/*
		Scanner entrada = new Scanner(System.in);
		String r;
		String x;
		Login receba;
		System.out.println("+-----------------------------------+");
		System.out.println("|         	     LOGIN              |");
		System.out.println("------------------------------------+");
		
		System.out.println("Nome Usuario: ");
		r=entrada.next();
		
		System.out.println("Senha: ");
		x=entrada.next();
		
		if(r.equals("adim")) {
			if(x.equals("123")) {
				em.Opc();
				
				System.out.println("+-----------------------------------+");
				System.out.println("|      LOGIN REALIZADO              |");
				System.out.println("------------------------------------+");
			}
		}
		if(r.equals("curvelo")) {
			if(x.equals("123")) {
				uem.pla();
				
				System.out.println("+-----------------------------------+");
				System.out.println("|      LOGIN REALIZADO              |");
				System.out.println("------------------------------------+");
			}
		}
		if(r.equals("teste")) {
			if(x.equals("123")) {
				uem.pla();
				
				System.out.println("+-----------------------------------+");
				System.out.println("|      LOGIN REALIZADO              |");
				System.out.println("------------------------------------+");
			}
		}
		*/
		
	}

}
