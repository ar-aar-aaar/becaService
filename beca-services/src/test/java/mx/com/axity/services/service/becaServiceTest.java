package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class becaServiceTest extends BaseTest {
    @Test
    public void shouldReturnTheSumOfTwoNumbers(){
        int num1=5;
        int num2=10;

        int result=this.becaService.suma(num1, num2);

        Assert.assertEquals(15, result);
    }
    @Test
    public void shouldReturnTheResOfTwoNumbers(){
        int num1=10;
        int num2=5;

        int result=this.becaService.resta(num1, num2);

        Assert.assertEquals(5, result);
    }
    @Test
    public void shouldReturnTheMulByFour(){
        int num1=5;

        int result=this.becaService.multiplicacion(num1);

        Assert.assertEquals(20, result);
    }
    @Test
    public void shouldReturnTheDivByFour(){
        int num1=24;

        int result=this.becaService.division(num1);

        Assert.assertEquals(6, result);
    }
}
