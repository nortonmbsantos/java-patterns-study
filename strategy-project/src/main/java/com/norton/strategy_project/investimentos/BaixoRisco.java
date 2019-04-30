package com.norton.strategy_project.investimentos;

import com.norton.strategy_project.Investimento;

public class BaixoRisco implements Investimento {

	public double calculaRetorno(int valor) {
		return valor + (valor*0.05);
	}
}
