package br.com.dbraun.movies.battle.dto.request;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class MatchRequest {

    @NotNull
    private UserRequest user;

}
