package br.com.dbraun.movies.battle.service;

import br.com.dbraun.movies.battle.domain.model.IMovieValidator;
import br.com.dbraun.movies.battle.domain.model.Movie;
import br.com.dbraun.movies.battle.infra.SameSequenceValidator;
import br.com.dbraun.movies.battle.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> findAll() {
        List<Movie> movies = new ArrayList<>();
        movieRepository.findAll().forEach(movies::add);
        return movies;
    }

    public List<Movie> findRandom(){
        boolean validMovies = false;
        List<Movie> randomMovies = null;
        while (!validMovies){
            randomMovies = movieRepository.findRandomMovies();
            validMovies = new SameSequenceValidator().validate(randomMovies);
        }
        return randomMovies;
    }
}
