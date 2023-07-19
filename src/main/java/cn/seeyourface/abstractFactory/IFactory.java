package cn.seeyourface.abstractFactory;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/19 10:26
 * @since 1.1.0
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
