public class Filme {
    public String nomeDoFilme;
    public int anoLancamento;
    public String diretor;
    public int duracaoMinutos;

    public Filme (String nomeDoFilme, int anoLancamento,  String diretor, int duracaoMinutos){
        this.nomeDoFilme = nomeDoFilme;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.duracaoMinutos = duracaoMinutos;

    }


    public void consultarDuracao(int duracaoMinutos){
            System.out.println("A duração de "+ nomeDoFilme + " é de: "+ duracaoMinutos +" minutos");
    }

    public void consultarAnoLancamento (int anoLancamento){
        System.out.println(nomeDoFilme+ " foi lançado em: " + anoLancamento);
    }
}
