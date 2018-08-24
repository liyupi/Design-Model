package yupi.com.abstract_factory;

import yupi.com.abstract_factory.common.Computer;
import yupi.com.abstract_factory.common.Factory;
import yupi.com.abstract_factory.common.Master;
import yupi.com.abstract_factory.common.Screen;
import yupi.com.abstract_factory.high.HighFactory;
import yupi.com.abstract_factory.low.LowFactory;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/23 16:07
 */
public class Main
{
    public static void main(String[] args){
        Factory highFactory = Factory.getFactory(HighFactory.class.getName());
        Master highMaster = highFactory.createMaster("拯救者高配主机","8000");
        Screen highScreen = highFactory.createScreen("三星高配屏幕","3000");
        Computer highComputer = highFactory.createComputer(highMaster,highScreen);
        highComputer.printInfo();
        Factory lowFactory = Factory.getFactory(LowFactory.class.getName());
        Master lowMaster = lowFactory.createMaster("拯救者低配主机","5000");
        Screen lowScreen = lowFactory.createScreen("三星低配屏幕","1000");
        Computer lowComputer = lowFactory.createComputer(lowMaster,lowScreen);
        lowComputer.printInfo();
    }
}

