package com.aspire.service;

import play.db.ebean.Model.Finder;

import com.aspire.model.User;

public class UserService  {
   private static final long serialVersionUID = 1L;
   public static Finder<Long, User> find = new Finder<Long, User>(Long.class, User.class);
    
    public static User findByAuthToken(String authToken) {
        if (authToken == null) {
            return null;
        }

        try  {
            return find.where().eq("authToken", authToken).findUnique();
        }
        catch (Exception e) {
            return null;
        }
    }

}
