package Test.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Demo {

     public static void main(String[] args) throws Exception{
         Test obj=new Test();

         Class cls=obj.getClass();
         System.out.println("The name class"+ cls.getName());

         Constructor constructor=cls.getConstructor();
         System.out.println("The cons name"+constructor.getName());

         Method[] methods=cls.getMethods();

         for (Method method:methods)
             System.out.println(method.getName());

         Method methodcall1 = cls.getDeclaredMethod("method2",
                 int.class);

         methodcall1.invoke(obj,19);

         Field field=cls.getDeclaredField("s");
         field.setAccessible(true);
         field.set(obj,"JAVA");

         Method methodcall2 = cls.getDeclaredMethod("method1");
         methodcall2.invoke(obj);

         Method methodcall3 = cls.getDeclaredMethod("method3");
         methodcall3.setAccessible(true);
         methodcall3.invoke(obj);
     }


}
