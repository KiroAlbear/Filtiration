package com.example.administrator.filtiration.Model;

import java.util.ArrayList;

public class UsersList {
    private ArrayList<User> UsersList = new ArrayList<User>();
    public ArrayList<User> AdingUsersList() {

        UsersList.add(new User("Ayman", "Zahraa", 123));
        UsersList.add(new User("Kirolos", "Shoubra", 493));
        UsersList.add(new User("Ahmed", "Nasr City", 846));
        UsersList.add(new User("Amr", "DownTwn", 7269));
        return UsersList;
    }
}
