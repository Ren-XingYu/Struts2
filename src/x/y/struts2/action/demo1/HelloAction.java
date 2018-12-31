package x.y.struts2.action.demo1;

public class HelloAction {
    /**
     * 方法签名是固定的
     * public String xxx 方法不能传递参数
     * @return
     */
    public String execute(){
        System.out.println("HelloAction执行了...");
        return "success";
    }
}
