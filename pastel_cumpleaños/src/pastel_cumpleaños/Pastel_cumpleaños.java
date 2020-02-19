
package pastel_cumpleaños;

import java.util.Scanner;

public class Pastel_cumpleaños {

     public static int mayorvalor(velas vel[])
     {
         
         int valorvela=0;
         int mayor =0;
         int cont=0;
         int cantidad =0;
         
         //valorvela= vel[0].getValorvelas();
         
    
         for(int i=0;i<vel.length;i++)
         {
             
             if(vel[i].getValorvelas() >= valorvela )
             {
                valorvela =  vel[i].getValorvelas();
                mayor= i;
                if( cantidad <= valorvela )
                {
                    cantidad = valorvela;
                }
             }
             
         }  
         
         for(int i=0;i<vel.length;i++)
         {
             
             if(cantidad == vel[i].getValorvelas()) 
             {
                 cont++;
             }
             
         }  

         
          System.out.println("\nSe apagan "+cont+" velas");
          return mayor; 
          
     }
     
    
    
    public static void main(String[] args) {
        

        
        Scanner entrada = new Scanner(System.in);
       
        String nombre;
        int edad;
        int valorvela;
        int valormayor;
  

         //entrada.nextLine();
         System.out.println("Digite el nombre de la persona: ");
         nombre = entrada.nextLine();
         System.out.println("Digite la edad de la persona: ");
         edad = entrada.nextInt();
         
         velas vel[]= new velas[edad];
         for(int i=0;i<vel.length;i++)
        {
         entrada.nextLine();
         System.out.println("Digite el valor de la vela "+(i+1)+" : ");
         valorvela = entrada.nextInt();        
         vel[i]= new velas(valorvela);
        }
         persona per = new persona(nombre,edad);
         valormayor= mayorvalor(vel);
         /*System.out.println("nombre: ");
         System.out.println(nombre);
         System.out.println("edad: ");
         System.out.println(edad);*/
         System.out.println("\n"+per.mostrardatos());
         System.out.println(vel[valormayor].mostrar());
         
       //indiceedad = mayoredad(per);
       //System.out.println("\nLa persona con mayor edad es: ");
       // System.out.println(per[indiceedad].mostrar());
        

    }
}