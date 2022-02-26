package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.valores.VALOR_DIARIA;
import br.edu.ifpb.padroes.valores.VALOR_HORA;
import br.edu.ifpb.padroes.valores.VALOR_MENSALIDADE;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class Calculadora {

    public BigDecimal calcularDuracao(LocalDateTime saida, LocalDateTime entrada) {
        long periodoHoras = Duration.between(saida, entrada).toHours();
        long periodoDias = Duration.between(saida, entrada).toDays();

        BigDecimal valor;
        if (periodoHoras < 12) {
            valor = new VALOR_HORA().multiply(new BigDecimal(periodoHoras));
        } else if (periodoHoras >= 12 && periodoDias < 15) {
            valor = new VALOR_DIARIA().multiply(new BigDecimal(periodoDias));
        } else{
            valor = VALOR_MENSALIDADE.valor;
    }
        return valor;

    }
}
