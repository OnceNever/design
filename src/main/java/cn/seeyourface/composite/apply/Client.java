package cn.seeyourface.composite.apply;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/8/14 14:30
 * @since 1.1.0
 */
public class Client {
    public static void main(String[] args) {
        CompositeCheckItem root = new CompositeCheckItem("检查模板", 100D);
        root.score = root.weight;
        CompositeCheckItem category1 = new CompositeCheckItem("检查类别1", 1D);
        root.addItem(category1);
        CompositeCheckItem content1 = new CompositeCheckItem("检查内容1", 0.5);
        category1.addItem(content1);
        CompositeCheckItem q1 = new CompositeCheckItem("检查问题1", 0.25);
        CompositeCheckItem q2 = new CompositeCheckItem("检查问题2", 0.75);
        content1.addItem(q1);
        content1.addItem(q2);
        CheckItemImpl i1 = new CheckItemImpl("检查项1", 0.4, true);
        CheckItemImpl i2 = new CheckItemImpl("检查项2", 0.6, false);
        q1.addItem(i1);
        q1.addItem(i2);
        CheckItemImpl i3 = new CheckItemImpl("检查项3", 0.2, true);
        CheckItemImpl i4 = new CheckItemImpl("检查项4", 0.4, false);
        CheckItemImpl i5 = new CheckItemImpl("检查项5", 0.4, false);
        q2.addItem(i3);
        q2.addItem(i4);
        q2.addItem(i5);
        CompositeCheckItem content2 = new CompositeCheckItem("检查内容2", 0.5);
        category1.addItem(content2);
        CompositeCheckItem q3 = new CompositeCheckItem("检查问题1", 0.5);
        CompositeCheckItem q4 = new CompositeCheckItem("检查问题2", 0.5);
        content2.addItem(q3);
        content2.addItem(q4);
        CheckItemImpl i6 = new CheckItemImpl("检查项6", 0.3, false);
        CheckItemImpl i7 = new CheckItemImpl("检查项7", 0.7, false);
        q3.addItem(i6);
        q3.addItem(i7);
        CheckItemImpl i8 = new CheckItemImpl("检查项8", 0.4, true);
        CheckItemImpl i9 = new CheckItemImpl("检查项9", 0.6, true);
        q4.addItem(i8);
        q4.addItem(i9);
        root.display();
    }
}
