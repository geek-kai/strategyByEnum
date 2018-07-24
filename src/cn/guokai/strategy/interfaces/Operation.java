package cn.guokai.strategy.interfaces;

/**
 * Created by guokai on 2018/7/24.
 * 计算接口
 */
public interface Operation {
    /**
     * 执行公式
     * @param a
     * @param b
     * @return
     */
    double apply(double a, double b);
}
