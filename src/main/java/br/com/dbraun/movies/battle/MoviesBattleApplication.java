package br.com.dbraun.movies.battle;

import br.com.dbraun.movies.battle.domain.model.Movie;
import br.com.dbraun.movies.battle.repository.MovieRepository;
import br.com.dbraun.movies.battle.service.MovieService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class MoviesBattleApplication {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private MovieService movieService;

	public static void main(String[] args) {
		SpringApplication.run(MoviesBattleApplication.class, args);
	}

	@Bean
	InitializingBean sendDatabase() {
		return () -> {
			movieRepository.save(Movie.builder().name("Filme 1").description("filme 1").imdbGrade(new BigDecimal(9)).build());
			movieRepository.save(Movie.builder().name("Filme 2").description("filme 2").imdbGrade(new BigDecimal(8)).build());
			movieRepository.save(Movie.builder().name("Filme 3").description("filme 3").imdbGrade(new BigDecimal(7)).build());
			movieRepository.save(Movie.builder().name("Filme 4").description("filme 4").imdbGrade(new BigDecimal(6)).build());
		};
	}
}
