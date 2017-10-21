package br.com.trabjee.repository;

import javax.ejb.Local;

import br.com.trabjee.domain.LogTransacao;
import br.com.trabjee.repository.impl.Repository;

@Local
public interface LogTransacaoRepository extends Repository<LogTransacao>{

}
