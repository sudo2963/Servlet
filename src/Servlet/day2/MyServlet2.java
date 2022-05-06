package Servlet.day2;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
/**
 * 使用通用的Servlet实现，只需要实现service
 * **/
public class MyServlet2 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello_servlet"); //jvm console 中输出
        servletResponse.getWriter().println("hello-Servlet");  //网页中输出

    }
}
