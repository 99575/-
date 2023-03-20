import java.math.BigDecimal;

public class Shop {
    //苹果单价
    private static BigDecimal apple = new BigDecimal("8");
    //苹果折扣
    private static BigDecimal appleDiscount = new BigDecimal("1");

    //草莓单价
    private static BigDecimal strawBerry = new BigDecimal("13");
    //草莓折扣
    private static BigDecimal strawBerryDiscount = new BigDecimal("0.8");

    //芒果单价
    private static BigDecimal mango = new BigDecimal("20");
    //芒果折扣
    private static BigDecimal mangoDiscount = new BigDecimal("1");

    //满多少
    private static BigDecimal left = new BigDecimal("100");
    //减多少
    private static BigDecimal right = new BigDecimal("10");

    /**
     * 依次输入
     * 苹果
     * 草莓
     * 芒果
     * 是否满减
     * 是否折扣
     * 购买数量（整数斤），输出当前需要支付的金额
     */
    public static String returnMoney(int appleCount, int strawBerryCountm, int mangoCountm, boolean isfullSub, boolean isDiscount) {

        //苹果折扣后单价
        BigDecimal a1 = returnApple(isDiscount);
        //购买苹果的价格
        BigDecimal b1 = new BigDecimal(appleCount).multiply(a1);

        //草莓折扣后单价
        BigDecimal a2 = returnStrawBerry(isDiscount);
        //购买草莓的价格
        BigDecimal b2 = new BigDecimal(strawBerryCountm).multiply(a2);

        //芒果折扣后单价
        BigDecimal a3 = returnMango(isDiscount);
        //购买芒果的价格
        BigDecimal b3 = new BigDecimal(mangoCountm).multiply(a3);

        //相加汇总，在经过满减，最后输出总价
        return returnSum(b1.add(b2).add(b3), isfullSub).toString();
    }

    /**
     * 输入
     * 总价
     * 是否满减
     * 返回超市满减后的总价
     */
    private static BigDecimal returnSum(BigDecimal sum, boolean isfullSub) {

        //不满减  或者  不大于等于满减金额,直接返回
        if (!isfullSub || sum.compareTo(left) < 0) {
            return sum;
        }

        //满减
        return sum.subtract(right);
    }

    /**
     * 输入是否折扣
     * 返回苹果当前折扣后价格
     */
    private static BigDecimal returnApple(boolean isDiscount) {

        //如果不启用折扣
        if (!isDiscount) {
            return apple;
        }

        return apple.multiply(appleDiscount);
    }

    /**
     * 输入是否折扣
     * 返回草莓当前折扣后价格
     */
    private static BigDecimal returnStrawBerry(boolean isDiscount) {

        //如果不启用折扣
        if (!isDiscount) {
            return strawBerry;
        }

        return strawBerry.multiply(strawBerryDiscount);
    }

    /**
     * 输入是否折扣
     * 返回芒果当前折扣后价格
     */
    private static BigDecimal returnMango(boolean isDiscount) {

        //如果不启用折扣
        if (!isDiscount) {
            return mango;
        }

        return mango.multiply(mangoDiscount);
    }


}
