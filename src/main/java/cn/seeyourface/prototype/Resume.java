package cn.seeyourface.prototype;

import lombok.Data;

import java.util.Date;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/11 14:28
 * @since 1.1.0
 */
public class Resume implements Cloneable {

    private final String name;
    private String sex;
    private Integer age;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    public void setBaseInfo(String sex, Integer age) {
        this.sex = sex;
        this.age = age;
    }

    @Override
    public Resume clone() {
        try {
            Resume resume = (Resume) super.clone();
            resume.workExperience = this.workExperience.clone();
            return resume;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void setWorkExperience(Date date, String company) {
        this.workExperience.workTime = date;
        this.workExperience.company = company;
    }

    public void display() {
        /*
        以下列格式打印出简历的信息
        张三 男 17
        2019-01-01 2021-01-01 中国移动
         */
        System.out.println(name + " " + sex + " " + age);
        System.out.println(workExperience.getWorkTime() + " " + workExperience.getCompany());
    }

    @Data
    public static class WorkExperience implements Cloneable{

        private Date workTime;
        private String company;

        @Override
        public WorkExperience clone() {
            try {
                // TODO: copy mutable state here, so the clone can't change the internals of the original
                return (WorkExperience) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}
