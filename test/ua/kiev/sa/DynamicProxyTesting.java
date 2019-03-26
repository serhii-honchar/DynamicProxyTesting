package ua.kiev.sa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Proxy;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class DynamicProxyTesting {


    @Test
    public void testDynamicProxyTesting() {
        Service target=new TextService();
        Service proxyInstance = (Service) Proxy.newProxyInstance(Service.class.getClassLoader(),
                new Class[]{Service.class},
                new TextServiceInvocationHandler(target));
        assertEquals("server.port = 8080", proxyInstance.variable(String.valueOf(8080)));
    }
}
