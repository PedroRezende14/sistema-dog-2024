package JSON;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import DTO.*;
import VIEW.PaineisVIEW;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class LoginJSON {
	EscolhaJSON ej=new EscolhaJSON();
	
	public void login() {
		ej.Escolha();
	}
}