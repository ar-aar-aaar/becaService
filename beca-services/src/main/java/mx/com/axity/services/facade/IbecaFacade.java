package mx.com.axity.services.facade;

import mx.com.axity.commons.to.UserTO;
import org.apache.catalina.User;

import java.util.List;

public interface IbecaFacade {

    int operation(int sum1, int sum2);
    List<UserTO> getAllUsers();
    void saveUser(UserTO user);
    void deleteUser (int id);
    UserTO readUser (int id);
    void updateUser(UserTO userTO);
}
