package com.fabioalves.dslist.services;

import com.fabioalves.dslist.dto.GameDTO;
import com.fabioalves.dslist.dto.GameMinDTO;
import com.fabioalves.dslist.entities.Game;
import com.fabioalves.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();   
    }

    @Transactional(readOnly = true)
    public GameDTO findById (@PathVariable Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO((result));
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        var result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinDTO::new).toList();
    }
}
