package br.com.dbraun.movies.battle.mapper;

import br.com.dbraun.movies.battle.domain.model.Match;
import br.com.dbraun.movies.battle.dto.request.MatchRequest;
import br.com.dbraun.movies.battle.dto.response.MatchResponse;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MatchMapper {

    private final ModelMapper mapper;

    public MatchMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public Match toModelEntity(final MatchRequest matchRequest){
        return mapper.map(matchRequest, Match.class);
    }

    public MatchResponse toResponseEntity(final Match match){
        return mapper.map(match, MatchResponse.class);
    }
}
