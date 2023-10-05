package br.com.evandrocustodio.aula01.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.evandrocustodio.aula01.models.Informacoes;

@Controller
@RequestMapping(path = "/info")
@CrossOrigin(origins = "*")
public class Info {

	@Autowired
	Environment environment;
	
	@Value("${aluno.nome}")
	private String aluno;

	@GetMapping
	public ResponseEntity<Informacoes> getInfo() throws UnknownHostException {

		String hostname = InetAddress.getLocalHost().getHostName();
		Informacoes info = new Informacoes(hostname, aluno);

		return new ResponseEntity<Informacoes>(info, HttpStatus.OK);
	}
}
