package com.thelinear.store.UserService;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRepository{

    HashMap<String,User> Users = new HashMap();

    @Override
    public void save(User user) {
        if (Users.get(user.getEmail()) == null)
            Users.put(user.getEmail(),user);
        else throw new IllegalArgumentException();
    }
}
