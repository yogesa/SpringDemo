<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/8/29
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <style type="text/css">
      table{
        width: 80%;
        text-align: center;
        border-collapse: collapse;
      }
      td{
        border: 1px solid grey;
      }
    </style>
  </head>
  <body>
  <center>
    <table>
      <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>生日</td>
        <td>注册时间</td>
        <td>操作</td>
      </tr>
      <c:forEach items="${list}"  var="u">
        <tr>
          <td>${u.id}</td>
          <td>${u.username}</td>
          <td>${u.realname}</td>
          <td>${u.age}</td>
          <td>${u.birthday}</td>
          <td>${u.regTime}</td>
          <td>
            <a href="/delUser?id=${u.id}" onclick="return confirm('确定删除？')">删除</a>
          </td>
        </tr>
      </c:forEach>
    </table>
  </center>
  </body>
</html>
