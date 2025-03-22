package com.devsuperior._crudapichallenge;

import com.devsuperior._crudapichallenge.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
