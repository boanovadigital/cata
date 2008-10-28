/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.ocara.cata.model;

import java.security.Timestamp;
import java.util.List;
import net.ocara.cata.model.beans.Arquivo;
import net.ocara.cata.model.beans.Diretorio;
import net.ocara.cata.model.beans.Elemento;

/**
 *
 * @author daraujo
 */
public class CataModel {
    
    List<Elemento> elementos;
    
    public void adicionaElementoRaiz(Elemento elemento) {
        elementos.add(elemento);
    }
    
    
    public void removeElemento(Elemento elemento) {
        elementos.remove(elemento);
        
    }
    
    public Diretorio criaDiretorio(String nome, Timestamp data) {
        return new Diretorio(nome, data);
    }
    
    public Arquivo criaArquivo(String nome, Timestamp data, String tipo, Long tamanho) {
        return new Arquivo(nome, data, tipo, tamanho);
        
    }
    

}
