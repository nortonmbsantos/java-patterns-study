package com.norton.strategy_project;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Informe o valor a ser investido: ");
			int valor = entrada.nextInt();
			System.out.print("Qual o tipo de investimento (1) Baixo Risco, (2) Medio Risco ou (3) Alto Risco: ");
			int opcaoInvestimento = entrada.nextInt();
			TipoInvestimento tipoInvestimento = TipoInvestimento.values()[opcaoInvestimento - 1];
			
			Investimento investimento = tipoInvestimento.obterInvestimento();
			double retorno = investimento.calculaRetorno(valor);
			System.out.printf("O seu retorno será de R$%.2f", retorno);
		}
    
    }
}