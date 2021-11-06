package com.trading.platform.repository;

import com.trading.platform.entity.Symbol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymbolRepository extends JpaRepository<Long, Symbol> {
}
