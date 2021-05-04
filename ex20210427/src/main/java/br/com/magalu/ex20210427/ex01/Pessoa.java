package br.com.magalu.ex20210427.ex01;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private Double altura;

    public Pessoa(){
        this.nome = "";
        this.dataDeNascimento = LocalDate.now();
        this.altura = 0.0;
    }

    public Pessoa(String nome, LocalDate dataDeNascimento, double altura){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public String imprimeDados() {
        String dados = "Nome: " + this.nome
                    + "\nData de nascimento: " + this.dataDeNascimento
                    + "\nAltura: " + String.valueOf(this.altura) + " m";
        return dados;
    }

    public long calculaIdade(){
        LocalDate today = LocalDate.now();
        return ChronoUnit.YEARS.between(this.dataDeNascimento,today);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
