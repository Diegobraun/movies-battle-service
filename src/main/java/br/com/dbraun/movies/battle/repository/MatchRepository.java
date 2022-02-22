package br.com.dbraun.movies.battle.repository;

import br.com.dbraun.movies.battle.domain.model.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends CrudRepository<Match, Long> {
}
