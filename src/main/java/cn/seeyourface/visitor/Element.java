package cn.seeyourface.visitor;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/30 10:47
 * @Version 1.0
 * @Description
 */
public abstract class Element {

    protected abstract void accept(Visitor visitor);

}
