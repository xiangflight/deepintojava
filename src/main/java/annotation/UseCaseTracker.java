package annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * PasswordUtils的注解处理器
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version annotation
 * @date 2019-04-11 22:58
 */

public class UseCaseTracker {
    /**
     * 跟踪使用UseCase注解的用例
     *
     * @param useCases 用例id列表
     * @param cl 注解Class
     */
    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m: cl.getDeclaredMethods()) {
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Found Use Case: " + uc.id() + " " + uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for (int i: useCases) {
            System.out.println("Warning: Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        trackUseCases(useCases, PasswordUtils.class);
    }
}
