package com.jorgesiqueira.contadigital.contacontroller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jorgesiqueira.contadigital.domain.model.Cliente;


@RestController
public class ContaController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Jorge Siqueira");
		cliente1.setCpf("999.888.777-66");
		cliente1.setEndereco("Rua Doze de Dezembro, N164 - João Pessoa, PB.");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Miriam Targino");
		cliente2.setCpf("999.888.777-66");
		cliente2.setEndereco("Rua Quinze De Novembro, N57 - João Pessoa, PB.");

		return Arrays.asList(cliente1, cliente2);

	}

}
