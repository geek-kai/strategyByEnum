package cn.guokai.strategy.enums;

import cn.guokai.strategy.interfaces.Operation;


/**
 * Created by guokai on 2018/7/24.
 * 计算类枚举
 * 利用lambda表达式传递实现 因此实现策略者模式
 */
public enum OperationEnum {
    /**
     * 加法
     */
    ADD((a,b)->a+b,0);
    private Operation operation;

    private int value;

    OperationEnum(Operation operation, int value) {
        this.operation = operation;
        this.value = value;
    }

    public static OperationEnum getByValue(int value) {
        OperationEnum[] types = OperationEnum.values();
        for (OperationEnum type : types) {
            if (type.getValue()==value) {
                return type;
            }
        }
        return null;
    }

    public Operation getOperation() {
        return operation;
    }



    public int getValue() {
        return value;
    }

}
