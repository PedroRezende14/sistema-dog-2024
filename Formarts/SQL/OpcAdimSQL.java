package SQL;
import java.util.Scanner;

import javax.swing.JOptionPane;

import BO.*;

import java.io.IOException;

import java.sql.SQLException;
import DTO.*;
import VIEW.LimparTela;
import VIEW.PaineisVIEW;
import Conexao.Conexao;
import DAO.*;
public class OpcAdimSQL {
	
	
	public void Opc() {
		
		PaineisVIEW pv = new PaineisVIEW();
		
		LimparTela lt = new LimparTela();
		Scanner entrada = new Scanner(System.in);
		
		DadosCao dl = new DadosCao();
		DadosCaoDAO d = new DadosCaoDAO();
		
		int opc = 0;
		int x ;	
		String resposta;
		
		
		while(opc != 8 ) {
			
			pv.PainelAdim();
			opc = entrada.nextInt();

			
			switch(opc) {
				case 1:
					DogInserir di = new DogInserir();
					di.funcaoInserir();
					
					break;
					
				case 2:
					DogExcluir de = new DogExcluir();
					de.funcaoExcluir();
					break;
					
				case 3:
					DogProcurarId dp = new DogProcurarId();
					dp.FuncaoProcurar();
					break;
					
				case 4:
					DogAlterar da = new DogAlterar();
					da.funcaoAlterar();
					break;
					
				case 5:
					DogPesquisarTodos dpt = new DogPesquisarTodos();
					dpt.PesquisarTodos();
					break;
					
				case 6:
					UsuarioExcluir ue = new UsuarioExcluir();
					ue.mataUsuario();
					break;
				case 7:
					UsuarioLista ul = new UsuarioLista();
					ul.UsuarioList();
					break;
					
				case 8:
					System.out.println("Saiu do sistema");
					break;
				default:
	                System.out.println("Escolha inválida.");
			}	
		}
	}

}





