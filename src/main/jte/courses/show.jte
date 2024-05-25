@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage page

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
            crossorigin="anonymous">
        <title>Course</title>
    </head>
    <body>
        <h1>Course</h1>
            <div>
                <h2>${page.getCourse().getName()}</h2>
                <p>${page.getCourse().getDescription()}</p>
            </div>
    </body>
</html>
