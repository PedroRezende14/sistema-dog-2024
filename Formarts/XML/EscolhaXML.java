package XML;

import VIEW.PaineisVIEW;
import java.util.Scanner;

public class EscolhaXML {
	
	Scanner entrada = new Scanner(System.in);
	
	AnimalFormulario af = new AnimalFormulario();
	ListaTodosXML lt = new ListaTodosXML();
	ExcluirXML ex = new ExcluirXML();
	PaineisVIEW pv = new PaineisVIEW();
	
	
	public void Escolha() {

		
		int opc = 0 ;
		while(opc!=4) {		
			pv.PainelXML();
			opc = entrada.nextInt();
			
			switch(opc) {
				case 1:
					af.CadastroXML();
				break;
				
				case 2:
					lt.ListaTodos();
				break;
				case 3:
					ex.ExcluirDog();
				break;
				case 4:
					opc=4;
				break;
				
				default:
					pv.InvalidaOpc();
				
			}
		}
	}
}
