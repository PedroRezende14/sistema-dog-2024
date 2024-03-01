package JSON;

import VIEW.PaineisVIEW;
import java.util.Scanner;

public class EscolhaJSON {
	ExcluirJSON ex = new ExcluirJSON();
	ListaTodosJSON lt = new ListaTodosJSON();
	DogInserirJSON di = new DogInserirJSON();
	PaineisVIEW pv = new PaineisVIEW();
	Scanner entrada = new Scanner(System.in);
	
	public void Escolha() {
		
		int opc = 0 ;
		
		while(opc!=4) {		
			pv.PainelJSON();
			opc = entrada.nextInt();
			
			switch(opc) {
				case 1:
					di.funcaoInserir();
				break;
				case 2:
					lt.ListaTodos();
				break;
				case 3:
					ex.Excluir();
					break;
				case 4:
					System.out.println("Saiu do sistema");
					break;
				default:
					pv.InvalidaOpc();
			}
		}
	}
}
