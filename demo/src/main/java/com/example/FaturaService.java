package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class FaturaService {
    public boolean validarFatura(Double valor) {
        if (valor == null || valor <= 0) {
            throw new IllegalArgumentException("O valor da fatura deve ser maior que zero.");
        }
        return true;
    }
}
