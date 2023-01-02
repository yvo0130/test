package org.example.optional;

import org.example.entity.User;

import java.util.Optional;

public class Test01 {
    public static void main(String[] args) {

        User user = null;

        User aa = Optional.ofNullable(user).orElse(User.builder().name("zhangsan").age("14").build());

        System.out.println(aa.toString());

    }
}
