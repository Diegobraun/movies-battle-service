package br.com.dbraun.movies.battle.controller.v1;

import br.com.dbraun.movies.battle.client.PopulateClient;
import br.com.dbraun.movies.battle.domain.model.Movie;
import br.com.dbraun.movies.battle.dto.ImdbMovie;
import br.com.dbraun.movies.battle.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/v1/api")
public class ApiController {

    private final MovieService movieService;
    private final PopulateClient populateClient;

    public ApiController(MovieService movieService, PopulateClient populateClient) {
        this.movieService = movieService;
        this.populateClient = populateClient;
    }

    @GetMapping
    public void populateData(){
        ImdbMovie populate = populateClient.populate().getBody();
        movieService.save(Movie.builder().imbmId(populate.getImdbID()).imdbGrade(new BigDecimal(populate.getImdbRating())).build());

    }
}
