package cn.seeyourface.template;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 *     考卷模板
 * </p>
 *
 * @author yangLei
 * @date 2023/7/13 14:38
 * @since 1.0.0
 */
@Slf4j
public abstract class TestPaper {

    public void testQuestion1() {
        log.info("杨过得到，后来给了郭靖，炼成倚天剑、屠龙刀的玄铁可能是【】\n" +
                "A.球磨铸铁\n" +
                "B.马口铁\n" +
                "C.高速合金钢\n" +
                "D.碳素纤维");
        log.info("答案：" + answer1());
    }

    public abstract String answer1();

    public void testQuestion2() {
        log.info("杨过、程英、陆无双铲除了情花，造成【】\n" +
                "A.使这种植物不再害人\n" +
                "B.使一种珍稀物种灭绝\n" +
                "C.破坏了那个生物圈的生态平衡\n" +
                "D.造成该地区沙漠化");
        log.info("答案：" + answer2());
    }

    public abstract String answer2();

    public void testQuestion3() {
        log.info("蓝凤凰致使华山师徒、桃谷六仙呕吐不止，如果你是大夫，会给他们开什么药【】\n" +
                "A.阿司匹林\n" +
                "B.牛黄解毒片\n" +
                "C.氟哌酸\n" +
                "D.让他们喝大量的生牛奶\n");
        log.info("答案：" + answer3());
    }

    public abstract String answer3();
}
