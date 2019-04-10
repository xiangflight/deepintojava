package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用例注解
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version annotation
 * @date 2019-04-10 22:08
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {

    int id();

    String description() default "no description";

}
