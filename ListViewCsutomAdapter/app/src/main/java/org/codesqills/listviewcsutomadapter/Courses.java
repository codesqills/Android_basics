package org.codesqills.listviewcsutomadapter;

/**
 * Created by kamalshree on 7/30/2017.
 */

public class Courses {


    private String courses;
    private int imageid;

    public void setCourses(String courses) {
        this.courses = courses;
    }


    public Courses(String courses,int imageid) {
        this.courses = courses;
        this.imageid = imageid;
    }

    public String getCourses() {
        return courses;
    }


    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

}
