package br.com.dbraun.movies.battle.repository;

import br.com.dbraun.movies.battle.domain.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
