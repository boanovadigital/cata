/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.ocara.cata.model.io;

import java.io.IOException;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author daraujo
 */
public class CataXMLWriter {
    
          //Declaração dos elementos que irão compor a estrutura do documento.  
   Element mural = new Element("mural");  
   Element mensagem = new Element("mensagem");  
   Element para = new Element("para");  
   Element de = new Element("de");  
   Element corpo = new Element("corpo");  
   
   public void escreve() {
   
       //"Setando" os atributos  
       mensagem.setAttribute("id", "01");  

      //"Setando" outro atributo agora utilizando da classe Attribute  
      Attribute prioridade = new Attribute("prioridade","-1");  
      mensagem.setAttribute(prioridade);     

      mensagem.addContent(para);  
      mensagem.addContent(de);  
      mensagem.addContent(corpo);  

      mural.addContent(mensagem);  

      //Criando o documento XML (montado)  
      Document doc = new Document();  
      doc.setRootElement(mural);  

      //Imptrimindo o XML  
      try {
          XMLOutputter xout = new XMLOutputter();  
          xout.output(doc, System.out); 
      } catch (Exception e) {
          e.printStackTrace();
      }
   }

}
