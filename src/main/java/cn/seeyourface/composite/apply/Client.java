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
        CheckBranch root = new CheckBranch("检查模板", 100D);
        root.score = root.weight;
        CheckBranch category1 = new CheckBranch("检查类别1", 1D);
        root.addItem(category1);
        CheckBranch content1 = new CheckBranch("检查内容1", 0.5);
        category1.addItem(content1);
        CheckBranch q1 = new CheckBranch("检查问题1", 0.25);
        CheckBranch q2 = new CheckBranch("检查问题2", 0.75);
        content1.addItem(q1);
        content1.addItem(q2);
        CheckItem i1 = new CheckItem("检查项1", 0.4, (byte)1);
        CheckItem i2 = new CheckItem("检查项2", 0.6, (byte)0);
        q1.addItem(i1);
        q1.addItem(i2);
        CheckItem i3 = new CheckItem("检查项3", 0.2, (byte)1);
        CheckItem i4 = new CheckItem("检查项4", 0.4, (byte)1);
        CheckItem i5 = new CheckItem("检查项5", 0.4, (byte)0);
        q2.addItem(i3);
        q2.addItem(i4);
        q2.addItem(i5);
        CheckBranch content2 = new CheckBranch("检查内容2", 0.5);
        category1.addItem(content2);
        CheckBranch q3 = new CheckBranch("检查问题3", 0.5);
        CheckBranch q4 = new CheckBranch("检查问题4", 0.5);
        content2.addItem(q3);
        content2.addItem(q4);
        CheckItem i6 = new CheckItem("检查项6", 0.3, (byte)0);
        CheckItem i7 = new CheckItem("检查项7", 0.7, (byte)1);
        q3.addItem(i6);
        q3.addItem(i7);
        CheckItem i8 = new CheckItem("检查项8", 0.4, (byte)1);
        CheckItem i9 = new CheckItem("检查项9", 0.6, (byte)0);
        q4.addItem(i8);
        q4.addItem(i9);
        root.display((byte)0);
    }
}
