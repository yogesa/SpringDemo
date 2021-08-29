package com.nwpu.servlet;

import com.nwpu.pojo.User;
import com.nwpu.service.UserService;

import javax.servlet.ServletException;
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
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //调用服务层方法获取用户集合
        List<User> list = this.userService.userList();
        //保存到作用域

    }
}
