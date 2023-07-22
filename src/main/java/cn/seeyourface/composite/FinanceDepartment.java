package cn.seeyourface.composite;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/22 10:46
 * @Version 1.0
 * @Description
 */
@Slf4j
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name + "财务部");
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int length) {
        String n = StringUtils.repeat('-', length) + name;
        System.out.println(n);
    }

    @Override
    public void lineOfDuty() {
        System.out.printf("%s 公司财务收支管理%n", name);
    }
}
