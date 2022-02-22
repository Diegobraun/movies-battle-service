package br.com.dbraun.movies.battle.domain.model;

import java.util.List;

public interface IMovieValidator {
    boolean validate(List<Movie> movies);
}
