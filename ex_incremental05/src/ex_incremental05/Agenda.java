package ex_incremental05;

import java.util.ArrayList;
import java.util.Date;

public class Agenda {
    private ArrayList<Date> disponiveis;
    private ArrayList<Date> alugados;
    private ArrayList<Date> bloqueados;

    public Agenda() {
        this.disponiveis = new ArrayList<Date>();
        this.alugados = new ArrayList<Date>();
        this.bloqueados = new ArrayList<Date>();
    }

    public ArrayList<Date> getDisponiveis() {
        return disponiveis;
    }

    public ArrayList<Date> getAlugados() {
        return alugados;
    }

    public ArrayList<Date> getBloqueados() {
        return bloqueados;
    }

    public void addDisponivel(Date data) {
        disponiveis.add(data);
    }

    public void addAlugado(Date data) {
        alugados.add(data);
    }

    public void addBloqueado(Date data) {
        bloqueados.add(data);
    }
}
