package com.ironhack.pokeappbackend.controller.interfaces;

import com.ironhack.pokeappbackend.controller.dto.UserDTO;
import com.ironhack.pokeappbackend.model.User;

import java.util.List;

public interface UserController {
    UserDTO register(UserDTO userDTO);
    List<UserDTO> findAll();
    UserDTO login(User user);
}
