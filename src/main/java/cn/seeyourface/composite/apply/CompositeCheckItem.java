package cn.seeyourface.composite.apply;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.NumberUtil;
import cn.seeyourface.composite.Company;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/8/14 11:41
 * @since 1.1.0
 */
public class CompositeCheckItem extends CheckItem {
    private final List<CheckItem> items;

    public CompositeCheckItem(String name, Double weight) {
        super(name, weight);
        this.items = new ArrayList<>();
    }

    @Override
    public double display() {
        double s = items.stream().mapToDouble(CheckItem::display).sum();
        String n = name + "的得分为：" + s;
        System.out.println(n);
        return s;
    }

    void addItem(CheckItem item) {
        item.score = NumberUtil.round(NumberUtil.mul(this.score, item.weight), 2).doubleValue();
        this.items.add(item);
    }

    void removeItem(CheckItem item) {
        this.items.remove(item);
    }

    List<CheckItem> getItems() {
        return this.items;
    }
}
