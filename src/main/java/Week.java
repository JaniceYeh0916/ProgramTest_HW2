//package org.example

public class Week {
    int month = 0;  //物件的月份
    int day = 0;  //物件的日期

    public static void main(String[] args) throws WrongException {
        Week date = new Week(9, 16);
        String week = date.checkWeek();

        System.out.println(date.month + "/" + date.day + "是" + week);
    }

    //建構子
    //將相關變數初始化
    public Week(int month, int day) {
        this.month = month;
        this.day = day;
    }

    //checkWeek() Function
    //用於計算該日期為星期幾
    //檢查數值是否合理，若不合理拋出例外處理
    //回傳星期幾 (type:String)
    public String checkWeek() throws WrongException {
        //設定每月天數
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //檢查月份是否小於1或大於12
        if (month < 1 || month > 12) {
            throw new WrongException();
        }
        //檢查日期是否小於1或大於該月最大日期
        if (day < 1 || day > monthDays[month - 1]) {
            throw new WrongException();
        }

        //計算前幾個月的天數總和，並加上day
        int totalDay = day;
        for (int i = 0; i < (month - 1); i++) {
            totalDay += monthDays[i];
        }

        //計算星期幾
        int week = (totalDay + 4) % 7;

        //根據結果回傳對應字串
        if (week == 1) {
            return "星期一";
        } else if (week == 2) {
            return "星期二";
        } else if (week == 3) {
            return "星期三";
        } else if (week == 4) {
            return "星期四";
        } else if (week == 5) {
            return "星期五";
        } else if (week == 6) {
            return "星期六";
        } else if (week == 0) {
            return "星期日";
        }
        return null;
    }

    class WrongException extends Exception {

        //發生錯誤，告知使用者系統的錯誤訊息
        public WrongException(String title) {
            super(title);
        }

        //發生錯誤，告知使用者輸入的數值中有錯誤之數值
        public WrongException() {
            super("Invalid value");
        }
    }
}
