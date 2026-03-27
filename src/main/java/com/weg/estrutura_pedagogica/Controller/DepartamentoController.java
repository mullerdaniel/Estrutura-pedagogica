package com.weg.estrutura_pedagogica.Controller;

import com.weg.estrutura_pedagogica.Dto.DepartamentoRequisicaoDto;
import com.weg.estrutura_pedagogica.Dto.DepartamentoRespostaDto;
import com.weg.estrutura_pedagogica.Service.DepartamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    private final DepartamentoService service;

    public DepartamentoController(DepartamentoService service) {
        this.service = service;
    }

    @PostMapping
    public DepartamentoRespostaDto salvar(@RequestBody DepartamentoRequisicaoDto dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public List<DepartamentoRespostaDto> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public DepartamentoRespostaDto buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}