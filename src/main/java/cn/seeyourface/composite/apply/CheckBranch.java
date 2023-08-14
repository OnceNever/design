package cn.seeyourface.composite.apply;

import cn.hutool.core.util.NumberUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/8/14 11:41
 * @since 1.1.0
 */
public class CheckBranch extends CheckLeaf {
    private final List<CheckLeaf> items;

    public CheckBranch(String name, Double weight) {
        super(name, weight);
        this.items = new ArrayList<>();
    }

    @Override
    public double display(Byte type) {
        double s = items.stream().mapToDouble(i -> i.display(type)).sum();
        String n = name + "的得分为：" + s;
        System.out.println(n);
        return s;
    }

    void addItem(CheckLeaf item) {
        item.score = NumberUtil.round(NumberUtil.mul(this.score, item.weight), 2).doubleValue();
        this.items.add(item);
    }
}
