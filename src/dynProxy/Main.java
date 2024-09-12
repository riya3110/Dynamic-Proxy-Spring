package dynProxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        Man mohan = new Man("Mohan",30,"delhi","india");
        ClassLoader mohanClassLoader = mohan.getClass().getClassLoader();
        Class[] interfaces = mohan.getClass().getInterfaces();
        Person proxymohan = (Person) Proxy.newProxyInstance(mohanClassLoader, interfaces, new PersonInvocationHandler(mohan));
        proxymohan.introduce(mohan.getName());

    }
}