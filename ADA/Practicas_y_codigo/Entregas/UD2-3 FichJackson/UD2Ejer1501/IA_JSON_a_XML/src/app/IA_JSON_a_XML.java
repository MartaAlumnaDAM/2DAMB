
package app;

import clases.IA;
import clases.Portales;
import java.util.ArrayList;
import org.json.JSONArray;
import utils.JSONUtils;


public class IA_JSON_a_XML {

    public static void main(String[] args) {

        // **************************************
        // JSON - Leer 
        String archivo = "./datos/iartificial.json";
        JSONArray jArray = JSONUtils.getArrayFromFile(archivo);
        
        ArrayList<IA> listaIA = new ArrayList<>();
        
        for(Object jObj : jArray){
            
            
            
        }
        
        String jsonList = "";
                
        System.out.println(jsonList);
        
        // **************************************
        // Mapeo
        //Portales portales = new Portales();
       
        // **************************************
        // XML - Escribir 
        //String xmlPortales = "";

        //System.out.println(xmlPortales);
        
        
        
    }
    
    
    
}
