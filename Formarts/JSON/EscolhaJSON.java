package JSON;

import VIEW.PaineisVIEW;
import java.util.Scanner;

public class EscolhaJSON {
	
	DogInserirJSON di = new DogInserirJSON();
	PaineisVIEW pv = new PaineisVIEW();
	Scanner entrada = new Scanner(System.in);
	
	public void Escolha() {
		
		int opc = 0 ;
		
		while(opc!=8) {		
			pv.PainelJSON();
			opc = entrada.nextInt();
			
			switch(opc) {
				case 1:
					di.funcaoInserir();
				break;
			}
		}
	}
}
