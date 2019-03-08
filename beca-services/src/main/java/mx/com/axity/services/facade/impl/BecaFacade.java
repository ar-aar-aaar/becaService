package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.LoginTO;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.LoginDO;
import mx.com.axity.model.UserDO;
import mx.com.axity.services.facade.IbecaFacade;
import mx.com.axity.services.service.IbecaService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.List;

@Component
public class BecaFacade implements IbecaFacade {

    @Autowired
    private IbecaService becaService;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public int operation(int a, int b) {
        int c= this.becaService.suma(a, b);
        b = this.becaService.resta(c, a);
        int d = this.becaService.multiplicacion(b);
        return this.becaService.division(d);
    }

    @Override
    public List<UserTO> getAllUsers() {
        List<UserDO>userDOList = this.becaService.getAllUsers();
        Type userTOType = new TypeToken<List<UserTO>>() {}.getType();
        List<UserTO> result = this.modelMapper.map(userDOList, userTOType);
        return result;
    }

    @Override
    public void saveUser(UserTO userTO) {
        UserDO userDO = modelMapper.map(userTO, UserDO.class);
        this.becaService.createUser(userDO);

    }

    @Override
    public void deleteUser(int id) {
        this.becaService.deleteUser(id);
        return;
    }

    @Override
    public UserTO readUser(int id) {
        UserDO userDO=this.becaService.readUser(id);
        UserTO userTO=modelMapper.map(userDO, UserTO.class);
        return userTO;
    }

    @Override
    public void updateUser(UserTO userTO) {
        this.becaService.readUser(userTO.getId());
        UserDO userDO = modelMapper.map(userTO, UserDO.class);
        this.becaService.updateUser(userDO);
    }

    @Override
    public void saveLogin(LoginTO loginTO) {
        LoginDO loginDO = modelMapper.map(loginTO, LoginDO.class);
        this.becaService.createLogin(loginDO);

    }

    @Override
    public void deleteLogin(int id) {
        this.becaService.deleteLogin(id);
        return;

    }

    @Override
    public LoginTO readLogin(int id) {
        LoginDO loginDO=this.becaService.readLogin(id);
        LoginTO loginTO=modelMapper.map(loginDO, LoginTO.class);
        return loginTO;
    }

    @Override
    public void updateLogin(LoginTO loginTO) {
        this.becaService.readUser(loginTO.getId());
        LoginDO loginDO = modelMapper.map(loginTO, LoginDO.class);
        this.becaService.updateUser(loginDO);

    }


}
