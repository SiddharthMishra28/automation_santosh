package com.java.project;

import com.java.project.models.User;
import com.java.project.service.EcommService;

public class Main {
    public static void main(String[] args) {
        // BELOW DATA COMES FROM A WEB FORM!
        User user = new User();
        user.setFirstName("sid");
        user.setLastName("mishra");
        user.setEmail("sid@test.com");
        user.setPassword("secret_password");
        user.setPhone("382193213");
        user.setAddress("Kharadi, Pune");

        EcommService service = new EcommService();
        service.createUser(user);
    }
}
