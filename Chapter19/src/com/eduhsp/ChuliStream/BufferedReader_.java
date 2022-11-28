package com.eduhsp.ChuliStream;

/*
做成处理流
* */
public class BufferedReader_ extends Reader_ {
    private Reader_ reader_; //一个私有属性

    //构造器中可以接受 reader_的子类
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    //扩展方法 : 多次读取文件
    public void read(int num) {
        for (int i = 0; i < num; i++) {
            reader_.read();
        }
    }

    @Override
    public void read() {

    }
}
