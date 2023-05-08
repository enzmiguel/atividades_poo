package ex_incremental05;

import java.util.Date;

    public class Imovel {

    private Endereco endereco;
    private char tipo;
    private char utilizacao;
    private Agenda agenda;
    
    public Imovel(char tipo, char utilizacao, Endereco endereco, Agenda agenda) {
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