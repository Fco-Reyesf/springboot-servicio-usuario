package com.example.prueba._tecnica.modulos.user;

import lombok.RequiredArgsConstructor;
import com.example.prueba._tecnica.modulos.user.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public String createUser(Integer id, String name, String email) {
        if (userRepository.findByEmail(email).isPresent()) {;
            return "El email ya está registrado.";
        }
        userRepository.save(id, name, email);
        return "Usuario registrado exitosamente.";
    }

    public List<UserDTO> findAll() {
        return userRepository.findAll();
    }
}
