package x.y.struts2.action.valuestack;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;
import x.y.struts2.domain.Product;

/**
 * 操作ValueStack二：调用值栈中的方法
 */
public class ValueStackDemo3 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        //向valuestack中存值
        ValueStack valueStack= ActionContext.getContext().getValueStack();
        //使用两个方法：push(Object obj)，set(String key,Object obj)
        Product product=new Product("abc",100.0);
        valueStack.push(product);//product在栈顶
        valueStack.set("xyz","xyz");

        ServletActionContext.getRequest().setAttribute("reqName","reqValue");
        return SUCCESS;
    }
}
