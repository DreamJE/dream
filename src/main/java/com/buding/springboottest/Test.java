package com.buding.springboottest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author hanxin
 * @version 1.0
 * @description
 * @date 2018/11/22 16:18
 **/
public class Test {

    public static void main(String[] args) {

        /*ZoneId ZONE = ZoneId.systemDefault();

        Date d = new Date();

        Instant instant = d.toInstant();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZONE);

        LocalTime localTime = localDateTime.toLocalTime();

        LocalTime localTime1 = localTime.plusHours(3);

        System.out.println(localTime1);*/

        //1.使用Collection中的方法和Arrays
        String[] strArr = new String[]{"a", "b", "c"};
        List<String> list = Arrays.asList(strArr);
        Stream<String> stream = list.stream();
        Stream<String> stream1 = Arrays.stream(strArr);

        //2. 使用Stream中提供的静态方法
        Stream<String> stream2 = Stream.of(strArr);
        Stream<Double> stream3 = Stream.generate(Math::random);
        Stream<Object> stream4 = Stream.empty();
        Stream.iterate(1, i -> i++);

        User user = new User();
        user.setUserName("可爱的鱼");

        //String name = Test.getName(user);
        String name = Test.getName(null);

        System.out.println("Name: "+ name);

    }

    public static String getName(User user){
        Optional<User> optionalUser = Optional.ofNullable(user);
        return optionalUser.map(User::getUserName).orElse(null);
    }
}
