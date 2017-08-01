package edu.mum.cs.asd.lab2.proxy.dynemic;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import edu.mum.cs.asd.lab2.proxy.delay.*;


public class DBQueryHandler implements InvocationHandler{
    IDBQuery realQuery = null;//定义主题接口

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
//如果第一次调用，生成真实主题
        if(realQuery == null){
            realQuery = new DBQuery();
        }
//返回真实主题完成实际的操作
        return realQuery.request();
    }

}