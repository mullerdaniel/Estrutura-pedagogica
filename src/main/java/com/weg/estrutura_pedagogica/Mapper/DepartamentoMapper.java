package com.weg.estrutura_pedagogica.Mapper;

import com.weg.estrutura_pedagogica.Dto.DepartamentoRequisicaoDto;
import com.weg.estrutura_pedagogica.Dto.DepartamentoRespostaDto;
import com.weg.estrutura_pedagogica.Model.Departamento;
import org.springframework.stereotype.Component;

@Component
public class DepartamentoMapper {

    public Departamento toEntity(DepartamentoRequisicaoDto departamentoRequisicaoDto) {
        Departamento departamento = new Departamento();
        departamento.setNome(departamento.getNome());
        departamento.setFuncionarios(departamento.getFuncionarios());
        return departamento;
    }

    public DepartamentoRespostaDto toDto(Departamento departamento) {
        DepartamentoRespostaDto departamentoRespostaDto = new DepartamentoRespostaDto();
        departamentoRespostaDto.
    }
}
