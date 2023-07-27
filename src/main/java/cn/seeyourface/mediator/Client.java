package cn.seeyourface.mediator;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/27 13:43
 * @since 1.1.0
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague c1 = new ConcreteColleague1(mediator, "小李");
        Colleague c2 = new ConcreteColleague2(mediator, "小张");
        Colleague c3 = new ConcreteColleague3(mediator, "小王");

        mediator.register(c1);
        mediator.register(c2);
        mediator.register(c3);

        c1.send("超强台风杜苏芮要来啦，大家出行注意安全！");
    }
}
