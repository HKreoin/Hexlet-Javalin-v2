package org.example.hexlet;

import static io.javalin.rendering.template.TemplateUtil.model;

import java.util.List;

import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.model.Course;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;
import io.javalin.rendering.template.JavalinJte;

import org.apache.commons.text.StringEscapeUtils;

public class HelloWorld {
    // Каждый курс представлен объектом класса Course
    private static final List<Course> COURSES= Data.getCourses();
    public static void main(String[] args) {

        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });
        // Описываем, что загрузится по адресу /
        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/users", ctx -> ctx.result("GET /users"));

        app.post("/users", ctx -> ctx.result("POST /users"));

        app.get("/hello", ctx -> {
            var name = ctx.queryParamAsClass("name", String.class).getOrDefault("World");
            ctx.result("Hello, " + name + "!");
        });

        app.get("/users/{id}/post/{postId}", ctx -> {
            var id = ctx.pathParam("id");
            var postId = ctx.pathParam("postId");
            ctx.result("User ID: " + id + " Post ID:" + postId);
        });

        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParamAsClass("id", Long.class).get();
            var course = COURSES.stream().filter(c -> c.getId().equals(id)).findFirst()
                        .orElseThrow(() -> new NotFoundResponse("Entity with id = " + id + " not found"));
            var page = new CoursePage(course);
            ctx.render("courses/show.jte", model("page", page));
        });

        app.get("/courses", ctx -> {
            var courses = COURSES;
            var header = "Все курсы";
            var page = new CoursesPage(courses, header);
            ctx.render("courses/index.jte", model("page", page));
        });

        app.get("/users/{id}", ctx -> {
            var id = ctx.pathParam("id");
            var escapedId = StringEscapeUtils.escapeHtml4(id);
            ctx.contentType("html");
            ctx.result("<h1>" + escapedId + "</h1>");
        });

        app.start(7070); // Стартуем веб-сервер
    }
}