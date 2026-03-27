package com.weg.estrutura_pedagogica.Repository;

import com.weg.estrutura_pedagogica.Model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
