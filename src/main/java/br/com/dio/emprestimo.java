package br.com.dio;

public class emprestimo{
    public static int parcelas5;

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    }
public static void calcular (double valor, int parcelas) {

    if (parcelas == 2) {
        double valorFinal = valor + (valor + getTaxaDuasParcelas());
        System.out.println("O Valor final do empréstimo de duas parcelas é R$ " + valorFinal);
    } else if (parcelas == 3) {

        double valorFinal = valor + (valor + getTaxaTresParcelas());
        System.out.println("O Valor final do empréstimo de três parcelas é R$ " + valorFinal);
    } else {
        System.out.println("Quantidade de parcelas não aceita.");
    }
}
}