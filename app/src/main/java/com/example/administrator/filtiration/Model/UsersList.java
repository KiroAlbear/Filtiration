package com.example.administrator.filtiration.Model;

import java.util.ArrayList;

public class UsersList {
    private ArrayList<User> UsersList = new ArrayList<User>();
    public ArrayList<User> AdingUsersList() {

        UsersList.add(new User("Ayman", "Zahraa", 123));
        UsersList.add(new User("Kirolos", "Shoubra", 493));
        UsersList.add(new User("Ahmed", "Nasr City", 846));
        UsersList.add(new User("Mostafa", "DownTwn", 7269));
        UsersList.add(new User("Abd-El-Rahman", "DownTwn", 7269));
        UsersList.add(new User("Abdallah", "DownTwn", 7269));
        UsersList.add(new User("Mahmoud", "DownTwn", 7269));
        UsersList.add(new User("Reem", "DownTwn", 7269));
        UsersList.add(new User("Omnia", "DownTwn", 7269));
        UsersList.add(new User("Sara", "DownTwn", 7269));
        UsersList.add(new User("Kiro", "DownTwn", 7269));
        UsersList.add(new User("David", "DownTwn", 7269));

        return UsersList;
    }
}
