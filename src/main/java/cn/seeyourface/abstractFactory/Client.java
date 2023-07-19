package cn.seeyourface.abstractFactory;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/19 11:45
 * @since 1.1.0
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        IFactory factory = new MysqlFactory();
        IUser iUser = factory.createUser();

        iUser.insert(user);
        iUser.getUser(1);
    }
}
