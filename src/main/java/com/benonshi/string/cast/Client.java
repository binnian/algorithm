package com.benonshi.string.cast;


/**
 * @Author: BenOnSHI
 * @Date: 2020/8/7 16:39
 **/
public class Client {

    public static void main(String[] args) {
        Model model1 = new Model("-50000");
        Model model2 = new Model("-567891");
        Model model3 = new Model("5000000");
        Model model4 = new Model("50000000");
        Model model5 = new Model("-500000000");
//        Model model6 = new Model("5000000000");
//        Model model7 = new Model("50000000000");
        CalculationUtils.calculation(model1);
        CalculationUtils.calculation(model2);
        CalculationUtils.calculation(model3);
        CalculationUtils.calculation(model4);
        CalculationUtils.calculation(model5);
//        CalculationUtils.calculation(model6);
//        CalculationUtils.calculation(model7);
        System.out.println(model1.getMoreMoney());
        System.out.println(model2.getMoreMoney());
        System.out.println(model3.getMoreMoney());
        System.out.println(model4.getMoreMoney());
        System.out.println(model5.getMoreMoney());
//        System.out.println(model6.getMoreMoney());
//        System.out.println(model7.getMoreMoney());
    }
}
