package mx.com.axity.services.service.impl;

import mx.com.axity.model.UserDO;
import mx.com.axity.persistence.UserDAO;
import mx.com.axity.services.service.IbecaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class becaServiceImpl implements IbecaService {

    static final Logger LOG = LogManager.getLogger(becaServiceImpl.class);

    @Autowired
    UserDAO userDAO;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public int suma(int sum1, int sum2) {
        return sum1+sum2;
    }

    @Override
    public int resta(int res1, int res2) {
        return res1-res2;
    }

    @Override
    public int multiplicacion(int mul) {
        return mul*4;
    }

    @Override
    public int division(int div) {
        return div/4;
    }

    @Override
    public List<UserDO> getAllUsers() {
        return (List<UserDO>) this.userDAO.findAll();

    }

    @Override
    public void createUser(UserDO userDO) {
        userDO = this.userDAO.save(userDO);
    }

    @Override
    public void deleteUser(int id) {
        this.userDAO.deleteById((long) id);
    }

    @Override
    public UserDO readUser(int id) {
        return this.userDAO.findById((long) id).get();
    }

    @Override
    public void updateUser(UserDO userDO) {
        this.userDAO.save(userDO);
    }


}
