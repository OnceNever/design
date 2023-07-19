package cn.seeyourface.abstractFactory;

import lombok.SneakyThrows;

import java.util.ResourceBundle;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/19 14:24
 * @since 1.1.0
 */
public class DataAccess {

    private static final String DB;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("Config");
        DB = bundle.getString("abstractFactory.DB");
    }

    @SneakyThrows
    public IUser createUser() {
        String className = "cn.seeyourface.abstractFactory." + DB + "User";
        return (IUser) Class.forName(className).getDeclaredConstructor().newInstance();
    }

    @SneakyThrows
    public IDepartment createDepartment() {
        String className = "cn.seeyourface.abstractFactory." + DB + "Department";
        return (IDepartment) Class.forName(className).getDeclaredConstructor().newInstance();
    }
}
