package mx.com.axity.services.facade;

import mx.com.axity.commons.to.LoginTO;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import org.apache.catalina.User;

import java.util.List;

public interface IbecaFacade {

    int operation(int sum1, int sum2);
    List<UserTO> getAllUsers();
    void saveUser(UserTO user);
    void deleteUser (int id);
    UserTO readUser (int id);
    void updateUser(UserTO userTO);

    void saveLogin(LoginTO loginTO);
    void deleteLogin (int id);
    LoginTO readLogin (int id);
    void updateLogin(LoginTO loginTO);
}
