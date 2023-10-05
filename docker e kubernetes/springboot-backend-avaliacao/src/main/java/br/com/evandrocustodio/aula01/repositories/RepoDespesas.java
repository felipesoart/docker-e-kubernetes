package br.com.evandrocustodio.aula01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.evandrocustodio.aula01.models.Despesa;
	
@Repository
public interface RepoDespesas extends JpaRepository<Despesa, Long> {

}
