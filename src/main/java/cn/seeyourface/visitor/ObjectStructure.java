package cn.seeyourface.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/30 10:55
 * @Version 1.0
 * @Description
 */
public class ObjectStructure {
    private static final List<Element> ELEMENTS = new ArrayList<>();

    public void attach(Element e) {
        ELEMENTS.add(e);
    }

    public void detach(Element e) {
        ELEMENTS.remove(e);
    }

    public void accept(Visitor visitor) {
        ELEMENTS.forEach(e -> e.accept(visitor));
    }
}
