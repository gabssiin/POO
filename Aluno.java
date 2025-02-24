public class Aluno{
    public String nome;
    public double altura;
    public int matricula;
    

    public void spaceMenu(){
        System.out.println(" ");
    }

    public void estudar(String materia){
    System.out.println( nome + materia);
    
    }
    public void pedirNota(String nomeProfessor){
    System.out.println( nome +" está pedindo nota a: " + nomeProfessor);
    }
    public void pedirMatricula(int matricula){
        System.out.println("A matrícula de " + nome + " é: "+ matricula);
    }
}