public class App{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Gabriel";
        aluno1.altura = 1.70;
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Altura: "+ aluno1.altura);
        aluno1.estudar("POO");
        aluno1.pedirNota("Iago");

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Delmiro";

        aluno2.altura = 1.69;
        aluno2.estudar("Projeto Integrador");
        aluno2.pedirNota("Márcio");

    }
}