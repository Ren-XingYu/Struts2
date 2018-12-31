package x.y.struts2.action.demo2;

import com.opensymphony.xwork2.Action;

/**
 * 实现接口这种方式，提供了五个常量(五个逻辑视图的名称)
 * success：成功
 * error:失败
 * login:登录出错页面跳转
 * input:表单校验的时候出错,跳转视图
 * none:不跳转
 */
public class ActionDemo2 implements Action {
    @Override
    public String execute() throws Exception {
        System.out.println("ActionDemo2 执行了");
        return null;
    }
}
