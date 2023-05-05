package ex_incremental05;

    public class Imovel {

    private Endereco endereco;
    private char tipo = 'c';
    private char utilizacao = 'p';
    
    public Imovel(char tipo, char utilizacao, Endereco endereco) {
        this.endereco = endereco;
        this.tipo = tipo; //'c' para casa, 'a' para apartamento
        this.utilizacao = utilizacao; //'p' para praia ou 'd' para campo
    }
    
    public char getTipo() {
        return tipo;
    }
    public char getUtilizacao() {
        return utilizacao;
    }
    public Endereco getEndereco() {
        return endereco;
    }
}