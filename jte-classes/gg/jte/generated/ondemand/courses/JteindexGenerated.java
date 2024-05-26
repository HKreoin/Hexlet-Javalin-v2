package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,6,6,10,10,10,11,11,15,15,16,16,20,20,20,20,20,20,20,21,21,21,24,24,25,25,29,29,29,29,37,37,37,37,37,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n  <main role=\"main\" class=\"container\">\n  <div class=\"d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded shadow-sm\">\n  <div class=\"my-3 p-3 bg-white rounded shadow-sm\">\n    <h6 class=\"border-bottom border-gray pb-2 mb-0\">");
				jteOutput.setContext("h6", null);
				jteOutput.writeUserContent(page.getHeader());
				jteOutput.writeContent("</h6>\n    ");
				if (page.getCourses().isEmpty()) {
					jteOutput.writeContent("\n      <div class=\"media text-muted pt-3\">\n        <p class=\"media-body pb-3 mb-0 small lh-125 border-bottom border-gray\">Пока не добавлено ни одного курса</p>\n      </div>\n    ");
				} else {
					jteOutput.writeContent("\n      ");
					for (var course : page.getCourses()) {
						jteOutput.writeContent("\n        <div class=\"media text-muted pt-3\">\n          <svg class=\"bd-placeholder-img mr-2 rounded\" width=\"32\" height=\"32\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\" aria-label=\"Placeholder: 32x32\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#6f42c1\"></rect><text x=\"50%\" y=\"50%\" fill=\"#6f42c1\" dy=\".3em\">32x32</text></svg>\n          <p class=\"media-body pb-3 mb-0 small lh-125 border-bottom border-gray\">\n            <strong class=\"d-block text-gray-dark\"><a href=\"/courses/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(course.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(course.getName());
						jteOutput.writeContent("</a></strong>\n            ");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(course.getDescription());
						jteOutput.writeContent("\n          </p>\n        </div>\n      ");
					}
					jteOutput.writeContent("\n    ");
				}
				jteOutput.writeContent("\n    </div>\n      </div>\n</main>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n          <ul class=\"nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0\">\n            <li><a href=\"/\" class=\"nav-link px-2 text-white\">Home</a></li>\n            <li><a href=\"/courses\" class=\"nav-link px-2 text-secondary\">Courses</a></li>\n            <li><a href=\"/users\" class=\"nav-link px-2 text-white\">Users</a></li>\n            <li><a href=\"#\" class=\"nav-link px-2 text-white\">FAQs</a></li>\n            <li><a href=\"#\" class=\"nav-link px-2 text-white\">About</a></li>\n          </ul>\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
