package cn.seeyourface.iterator;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/23 10:08
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addItem("大鸟");
        aggregate.addItem("小菜");
        aggregate.addItem("老外");
        aggregate.addItem("行李");
        aggregate.addItem("员工");
        aggregate.addItem("小偷");

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            Object current = iterator.next();
            System.out.printf("%s 请买车票！\n", current);
        }
    }
}
