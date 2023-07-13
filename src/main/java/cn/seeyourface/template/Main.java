package cn.seeyourface.template;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/13 15:19
 * @since 1.1.0
 */
public class Main {

    public static void main(String[] args) {
        TestPaper paperA = new PaperA();
        paperA.testQuestion1();
        paperA.testQuestion2();
        paperA.testQuestion3();

        TestPaper paperB = new PaperB();
        paperB.testQuestion1();
        paperB.testQuestion2();
        paperB.testQuestion3();
    }
}
