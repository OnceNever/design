package cn.seeyourface.composite;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/22 10:50
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("杭州总公司");
        root.add(new HRDepartment(root.name));
        root.add(new FinanceDepartment(root.name));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment(comp.name));
        comp.add(new FinanceDepartment(comp.name));
        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HRDepartment(comp1.name));
        comp1.add(new FinanceDepartment(comp1.name));
        root.add(comp1);

        ConcreteCompany comp2 = new ConcreteCompany("上海办事处");
        comp2.add(new HRDepartment(comp2.name));
        comp2.add(new FinanceDepartment(comp2.name));
        root.add(comp2);

        System.out.println("结构图：");
        root.display(1);

        System.out.println("职责：");
        root.lineOfDuty();
    }
}
