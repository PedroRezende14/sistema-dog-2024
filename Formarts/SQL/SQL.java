package SQL;

import Main.Interface;
import SQL.*;
import JSON.*;
import XML.*;

import BO.*;
import DTO.*;
import VIEW.*;
import Conexao.Conexao;
import DAO.*;

public class SQL implements Interface {

	public void enviar() {
		System.out.println("sql");	
		OpcAdimSQL em = new OpcAdimSQL();
		em.Opc();
	}
}
