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
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    protected void handlerRequest(Request request) {
       if ("请假".equals(request.getRequestType()) && request.getRequestNumber() <= 1) {
           log.info("{}:{} 数量:{} 被批准。", request.getRequestType(), request.getRequestContent(), request.getRequestNumber());
       } else {
        if (superior != null)
            superior.handlerRequest(request);
       }
    }
}
