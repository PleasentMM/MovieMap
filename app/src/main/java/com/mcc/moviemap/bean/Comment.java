package com.mcc.moviemap.bean;

import java.util.Date;
import java.util.HashSet;

public class Comment {
    //实例化Comment必须有用户Id和评论内容和电影Id或地理位置Id
    public Comment(String content, int fromUserId) {
        this.content = content;
        this.fromUserId = fromUserId;
    }
    //评论Id
    private int Id;
    //评论内容
    private String content;
    //评论时间,系统自动设定
    private Date date;
    //来自用户ID
    private int fromUserId;
    //对此评论的投票
    private int vote;
    //回复Id
    private HashSet<Integer> replyIds = new HashSet<>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
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

    public HashSet<Integer> getReplyIds() {
        return replyIds;
    }

    public void setReplyIds(HashSet<Integer> replyId) {
        this.replyIds = replyId;
    }

    public void addReply(int Id) {
        replyIds.add(Id);
    }

    public void removeReply(int Id) {
        if (replyIds.contains(Id)) {
            replyIds.remove(Id);
        }
    }

    @Override
    public String toString() {
        return "Comment{" +
                "Id=" + Id +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", fromUserId=" + fromUserId +
                ", vote=" + vote +
                ", replyIds=" + replyIds +
                '}';
    }
}
