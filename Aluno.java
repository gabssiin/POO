/*public class Aluno{
    public String nome;
    public double altura;
    public int matricula;
    public String nacionalidade; 
  */  
public class Aluno {

    public String nome;
    public double altura;
    public int matricula;
    public String nacionalidade;



    public Aluno (String nome, double altura, int matricula, String nacionalidade ){

        this.nome=nome;
        this.altura=altura;
        this.matricula=matricula;
        this.nacionalidade=nacionalidade;

    }
    

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

