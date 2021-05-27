/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomapas;

import java.util.*;

public class EjemploMapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TreeMap<String,Animal> mapa = new TreeMap<>();
        
        Animal an1 = new Animal("Nombre1"); 
        Animal an3 = new Animal("Nombre3");
        Animal an2 = new Animal("Nombre2");

        mapa.put("3",an3);
        mapa.put("1",an1);
        mapa.put("2",an2);
        
        //
        Collection<Animal> listaAnimales = mapa.values();
        
        for (Animal a: listaAnimales){
            System.out.println(a.getNombre());
        }
        //
        
        /*
        Set<String> conjuntoClaves = mapa.keySet();
        Iterator<String> it = conjuntoClaves.iterator();
        Animal anAux;
        String aux;
        
        while (it.hasNext()){
            aux = it.next();
            anAux = mapa.get(aux);
            System.out.println(aux + " - " + anAux.getNombre()); 
        }
        */
        
        /*
        Set<Map.Entry<String,Animal>> conjuntoEntry = mapa.entrySet();
        Iterator<Map.Entry<String,Animal>> itEntry = conjuntoEntry.iterator();
        Map.Entry<String,Animal> auxEntry;
        
        while (itEntry.hasNext()){
            auxEntry = itEntry.next();
            System.out.println( auxEntry.getKey()+ " - " + auxEntry.getValue().getNombre()); 
        }
*/
    }
    
}
