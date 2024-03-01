package JSON;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ExcluirJSON {
	
	public void Excluir() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome");
		String delet = entrada.nextLine();
		excluirCadastro(delet);
	}
	
	public static void excluirCadastro(String nome) {
            try {
                String filePath = "cadastros.json";
                if (Files.exists(Paths.get(filePath))) {
                    String content = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
                    JSONObject cadastrosJSON = new JSONObject(content);

                    if (cadastrosJSON.has("cadastros")) {
                        JSONArray cadastrosArray = cadastrosJSON.getJSONArray("cadastros");
               
                        boolean removed = false;

                        for (int i = 0; i < cadastrosArray.length(); i++) {
                            JSONObject cadastro = cadastrosArray.getJSONObject(i);
                            if (cadastro.has("nome") && cadastro.getString("nome").equals(nome)) {
                                cadastrosArray.remove(i); 
                                removed = true;
                                break;
                            }
                        }
                        if (!removed) {
                            System.out.println("Nenhum cadastro encontrado com o nome '" + nome + "'.");
                        } 
                        else {
                            Files.write(Paths.get(filePath), cadastrosJSON.toString(4).getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
                            System.out.println("Cadastro de '" + nome + "' excluido com sucesso.");
                        }
                    } 
                    else {
                        System.out.println("Nenhum cadastro encontrado.");
                    }
                } 
                else {
                    System.out.println("Arquivo de cadastros nao encontrado.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
