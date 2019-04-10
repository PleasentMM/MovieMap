package com.mcc.moviemap.bean;

import java.util.HashMap;
import java.util.HashSet;

public class UserDetails {
    //用户详细信息Id
    private int Id;
    //收藏的电影Id
    private HashSet<Integer> colleMovieIds = new HashSet<>();
    //发出的评论的Id
    private HashSet<Integer> commentIds = new HashSet<>();
    //收藏的地理位置Id
    private HashSet<Integer> colleGeoInfoIds = new HashSet<>();
    //关注的用户Id
    private HashSet<Integer> colleUserIds = new HashSet<>();
    //用户对某个电影的评分,Integer电影Id,Float电影评分
    private HashMap<Integer,Float> rateToMovie = new HashMap<>();
    //用户对某个地方的评分,Interger位置Id,Float位置评分
    private HashMap<Integer,Float> rateToGeo = new HashMap<>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public HashSet<Integer> getColleMovieIds() {
        return colleMovieIds;
    }

    public void setColleMovieIds(HashSet<Integer> colleMovieId) {
        this.colleMovieIds = colleMovieId;
    }

    public void addColleMovieIds(int Id) {
        colleMovieIds.add(Id);
    }

    public void removeColleMovieIds(int Id) {
        if (commentIds.contains(Id)) {
            commentIds.remove(Id);
        }
    }

    public HashSet<Integer> getCommentIds() {
        return commentIds;
    }

    public void setCommentIds(HashSet<Integer> commentId) {
        this.commentIds = commentId;
    }

    public void addCommentId(int id) {
        commentIds.add(id);
    }

    public void removeCommentId(int id) {
        if (commentIds.contains(id)) {
            commentIds.remove(id);
        }
    }

    public HashSet<Integer> getColleGeoInfoIds() {
        return colleGeoInfoIds;
    }

    public void setColleGeoInfoIds(HashSet<Integer> colleGeoInfoId) {
        this.colleGeoInfoIds = colleGeoInfoId;
    }

    public HashSet<Integer> getColleUserIds() {
        return colleUserIds;
    }

    public void setColleUserIds(HashSet<Integer> colleUserId) {
        this.colleUserIds = colleUserId;
    }

    public HashMap<Integer, Float> getRateToMovie() {
        return rateToMovie;
    }

    public void setRateToMovie(HashMap<Integer, Float> rateToMovie) {
        this.rateToMovie = rateToMovie;
    }

    public void addRateToMovie(int movieId, float rating) {
        rateToMovie.put(movieId,rating);
    }

    public HashMap<Integer, Float> getRateToGeo() {
        return rateToGeo;
    }

    public void setRateToGeo(HashMap<Integer, Float> rateToGeo) {
        this.rateToGeo = rateToGeo;
    }

    public void addRateToGeo(int geoId,float rating) {
        rateToGeo.put(geoId,rating);
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "Id=" + Id +
                ", colleMovieIds=" + colleMovieIds +
                ", commentIds=" + commentIds +
                ", colleGeoInfoIds=" + colleGeoInfoIds +
                ", colleUserIds=" + colleUserIds +
                ", rateToMovie=" + rateToMovie +
                ", rateToGeo=" + rateToGeo +
                '}';
    }
}
