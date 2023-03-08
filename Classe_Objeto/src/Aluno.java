/**
 * Classe Aluno criada apenas para o entendimento do conceito sobre classe e métodos
 * @author Francisco Chagas 
 * @version 1.0
 * @since 08/03/2023
 */
public class Aluno {

    //criação dos atributos 
    String nome;
    String endreco;
    int telefone;
    String email;
    int matricula;

    //método get recupera o valor armazenado no atributo
    public String getNome() {
        return nome;
    }

    //método set atribui o valor
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndreco() {
        return endreco;
    }

    public void setEndreco(String endreco) {
        this.endreco = endreco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
