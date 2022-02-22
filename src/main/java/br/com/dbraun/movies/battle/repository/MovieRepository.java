package br.com.dbraun.movies.battle.repository;

import br.com.dbraun.movies.battle.domain.model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    @Query(nativeQuery = true, value="SELECT *  FROM movie ORDER BY random() LIMIT 4")
    List<Movie> findRandomMovies();
}