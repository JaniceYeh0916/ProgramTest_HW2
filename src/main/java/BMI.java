//package org.example

public class BMI {
    double height = 0;  //物件的身高(m)
    double weight = 0;  //物件的體重(kg)

    public static void main(String[] args) {
        BMI user = new BMI(1.56, 53);
        double bmi = user.setBmi();
        System.out.println("BMI : " + bmi);
    }

    //建構子
    //將相關變數初始化
    public BMI(double height , double weight){
        this.height = height;
        this.weight = weight;
    }

    //setBmi() Function
    //用於計算BMI值，並取值取到小數點後第二位
    //回傳BMI值 (type:double)
    public double setBmi(){
        double bmi = Math.round((weight / (height * height)) * 100.0) / 100.0;
        return bmi;
    }
}
