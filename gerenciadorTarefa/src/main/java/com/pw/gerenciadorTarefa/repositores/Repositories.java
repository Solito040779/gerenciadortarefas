package com.pw.gerenciadorTarefa.repositores;
import com.exemplo.gerenciadortarefas.entities.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositories extends JpaRepository<Tarefa, Long> {
}
