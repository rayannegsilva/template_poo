package com.rayannegsilva.services;

import com.rayannegsilva.entities.User;
import com.rayannegsilva.repository.UserRepository;
import com.rayannegsilva.repository.UserRepositoryImpl;

import java.util.List;

// TODO: Adicione mais métodos
public class UserServiceImpl implements UserService {
    private final UserRepository repo = new UserRepositoryImpl();

    public User getById(Long id) {
        return repo.findById(id);
    }

    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public void register(User user) {
        // TODO: ADICIONE A VALIDAÇÃO

        repo.save(user);
    }
}
