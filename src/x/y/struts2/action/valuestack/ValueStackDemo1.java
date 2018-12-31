package x.y.struts2.action.valuestack;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

public class ValueStackDemo1 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        /**
         * 获取值栈的方式一
         */
        ValueStack valueStack1= ActionContext.getContext().getValueStack();

        /**
         * 获取值栈的方式一
         */
        ValueStack valueStack2= (ValueStack) ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY );

        System.out.println(valueStack1==valueStack2);
        return NONE;
    }
}
