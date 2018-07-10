package com.example.administrator.filtiration.Model;

public class User  {
        String Name,Address;
        int id;

        public String getName() {
            return Name;
        }

        public String getAddress() {
            return Address;
        }

        public int getId() {
            return id;
        }

        public User(String Name, String Address, int id){
            this.Name = Name;
            this.Address =Address;
            this.id=id;
        }
    }

