import java.time.LocalDate;

public class Tomorrow {
    int year = 0;  //物件的年份
    int month = 0;  //物件的月份
    int day = 0;  //物件的日

    public static void main(String[] args) {
        Tomorrow test = new Tomorrow("2023-09-16");
        System.out.println(test.checkTomorrow());
    }

    //建構子
    //將相關變數初始化
    public Tomorrow(String data){
        String[] date = data.split("-");

        this.year = Integer.parseInt(date[0]);
        this.month = Integer.parseInt(date[1]);
        this.day = Integer.parseInt(date[2]);
    }

    //checkTomorrow() Function
    //用於計算該日期的後一天
    //回傳隔天的日期(yyyy-mm-dd) (type:String)
    public String checkTomorrow(){
        LocalDate today = LocalDate.of(this.year , this.month , this.day);
        LocalDate tomorrow = today.plusDays(1);
        return tomorrow.toString();
    }
}
