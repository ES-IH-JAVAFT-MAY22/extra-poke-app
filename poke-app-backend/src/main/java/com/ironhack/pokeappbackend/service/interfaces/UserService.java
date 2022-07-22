package com.ironhack.pokeappbackend.service.interfaces;

import com.ironhack.pokeappbackend.controller.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO store(UserDTO user);
    List<UserDTO> findAll();
}
