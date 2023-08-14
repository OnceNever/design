package cn.seeyourface.composite.apply;


/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/8/14 11:40
 * @since 1.1.0
 */
public abstract class CheckLeaf {
    protected String name;
    protected Double score;
    protected Double weight;
    /* 是否选中 */
    protected Byte checkable;

    public CheckLeaf(String name, Double weight) {
        this(name, weight, (byte)1);
    }

    public CheckLeaf(String name, Double weight, Byte checkable) {
        this.name = name;
        this.weight = weight;
        this.checkable = checkable;
    }

    /**
     *
     * @param type 0 - 展示所勾选核查项分数详情；1 - 展示各级配置分数详情
     */
    public abstract double display(Byte type);
}
