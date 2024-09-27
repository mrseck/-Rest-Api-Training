package com.in28min.rests.webservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class userDaoService {

    private static List<User> users = new ArrayList<User>();

    private static int usersCount= 0;

    static {
        users.add(new User(++usersCount, "Seck", LocalDate.now().minusYears(32)));
        users.add(new User(++usersCount, "John", LocalDate.now().minusYears(28)));
        users.add(new User(++usersCount, "Doe", LocalDate.now().minusYears(25)));
    }

    public List<User> findAll() {
        return users;
    }

    
    public User findUsersById(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

}
