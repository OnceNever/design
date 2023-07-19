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

        /*
            抽象工厂模式创建
         */
        IFactory factory = new MysqlFactory();
        IUser iUser = factory.createUser();
        iUser.insert(user);
        iUser.getUser(1);

        /*
            简单工厂 + 反射代替抽象工厂
            移除了IFactory接口和具体工厂类，取而代之的是DataAccess类，客户端不再需要直接实例化具体工厂类。
            简单工厂中通过定义type使用switch来决定实例化的对象，这里使用反射+配置文件来代替switch
         */
        DataAccess dataAccess = new DataAccess();
        IDepartment iDepartment = dataAccess.createDepartment();
        iDepartment.insert(department);
        iDepartment.getDepartment(1);
    }
}
