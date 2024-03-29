package com.jnu.myapplication.data;

import java.io.Serializable;


public class BookItem implements Serializable{
    public BookItem(String TITLE, String AUTHORS, String TRANSLATORS, String PUBLISHER, String year, String month, String ISBN, int image_R_id,int BookId) {
        this.TITLE = TITLE;
        this.AUTHORS = AUTHORS;
        this.TRANSLATORS = TRANSLATORS;
        this.PUBLISHER = PUBLISHER;
        this.Year = year;
        this.Month = month;
        this.ISBN = ISBN;
        this.image_R_id = image_R_id;
        this.BookId=BookId;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getAUTHORS() {
        return AUTHORS;
    }

    public void setAUTHORS(String AUTHORS) {
        this.AUTHORS = AUTHORS;
    }

    public String getTRANSLATORS() {
        return TRANSLATORS;
    }

    public void setTRANSLATORS(String TRANSLATORS) {
        this.TRANSLATORS = TRANSLATORS;
    }

    public String getPUBLISHER() {
        return PUBLISHER;
    }

    public void setPUBLISHER(String PUBLISHER) {
        this.PUBLISHER = PUBLISHER;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getImage_R_id() {
        return image_R_id;
    }
    public int getCoverResourceId() {
        return image_R_id;
    }
    public void setImage_R_id(int image_R_id) {
        this.image_R_id = image_R_id;
    }

    String TITLE;String AUTHORS; String TRANSLATORS; String PUBLISHER; String Year;String Month;  String ISBN;int image_R_id;

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    int BookId;

    public Boolean getStar() {
        return isStar;
    }

    public void setStar(Boolean star) {
        isStar = star;
    }

    Boolean isStar=false;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url="";

    String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }



    public int getReadingStatus() {
        return ReadingStatus;
    }

    public void setReadingStatus(int readingStatus) {
        ReadingStatus = readingStatus;
    }

    public int getDoubanScore() {
        return doubanScore;
    }

    public void setDoubanScore(int doubanScore) {
        this.doubanScore = doubanScore;
    }

    int doubanScore=0;
    int ReadingStatus=0;


    // 综合
    public String getPubText(){//作者+出版社
        if (!"".equals(getAUTHORS()))

            return getAUTHORS() + "著";
        else return " ";
    }
    public String getPubTime(){
        return getYear()+"-"+getMonth();
    }
//

}
//book类
// 书名 图像 作者 译者 出版社 发布时间 ISBN
//public class BookItem implements Serializable {
//    private String title;
//    private int image_R_id;
//    public BookItem(String name, int id){
//        title=name;
//        image_R_id=id;
//    }
//        public void setTITLE(String TITLE) {
//        this.title = TITLE;
//    }
//    public String getTitle(){
//        return title;
//    }
//    public String getPubText(){
//        return "getPubText";
//    }
//    public String getPubTime(){
//        return "getPubTime";
//    }
//    public int getCoverResourceId(){
//        return image_R_id;
//    }
//}