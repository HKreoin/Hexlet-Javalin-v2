package gg.jte.generated.ondemand;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,3,3,14,14,14,14,22,22,22,22,22,22,22,22};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n  <div class=\"px-4 py-5 my-5 text-center\">\n    <h1 class=\"display-5 fw-bold\">Centered hero</h1>\n    <div class=\"col-lg-6 mx-auto\">\n      <p class=\"lead mb-4\">Quickly design and customize responsive mobile-first sites with Bootstrap, the world’s most popular front-end open source toolkit, featuring Sass variables and mixins, responsive grid system, extensive prebuilt components, and powerful JavaScript plugins.</p>\n      <div class=\"d-grid gap-2 d-sm-flex justify-content-sm-center\">\n        <button type=\"button\" class=\"btn btn-primary btn-lg px-4 gap-3\">Primary button</button>\n        <button type=\"button\" class=\"btn btn-outline-secondary btn-lg px-4\">Secondary</button>\n      </div>\n    </div>\n  </div>\n  ");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n          <ul class=\"nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0\">\n            <li><a href=\"/\" class=\"nav-link px-2 text-secondary\">Home</a></li>\n            <li><a href=\"/courses\" class=\"nav-link px-2 text-white\">Courses</a></li>\n            <li><a href=\"/users\" class=\"nav-link px-2 text-white\">Users</a></li>\n            <li><a href=\"#\" class=\"nav-link px-2 text-white\">FAQs</a></li>\n            <li><a href=\"#\" class=\"nav-link px-2 text-white\">About</a></li>\n          </ul>\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
