package cn.seeyourface.visitor;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/30 10:49
 * @Version 1.0
 * @Description
 */
public class ConcreteElementB extends Element {
    @Override
    protected void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
