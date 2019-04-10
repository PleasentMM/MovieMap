package com.mcc.moviemap.bean;

public class Reply {
    //实例化回复必须要被评论的Id,回复内容,来自用户的Id
    public Reply(String content, int fromUserId) {
        this.content = content;
        this.fromUserId = fromUserId;
    }

    //评论的Id
    private int Id;
    //回复内容
    private String content;
    //来自用户Id
    private int fromUserId;
    //对评论的投票
    private int vote;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getContent() {
        return content;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public void addVote() {
        vote++;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "Id=" + Id +
                ", content='" + content + '\'' +
                ", fromUserId=" + fromUserId +
                ", vote=" + vote +
                '}';
    }
}
