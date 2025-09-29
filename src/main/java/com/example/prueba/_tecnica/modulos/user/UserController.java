package com.example.prueba._tecnica.modulos.user;


import lombok.RequiredArgsConstructor;
import com.example.prueba._tecnica.modulos.user.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping()
    public String createUser(@RequestBody UserDTO user) {
        return userService.createUser(user.id(), user.name(), user.email());
    }

    @GetMapping()
    public List<UserDTO> allUsers() {
        return userService.findAll();
    }

}
