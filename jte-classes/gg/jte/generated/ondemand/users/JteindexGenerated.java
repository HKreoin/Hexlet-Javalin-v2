package gg.jte.generated.ondemand.users;
public final class JteindexGenerated {
	public static final String JTE_NAME = "users/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,3,3,14,14,14,14,22,22,22,22,22,22,22,22};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n  <main role=\"main\" class=\"container\">\n    <div class=\"d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded shadow-sm\">\n      <div class=\"my-3 p-3 bg-white rounded shadow-sm\">\n        <h6 class=\"border-bottom border-gray pb-2 mb-0\">Users</h6>\n        <div class=\"media text-muted pt-3\">\n          <p class=\"media-body pb-3 mb-0 small lh-125 border-bottom border-gray\">Пока не добавлено ни одного пользователя</p>\n        </div>\n      </div>\n    </div>\n  </main>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n          <ul class=\"nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0\">\n            <li><a href=\"/\" class=\"nav-link px-2 text-white\">Home</a></li>\n            <li><a href=\"/courses\" class=\"nav-link px-2 text-white\">Courses</a></li>\n            <li><a href=\"/users\" class=\"nav-link px-2 text-secondary\">Users</a></li>\n            <li><a href=\"#\" class=\"nav-link px-2 text-white\">FAQs</a></li>\n            <li><a href=\"#\" class=\"nav-link px-2 text-white\">About</a></li>\n          </ul>\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
