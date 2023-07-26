package cn.seeyourface.responsilibity;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/26 19:55
 * @Version 1.0
 * @Description
 */
@Slf4j
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    protected void handlerRequest(Request request) {
        if ("请假".equals(request.getRequestType())) {
            log.info("{}:{} 数量:{} 被批准。", request.getRequestType(), request.getRequestContent(), request.getRequestNumber());
        } else if ("加薪".equals(request.getRequestType()) && request.getRequestNumber() <= 500) {
            log.info("{}:{} 数量:{} 被批准。", request.getRequestType(), request.getRequestContent(), request.getRequestNumber());
        } else {
            log.info("{}:{} 数量:{} 对不起，做不到。", request.getRequestType(), request.getRequestContent(), request.getRequestNumber());
        }
    }
}
