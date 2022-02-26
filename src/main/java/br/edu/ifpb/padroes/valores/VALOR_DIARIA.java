package br.edu.ifpb.padroes.valores;

import java.math.BigDecimal;

public class VALOR_DIARIA implements DefinirValor {
    public static BigDecimal valor = new BigDecimal("26.00");

    @Override
    public BigDecimal multiply(BigDecimal periodo) {

        return  valor.multiply(periodo);

    }

}
