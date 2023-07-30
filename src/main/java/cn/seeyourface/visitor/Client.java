package cn.seeyourface.visitor;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/30 10:58
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        Visitor v1 = new ConcreteVisitor1();
        Visitor v2 = new ConcreteVisitor2();

        objectStructure.accept(v1);
        objectStructure.accept(v2);
    }
}
