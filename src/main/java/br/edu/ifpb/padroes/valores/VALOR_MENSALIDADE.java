package br.edu.ifpb.padroes.valores;

import java.math.BigDecimal;

public class VALOR_MENSALIDADE implements DefinirValor {
    public static BigDecimal valor = new BigDecimal("300.00");

    @Override
    public BigDecimal multiply(BigDecimal periodo) {

        return valor;
    }


}