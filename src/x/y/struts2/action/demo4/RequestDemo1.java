package x.y.struts2.action.demo4;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Map;

public class RequestDemo1 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        //接收数据
        ActionContext context=ActionContext.getContext();
        Map<String,Object> map=context.getParameters();
        for (String key:map.keySet()){
            String[] value= (String[]) map.get(key);
            System.out.println(key+"   "+ Arrays.toString(value));
        }

        context.put("reqName","reqValue");//向request中存值
        context.getSession().put("sessName","sessValue");//向session中存入数据
        context.getApplication().put("appName","appValue");//向application中存入数据
        return SUCCESS;
    }
}
