package br.com.dbraun.movies.battle.service;

import br.com.dbraun.movies.battle.domain.model.Match;
import br.com.dbraun.movies.battle.dto.request.MatchRequest;
import br.com.dbraun.movies.battle.dto.response.MatchResponse;
import br.com.dbraun.movies.battle.mapper.MatchMapper;
import br.com.dbraun.movies.battle.repository.MatchRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatchService {

    private final MatchRepository matchRepository;
    private final MatchMapper matchMapper;

    public MatchService(MatchRepository matchRepository, MatchMapper matchMapper) {
        this.matchRepository = matchRepository;
        this.matchMapper = matchMapper;
    }

    public MatchResponse save(MatchRequest matchRequest) {
        final Match match = matchMapper.toModelEntity(matchRequest);
        return matchMapper.toResponseEntity(matchRepository.save(match));
    }

    public List<MatchResponse> findAll() {
        List<Match> matches = new ArrayList<>();
        matchRepository.findAll().forEach(matches::add);
        return matches.stream().map(matchMapper::toResponseEntity).collect(Collectors.toList());
    }
}
