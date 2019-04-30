package com.norton.gerenciador_viagens.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.norton.gerenciador_viagens.dtos.ViagemDto;
import com.norton.gerenciador_viagens.entities.Viagem;
import com.norton.gerenciador_viagens.repositories.ViagemRepository;
import com.norton.gerenciador_viagens.services.exceptions.ViagemException;

@Service
public class ViagemServices {

	@Autowired
	private ViagemRepository viagemRepository;

	public List<Viagem> listar() {
		return viagemRepository.findAll();
	}

	public Viagem salvar(ViagemDto viagemDto) {

		Viagem viagem = new Viagem();

		viagem.setLocalDeDestino(viagemDto.getLocalDeDestino());
		viagem.setDataPartida(viagemDto.getDataPartida());
		viagem.setDataRetorno(viagemDto.getDataRetorno());
		viagem.setAcompanhante(viagemDto.getAcompanhante());
		return viagemRepository.save(viagem);
	}

	public Viagem buscar(Long id) {
		Viagem viagem = viagemRepository.findOne(id);

		if (viagem == null) {
			throw new ViagemException("Não existe esta viagem cadastrada");
		}
		return viagem;
	}
}