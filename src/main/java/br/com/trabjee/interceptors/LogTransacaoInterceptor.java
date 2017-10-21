package br.com.trabjee.interceptors;

import java.util.Calendar;

import javax.ejb.EJB;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import br.com.trabjee.domain.LogTransacao;
import br.com.trabjee.repository.LogTransacaoRepository;

public class LogTransacaoInterceptor {

	@EJB
	private LogTransacaoRepository repository;
	
	@AroundInvoke
	public Object registraLogTransacao(InvocationContext invocationContext) throws Exception {
		
		LogTransacao logTransacao = new LogTransacao();
		
		Calendar calendar = Calendar.getInstance();
		
		logTransacao.setDataInicio(calendar.getTime());
		
		try {
			return invocationContext.proceed();
		} finally  {
			logTransacao.setDataFim(calendar.getTime());
			repository.save(logTransacao);
		}
	}
}
