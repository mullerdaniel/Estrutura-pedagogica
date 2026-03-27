package com.weg.estrutura_pedagogica.Controller;

import com.weg.estrutura_pedagogica.Dto.FuncionarioRequisicaoDto;
import com.weg.estrutura_pedagogica.Dto.FuncionarioRespostaDto;
import com.weg.estrutura_pedagogica.Service.FuncionarioService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<FuncionarioRespostaDto> salvar(
            @RequestBody FuncionarioRequisicaoDto dto) {

        FuncionarioRespostaDto resposta = service.salvar(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(resposta);
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioRespostaDto>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioRespostaDto> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}