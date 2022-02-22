package br.com.dbraun.movies.battle.infra;

import br.com.dbraun.movies.battle.domain.model.IMovieValidator;
import br.com.dbraun.movies.battle.domain.model.Movie;

import java.util.List;

public class SameSequenceValidator implements IMovieValidator {

    @Override
    public boolean validate(List<Movie> movies) {
        return movies.stream().distinct().count() > 2;
    }
}
