/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetsteparagrafos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Roberto
 */

public class Classeteste {
    
    Scanner scan = new Scanner (System.in); 
    ArrayList <String> vert = new ArrayList <String> ();
    
    String vertice;
    String vertice2;
    
    String arrayVertice[] = new String [0];  
    String arrayVertice2 [] = new String [0];
    String arrayVertice3 [] = new String [0];
    
    
   public Classeteste(){
       
   }
    
   public void verificadorDeGrafos(){
       
       
        System.out.println("Quantos vertices tem o seu grafo ?");
        int numVertices = scan.nextInt();
        System.out.println("Digite os vertices Adjacentes separando por Virgula: ");
        vertice = scan.next();       
        System.out.println("Vertices");
              
        arrayVertice = vertice.split(",");
        
        // Imprimir Arestas
        
        for (int i = 0; i < arrayVertice.length; i++) {
            System.out.println(arrayVertice[i]);
       }
        
        //Testar se existe arestas.
        
        
        for (int i = 0; i < arrayVertice.length; i++) {
           int cont=0;
            System.out.println("Quais os adjacêntes de: " + arrayVertice[i]);
            vertice2 = scan.next();
            arrayVertice2 = vertice2.split(",");
            System.out.println(arrayVertice[i]);
            for (int j = 0; j < arrayVertice2.length; j++) {
                System.out.println(arrayVertice2[j]);
                
            }
            
       }
          arrayVertice3 = arrayVertice;
          arrayVertice3 = arrayVertice2;
   } 
     
    
     public void ehAdjacentes(){
          for (int i = 0; i < arrayVertice3.length; i++) {             
                System.out.println(arrayVertice3[i]);
            }
     }
     
     public void ehRegular(){
         
         
     }
     
     public void ehCompleto(){
    
         
     }
    
     public void ehConexo(){
         
         
     }
   
    
}
