/*
 * EXERCÍCIO PRÁTICO
 * Escreva um método que receba um inteiro n e 
 * retorne true se e somente se n for par
 */

public class VerificarPar {
  
   public static void main(String[] args) {

      int numero = 5;

      if (verificarPar(numero)) {
         System.out.println(+ numero + " é par");
      } else {
         System.out.println(+ numero + " é ímpar");
      }
      
   }

   private static boolean verificarPar(int numero) {

      if (numero % 2 == 0) {
         return true;
      } else {
         return false;
      }

   }
}
