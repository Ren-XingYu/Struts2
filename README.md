# Struts2配置文件加载顺序

    this.init_DefaultProperties();          org/apache/struts2/default.properties
    this.init_TraditionalXmlConfigurations();           struts-default.xml,struts-plugin.xml,struts.xml
    this.init_LegacyStrutsProperties();         用户自定义的struts.properties文件
    this.init_CustomConfigurationProviders();           用户自定义的配置的提供类
    this.init_FilterInitParameters();           加载web.xml中过滤器的初始化参数
    this.init_AliasStandardObjects();           加载Bean对象
    
    default.properties-->struts-default.xml-->struts-plugin.xml-->struts.xml-->struts.properties-->web.xml(filter的初始化参数中可以修改常量)
    
# Action类的写法

    1、Action类是POJO的类
    2、Action类实现一个Action的接口
    3、Action类继承ActionSupport类
    
# Action类的访问

    通过method设置
    通过通配符的方式进行配置
    动态方法访问
    
# Struts2的Servlet的API的访问

    1、完全解耦和的方式
    2、使用Servlet的API的原生方式
    3、接口注入的方式
    
    
Servlet是单例的，Struts2中的Action是多例的(不会出现线程安全问)

# Struts2结果页面配置

    全局结果页面配置：当前package下配置
    局部结果页面配置：当前action中配置
    
# Struts2数据封装

属性驱动

    提供属性set方法的方式
    页面中提供表达式方式
    
模型驱动：采用模型驱动方式

# Struts3复杂数据类型封装

# OGNL(Object-Graph Navigation Language)

三要素：

    表达式
    根对象
    Context对象

作用：

    访问对象的方法
    访问对象的静态方法 
    获取OgnlContext中的数据，需要加#
    获取Root中的数据，不需要加#
    
# 值栈

Struts将XWork对Ognl的扩展这一套机制封装起来，这个对象叫ValueStack,ValueStack是一个容器,由Struts框架内创建

ValueStack是一个接口，OgnlValueStack是实现类,一个请求创建一个OgnlValueStack,OgnlValueStack贯穿整个Action的生命周期

ValueStack中有两块主要区域

     root:CompoundRoot      是一个ArrayList,里面放置的Object
     context:OgnlContext    是一个Map，有root的引用，有web常见对象的引用(request、session、application、parameters、attr)
     
 操作值栈，通常操作的就是root区域
 
 # 操作值栈
    
    一种：在Action中提供属性的get方法的方式
    二种：使用ValueStack中本身的方法的方式

# 拦截器

Interceptor：拦截器，起到拦截Action的作用

    Filter：过滤器,过滤从客户端向服务器发送的请求
    Interceptor：拦截器，拦截客户端对Action的访问,更细粒度拦截(可以拦截Action中具体的方法)
    
Struts框架的核心就是依赖拦截器实现的

拦截器配置方式

    定义拦截器进行配置
    定义一个拦截器栈的方式
    

