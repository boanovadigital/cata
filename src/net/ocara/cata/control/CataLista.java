/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.ocara.cata.control;

import java.io.File;

public class CataLista {
    
    public CataLista(String lista) {        
        System.out.println("CataLista: " + lista);
        File file= new File( lista );
        this.listar( file, 0);
    }

  /** Exibe uma listagem do arquivo ou diretório. */
  public void listar( File file, int nivel) {

    // Exibe a identação necessária
    System.out.print( getIdentacao(nivel) );

    if (file.isDirectory()) {
      // Exibe o nome do diretório
      System.out.println( "+ Dir: " + file.getName() );

      File[] lista= file.listFiles();
      // Faz uma chamada recursiva para exibir os arquivos e subdiretórios
      for (int i= 0; i < lista.length; i++)
        listar( lista[i], nivel+1);
    }
    else {
      // Exibe o nome do arquivo
      System.out.println( "* Arq: " + file.getName() );
    }
  }

  /** Retorna a quantidade de espaços necessários para o nível especificado. */
  private String getIdentacao( int nivel) {
    StringBuffer buffer= new StringBuffer();
    for ( int i= 0; i < nivel; i++)
      buffer.append( "  " );
    return buffer.toString();
  }

  /** Método principal */
  /*
  public static void main (String[] args) {
    CataLista cataLista = new CataLista();

    File file= new File( "c:\\tmp\\" );
    cataLista.listar( file, 0);
  }
*/
}

