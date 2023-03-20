public class Main {
    public static void main(String[] args) {


//        String sum = Shop.returnMoney(1, 2, 0, false, false);//一斤苹果 两斤草莓  总价：34元
//        System.out.println("你需要支付：" + sum + "元");

//        String sum = Shop.returnMoney(1, 2, 3, false, false);//一斤苹果 两斤草莓 三斤芒果  总价：94元
//        System.out.println("你需要支付：" + sum + "元");

//        String sum = Shop.returnMoney(1, 2, 3, false, true);//一斤苹果 两斤草莓 三斤芒果 草莓打8折  总价：88.8元
//        System.out.println("你需要支付：" + sum + "元");

        String sum1 = Shop.returnMoney(1, 3, 3, true, true);//一斤苹果 两斤草莓 三斤芒果 草莓打8折 不满足100减10满减，且参与满减  总价：99.2元
        String sum2 = Shop.returnMoney(1, 2, 4, true, true);//一斤苹果 两斤草莓 四斤芒果 草莓打8折 满足100减10满减，且参与满减  总价：98.8元
        System.out.println("你需要支付：" + sum1 + "元");
        System.out.println("你需要支付：" + sum2 + "元");
    }
}