package com.thelinear.store.Service;

import com.thelinear.store.entities.User;
import com.thelinear.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service("userService")
public class UserService {

    UserRepository userRepository;
    EntityManager entityManager;


    @Transactional
    public void showEntityStates(){

        var user = User.builder().name("test1").email("tahhaj70@gmail.com").password("tahhaJ70@gmail.com").build();

        if(entityManager.contains(user)){
            System.out.println("Entity is managed");
        }else{
            System.out.println("Transient Entity / Detached Entity");
        }

        userRepository.save(user);

        if(entityManager.contains(user)){
            System.out.println("Entity is managed");
        }else{
            System.out.println("Transient Entity / Detached Entity");
        }

        user.setName("test2");
    }

}
