package com.benonshi.array;


/**
 * 小美想要学习吉他，但是她的精力有限，小美初始学习精力为x，意味着此时学习一个小时可以获得x的知识量，
 * 但是小美一天要学习n小时，如果小美选择学习一小时，那她会获得x知识量，精力会减少a，
 * 如果休息一小时她不会获得知识量，但是会增加b精力，问小美怎么安排学习时间可以获得最大知识量？
 * 输入示例: [x,a,b,n],初始精力为x，学习一小时精力减少a，休息一小时精力增加b，n小时能获得多少知识量
 * <p>
 * 如[10,5,5,3]，初始精力为10，学习一小时精力减少5，休息一小时精力增加5，3小时能获得多少知识量，
 * 此时选择先休息一小时然后学两小时获得知识量最大，即3小时获得知识量分别为[0,15,10]，一共获得25知识量。
 * <p>
 * 作者：LegendaryGZ
 * 链接：https://leetcode-cn.com/circle/discuss/XgwKML/
 * 来源：力扣（LeetCode）
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/15 13:23
 **/
public class MaxKnowledge {
    /**
     * energy : 初始精力
     * sub : 学习减少
     * add : 休息获得
     * time : 学习时间
     *
     * @Author: BenOniShi
     * @Date: 2021/5/15 13:25
     */
    public static int maxKnowledge1(int energy, int sub, int add, int time) {
        return maxKnow(energy, sub, add, time);
    }

    private static int maxKnow(int energy, int sub, int add, int time) {
        if (time == 0) {
            return 0;
        }
        // 学
        int study = Integer.MIN_VALUE;
        if (energy > 0) {
            study = maxKnow(energy - sub, sub, add, time - 1) + energy;
        }
        // 不学
        int noStudy = maxKnow(energy + add, sub, add, time - 1);

        return Math.max(noStudy, study);
    }

    /**
     * description: 等差数列求和最大值求解
     * 休息天数 记为i n记为 h-i
     * a1 即为 e + (i)*a
     * an 即为 a1 - (n-1) * b
     * sn公式 n * （a1+a2） /2
     * 递推每一个 sn 求得最大值即可
     *
     * @Author: BenOniShi
     * @Date: 2021/5/15 17:06
     */
    private static int maxKnowledge2(int energy, int sub, int add, int time) {
        int temp = 0;
        for (int i = 0; i < time; i++) {
            int a1 = energy + (i) * add;
            int an = a1 - (time - i - 1) * sub;
            int sn = ((time - i) * (a1 + an)) / 2;
            temp = Math.max(sn, temp);
        }
        return temp;
    }

    public static void main(String[] args) {
        int i = maxKnowledge1(25, 5, 5, 3);
        int j = maxKnowledge2(10, 5, 5, 3);
        System.out.println(i);
        System.out.println(j);
    }
}
