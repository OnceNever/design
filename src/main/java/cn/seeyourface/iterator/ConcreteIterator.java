package cn.seeyourface.iterator;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/23 9:58
 * @Version 1.0
 * @Description
 */
public class ConcreteIterator implements Iterator {

    private final ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.aggregate = concreteAggregate;
    }

    @Override
    public Object getFirst() {
        return aggregate.get(0);
    }

    @Override
    public boolean hasNext() {
        return current < aggregate.getItems().size() - 1;
    }

    @Override
    public Object next() {
        return aggregate.get(current++);
    }

    @Override
    public Object current() {
        return aggregate.get(current);
    }
}
