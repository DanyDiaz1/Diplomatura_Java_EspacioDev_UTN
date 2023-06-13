package main;

import org.json.*;

import manejoJSON.JSONUtiles;

public class App {

	public static void main(String[] args) {
		
		try {
			JSONArray jsonArray = new JSONArray(JSONUtiles.leer("prueba.json"));
			
			for(int i = 0 ; i<jsonArray.length(); i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				System.out.println("Nombre: "+ jsonObject.getString("nombre"));
				System.out.println("Edad: "+ jsonObject.getInt("edad"));
				System.out.println("DNI: "+ jsonObject.getInt("dni"));
				
				JSONObject jsonDirection = jsonObject.getJSONObject("direccion");
				System.out.println("Calle: "+ jsonDirection.getString("calle"));
				System.out.println("Numero: "+ jsonDirection.getInt("numero"));
				
				JSONArray jsonNumeros = jsonObject.getJSONArray("numeros");
				
				for(int j = 0; j<jsonNumeros.length(); j++) {
					JSONObject jsonNumero = jsonNumeros.getJSONObject(j);
					System.out.println("Numero "+ (j+1) + ": "+ jsonNumero.getLong("numero"));
					System.out.println("Compania :"+ jsonNumero.getString("compania"));
				}
				
				System.out.println("-------------------------------------------");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*JSONArray jsonArray = new JSONArray();
		
		JSONObject jsonObject1 = new JSONObject();
		JSONObject jsonObject2 = new JSONObject();
		
		try {
			jsonObject1.put("nombre", "Juan");
			jsonObject1.put("edad", 22);
			jsonObject1.put("dni", 35123451);
			
			JSONObject jsonDirection = new JSONObject();
			jsonDirection.put("calle", "calle1");
			jsonDirection.put("numero", 123);
			
			jsonObject1.put("direccion", jsonDirection);
			
			JSONArray jsonNumeros = new JSONArray();
			JSONObject jsonNumero1 = new JSONObject();
			jsonNumero1.put("compania", "Movistar");
			jsonNumero1.put("numero", 12431235);
			jsonNumeros.put(jsonNumero1);
			
			JSONObject jsonNumero2 = new JSONObject();
			jsonNumero2.put("compania", "Claro");
			jsonNumero2.put("numero", 1556342);
			jsonNumeros.put(jsonNumero2);
			
			jsonObject1.put("numeros", jsonNumeros);
			
			jsonArray.put(jsonObject1);
			
			JSONUtiles.grabar(jsonArray);
			
		} catch (JSONException e) {
			
			e.printStackTrace();
		}*/


	}

}
