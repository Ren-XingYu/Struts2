package x.y.struts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class InterceptorDemo2 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("InterceptorDemo2开始执行");
        String obj=actionInvocation.invoke();
        System.out.println("InterceptorDemo2执行结束");
        return obj;
    }
}
