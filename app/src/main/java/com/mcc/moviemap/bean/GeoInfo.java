package com.mcc.moviemap.bean;

import java.util.HashSet;

public class GeoInfo {

    //实例化GeoInfo必须有经纬度
    public GeoInfo(double longitude, double dimension) {
        this.longitude = longitude;
        this.dimension = dimension;
    }

    //地理信息Id
    private int Id;
    //经度
    private double longitude;
    //维度
    private double dimension;
    //地区
    private String region;
    //地区详细信息
    private String regionDetail;
    //地图电影信息描述
    private String regionMovieDetail;
    //地图评分
    private float rating;
    //相关电影信息
    private HashSet<Integer> movieIds = new HashSet<>();
    //相关对地理位置的评论信息
    private HashSet<Integer> commentIds = new HashSet<>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionDetail() {
        return regionDetail;
    }

    public void setRegionDetail(String regionDetail) {
        this.regionDetail = regionDetail;
    }

    public String getRegionMovieDetail() {
        return regionMovieDetail;
    }

    public void setRegionMovieDetail(String regionMovieDetail) {
        this.regionMovieDetail = regionMovieDetail;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public HashSet<Integer> getMovieIds() {
        return movieIds;
    }

    public void setMovieIds(HashSet<Integer> movieIds) {
        this.movieIds = movieIds;
    }

    public void addMovieId(int id) {
        movieIds.add(id);
    }

    public void removeMovieId(int id) {
        if (movieIds.contains(id)) {
            movieIds.remove(id);
        }
    }

    public HashSet<Integer> getCommentIds() {
        return commentIds;
    }

    public void setCommentIds(HashSet<Integer> commentIds) {
        this.commentIds = commentIds;
    }

    public void addCommentId(int id) {
        commentIds.add(id);
    }

    public void removeCommentId(int id) {
        if (commentIds.contains(id)) {
            commentIds.remove(id);
        }
    }

    @Override
    public String toString() {
        return "GeoInfo{" +
                "Id=" + Id +
                ", longitude=" + longitude +
                ", dimension=" + dimension +
                ", region='" + region + '\'' +
                ", regionDetail='" + regionDetail + '\'' +
                ", regionMovieDetail='" + regionMovieDetail + '\'' +
                ", movieId=" + movieIds +
                ", commentIds=" + commentIds +
                '}';
    }
}
