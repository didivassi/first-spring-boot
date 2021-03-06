package academy.mindswap.firstspringboot.services;

import academy.mindswap.firstspringboot.model.User;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final List<User> users;

    public UserService(){
        users=new LinkedList<>();
        createUsers();
    }

    private void createUsers() {
        users.add(new User(18,"Filipa Bastos", "filipa@ourgroup.com"));
        users.add(new User(18,"Sara Melo", "sara@ourgroup.com"));
        users.add(new User(18,"Diogo Velho", "diogo@ourgroup.com"));

    }

    public boolean addUser(User user){
        boolean isValidUser=validate(user);

        if(isValidUser){
            users.add(user);
        }
        return isValidUser;
    }

    private boolean validate(User user) {
        if(user == null){
            return false;
        }
        if (user.getName().length()<2){
            return false;
        }
        if (!user.getEmail().contains("@")){
            return false;
        }
        return true;
    }

    public List<User> getUsers(){
        return users;
    }

    public Optional<User> getUserByID(int id){
      return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst();
    }



}
