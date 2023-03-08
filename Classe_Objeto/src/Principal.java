/**
 * Classe Principal criada apenas para o entendimento do conceito sobre classe
 * executável e objeto
 * 
 * @author Francisco Chagas
 * @version 1.0
 * @since 08/03/2023
 */
public class Principal {

    // Método main é o método executável
    public static void main(String[] args) {

        // Criando um objeto Aluno
        Aluno aluno1 = new Aluno();

        // Atribuindo valores nos atributos do objeto aluno1
        aluno1.nome = "Francisco Chagas";
        aluno1.endreco = "Pau Amarelo,Paulista,PE";
        aluno1.telefone = 991232953;
        aluno1.email = "franciscochagasdev@gmail.com";
        aluno1.matricula = 506801;

        // Imprimindo na tela as informações do objeto aluno1
        System.out.println("Nome:" + aluno1.getNome() + " " + "Endereço:" + aluno1.endreco + " " +
                "Telefone:" + aluno1.telefone + " " + "Email:" + aluno1.email + " " + "Matrícula:" + aluno1.matricula);

        // Criando outro objeto
        Aluno aluno2 = new Aluno();

        // Atribuindo valores nos atributos do objeto aluno2
        aluno2.nome = "Chagas Francisco";
        aluno2.endreco = "Pau Amarelo,Paulista,PE";
        aluno2.telefone = 991232953;
        aluno2.email = "franciscochagasdev@gmail.com";
        aluno2.matricula = 506801;

        // Imprimindo na tela as informações do objeto aluno2
        System.out.println("Nome:" + aluno2.getNome() + " " +
                "Endereço:" + aluno2.endreco + " " +
                "Telefone:" + aluno2.telefone + " " +
                "Email:" + aluno2.email + " " +
                "Matrícula:" + aluno2.matricula);
    }

}