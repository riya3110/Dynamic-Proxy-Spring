package dynProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler {

    private Person person;

    public PersonInvocationHandler(Person person){
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("proxy invoke method initiated");
        return null;
    }
}
