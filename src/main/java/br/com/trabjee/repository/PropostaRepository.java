package br.com.trabjee.repository;

import javax.ejb.Local;

import br.com.trabjee.domain.Proposta;
import br.com.trabjee.repository.impl.Repository;

@Local
public interface PropostaRepository extends Repository<Proposta>{

}
