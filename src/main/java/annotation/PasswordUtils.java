package annotation;

import java.util.List;

/**
 * 用例注解的使用
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version annotation
 * @date 2019-04-10 22:13
 */

public class PasswordUtils {

    /**
     * 验证密码合法性
     *
     * @param password 传入的密码
     * @return 是否合法
     */
    @UseCase(id = 47, description = "Passwords must contain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    /**
     * 加密密法
     *
     * @param password 传入的密码
     * @return 加密后的密码
     */
    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    /**
     * 验证新密码是否合法
     *
     * @param prevPasswords 之前输入的密码集合
     * @param password 传入的密码
     * @return 是否合法
     */
    @UseCase(id = 49, description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
