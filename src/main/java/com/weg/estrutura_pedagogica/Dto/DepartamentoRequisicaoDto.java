package com.weg.estrutura_pedagogica.Dto;

import com.weg.estrutura_pedagogica.Model.Funcionario;

import java.util.List;

public record DepartamentoRequisicaoDto (
        String nome,
        List<Funcionario> funcionarios
){
}
