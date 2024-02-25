package SQL;

import java.util.Scanner;

import BO.DogAlterar;
import BO.DogExcluir;
import BO.DogInserir;
import BO.DogPesquisarTodos;
import BO.DogProcurarId;
import BO.UsuarioExcluir;
import BO.UsuarioLista;
import DAO.DadosCaoDAO;
import DTO.DadosCao;
import VIEW.LimparTela;
import VIEW.PaineisVIEW;

public class OpcUserSQL {
	public void pla() {
		LimparTela lt = new LimparTela();
		PaineisVIEW vp = new PaineisVIEW();
		Scanner entrada = new Scanner(System.in);
		DadosCao dl = new DadosCao();
		DadosCaoDAO d = new DadosCaoDAO();
		
		int opc = 0;
		int x ;	
		String resposta;
		
		
		while(opc != 3 ) {

			
			
			vp.PainelUser();
			
			opc = entrada.nextInt();
			
			lt.limparTela();
			if (opc == 1) {
				DogInserir di = new DogInserir();
				di.funcaoInserir();
			}
			
					
			if (opc == 2) {
				DogProcurarId dp = new DogProcurarId();
				dp.FuncaoProcurar();
			}
			
		
			if(opc >4 || opc < 1) {
				System.out.println("Opção invalida"); 
			}

			
		}
		lt.limparTela();
		System.out.println("Saiu do sistema");
	}
}
