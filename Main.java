package treemap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	
	public static void main (String [] args) {
		
		Map< Integer, String> miTreeMap = new TreeMap< Integer, String>();
		
		miTreeMap.put( 1, "Ger ");
		miTreeMap.put( 2, "GerDos");
		miTreeMap.put( 3, "GerTres");
		miTreeMap.put( 4, "GerCuatro");
        Integer i = 1;
        
        miTreeMap.forEach((key,value)->System.out.println(key+value));
        
        
        
        
       ArrayList <Integer> lista = new ArrayList();
       
       lista.add(2);
       lista.add(3);
       System.out.println(lista.get(0));
    
       for(int k = 0;k<lista.size();i++) {
       }
       
    
       
		
		
		/*Integer key = 4;
		String value = (String) miTreeMap.get(key);
		
		
		for(Map<Integer,String>() mapa : miTreeMap<Integer,String>()) {
		System.out.println("Hola "+ key + " = " + value);
		}*/
		
		//System.out.println(miTreeMap.entrySet());
		
		/*for(Map.Entry<Integer, String> entry : miTreeMap.entrySet()) {
			  
			Integer key = entry.getKey();
			  
			String value = entry.getValue();

			  System.out.println(key + " => " + value);
			}*/
		   
		   
		     
		
		//System.out.println(miTreeMap);
	}
}


