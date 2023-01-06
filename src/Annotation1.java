import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Myannotation(name="张三")
public class Annotation1 {
    public static void main(String[] args) {
        Annotation1 annotation1=new Annotation1();
        annotation1.testMethod();
    }

    @Myannotation(name="李四")    //设name的
    @Myannotation2("赵五")    //设value的
    void testMethod(){
        System.out.println("hello world");
    }
}

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)  //RUNTIME > CLASS > SOURCE
@interface Myannotation{        //注解的参数   参数类型 + 参数名（）
    String name() default "";
}

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)  //RUNTIME > CLASS > SOURCE
@interface Myannotation2{        //注解的参数   参数类型 + 参数名（）
    String value();   //value为默认，就不用写xxx=“xx”
}