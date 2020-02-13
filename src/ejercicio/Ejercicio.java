/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author l11m13
 */
public class Ejercicio {

    public static void main(String[] args) {
        Integer num[] = new Integer[]{13,14,25,11,13,14,23,27,16,14};
  
        for(int i = 0; i < num.length;i++ ){
            boolean repetido = false;
            for(int j=i+1;j<num.length-1;j++){
            if(num[i] == num[j] && i != j){
                repetido = true;
                break;
            }
//            System.out.println("Valor:" +num[i] + "En la posicion:" +i );
//            break;
            
        }
        if(!repetido){
            System.out.println("El primer número no repetido es: "+num[i]+ " en la posicion: " +i); 
            break;
        }     
      }      
   }
}
    
    

