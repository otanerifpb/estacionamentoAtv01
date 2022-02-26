package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.valores.DefinirValor;
import br.edu.ifpb.padroes.valores.VALOR_DIARIA;
import br.edu.ifpb.padroes.valores.VALOR_HORA;
import br.edu.ifpb.padroes.valores.VALOR_MENSALIDADE;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class Estacionamento {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Veiculo veiculo;

    private Calculadora calculadora = new Calculadora();
    private BigDecimal valor = new BigDecimal(0);

    public static DefinirValor VALOR_HORA = new VALOR_HORA();
    public static DefinirValor VALOR_DIARIA = new VALOR_DIARIA();
    public static DefinirValor VALOR_MENSAL = new VALOR_MENSALIDADE();

    public static BigDecimal VALOR_MENSALIDADE = VALOR_MENSAL.multiply(new BigDecimal(1));;

    public BigDecimal obterTotalAPagar() {
        assert(entrada != null && saida != null && veiculo != null);

        Calculadora tipo = new Calculadora();
        BigDecimal valor = tipo.calcularDuracao(entrada, saida);

        return valor;
    }

}
