package x.y.struts2.action.demo5;

import com.opensymphony.xwork2.ActionSupport;
import x.y.struts2.domain.User;

import java.util.Date;

/**
 * 数据封装方式1：属性驱动-提供属性set方法的方式(不常用)
 */
public class UserAction1 extends ActionSupport {
    private String username;
    private String password;
    private Integer age;
    private Date birthday;
    private Double salary;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String execute() throws Exception {
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        user.setBirthday(birthday);
        user.setSalary(salary);

        System.out.println(user);
        return NONE;
    }
}
