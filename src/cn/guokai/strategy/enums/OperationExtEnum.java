package cn.guokai.strategy.enums;

import cn.guokai.strategy.interfaces.Operation;


/**
 * Created by guokai on 2018/7/24.
 * 计算类枚举
 * 利用枚举继承函数式接口 实现策略者模式
 */
public enum OperationExtEnum implements Operation {
    /**
     * 加法
     */
    ADD(0){
        @Override
        public double apply(double a, double b) {
            return a+b;
        }
    };
    private int value;

    OperationExtEnum(int value) {
        this.value = value;
    }

    public static OperationExtEnum getByValue(int value) {
        OperationExtEnum[] types = OperationExtEnum.values();
        for (OperationExtEnum type : types) {
            if (type.getValue()==value) {
                return type;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

}
