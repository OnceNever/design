package cn.seeyourface.responsilibity;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/26 19:54
 * @Version 1.0
 * @Description
 */
@Slf4j
public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    protected void handlerRequest(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getRequestNumber() <= 3) {
            log.info("{}:{} 数量:{} 被批准。", request.getRequestType(), request.getRequestContent(), request.getRequestNumber());
        } else {
            if (superior != null)
                superior.handlerRequest(request);
        }
    }
}
