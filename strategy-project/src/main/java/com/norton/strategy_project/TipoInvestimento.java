package com.norton.strategy_project;

import com.norton.strategy_project.investimentos.AltoRisco;
import com.norton.strategy_project.investimentos.BaixoRisco;
import com.norton.strategy_project.investimentos.MedioRisco;

public enum TipoInvestimento {
	BAIXORISCO {
		@Override
		public Investimento obterInvestimento() {
			return new BaixoRisco();
		}
	}, MEDIORISCO {
		@Override
		public Investimento obterInvestimento() {
			return new MedioRisco();
		}
	}, ALTORISCO {
		@Override
		public Investimento obterInvestimento() {
			return new AltoRisco();
		}
	};

	public abstract Investimento obterInvestimento();
}
