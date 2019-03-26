package ua.kiev.sa;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TextServiceInvocationHandler implements InvocationHandler {

    private Service target;

    public TextServiceInvocationHandler(Service target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String pattern = "server.port = ${port}";
        return pattern.replace("${port}", (CharSequence) method.invoke(target, args));
    }
}
