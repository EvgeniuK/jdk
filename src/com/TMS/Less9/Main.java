package com.TMS.Less9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        List<User> list = new ArrayList<>(List.of(new User(12, "Anton", Gender.MEN),
                new User(19, "Sergei", Gender.MEN),
                new User(17, "Petr", Gender.MEN),
                new User(28, "Aetr", Gender.WOMEN),
                new User(65, "Nasty", Gender.WOMEN),
                new User(32, "Polina", Gender.WOMEN)));

        Set<User> set = new TreeSet<>(Set.of(new User(19, "Sergei", Gender.MEN),
                new User(17, "Petr", Gender.MEN),
                new User(28, "Aetr", Gender.WOMEN),
                new User(65, "Nasty", Gender.MEN),
                new User(32, "Polina", Gender.WOMEN)));

        System.out.println(Service.findByGender(set, Gender.MEN));
        System.out.println(Service.findByName(list, "Petr"));
        System.out.println(Service.sortByAge(list));

    }
}