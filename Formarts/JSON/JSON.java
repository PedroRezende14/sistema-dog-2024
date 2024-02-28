package JSON;

import Main.Interface;
import SQL.OpcAdimSQL;

public class JSON implements Interface {
	public void enviar() {
		LoginJSON lj = new LoginJSON();
		lj.login();
	}
}
