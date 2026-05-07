package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FaturaServiceTest {
    private final FaturaService service = new FaturaService();

    @Test
    void deveValidarFaturaComValorPositivo() {
        assertTrue(service.validarFatura(100.0));
    }

    @Test
    void deveLancarExcecaoParaFaturaInvalida() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.validarFatura(-5.0);
        });
        assertEquals("O valor da fatura deve ser maior que zero.", exception.getMessage());
    }
}