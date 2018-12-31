package x.y.struts2.ognldemo;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;
import x.y.struts2.domain.Product;

public class OgnlDemo1 {

    //访问对象的方法
    @Test
    public void demo1() throws OgnlException {
        //获得Context
        OgnlContext context=new OgnlContext();
        //获取根对象
        Object root=context.getRoot();
        //执行表达式
        Object obj=Ognl.getValue("'helloworld'.length()",context,root);
        System.out.println(obj);
    }
    //访问对象的静态方法
    @Test
    public void demo2() throws OgnlException {
        //获得Context
        OgnlContext context=new OgnlContext();
        //获取根对象
        Object root=context.getRoot();
        //执行表达式：@类名@方法名
        Object obj=Ognl.getValue("@java.lang.Math@random()",context,root);
        System.out.println(obj);
    }

    //访问Root中的数据，不需要加#
    @Test
    public void demo3() throws OgnlException {
        //获得Context
        OgnlContext context=new OgnlContext();
        Product product=new Product("abc",100.0);
        context.setRoot(product);
        //获取根对象
        Object root=context.getRoot();
        String name= (String) Ognl.getValue("name",context,root);
        Double price= (Double) Ognl.getValue("price",context,root);
        System.out.println(name+"..."+price);
    }

    //访问OgnlContext中的数据，需要加#
    @Test
    public void demo4() throws OgnlException {
        //获得Context
        OgnlContext context=new OgnlContext();
        //获取根对象
        Object root=context.getRoot();
        context.put("name","xyz");
        String name= (String) Ognl.getValue("#name",context,root);
        System.out.println(name);
    }
}
