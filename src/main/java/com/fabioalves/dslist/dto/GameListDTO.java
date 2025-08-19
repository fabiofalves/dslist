package com.fabioalves.dslist.dto;

import com.fabioalves.dslist.entities.GameList;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO (GameList gameList){
        id = gameList.getId();
        name = gameList.getName();
    }
}
