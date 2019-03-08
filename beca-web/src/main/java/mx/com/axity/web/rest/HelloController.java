package mx.com.axity.web.rest;

import io.swagger.annotations.Api;
import mx.com.axity.commons.to.LoginTO;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.IbecaFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.postgresql.translation.messages_bg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("beca")
@Api(value="beca", description="Operaciones con beca")
public class HelloController {

    static final Logger LOG = LogManager.getLogger(HelloController.class);


    @Autowired
    IbecaFacade IbecaFacade;

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<UserTO>> getAllUsers() {
        LOG.info("Se invoca /users");
        List<UserTO> users = this.IbecaFacade.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }


    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveUser(@RequestBody UserTO userTO) {
        LOG.info("User");
        LOG.info(userTO.getId());
        LOG.info(userTO.getName());
        LOG.info(userTO.getLastName());
        LOG.info(userTO.getAge());
        LoginTO loginTO= new LoginTO();
        loginTO.setPassword(userTO.getPassword());
        loginTO.setUsername(userTO.getPassword());
        userTO.setLoginTO(loginTO);
        this.IbecaFacade.saveUser(userTO);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity updateUser(@RequestBody UserTO userTO) {

        LOG.info("User");
        LOG.info(userTO.getName());
        LOG.info(userTO.getLastName());
        LOG.info(userTO.getId());
        LOG.info(userTO.getAge());


        this.IbecaFacade.updateUser(userTO);


        return new ResponseEntity<> (HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity findUser(@RequestParam(value = "id") int id) {
        LOG.info("User id");
        LOG.info(id);
        UserTO userTO = this.IbecaFacade.readUser(id);
        LOG.info("User");
        LOG.info(userTO.getName());
        LOG.info(userTO.getLastName());
        LOG.info(userTO.getAge());

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity deleteUser(@RequestParam(value = "id") int id) {
        LOG.info("User id");
        LOG.info(id);
        this.IbecaFacade.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity test() {
        LOG.info("Se invoca /test");
        return new ResponseEntity<>("Prueba Ok", HttpStatus.OK);
    }

    @RequestMapping (value = "/operation", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity operation(){
        int result = this.IbecaFacade.operation(5, 10);
        LOG.info("Se invoca /operation");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

