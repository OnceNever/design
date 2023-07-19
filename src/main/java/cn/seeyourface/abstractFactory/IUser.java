package cn.seeyourface.abstractFactory;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/19 10:27
 * @since 1.1.0
 */
public interface IUser {

    void insert(User user);

    User getUser(int id);
}
