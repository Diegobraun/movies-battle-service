package br.com.dbraun.movies.battle.controller.v1;

import br.com.dbraun.movies.battle.domain.model.Movie;
import br.com.dbraun.movies.battle.dto.request.MatchRequest;
import br.com.dbraun.movies.battle.dto.response.MatchResponse;
import br.com.dbraun.movies.battle.service.MatchService;
import br.com.dbraun.movies.battle.service.MovieService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> findAll(){
        return movieService.findAll();
    }

    @GetMapping("/random")
    public List<Movie> findRandom(){
        return movieService.findRandom();
    }

}
