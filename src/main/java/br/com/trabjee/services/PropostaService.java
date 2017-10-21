package br.com.trabjee.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Path;

import br.com.trabjee.domain.Proposta;
import br.com.trabjee.repository.PropostaRepository;

@Stateless
public class PropostaService {

	@EJB
	private PropostaRepository repository;
	
	@Path(value = "vbank/proposta")
	public void enviarProposta(Proposta proposta) {
		repository.save(proposta);
	}
}
