package br.com.dbraun.movies.battle.client;

import br.com.dbraun.movies.battle.dto.ImdbMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PopulateClient {

    private final RestTemplate restTemplate;

    @Autowired
    public PopulateClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<ImdbMovie> populate(){
        return restTemplate.getForEntity("http://www.omdbapi.com/?i=tt3896198&apikey=df4d1237", ImdbMovie.class);
    }
}
