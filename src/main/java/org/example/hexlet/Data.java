package org.example.hexlet;

import java.util.Locale;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.LongStream;
import java.util.stream.Collectors;
import java.util.Collections;

import org.example.hexlet.model.Course;

import net.datafaker.Faker;

public class Data {
    private static final long ITEMS_COUNT = 10;

    public static List<Course> getCourses() {
        Random random = new Random(1234);
        Faker faker = new Faker(new Locale("en"), random);

        List<Long> ids = LongStream
            .range(1, ITEMS_COUNT + 1)
            .boxed()
            .collect(Collectors.toList());
        Collections.shuffle(ids, random);

        List<Course> courses = new ArrayList<>();

        for (int i = 0; i < ITEMS_COUNT; i++) {
            var id = ids.get(i);
            var name = faker.name().title();
            var description = faker.educator().course();
            Course course = new Course(id, name, description);
            courses.add(course);
        }

        return courses;
    }
}
