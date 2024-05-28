package com.pw.gerenciadorTarefa.services;

import com.pw.gerenciadorTarefa.entities.Tarefa;
import com.pw.gerenciadorTarefa.repositores.Repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> findAll() {
        return tarefaRepository.findAll();
    }

    public Tarefa findById(Long id) {
        Optional<Tarefa> tarefa = tarefaRepository.findById(id);
        return tarefa.orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    public Tarefa save(Tarefa tarefa) {
        tarefa.setDataCriacao(LocalDate.now());
        return tarefaRepository.save(tarefa);
    }

    public Tarefa update(Long id, Tarefa tarefaDetails) {
        Tarefa tarefa = findById(id);
        tarefa.setDescricao(tarefaDetails.getDescricao());
        tarefa.setDataLimite(tarefaDetails.getDataLimite());
        tarefa.setFinalizada(tarefaDetails.isFinalizada());
        return tarefaRepository.save(tarefa);
    }

    public void delete(Long id) {
        Tarefa tarefa = findById(id);
        tarefaRepository.delete(tarefa);
    }
}
