package x.y.struts2.action.demo5;

import com.opensymphony.xwork2.ActionSupport;
import x.y.struts2.domain.User;

import java.util.Date;

/**
 * 数据封装方式2：属性驱动-在页面中提供表达式的方式
 */
public class UserAction2 extends ActionSupport {

    //提供一个user对象
    private User user;
    //提供user的set和get方法,一定要提供get方法


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return NONE;
    }
}
