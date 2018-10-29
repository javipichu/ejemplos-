/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_if;

import java.util.Scanner;

/**
 *
 * @author jalvarezotero
 */
public class Condicionalsimple {
    public void maioridade(){//creamos conductor
       Scanner res = new Scanner(System.in);
       System.out.println("teclee idade:");
    int idade =res.nextInt();
    if (idade<18){//si es menor de idade...
        System.out.println("e menor de idade");
    }           
              System.out.println("remata o programa");
                    
                            
                    
    }
}
