/**
 * 
 */
package org.escoladeltreball.JSONexemple;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
/**
 * @author iaw39397876
 *
 */
public class Principal {

	public static void main(String[] args) {
		//bean to JSON
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("934035434");
		aList.add("634035434");
		Persona per1 = new Persona("manolo", "garcia", 64, aList);
		Persona per2 = new Persona("aleix", "chaves", 21, aList);
		ArrayList<Persona> aListPersonas = new ArrayList<Persona>();
		aListPersonas.add(per1);
		aListPersonas.add(per2);
		
		Gson gson = new Gson();
		String json = gson.toJson(per1);
		System.out.println(json);
		
		//JSON to bean
		Persona copia = gson.fromJson(json, Persona.class);
		System.out.println(copia.toString());
		
		//JSON sin bean
		JsonObject objeto = new JsonObject();
		objeto.addProperty("nom", "algo");
		objeto.addProperty("nom2", "algo2");
		
		json = objeto.toString();
		System.out.println(json);
		
		
		//Parser
		
		/*JsonParser jParser = new JsonParser();
		JsonElement element = jParser.parse(json);
		if (element.isJsonObject()) {
			JsonObject aux = element.getAsJsonObject();
			String nombre = aux.get("nombre").getAsString();
			String apellido = aux.get("apellido").getAsString();
			String edad = aux.get("edad").getAsString();
			
			JsonElement elementArray = aux.get("telefonos");
			if (elementArray.isJsonArray()) {
				for (int i = 0; i < elementArray.getAsJsonArray().size(); i++) {
					String telf = elementArray.getAsJsonArray().get(i).getAsString();
					System.out.println(" " + telf);
				}
			}
			
			System.out.println(nombre + "    " +  edad);
		}*/
		
		//Parser invertido
		
		JsonParser jParser = new JsonParser();
		JsonElement element = jParser.parse(json);
		String nombre;
		String apellido;
		String edad;
		String telf;
		if (element.isJsonArray()) {
			for (int i = 0; i < element.getAsJsonArray().size(); i++) {
				JsonElement elementArray = element.getAsJsonArray().get(i);
				nombre = elementArray.getAsJsonObject().get("nombre").getAsString();
				apellido = elementArray.getAsJsonObject().get("apellido").getAsString();
				edad = elementArray.getAsJsonObject().get("edad").getAsString();
				JsonElement telefonoArray = elementArray.getAsJsonObject().get("telefono");
				if (telefonoArray.isJsonArray()) {
					for (int j = 0; j < telefonoArray.getAsJsonArray().size(); j++) {
						telf = telefonoArray.getAsJsonArray().get(j).getAsString();
						System.out.println(" " + telf);
					}
				}
			System.out.println(nombre + " " + apellido + " " +  edad);	
			}
		}
	}
	

}
