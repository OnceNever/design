package cn.seeyourface.state;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/19 21:21
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9.0);
        work.writeProgram();
        work.setHour(10.0);
        work.writeProgram();
        work.setHour(11.0);
        work.writeProgram();
        work.setHour(12.0);
        work.writeProgram();
        work.setHour(13.0);
        work.writeProgram();
        work.setHour(14.0);
        work.writeProgram();
        work.setHour(15.0);
        work.writeProgram();
        work.setHour(16.0);
        work.setFinishedWork(true);
        work.writeProgram();
        work.setHour(17.0);
        work.writeProgram();
        work.setHour(18.0);
        work.writeProgram();
        work.setHour(19.0);
        work.writeProgram();
        work.setHour(20.0);
        work.writeProgram();
        work.setHour(21.0);
        work.writeProgram();
    }
}
