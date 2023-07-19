package cn.seeyourface.abstractFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/19 11:41
 * @since 1.1.0
 */
@Slf4j
public class OracleDepartment implements IDepartment{
    @Override
    public void insert(Department department) {
        log.info("在Oracle中插入一条Department数据");
    }

    @Override
    public Department getDepartment(int id) {
        log.info("查询一条Oracle中id为：{}的Department记录", id);
        return null;
    }
}
