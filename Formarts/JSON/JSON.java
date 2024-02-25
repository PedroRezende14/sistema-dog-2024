package JSON;

import Main.Interface;
import SQL.OpcAdimSQL;

public class JSON implements Interface {
	public void enviar() {
		System.out.println("json");	
		System.out.println("sql");	
		OpcAdimSQL em = new OpcAdimSQL();
		em.Opc();
	}
}
