package x.y.struts2.action.demo4;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * 接口注入的方式
 */
public class RequestDemo3 extends ActionSupport implements ServletRequestAware, ServletContextAware {

    private HttpServletRequest request;
    private ServletContext context;

    @Override
    public String execute() throws Exception {
        Map<String,String[]> map=request.getParameterMap();
        for (String key:map.keySet()){
            String[] value= (String[]) map.get(key);
            System.out.println(key+"   "+ Arrays.toString(value));
        }
        request.setAttribute("reqName","reqValue");
        request.getSession().setAttribute("sessName","sessValue");
        context.setAttribute("appName","appValue");
        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request=httpServletRequest;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.context=servletContext;
    }
}
