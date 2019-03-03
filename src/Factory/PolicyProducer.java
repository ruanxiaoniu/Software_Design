package Factory;

import Insurance.AutoInsurance;

/**
 * 工厂类接口
 */
public interface PolicyProducer {
    public AutoInsurance getInsureObj();
}
