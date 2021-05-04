package br.com.magalu.ex20210422;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.String;
import java.util.Scanner;

@SpringBootApplication
public class Ex20210422Application {

	public static void main(String[] args) {

		// Inicializando o input de dados
		Scanner sc = new Scanner(System.in);

		// Inicializacao da classe
		String curso = "LuizaCode#2";
		String aluna = "Amanda Leonel";
		String profa = "Camila Nachbar";
		String lista = "Exercicio 22.04.2021";
		Exercicio exClass = new Exercicio(curso, aluna, profa, lista);

		// EXERCICIO 3)
		boolean[] resultadoEx3 = exClass.ex3();
		System.out.printf("\nEx3) Resultado:\nA=%b\nB=%b\nC=%b\n", resultadoEx3[0], resultadoEx3[1], resultadoEx3[2]);

		// EXERCICIO 4)
		double[] resultadoEx4 = exClass.ex4();
		System.out.println("\nEx4) Resultado:");
		int idx=0;
		for (char alfabeto='A'; alfabeto<='J'; alfabeto++, idx++){
			System.out.printf("%c=%f\n", alfabeto, resultadoEx4[idx]);
		}

		// EXERCICIO 5)
		System.out.println("\nEx5) Resultado:");
		System.out.print("Por favor, digite um numero inteiro: ");
		int resultadoEx5 = exClass.ex5(sc.nextInt());
		System.out.printf("Seu antecessor eh %d.\n", resultadoEx5);

		// EXERCICIO 6)
		System.out.println("\nEx6) Resultado:");
		System.out.print("Por favor, digite a base do retangulo:\n");
		double base = sc.nextDouble();
		System.out.print("Por favor, digite a altura do retangulo:\n");
		double altura = sc.nextDouble();
		double resultadoEx6 = exClass.ex6(base, altura);
		System.out.printf("A area do retangulo mede = %.2f.\n", resultadoEx6);

		// EXERCICIO 7)
		System.out.println("\nEx7) Resultado:");
		System.out.print("Por favor, digite sua idade em anos...\n");
		int anos = sc.nextInt();
		System.out.print("Meses:\n");
		int meses = sc.nextInt();
		System.out.print("Dias:\n");
		int dias = sc.nextInt();
		int resultadoEx7 = exClass.ex7(anos, meses, dias);
		System.out.printf("A sua idade em dias eh = %d dias.\n", resultadoEx7);

		// EXERCICIO 8)
		System.out.println("\nEx8) Resultado:");
		System.out.print("Por favor, digite o numero total de eleitores:\n");
		int totalEleitores = sc.nextInt();
		System.out.print("Digite o numero de votos em branco:\n");
		int brancos = sc.nextInt();
		System.out.print("Digite o numero de votos nulos:\n");
		int nulos = sc.nextInt();
		System.out.print("Digite o numero de votos validos:\n");
		int validos = sc.nextInt();
		double[] resultadoEx8 = exClass.ex8(totalEleitores, brancos, nulos, validos);
		System.out.printf("Percentual de votos em branco = %.2f%%, nulos = %.2f%%, e validos = %.2f%%.\n",
				resultadoEx8[0], resultadoEx8[1], resultadoEx8[2]);

		// EXERCICIO 9)
		System.out.println("\nEx9) Resultado:");
		System.out.print("Por favor, digite o valor do salario:\n");
		double salario = sc.nextDouble();
		System.out.print("Digite o valor do reajuste:\n");
		double reajuste = sc.nextDouble();
		double resultadoEx9 = exClass.ex9(salario, reajuste);
		System.out.printf("O salario reajustado vale = %.2f.\n", resultadoEx9);

		// EXERCICIO 10)
		System.out.println("\nEx10) Resultado:");
		System.out.print("Por favor, digite o valor do custo de fabrica do carro:\n");
		double custoDeFabrica = sc.nextDouble();
		double resultadoEx10 = exClass.ex10(custoDeFabrica);
		System.out.printf("O custo final do carro eh de = %.2f.\n", resultadoEx10);

		// EXERCICIO 11)
		System.out.println("\nEx11) Resultado:");
		System.out.print("Por favor, digite o numero de carros vendidos:\n");
		int numCarros = sc.nextInt();
		System.out.print("Digite o total de vendas:\n");
		double totalVendas = sc.nextDouble();
		System.out.print("Digite o salario fixo:\n");
		double salarioFixo = sc.nextDouble();
		System.out.print("Digite a comissao fixa para cada carro vendido:\n");
		double valorPorCarro = sc.nextDouble();
		double resultadoEx11 = exClass.ex11(numCarros, totalVendas, salarioFixo, valorPorCarro);
		System.out.printf("O salario final do vendedor eh de = %.2f.\n", resultadoEx11);

		System.out.println("FIM");
	}
}