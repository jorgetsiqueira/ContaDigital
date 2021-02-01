package com.jorgesiqueira.contadigital.contacontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContaController {
	
	@GetMapping ("/clientes")
	public String listar () {
		return "Teste";
		
	}

}
