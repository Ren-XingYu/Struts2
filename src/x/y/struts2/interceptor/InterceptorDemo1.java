package x.y.struts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class InterceptorDemo1 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("InterceptorDemo1开始执行");
        String obj=actionInvocation.invoke();
        System.out.println("InterceptorDemo1执行结束");
        return obj;
    }
}
