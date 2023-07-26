package cn.seeyourface.responsilibity;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/26 19:57
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager("经理");
        Majordomo majordomo = new Majordomo("总监");
        GeneralManager generalManager = new GeneralManager("总经理");
        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request r1 = new Request();
        r1.setRequestType("请假");
        r1.setRequestContent("小菜请假");
        r1.setRequestNumber(1);
        commonManager.handlerRequest(r1);

        Request r2 = new Request();
        r2.setRequestType("请假");
        r2.setRequestContent("小菜请假");
        r2.setRequestNumber(5);
        commonManager.handlerRequest(r2);

        Request r3 = new Request();
        r3.setRequestType("加薪");
        r3.setRequestContent("小菜请求加薪");
        r3.setRequestNumber(500);
        commonManager.handlerRequest(r3);

        Request r4 = new Request();
        r4.setRequestType("加薪");
        r4.setRequestContent("小菜请求加薪");
        r4.setRequestNumber(5000);
        commonManager.handlerRequest(r4);
    }
}
