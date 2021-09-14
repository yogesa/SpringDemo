package com.nwpu.jzoffer.servlet;

import com.nwpu.jzoffer.pojo.User;
import com.nwpu.jzoffer.service.UserService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 16:47 2021/8/29
 * @Modified By:
 */
@WebServlet("/userList")
public class UserListServlet extends HttpServlet {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void init() throws ServletException {
        //为userService赋值
        WebApplicationContext context =
                WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        userService = context.getBean("userService", UserService.class);
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //调用服务层方法获取用户集合
        List<User> list = this.userService.userList();

        req.setAttribute("list",list);
        //保存到作用域
        req.getRequestDispatcher("/index.jsp").forward(req,resp);

    }
}
