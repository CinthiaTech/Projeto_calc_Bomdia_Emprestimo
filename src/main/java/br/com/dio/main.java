package br.com.dio;
public class main {
    public static int parcelas5;

    public main(String[] args) {
        System.out.println("Exercício Calculadora");
        calc.soma(2, 6);
        calc.subtracao(2, 3);
        calc.multiplicacao(5, 4);
        calc.divisao(3, 1);
    }

    {
        System.out.println("Exercício Mensagem");
        mensagem.obterMensagem(9);
        mensagem.obterMensagem(12);
        mensagem.obterMensagem(20);
    }

    {
        System.out.println("Exercício Emprestimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, parcelas5);
    }
}
