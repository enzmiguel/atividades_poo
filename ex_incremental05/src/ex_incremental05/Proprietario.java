package ex_incremental05;

import java.util.ArrayList;

public class Proprietario {

    private String nome;
    private String cpf;
    private String identidade;
    private Endereco enderecoResidencial;   
    private ArrayList<Imovel> imoveis = new ArrayList<>();

    public Proprietario(String n, String cpf, String id, Endereco end) {
    this.nome = n;
    this.cpf = cpf;
    this.identidade = id;
    this.enderecoResidencial = end;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }
    
    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }
    
    public void removerImovel(Imovel imovel) {
        this.imoveis.remove(imovel);
    }
    
    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }
    
    public void buscarImoveisPorTipo(char tipo) {
        for (Imovel imovel : this.imoveis) {
            if (imovel.getTipo() == tipo) {
                System.out.println("O imóvel do endereço: " + imovel.getEndereco() + " pertence a " + this.getNome());
            }
        }
    }
    
    public void adicionarImovel(Imovel imovel) {
    this.imoveis.add(imovel);
    }

    
    public void mostrarImoveis() {
    for (Imovel imovel : imoveis) {
        System.out.println(imovel);
    }
    }
}