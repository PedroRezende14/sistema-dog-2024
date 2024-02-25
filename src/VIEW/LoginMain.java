package VIEW;
import java.util.Scanner;

import BO.*;

import java.io.IOException;

import java.sql.SQLException;
import DTO.*;
import SQL.OpcAdimSQL;
import Conexao.Conexao;
import DAO.*;

public class LoginMain {
	LimparTela lt = new LimparTela();
	Scanner entrada = new Scanner(System.in);
	UsuarioAdd au  = new UsuarioAdd();		
	PaineisVIEW vp = new PaineisVIEW();
	OpcAdimSQL em = new OpcAdimSQL();

	public void inicio() {
		int opc=0;
		
		while(opc != 3 ) {

			vp.PainelUser();
			
			opc = entrada.nextInt();
			
			lt.limparTela();
			if (opc == 1) {
				Valida v = new Valida();
				v.chek();
			}
			
			if (opc == 3) {
				au.InserirUsuario();
			}
		
			if(opc >4 || opc < 1) {
				System.out.println("Numero invalido"); 
			}
		}
	}
}