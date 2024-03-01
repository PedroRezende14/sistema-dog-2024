package BO;
import java.util.Scanner;
import java.sql.SQLException;
import DTO.*;
import Conexao.Conexao;
import DAO.*;

public class UsuarioExcluir {
	Login l = new Login();
	LoginDAO ld = new LoginDAO();
	Scanner entrada = new Scanner(System.in);
	
	public void mataUsuario() {

		System.out.println("+-----------------------------------+");
		System.out.println("|         EXCLUIR USUARIO           |");
		System.out.println("------------------------------------+");
		System.out.println("ID USUARIO");
		int x = entrada.nextInt();
		l.setId_usuario(x);

		System.out.println("+-----------------------------------+");
		System.out.println("|         USUARIO DELETADO          |");
		System.out.println("------------------------------------+");
		ld.Excluir(l);
		
	}

}
