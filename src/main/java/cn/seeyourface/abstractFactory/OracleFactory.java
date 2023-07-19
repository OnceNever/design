package cn.seeyourface.abstractFactory;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/19 10:41
 * @since 1.1.0
 */
public class OracleFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new OracleDepartment();
    }
}
