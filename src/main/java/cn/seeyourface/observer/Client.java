package cn.seeyourface.observer;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/17 17:21
 * @since 1.1.0
 */
public class Client {

    public static void main(String[] args) {
        Observable boss = new Boss();
        Observer manager = new Manager("老张", boss);
        Observer employee = new Employee("小李", boss);
        boss.addObserver(manager);
        boss.addObserver(employee);
        boss.setState(true);
        boss.setState(false);
    }
}
