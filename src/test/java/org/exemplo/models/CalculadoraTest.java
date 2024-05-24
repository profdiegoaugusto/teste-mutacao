package org.exemplo.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadoraSobTeste = new Calculadora();

    @Test
    void deveSerPositivo() {
        int numero = 1;
        boolean saidaEsperada = true;
        boolean resultado = calculadoraSobTeste.ePositivo(numero);
        assertEquals(saidaEsperada, resultado);
    }

    @Test
    void deveSerZero() {
        int numero = 0;
        boolean saidaEsperada = true;
        boolean resultado = calculadoraSobTeste.ePositivo(numero);
        assertEquals(saidaEsperada, resultado);
    }

    @Test
    void deveSerNegativo() {
        int numero = -1;
        boolean saidaEsperada = false;
        boolean resultado = calculadoraSobTeste.ePositivo(numero);
        assertEquals(saidaEsperada, resultado);
    }
}