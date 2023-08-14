package cn.seeyourface.composite.apply;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/8/14 14:33
 * @since 1.1.0
 */
public class CheckItem extends CheckLeaf {
    public CheckItem(String name, Double weight, Byte checkable) {
        super(name, weight, checkable);
    }

    @Override
    public double display(Byte type) {
        return (checkable | type) == 1 ? score : 0D;
    }
}
