package x.y.struts2.action.demo4;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * 使用Servlet的API的原生方式
 */
public class RequestDemo2 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        HttpServletRequest request=ServletActionContext.getRequest();
        Map<String,String[]> map=request.getParameterMap();
        for (String key:map.keySet()){
            String[] value= (String[]) map.get(key);
            System.out.println(key+"   "+ Arrays.toString(value));
        }
        request.setAttribute("reqName","reqValue");
        request.getSession().setAttribute("sessName","sessValue");
        request.getServletContext().setAttribute("appName","appValue");
        return SUCCESS;
    }
}
