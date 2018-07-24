package cn.guokai.strategy.base;

import cn.guokai.strategy.enums.OperationEnum;
import cn.guokai.strategy.enums.OperationExtEnum;
import cn.guokai.strategy.interfaces.Operation;

/**
 * Created by guokai on 2018/7/24.
 * 计算器管理类 通过两种模式 测试速率
 * @author guokai
 */
public class OpeationManage {

    public static Operation getOperationByLambda(int value){
        return OperationEnum.getByValue(value).getOperation();
    };

    public static OperationExtEnum getOperationExtEnum(int value){
        return OperationExtEnum.getByValue(value);
    }


}
