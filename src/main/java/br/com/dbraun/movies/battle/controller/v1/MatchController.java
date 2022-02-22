package br.com.dbraun.movies.battle.controller.v1;

import br.com.dbraun.movies.battle.dto.request.MatchRequest;
import br.com.dbraun.movies.battle.dto.response.MatchResponse;
import br.com.dbraun.movies.battle.service.MatchService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/matches")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping
    public List<MatchResponse> findAll(){
        return matchService.findAll();
    }

    @PostMapping
    public MatchResponse save(@Valid @RequestBody MatchRequest matchRequest){
        return matchService.save(matchRequest);
    }
}
