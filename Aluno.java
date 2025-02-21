public class Aluno{
    public String nome;
    public double altura;
    
    public void estudar(String materia){
    System.out.println( nome + materia);
    
    }
    public void pedirNota(String nomeProfessor){
    System.out.println( nome +"está pedindo nota a: " + nomeProfessor);
    }
}