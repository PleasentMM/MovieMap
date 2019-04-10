package com.mcc.moviemap.bean;

public class User {
    //实例化用户必须有用户名和密码
    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
    //用户Id
    private int Id;
    //用户名
    private String userName;
    //用户头像URL
    private String userHeadPicUrl;
    //昵称
    private String nickName;
    //密码
    private String passWord;
    //性别
    private String sex;
    //国家
    private String nation;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHeadPicUrl() {
        return userHeadPicUrl;
    }

    public void setUserHeadPicUrl(String userHeadPicUrl) {
        this.userHeadPicUrl = userHeadPicUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
