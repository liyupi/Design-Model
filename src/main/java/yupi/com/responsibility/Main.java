package yupi.com.responsibility;

/**
 * 功能描述：测试类
 *
 * @author Yupi Li
 * @date 2018/08/31 16:28
 */
public class Main
{
    public static void main(String[] args){
        // 构建责任链
        Resolver resolver = new FirstResolver("数学专家");
        resolver.setNext(new SecondResolver("语文专家")).setNext(new FinalResolver("英语专家"));
        Problem problem1 = new Problem("数学题",1);
        Problem problem2 = new Problem("语文题",2);
        Problem problem3 = new Problem("英语题",3);
        Problem problem4 = new Problem("计算机题",4);
        resolver.solveStep(problem1);
        System.out.println();
        resolver.solveStep(problem2);
        System.out.println();
        resolver.solveStep(problem3);
        System.out.println();
        resolver.solveStep(problem4);
        System.out.println();
    }
}
