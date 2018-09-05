package com.test.jdk;

import com.test.bean.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {

    public static void main(String[] args) throws Throwable {
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      Class clazz = classLoader.loadClass("com.test.bean.Car");
      Car car = (Car) clazz.newInstance();
      Field color = clazz.getDeclaredField("color");
      color.setAccessible(true);
      color.set(car, "黑色");
      Field name = clazz.getDeclaredField("name");
      name.setAccessible(true);
      name.set(car, "法拉利");

      Method method = clazz.getMethod("introduce", (Class[])null);
      method.invoke(car, (Object[]) null);
    }

    public static Car createCar() throws Throwable {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        /*Class clazz = loader.loadClass("com.test.bean.Car");*/
        Class clazz = loader.loadClass("com.test.bean.Car");

        //创建对象car

        Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) cons.newInstance();

        Method method = clazz.getMethod("setName", String.class);
        method.invoke(car, "宝马");
        Method method1 = clazz.getMethod("setColor", String.class);
        method1.invoke(car, "红色");

        return car;
    }
}
