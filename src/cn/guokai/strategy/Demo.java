package cn.guokai.strategy;

import cn.guokai.strategy.base.OpeationManage;

/**
 * Created by guokai on 2018/7/24.
 */
public class Demo {

    /**
     * 性能测试 利用枚举实现接口效率最高
     * @param args
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        double apply = OpeationManage.getOperationByLambda(0).apply(10, 20);
        System.out.println(apply);
        long end = System.currentTimeMillis();
        System.out.println("lambda 时间" + (end - start));

        long start2 = System.currentTimeMillis();
        double apply1 = OpeationManage.getOperationExtEnum(0).apply(10, 20);
        System.out.println(apply1);
        long end2 = System.currentTimeMillis();
        System.out.println("EXT 时间" + (end2 - start2));


    }
}
