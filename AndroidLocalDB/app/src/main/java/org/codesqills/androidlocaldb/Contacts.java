package org.codesqills.androidlocaldb;

/**
 * Created by kamalshree on 8/31/2017.
 */

public class Contacts {

    public Contacts(String name,String emailaddress){
        this.setName(name);
        this.setEmailaddress(emailaddress);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    private String name,emailaddress;
}
