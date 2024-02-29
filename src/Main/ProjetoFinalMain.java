package Main;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import SQL.*;
import JSON.*;
import XML.*;

import BO.*;
import DTO.*;
import VIEW.*;
import Conexao.Conexao;
import DAO.*;

public class ProjetoFinalMain {

	
	
public static void main(String[] args) {
	
		Interface i = new SQL(); 
		Salvar s = new Salvar(i);
		//s.update();
		
		i = new JSON();
		s = new Salvar(i);
		//s.update();
		
		i = new XML();
		s = new Salvar(i);
		//s.update();
		
		
	
	}
}