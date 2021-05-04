package br.com.magalu.ex20210427.ex02;
import br.com.magalu.ex20210427.ex01.Pessoa;
import org.yaml.snakeyaml.util.ArrayUtils;

public class Agenda {
    private Pessoa[] pessoas;

    public Agenda(){
        this.pessoas = new Pessoa[10];
    }

    public void armazenaPessoa(Pessoa p){
        int idx = 0;
        for(int i=0; i < this.pessoas.length; i++) {
            if (this.pessoas[i] != null) {
                idx += 1;
            }
        }
        this.pessoas[idx] = p;
    }

    public void removePessoa(Pessoa p){
        String nome = p.getNome();
        for(int i=0; i < this.pessoas.length; i++) {
            if (this.pessoas[i] != null && this.pessoas[i].getNome() == nome){
                this.pessoas[i] = null;
            }
        }
    }

    public int buscaPessoa(Pessoa p){
        int posicao = -1;
        String nome = p.getNome();
        for(int i=0; i < this.pessoas.length; i++) {
            if (this.pessoas[i] != null && this.pessoas[i].getNome() == nome){
                posicao = i;
            }
        }
        return posicao;
    }

    public void imprimeAgenda(){
        for(int i=0; i < this.pessoas.length; i++) {
            if(this.pessoas[i] != null) {
                System.out.println(this.pessoas[i].imprimeDados() + "\n");
            }
        }
    }

    public void imprimePessoa(int index){
        System.out.println(this.pessoas[index].imprimeDados());
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }
}
