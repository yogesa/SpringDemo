package com.nwpu.jzoffer.servlet;

import com.nwpu.jzoffer.service.UserService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 10:24 2021/8/30
 * @Modified By:
 */
@WebServlet("/delUser")
public class UserDelService extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        WebApplicationContext context =
                WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        userService = context.getBean("userService", UserService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        System.out.println("id:"+id);

        userService.DelUser(id);

        resp.sendRedirect(req.getContextPath() + "/userList");
    }
}
