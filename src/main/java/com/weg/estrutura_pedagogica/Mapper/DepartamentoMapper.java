package com.weg.estrutura_pedagogica.Mapper;

import com.weg.estrutura_pedagogica.Dto.DepartamentoRequisicaoDto;
import com.weg.estrutura_pedagogica.Dto.FuncionarioRequisicaoDto;
import com.weg.estrutura_pedagogica.Model.Departamento;
import com.weg.estrutura_pedagogica.Model.Funcionario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartamentoMapper {

    public Departamento toEntity(DepartamentoRequisicaoDto dto) {
        Departamento departamento = new Departamento();
        departamento.setNome(dto.nome());

        if (dto.funcionarios() != null && !dto.funcionarios().isEmpty()) {

            List<Funcionario> funcionarios = new java.util.ArrayList<>();

            for (FuncionarioRequisicaoDto f : dto.funcionarios()) {
                Funcionario func = new Funcionario();
                func.setNome(f.nome());
                func.setSalario(f.salario());
                func.setDepartamento(departamento);

                funcionarios.add(func);
            }

            departamento.setFuncionarios(funcionarios);
        }

        return departamento;
    }
}