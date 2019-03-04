package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import java.util.List;

public interface IbecaService {

    List<UserTO> getUsers();
    int suma(int sum1, int sum2);
    int resta (int res1, int res2);
    int multiplicacion(int mul);
    int division (int div);
}
