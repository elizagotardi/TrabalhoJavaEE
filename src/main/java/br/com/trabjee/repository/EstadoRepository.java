package br.com.trabjee.repository;

import javax.ejb.Local;

import br.com.trabjee.domain.Estado;
import br.com.trabjee.repository.impl.Repository;

@Local
public interface EstadoRepository extends Repository<Estado>{

}
