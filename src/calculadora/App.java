/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class App {

    public static void main(String[] args) {
        
        /**
         * 1. Declaração de variáveis locais (main)
         */
         Scanner scanner = new Scanner(System.in);

         /**
          * 2. Entrada de dados
         */
        System.out.print ("Digite o valor de x: ");
        Calculadora.x = scanner.nextInt();
        System.out.print ("Digite o valor de y: ");
        Calculadora.y = scanner.nextInt();

         /**
          * 3. Chamada dos métodos
         */
        Calculadora.soma();
        Calculadora.subtracao();
        Calculadora.multiplicacao();
        Calculadora.divisao();
    }
    
}
