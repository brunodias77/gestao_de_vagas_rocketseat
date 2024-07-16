package br.com.brunodias.gestao_vagas.modules.company.repositories;

import br.com.brunodias.gestao_vagas.modules.company.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<Job, UUID> {

}