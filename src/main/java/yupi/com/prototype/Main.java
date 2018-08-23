package yupi.com.prototype;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/23 12:55
 */
public class Main
{
    public static void main(String[] args){
        // 已有的女人
        Woman woman1 = new BeautifulWoman();
        woman1.setHeight("160cm");
        woman1.setWeight("45kg");
        woman1.setName("杨幂");
        // 克隆三个拥有相同身高体重的女人，再修改她们的姓名
        Woman woman2 = woman1.createClone();
        woman2.setName("杨超越");
        Woman woman3 = woman1.createClone();
        woman3.setName("杨紫");
        Woman woman4 = woman1.createClone();
        woman4.setName("杨树林");
        // 后宫们自我介绍
        woman1.selfIntroduce();
        woman2.selfIntroduce();
        woman3.selfIntroduce();
        woman4.selfIntroduce();
    }
}
