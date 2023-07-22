package cn.seeyourface.composite;

import cn.hutool.core.collection.CollUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/22 10:30
 * @Version 1.0
 * @Description
 */
@Slf4j
public class ConcreteCompany extends Company {

    private final List<Company> children;

    public ConcreteCompany(String name) {
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int length) {
        String n = StringUtils.repeat('-', length) + name;
        System.out.println(n);
        if (CollUtil.isEmpty(children))
            return;
        for (Company c : children) {
            c.display(length + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        if (CollUtil.isEmpty(children))
            return;
        children.forEach(Company::lineOfDuty);
    }
}
