package cn.seeyourface.responsilibity;

import lombok.Data;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/26 19:47
 * @Version 1.0
 * @Description
 */
@Data
public class Request {

    // 请求类型
    private String requestType;
    // 请求内容
    private String requestContent;
    // 请求数量
    private Integer requestNumber;
}
