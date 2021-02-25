package com.murilo.project.projetomurilo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.murilo.project.projetomurilo.domain.Stock;


@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{

}
