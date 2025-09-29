package com.example.prueba._tecnica.modulos.user;

import com.example.prueba._tecnica.modulos.user.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    private final Map<Integer, UserDTO> usuarios = new ConcurrentHashMap<>();

    public void save(Integer id, String name, String email) {
        usuarios.put(usuarios.size() + 1 ,new UserDTO(id,name,email));
    }

    public List<UserDTO> findAll() {
        return new ArrayList<>(usuarios.values());
    }

    public Optional<UserDTO> findByEmail(String email) {
        return usuarios.values().stream()
                .filter( u -> u.email().contains(email))
                .findFirst();
    }

}
