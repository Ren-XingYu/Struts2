package x.y.struts2.action.demo2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 推荐使用
 * 提供了数据校验、国际化等一系列操作的方法
 */
public class ActionDemo3 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("ActionDemo3 执行了");
        return NONE;
    }
}
