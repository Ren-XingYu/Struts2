package x.y.struts2.action.demo7;

import com.opensymphony.xwork2.ActionSupport;

public class ActionInterceptor extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("ActionInterceptor执行");
        return SUCCESS;
    }
}
