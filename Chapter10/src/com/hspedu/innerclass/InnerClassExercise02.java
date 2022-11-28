package com.hspedu.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        System.out.println(cellphone.getClass());
    }
}


interface Bell{
    void ring();
}
class Cellphone {
    public void alarmClock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();
    }

}