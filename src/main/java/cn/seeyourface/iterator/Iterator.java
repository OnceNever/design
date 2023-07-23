package cn.seeyourface.iterator;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/23 9:55
 * @Version 1.0
 * @Description
 */
public interface Iterator {

    Object getFirst();

    boolean hasNext();

    Object next();

    Object current();
}
