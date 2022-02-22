package br.com.dbraun.movies.battle.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class MatchResponse {
    private Long id;

    private UserResponse user;

    private List<RoundResponse> rounds;
}
