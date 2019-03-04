package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaService {


    int suma(int sum1, int sum2);
    int resta (int res1, int res2);
    int multiplicacion(int mul);
    int division (int div);
    List<UserDO> getAllUsers();
    void createUser(UserDO userDO);
    void deleteUser(int id);
    UserDO readUser (int id);
    void updateUser(UserDO userDO);
}
