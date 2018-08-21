package yupi.com.adapter;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/21 15:53
 */
public class Main
{
    public static void main(String[] args){
        // 我们已有的二孔插头
        TwoHolesPlug twoHolesPlug = new TwoHolesPlug();
        System.out.println("继承模式适配器");
        ThreeHolesPlug threeHolesPlug = new GongNiuAdapterExtend();
        threeHolesPlug.chargingWithThreeHoles();
        System.out.println();
        System.out.println("委托模式适配器");
        ThreeHolesPlug threeHolesPlug1 = new GongNiuAdapterEntrust(twoHolesPlug);
        threeHolesPlug1.chargingWithThreeHoles();
    }
}
