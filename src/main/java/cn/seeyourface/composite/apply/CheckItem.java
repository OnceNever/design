package cn.seeyourface.composite.apply;


/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/8/14 11:40
 * @since 1.1.0
 */
public abstract class CheckItem {
    protected String name;
    protected Double score;
    protected Double weight;
    protected Boolean checkable;

    public CheckItem(String name, Double weight) {
        this(name, weight, true);
    }

    public CheckItem(String name, Double weight, Boolean checkable) {
        this.name = name;
        this.weight = weight;
        this.checkable = checkable;
    }

    public abstract double display();
}
