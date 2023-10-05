package br.com.evandrocustodio.aula01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.evandrocustodio.aula01.models.Despesa;
import br.com.evandrocustodio.aula01.repositories.RepoDespesas;

@Service
public class ServiceDespesas {

	@Autowired
	RepoDespesas despesas;

	public List<Despesa> getDespesas() {
		return this.despesas.findAll();
	};

}
	