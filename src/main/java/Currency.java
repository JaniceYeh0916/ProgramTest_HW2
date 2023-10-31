public class Currency {
    double amount = 0;  //物件的金額
    String symbol = "";  //物件的幣值

    public static void main(String[] args) {
        Currency nt = new Currency(100, "NT");
        Currency us = new Currency(100, "US");

        Currency sumNT = nt.add(us);
        System.out.println(sumNT.symbol + " " + sumNT.amount);

        Currency sumUS = us.add(nt);
        System.out.println(sumUS.symbol + " " + sumUS.amount);
    }

    //建構子
    //將相關變數初始化
    public Currency(double amount, String symbol) {
        this.amount = amount;
        this.symbol = symbol;
    }

    //add() Function
    //用於計算該總金額與幣值
    //回傳總和物件
    public Currency add(Currency other) {
        double amount = 0;
        String symbol = "";

        Currency sum = new Currency(amount, symbol);

        if (this.symbol.equals("US") && other.symbol.equals("US")) {  //US + US = US
            sum.amount = Math.round((this.amount + other.amount) * 100.0) / 100.0;
            sum.symbol = "US";
        } else if (this.symbol.equals("NT") && other.symbol.equals("NT")) {  //NT + NT = NT
            sum.amount = Math.round((this.amount + other.amount) * 100.0) / 100.0;
            sum.symbol = "NT";
        } else if (this.symbol.equals("NT") && other.symbol.equals("US")) {  //NT + US = NT
            sum.amount = Math.round((this.amount + other.amount * 30) * 100.0) / 100.0;
            sum.symbol = "NT";
        } else if (this.symbol.equals("US") && other.symbol.equals("NT")) {  //US + NT = US
            sum.amount = Math.round((this.amount + other.amount / 30) * 100.0) / 100.0;
            sum.symbol = "US";
        }

        return sum;
    }
}
