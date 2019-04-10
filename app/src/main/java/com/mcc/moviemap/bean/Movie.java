package com.mcc.moviemap.bean;

import java.util.HashSet;

public class Movie {

    //实例化电影必须有名称
    public Movie(String name) {
        this.name = name;
    }
    //电影ID
    private int Id;
    //电影名称
    private String name;
    //电影年份
    private int year;
    //导演,名称之间用/隔开,如: 鲍勃·佩尔西凯蒂 / 彼得·拉姆齐 / 罗德尼·罗斯曼
    private String director;
    //编剧,名称之间用/隔开
    private String screenWriter;
    //主演,名称之间用/隔开
    private String performer;
    //类型,名称之间用/隔开
    private String type;
    //制片国家和地区,名称之间用/隔开
    private String nation;
    //语言,名称之间用/隔开
    private String language;
    //上映日期,各时间之间用/隔开,如:2018-12-21(中国大陆) / 2018-12-14(美国)
    private String releaseDate;
    //片长
    private String filmLength;
    //剧情简介
    private String synopsis;
    //电影评分
    private float rating;
    //评价人数
    private int ratedCount;
    //相关的地理位置信息ID,存数据库时经行序列化
    private HashSet<Integer> geoInfoIds = new HashSet<>();
    //相关的回复信息ID,存数据库时经行序列化
    private HashSet<Integer> commentIds = new HashSet<>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getScreenWriter() {
        return screenWriter;
    }

    public void setScreenWriter(String screenWriter) {
        this.screenWriter = screenWriter;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getRatedCount() {
        return ratedCount;
    }

    public void setRatedCount(int ratedCount) {
        this.ratedCount = ratedCount;
    }

    public void addGeoInfoIds(int Id) {
        geoInfoIds.add(Id);
    }

    public void removeGeoInfoId(int Id) {
        if (geoInfoIds.contains(Id)) {
            geoInfoIds.remove(Id);
        }
    }

    public HashSet<Integer> getGeoInfoIds() {
        return geoInfoIds;
    }

    public void setGeoInfoIds(HashSet<Integer> geoInfoIds) {
        this.geoInfoIds = geoInfoIds;
    }

    public void addCommentId(int Id) {
        commentIds.add(Id);
    }

    public void removeCommentId(int Id) {
        if (commentIds.contains(Id)) {
            commentIds.remove(Id);
        }
    }

    public HashSet<Integer> getCommentIds() {
        return commentIds;
    }

    public void setCommentIds(HashSet<Integer> commentIds) {
        this.commentIds = commentIds;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", screenWriter='" + screenWriter + '\'' +
                ", performer='" + performer + '\'' +
                ", type='" + type + '\'' +
                ", nation='" + nation + '\'' +
                ", language='" + language + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", filmLength='" + filmLength + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", rating=" + rating +
                ", ratedCount=" + ratedCount +
                ", geoInfoIds=" + geoInfoIds +
                ", commentIds=" + commentIds +
                '}';
    }
}
