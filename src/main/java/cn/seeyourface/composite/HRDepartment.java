package cn.seeyourface.composite;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/22 10:44
 * @Version 1.0
 * @Description
 */
@Slf4j
public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name + "人力资源部");
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
        System.out.printf("%s 员工招聘培训管理%n", name);
    }
}
