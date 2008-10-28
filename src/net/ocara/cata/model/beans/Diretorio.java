/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.ocara.cata.model.beans;

import java.security.Timestamp;
import java.util.List;

/**
 *
 * @author daraujo
 */
public class Diretorio extends Elemento {
    public List<Elemento> elementos;
    
    public Diretorio(String nome, Timestamp data) {
        super.nome = nome;
        super.data = data;
    }
}
