package br.com.magalu.ex20210427;

import br.com.magalu.ex20210427.ex01.Pessoa;
import br.com.magalu.ex20210427.ex02.Agenda;
import br.com.magalu.ex20210427.ex03.Elevador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.time.LocalDate;

@SpringBootApplication
public class Ex20210427Application {

	public static void main(String[] args) throws ParseException {

		// EXERCEICIO 1) Class Pessoa
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate dataDeNascimento = LocalDate.parse("09/10/1951", formatter);
		Pessoa luiza = new Pessoa("Luiza Helena Trajano", dataDeNascimento, 1.55);

		LocalDate nascimentoLu = LocalDate.parse("11/06/2014", formatter);
		Pessoa luDaMagalu = new Pessoa("Lu da Magalu", nascimentoLu, 1.60);

		String dados = luiza.imprimeDados();
		System.out.println(dados);

		Long idade = luiza.calculaIdade();
		System.out.printf("Idade = %d anos\n", idade);


		// EXERCICIO 2) Class Agenda
		Agenda agenda = new Agenda();
		agenda.armazenaPessoa(luiza);
		agenda.armazenaPessoa(luDaMagalu);
		int posicao = agenda.buscaPessoa(luiza);
		agenda.imprimeAgenda();
		agenda.imprimePessoa(1);
		agenda.removePessoa(luiza);
		agenda.imprimeAgenda();


		// EXERCICIO 3) Class Elevador
		Elevador elevador = new Elevador();
		elevador.inicializa(2, 1);

		elevador.desce();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.desce();

		elevador.entra(luiza);
		elevador.entra(luiza);
		elevador.entra(luDaMagalu);
		elevador.sai(luiza);
		elevador.sai(luDaMagalu);
		elevador.entra(luDaMagalu);

		System.out.printf("FIM");
	}
}
