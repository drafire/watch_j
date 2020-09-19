package com.drafire.watch.model;

/**
 * 训练模型
 */
public class Pratice {
    //呼吸类型
    private String type;
    //时间
    private int time;
    //时间类型
    private int timeType;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTimeType() {
        return timeType;
    }

    public void setTimeType(int timeType) {
        this.timeType = timeType;
    }

    public Pratice(String type, int time, int timeType) {
        this.type = type;
        this.time = time;
        this.timeType = timeType;
    }

    @Override
    public String toString() {
        return "Pratice{" +
                "type='" + type + '\'' +
                ", time=" + time +
                ", timeType=" + timeType +
                '}';
    }
}
