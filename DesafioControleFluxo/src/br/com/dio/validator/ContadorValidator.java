package br.com.dio.validator;

import br.com.dio.exception.ParametrosInvalidosException;
import br.com.dio.model.Contador;


public class ContadorValidator {
    private ContadorValidator(){

    }
    public static void VerificarContador(final Contador contador) throws ParametrosInvalidosException {
        if(IntIsBlank(contador.getParametroUm())) {
            throw new ParametrosInvalidosException("Informe um primeiro parâmetro válido!");
        }
        if(IntIsBlank(contador.getParametroDois())) {
            throw new ParametrosInvalidosException("Informe um segundo parâmetro válido!");
        }
        if(contador.getParametroUm() > contador.getParametroDois()) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo!");
        }
    }
    private static boolean IntIsBlank(final Integer value) {
        return value == null || value <= 0;
    }
}
