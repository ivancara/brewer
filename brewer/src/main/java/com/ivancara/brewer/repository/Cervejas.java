package com.ivancara.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivancara.brewer.model.Cerveja;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long> {

}
