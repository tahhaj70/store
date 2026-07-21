package com.thelinear.store.repositories;

import com.thelinear.store.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT COUNT(u) FROM User u WHERE u.email = ?1")
    public int countByEmail(String email);

}
