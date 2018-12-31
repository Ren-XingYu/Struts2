package x.y.struts2.action.valuestack;

import com.opensymphony.xwork2.ActionSupport;
import x.y.struts2.domain.Product;
import x.y.struts2.domain.User;

/**
 * 操作ValueStack一：在Action中提供属性的get方法的方式
 */
public class ValueStackDemo2 extends ActionSupport {
    private Product product;

    public Product getProduct() {
        return product;
    }

    @Override
    public String execute() throws Exception {
        //向valuestack中存值
        product=new Product("name",100.0);//可以这样操作是因为默认情况下将action压入值栈
        return SUCCESS;
    }
}
