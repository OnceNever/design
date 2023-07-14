package cn.seeyourface.facade;


/**
 * <p>
 *     外观类 门面，将子系统复杂的调用封装起来，对外提供一个简单的接口
 * </p>
 *
 * @author yangLei
 * @date 2023/7/14 15:33
 * @since 1.1.0
 */
public class Facade {

    private final SubSystem1 subSystem1;
    private final SubSystem2 subSystem2;
    private final SubSystem3 subSystem3;
    private final SubSystem4 subSystem4;

     public Facade() {
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
        subSystem3 = new SubSystem3();
        subSystem4 = new SubSystem4();
    }

    public void methodA() {
         subSystem1.method1();
         subSystem2.method2();
    }

    public void methodB() {
         subSystem3.method3();
         subSystem4.method4();
    }
}
