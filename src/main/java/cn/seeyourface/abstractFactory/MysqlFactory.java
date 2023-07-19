package cn.seeyourface.abstractFactory;


/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/19 10:44
 * @since 1.1.0
 */
public class MysqlFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MysqlDepartment();
    }
}
