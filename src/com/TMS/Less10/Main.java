package com.TMS.Less10;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        User user = new User("Evgeniy", 38, true);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("/Users/user/user.dat"));
            oos.writeObject(user);
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try (FileReader fr = new FileReader(new File("/Users/user/Roli.txt"))) {

            int read = fr.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

