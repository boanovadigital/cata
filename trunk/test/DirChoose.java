/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.File;
import javax.swing.*;

   public class DirChoose {

     public static void main(String args[]) {
       SwingUtilities.invokeLater(new Runnable() {
         public void run() {
           JFileChooser fileChooser = 
                  new JFileChooser(".");
           fileChooser.setMultiSelectionEnabled(true);
           fileChooser.setFileSelectionMode(
                  JFileChooser.DIRECTORIES_ONLY);
           int status = fileChooser.showOpenDialog(null);
           if (status == JFileChooser.APPROVE_OPTION) {
             File selectedFiles[] = 
                 fileChooser.getSelectedFiles();
             for 
               (int i=0, n=selectedFiles.length; i<n; i++) {
                 
                     System.out.println("DirChoose: " 
                        + selectedFiles[i].getParent() 
                        + "\\" + selectedFiles[i].getName());
             }
           }
           System.exit(0);
         }
       });
     }
   }

