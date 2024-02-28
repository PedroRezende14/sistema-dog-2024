package JSON;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import org.json.JSONObject;
import DAO.DadosCaoDAO;
import DAO.MaeDAO;
import DAO.PaiDAO;
import DTO.DadosCao;
import DTO.Mae;
import DTO.Pai;
import VIEW.PaineisVIEW;

public class DogInserirJSON {
	public void funcaoInserir() {
			
		PaineisVIEW pv = new PaineisVIEW();
		DadosCao dl = new DadosCao();

		Scanner entrada = new Scanner(System.in);
		Pai p = new Pai();
		Mae m = new Mae();
		
		String resposta;
		
		System.out.println("+-----------------------------------+");
		System.out.println("|         DADOS DO CACHORRO         |");
		System.out.println("------------------------------------+");
		System.out.print("Nome: ");
		resposta = entrada.next();
		dl.setNomeCao(resposta);
		
		System.out.print("Raca: ");
		resposta = entrada.next();	
		dl.setRaca(resposta);
		
		System.out.print("RegistroStudBook: ");
		resposta = entrada.next();	
		dl.setRegistroStudBook(resposta);
		
		System.out.print("Cor: ");
		resposta = entrada.next();	
		dl.setCor(resposta);
		
		System.out.print("Origem Raca: ");
		resposta = entrada.next();	
		dl.setOrigemRaca(resposta);
		
		System.out.print("Sexo: ");
		resposta = entrada.next();
		dl.setSexo(resposta);
		
		System.out.print("Criador : ");
		resposta = entrada.next();	
		dl.setCriador(resposta);
			
		System.out.println("+-----------------------------------+");
		System.out.println("|  CACHORRO ADICIONADO COM SUCESSO  |");
		System.out.println("+-----------------------------------+");
			
		System.out.println("+-----------------------------------+");
		System.out.println("|      DADOS DO PAI DO CACHORRO     |");
		System.out.println("------------------------------------+");
		
		System.out.print("Nome: ");
		resposta = entrada.next();
		p.setNomePai(resposta);
				
		System.out.print("RegistroStudBook");
		resposta = entrada.next();
		p.setRegistrostudbook(resposta);
		
		System.out.println("+-----------------------------------+");
		System.out.println("|    PAI ADICIONADO COM SUCESSO     |");
		System.out.println("+-----------------------------------+");

		System.out.println("+-----------------------------------+");
		System.out.println("|      DADOS DO MAE DO CACHORRO       |");
		System.out.println("------------------------------------+");
			
		System.out.print("Nome: ");
		resposta = entrada.next();
		m.setNomemae(resposta);
				
		System.out.print("RegistroStudBook");
		resposta = entrada.next();
		m.setRegistrostudbook(resposta);
			
		System.out.println("+-----------------------------------+");
		System.out.println("|    MAE ADICIONADO COM SUCESSO     |");
		System.out.println("+-----------------------------------+");
		
		try {
            JSONObject cadastroCachorro = new JSONObject();
            cadastroCachorro.put("nome", dl.getNomeCao());
            cadastroCachorro.put("raca", dl.getRaca());
            cadastroCachorro.put("registroStudBook", dl.getRegistroStudBook());
            cadastroCachorro.put("cor", dl.getCor());
            cadastroCachorro.put("origemRaca", dl.getOrigemRaca());
            cadastroCachorro.put("criador", dl.getCriador());
            cadastroCachorro.put("sexo", dl.getSexo());
            cadastroCachorro.put("Nome da Mae",m.getNomemae());
            cadastroCachorro.put("ResgistroStudBook Mae ", m.getRegistrostudbook());
            cadastroCachorro.put("Nome do Pai",p.getNomePai());
            cadastroCachorro.put("ResgistroStudBook Pai", p.getRegistrostudbook());

            String cadastroJSON = cadastroCachorro.toString(4);
            Files.write(Paths.get("cadastros.json"), cadastroJSON.getBytes());
            
            System.out.println(cadastroJSON);
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
}
