package com.fabioalves.dslist.services;

import com.fabioalves.dslist.dto.GameMinDTO;
import com.fabioalves.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
