package com.benonshi.string.cast;

import com.benonshi.string.cast.Model;
import com.benonshi.string.cast.MoneyEnum;

/**
 * @Author: BenOnSHI
 * @Date: 2020/8/7 16:24
 **/
public class CalculationUtils {

    public static void calculation(Model model) {
        final int T_THOUSAND = 10000;
        MoneyEnum[] values = MoneyEnum.values();
        boolean flag = false;
        for (int i = 0; i < values.length; i++) {
            String y = "";
            if (model.getMoreMoney().indexOf('-') > -1) {
                model.setMoreMoney(model.getMoreMoney().substring(1));
                flag = true;
            }
            y = String.valueOf(Integer.parseInt(model.getMoreMoney()) / T_THOUSAND);
            if (y.length() == values[i].getLength()) {
                if (y.length() >= MoneyEnum.HUNDRED_MILLION_THOUSAND.getLength()) {
                    model.setMoreMoney(y.substring(0, y.indexOf('0')) + values[i].getName());
                } else {
                    model.setMoreMoney(y + values[i].getName());
                }
                if (flag) {
                    model.setMoreMoney("-" + model.getMoreMoney());
                }
                return;
            }
        }
    }
}
