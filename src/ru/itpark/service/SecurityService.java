package ru.itpark.service;

import ru.itpark.domain.User;
import ru.itpark.exception.InvalidPasswordException;
import ru.itpark.exception.NoSuchUserException;
import ru.itpark.exception.PermissionNotGrantedException;
import ru.itpark.repository.SecurityRepository;

public class SecurityService {
    private SecurityRepository repository;

    public SecurityService(SecurityRepository repository) {
        this.repository = repository;
    }

    public void add(User user) {
        repository.add(user);
    }

    public void authenticate(String login, String password) {

        User user = repository.getByLogin(login);
        if (!user.getPassword().equals(password)) {
            throw new InvalidPasswordException();
        }


    }

    public void checkAccess(String login, String minPermission) {
        User user=repository.getByLogin(login);
       if(!user.getPermissions().contains(minPermission)){
           throw new PermissionNotGrantedException();
       }
    }
}
