package cn.seeyourface.responsilibity;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/26 17:52
 * @since 1.1.0
 */
@Slf4j
public class HeadMan extends Handler {
    @Override
    protected void handlerRequest(int days) {
        if (days <= 1)
            log.info("{}请假审批：结果：{}", "组长", "通过");
        else {
            if (null != successor) {
                setSuccessor(successor);
                log.info("{}权限不足");
            }
        }

    }
}
