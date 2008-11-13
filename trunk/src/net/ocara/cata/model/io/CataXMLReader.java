/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.ocara.cata.model.io;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder; 

/**
 *
 * @author daraujo
 */
public class CataXMLReader {
    
    public void le() {
        Document d = null;
                
        //Aqui você informa o nome do arquivo XML.  
        File f = new File("c:/mural.xml");  

        //Criamos uma classe SAXBuilder que vai processar o XML4  
        SAXBuilder sb = new SAXBuilder();  
        try {
            //Este documento agora possui toda a estrutura do arquivo.  
            d = sb.build(f);  
              
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Recuperamos o elemento root  
        Element mural = d.getRootElement();

        //Recuperamos os elementos filhos (children)  
        List elements = mural.getChildren();  
        Iterator i = elements.iterator();  

        //Iteramos com os elementos filhos, e filhos do dos filhos  
        while (i.hasNext()) {  
        Element element = (Element) i.next();  
        System.out.println("Códido:"+ element.getAttributeValue("id"));  
        System.out.println("Prioridade:"+ element.getAttributeValue("prioridade"));  
        System.out.println("Para:"+ element.getChildText("para"));  
        System.out.println("De:"+ element.getChildText("de"));  
        System.out.println("Corpo:"+ element.getChildText("corpo")); 
    }
  }
}
