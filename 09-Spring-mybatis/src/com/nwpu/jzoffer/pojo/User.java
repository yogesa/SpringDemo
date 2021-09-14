package com.nwpu.jzoffer.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 15:27 2021/8/29
 * @Modified By:
 */
public class User implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String realname;
    private Date birthday;
    private Date regTime;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", realname='" + realname + '\'' +
                ", birthday=" + birthday +
                ", regTime=" + regTime +
                '}';
    }
}
