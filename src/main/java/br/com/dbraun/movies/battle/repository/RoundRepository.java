package br.com.dbraun.movies.battle.repository;

import br.com.dbraun.movies.battle.domain.model.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundRepository extends JpaRepository<Round, Long> {
}