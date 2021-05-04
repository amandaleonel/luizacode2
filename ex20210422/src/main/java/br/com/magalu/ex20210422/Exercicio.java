package br.com.magalu.ex20210422;
import java.util.Date;
import java.time.LocalDate;

public class Exercicio {
    private String curso;
    private String nomeDaAluna;
    private String nomeDaProfessora;
    private String nomeDaListaDeEx;

    public Exercicio(String curso, String nomeDaAluna, String nomeDaProfessora, String nomeDaListaDeEx){
        this.curso =curso;
        this.nomeDaAluna = nomeDaAluna;
        this.nomeDaProfessora = nomeDaProfessora;
        this.nomeDaListaDeEx = nomeDaListaDeEx;
    }

    // Realiza operacoes aritmeticas
    public boolean[] ex3(){
        boolean a = ((4/2)+(2/4)) == (4/2+2/4);
        boolean b = (4/(2+2)/4) == (4/2+2/4);
        boolean c = ((4+2)*2-4) == (4+2*2-4);
        boolean[] resultado = {a,b,c};
        return resultado;
    }

    // Realiza operacoes com pararenteses
    public double[] ex4(){
        double a = 6*(3+2);
        double b = 2+6*(3+2);
        double c = 2+3*6/(2+4);
        double d = 2*8/(3+1);
        double e = 3+(16-2)/(2*(9-2));
        double f = 6/3+8/2;
        double g = (3+8/2)*4+3*2;
        double h = 6*3*3+6-10;
        double i = (10*8+3)*9;
        double j = -12*-4+3*-4;
        double[] resultado = {a,b,c,d,e,f,g,h,i,j};
        return resultado;
    }

    // Retorna o antecessor de um numero inteiro
    public int ex5(int valor){
        return (valor-1);
    }

    // Retorna a area de um retangulo
    public double ex6(double base, double altura){
        return Math.abs(base*altura);
    }

    // Retorna a idade em dias
    public int ex7(int anos, int meses, int dias){
        int dataEmDias = anos*365 + meses*30 + dias;
        return dataEmDias;
    }

    // Retorna percentuais de votos, na mesma ordem de entrada
    public double[] ex8(int totalEleitores, int brancos, int nulos, int validos){
        double[] percentVotos = {brancos, nulos, validos};
        for(int i = 0; i < percentVotos.length; i++){
            percentVotos[i] = percentVotos[i] / totalEleitores * 100;
        } return (percentVotos);
    }

    // Retorna o salario reajustado
    public double ex9(double salario, double reajuste){
        salario += salario*reajuste;
        return salario;
    }

    // Retorna o custo final pro consumidor
    public double ex10(double custoDeFabrica){
        double percentDist = 0.28;
        double percentImpostos = 0.45;
        double custoFinal = custoDeFabrica * (1 + percentDist + percentImpostos);
        return custoFinal;
    }

    // Retorna o salario final do vendedor
    public double ex11(int numCarros, double totalVendas, double salarioFixo, double valorPorCarro){
        double comissaoFixa = 0.05;
        double salarioFinal = salarioFixo + valorPorCarro * numCarros + comissaoFixa * totalVendas;
        return salarioFinal;
    }

    public String getCurso() {
        return curso;
    }

    public String getNomeDaAluna() {
        return nomeDaAluna;
    }

    public String getNomeDaProfessora() {
        return nomeDaProfessora;
    }

    public String getNomeDaListaDeEx() {
        return nomeDaListaDeEx;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNomeDaAluna(String nomeDaAluna) {
        this.nomeDaAluna = nomeDaAluna;
    }

    public void setNomeDaProfessora(String nomeDaProfessora) {
        this.nomeDaProfessora = nomeDaProfessora;
    }

    public void setNomeDaListaDeEx(String nomeDaListaDeEx) {
        this.nomeDaListaDeEx = nomeDaListaDeEx;
    }
}