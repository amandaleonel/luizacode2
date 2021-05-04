package br.com.magalu.ex20210427.ex03;

import br.com.magalu.ex20210427.ex01.Pessoa;

import java.util.ArrayList;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private ArrayList<Pessoa> pessoas;

    public Elevador(){
    }

    public void inicializa(int totalAndares, int capacidade){
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        //this.pessoas = new Pessoa[capacidade];
        this.pessoas = new ArrayList<Pessoa>(10);
    }

    public void entra(Pessoa p){
        if(this.pessoas.size() < this.capacidade && !this.pessoas.contains(p)){
            pessoas.add(p);
        }
    }

    public void sai(Pessoa p){
        if(this.pessoas.size() > 0 && this.pessoas.contains(p)){
            pessoas.remove(p);
        }
    }

    public void sobe(){
        if(this.andarAtual < this.totalAndares){
            this.andarAtual += 1;
        }
    }

    public void desce(){
        if(this.andarAtual > 0){
            this.andarAtual -= 1;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
