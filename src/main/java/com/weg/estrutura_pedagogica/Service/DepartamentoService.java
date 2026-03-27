package com.weg.estrutura_pedagogica.Service;

import com.weg.estrutura_pedagogica.Dto.DepartamentoRequisicaoDto;
import com.weg.estrutura_pedagogica.Dto.DepartamentoRespostaDto;
import com.weg.estrutura_pedagogica.Mapper.DepartamentoMapper;
import com.weg.estrutura_pedagogica.Model.Departamento;
import com.weg.estrutura_pedagogica.Repository.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    private final DepartamentoRepository repository;
    private final DepartamentoMapper mapper;

    public DepartamentoService(DepartamentoRepository repository,
                               DepartamentoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public DepartamentoRespostaDto salvar(DepartamentoRequisicaoDto dto) {
        Departamento departamento = mapper.toEntity(dto);
        departamento = repository.save(departamento);
        return mapper.toDto(departamento);
    }

    public List<DepartamentoRespostaDto> listar() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    public DepartamentoRespostaDto buscarPorId(Long id) {
        Departamento departamento = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Departamento não encontrado"));

        return mapper.toDto(departamento);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}