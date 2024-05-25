package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,15,15,15,15,16,16,18,18,19,19,21,21,21,21,21,21,21,22,22,22,24,24,25,25,27,27,27,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n<!doctype html>\n<html>\n    <head>\n        <meta charset=\"utf-8\" />\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\n            rel=\"stylesheet\"\n            integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\n            crossorigin=\"anonymous\">\n        <title>Хекслет</title>\n    </head>\n    <body>\n        <h1>");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(page.getHeader());
		jteOutput.writeContent("</h1>\n        ");
		if (page.getCourses().isEmpty()) {
			jteOutput.writeContent("\n            <p>Пока не добавлено ни одного курса</p>\n        ");
		} else {
			jteOutput.writeContent("\n            ");
			for (var course : page.getCourses()) {
				jteOutput.writeContent("\n               <div>\n                   <h2><a href=\"/courses/");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(course.getId());
				jteOutput.setContext("a", null);
				jteOutput.writeContent("\">");
				jteOutput.setContext("a", null);
				jteOutput.writeUserContent(course.getName());
				jteOutput.writeContent("</a></h2>\n                   <p>");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(course.getDescription());
				jteOutput.writeContent("</p>\n               </div>\n            ");
			}
			jteOutput.writeContent("\n        ");
		}
		jteOutput.writeContent("\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
