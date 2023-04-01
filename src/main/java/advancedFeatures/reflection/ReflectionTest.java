package advancedFeatures.reflection;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> ball = Class.forName("advancedFeatures.Ball");
        Method[] ballMethods = ball.getMethods();
        Field[] ballField = ball.getDeclaredFields();

//       for (Method method : ballMethods){
//           System.out.println(method);
//       }
        for (Field field : ballField) {
            System.out.println(field);
        }
    }
}
