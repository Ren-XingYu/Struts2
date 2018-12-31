package x.y.struts2.action.demo5;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import x.y.struts2.domain.User;

/**
 * 数据封装方式3：模型驱动
 */
public class UserAction3 extends ActionSupport implements ModelDriven<User> {

    //模型驱动使用的对象：前提必须手动提供对象的实例
    private User user=new User();

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return NONE;
    }

    @Override
    public User getModel() {
        return user;
    }
}
