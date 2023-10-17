package com.senai.PaolaCristine.PrjGame.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.PaolaCristine.PrjGame.entities.Jogo;
import com.senai.PaolaCristine.PrjGame.repositories.JogoRepositories;

@Service
public class JogoServicies {

	@Autowired
	private final JogoRepositories jogoRepositories;
	
	public JogoServicies (JogoRepositories jogoRepositories) {
		this.jogoRepositories = jogoRepositories;
	}
	
	public Jogo saveCliente (Jogo jogo) {
		return jogoRepositories.save(jogo);
	}
	
	//preparando a busca getsl
	public List<Jogo> getAllJogo(){
		return jogoRepositories.findAll();
	}
	
	//
	public Jogo getJogoById (Long id) {
		return jogoRepositories.findById(id).orElse(null);
	}
	
	//deletando
	public void deleteJogo(Long id) {
		jogoRepositories.deleteById(id);
	}
	
}
