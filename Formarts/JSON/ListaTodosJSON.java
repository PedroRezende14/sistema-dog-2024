package JSON;

import org.json.JSONObject;
import org.json.simple.JSONArray;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class ListaTodosJSON {
	
	public void ListaTodos() {
		
		try {
		    JSONObject cadastrosJSON;
		    String filePath = "cadastros.json";

		    if (Files.exists(Paths.get(filePath))) {
		   
		        String content = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
		        cadastrosJSON = new JSONObject(content);
		    } else {
		        cadastrosJSON = new JSONObject();
		    }

		    JSONObject cadastroCachorro = new JSONObject();
		    cadastrosJSON.append("cadastros", cadastroCachorro);

		    String cadastroJSON = cadastrosJSON.toString(4);
		    Files.write(Paths.get(filePath), cadastroJSON.getBytes());

		    System.out.println(cadastroJSON);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}
