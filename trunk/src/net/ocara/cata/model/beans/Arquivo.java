/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.ocara.cata.model.beans;

import java.security.Timestamp;

/**
 *
 * @author daraujo
 */
public class Arquivo extends Elemento {
    
    public String tipo;
    public Long tamanho;
    
    public Arquivo(String nome, Timestamp data, String tipo, Long tamanho) {
        super.nome = nome;
        super.data = data;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

}
