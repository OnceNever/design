package cn.seeyourface.iterator;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/23 9:58
 * @Version 1.0
 * @Description
 */
@Getter
public class ConcreteAggregate implements Aggregate {
    private final List<Object> items = new ArrayList<>();

    @Override
    public Iterator iterator() {
        // 加一个头节点
        items.add(new Object());
        return new ConcreteIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Object get(int index) {
        return index >= items.size() ? null : items.get(index);
    }

    public void addItem(Object i) {
        this.items.add(i);
    }

}
