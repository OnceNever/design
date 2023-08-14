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

        CompositeCheckItem category1 = new CompositeCheckItem("检查类别1", 40D);
        root.addItem(category1);
        CompositeCheckItem content1 = new CompositeCheckItem("检查内容1", 20D);
        category1.addItem(content1);
        CompositeCheckItem q1 = new CompositeCheckItem("检查问题1", 5D);
        CompositeCheckItem q2 = new CompositeCheckItem("检查问题2", 15D);
        content1.addItem(q1);
        content1.addItem(q2);
        CheckItemImpl i1 = new CheckItemImpl("检查项1", 2D, true);
        CheckItemImpl i2 = new CheckItemImpl("检查项2", 3D, false);
        q1.addItem(i1);
        q1.addItem(i2);
        CheckItemImpl i3 = new CheckItemImpl("检查项3", 5D, true);
        CheckItemImpl i4 = new CheckItemImpl("检查项4", 3D, false);
        CheckItemImpl i5 = new CheckItemImpl("检查项5", 7D, false);
        q2.addItem(i3);
        q2.addItem(i4);
        q2.addItem(i5);
        CompositeCheckItem content2 = new CompositeCheckItem("检查内容2", 20D);
        category1.addItem(content2);
        CompositeCheckItem q3 = new CompositeCheckItem("检查问题1", 10D);
        CompositeCheckItem q4 = new CompositeCheckItem("检查问题2", 10D);
        content2.addItem(q3);
        content2.addItem(q4);
        CheckItemImpl i6 = new CheckItemImpl("检查项6", 5D, false);
        CheckItemImpl i7 = new CheckItemImpl("检查项7", 5D, false);
        q3.addItem(i6);
        q3.addItem(i7);
        CheckItemImpl i8 = new CheckItemImpl("检查项8", 5D, true);
        CheckItemImpl i9 = new CheckItemImpl("检查项9", 5D, true);
        q4.addItem(i8);
        q4.addItem(i9);
        root.display();
    }
}
