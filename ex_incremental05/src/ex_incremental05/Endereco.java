package ex_incremental05;

public class Endereco {
    private String rua;
    private int numero;
    private String cep;
    private Estado estado;
    private String cidade; 

    public Endereco(String rua, int numero, String cep, Estado estado, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
    }
    public Endereco(String rua, int numero, String cep) {
    this(rua, numero, cep, null, null);
    if (getEstado() == null) {
        setEstado(Estado.BA);
    } if (getCidade() == null) {
        setCidade("Salvador");
    }
}

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Estado getEstado() {
        return estado;
    }

    private void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    enum Estado {
        AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO;
    }
    
}