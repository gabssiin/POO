/*
 * Tarefa para casa :
 * Criar classes e ojetos de :
 * Professor
 * Universidade
 * Disciplina
 * Usuário 
 * Filme 
 * Livro
 * 
 */
public class App{
    public static void main(String[] args) {
       
        Aluno aluno1 = new Aluno("Louise", 1.57, 853792, "Safada");
        aluno1.pedirNota("Daniel"); 
        System.out.println("A nacionalidade de " +  aluno1.nome + " é: " + aluno1.nacionalidade);
        Aluno aluno2 = new Aluno("Gio",1.70,853797,"Flor");
        aluno2.pedirMatricula(aluno2.matricula);


    }
} 






/*
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Gabriel";
        aluno1.altura = 1.70;
        aluno1.matricula = 123;
        */


        
        /* 
        System.out.println("Nome: " + aluno1.nome);
         spaceMenu();  
        System.out.println("Altura: "+ aluno1.altura);
        aluno1.estudar(" deve estudar mais POO");
        aluno1.pedirNota("Iago");
        aluno1.pedirMatricula(aluno1.matricula);
        */
        /* 
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Delmiro";
        aluno2.altura = 1.69;
        aluno2.matricula = 456;
        aluno2.estudar(" deve se preocupar mais com o Projeto Integrador");
        aluno2.pedirNota("Márcio");
        aluno2.pedirMatricula(aluno2.matricula);
        */  