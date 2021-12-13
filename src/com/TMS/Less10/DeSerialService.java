package com.TMS.Less10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialService {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/user/user.dat"))) {
            Object o = ois.readObject();
            if (o instanceof User){
                User user = (User)o;
                System.out.println(user);
            }

        } catch (IOException | ClassNotFoundException exc) {


        }

    }
}
