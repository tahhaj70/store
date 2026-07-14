package com.thelinear.store.UserService;
import org.springframework.stereotype.Service;

@Service("Legacy Service")
public class UserService{
    private UserRepository userRepository;
    private NotificationService notificationService;

    public UserService(InMemoryUserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerService(User user){
        try{
            userRepository.save(user);
            notificationService.send("\n Dear User,\n You've been successfully Registered.",user.getEmail());
        }catch (IllegalArgumentException e){
            System.out.println("\n\n - Error : User Already Registered");
        }
    }

}