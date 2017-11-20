
package consumoCarro;

import java.util.Scanner;


public class consumoCarroTeste {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     
    double precoetanol;
    double precogasolina; 
    
        // Entrada de Dado do Usuario
        System.out.print("Entre com  preço da Gasolina");
        precoetanol = entrada.nextDouble();
        System.out.print("Entre com o preço do Etanol");
        precogasolina = entrada.nextDouble();
        
     // Estanciando Objeto
     Combustivel consumocarro = new Combustivel();

     consumocarro.PrecoEtanol = precoetanol;
     consumocarro.precoGasolina = precogasolina;
     
     // Saida de dado
    System.out.println(consumocarro.vantagem());
    
    
    
    
    

    }
    
}
