package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,7,7,11,25,25,25,41,41,41,59,59,59,1,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content, Content navActive) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\">\n  <head>\n    ");
		jteOutput.writeContent("\n    <meta charset=\"utf-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n\n    <title>Hexlet javalin test</title>\n  </head>\n  <body>\n    <header class=\"p-3 bg-dark text-white\">\n      <div class=\"container\">\n        <div class=\"d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start\">\n          <a href=\"/\" class=\"d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none\">\n            <svg class=\"bi me-2\" width=\"40\" height=\"32\" role=\"img\" aria-label=\"Bootstrap\"><use xlink:href=\"#bootstrap\"></use></svg>\n          </a>\n\n          <div class=\"navActive\">\n            ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(navActive);
		jteOutput.writeContent("\n          </div>\n\n          <form class=\"col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3\">\n            <input type=\"search\" class=\"form-control form-control-dark\" placeholder=\"Search...\" aria-label=\"Search\">\n          </form>\n\n          <div class=\"text-end\">\n            <button type=\"button\" class=\"btn btn-outline-light me-2\">Login</button>\n            <button type=\"button\" class=\"btn btn-warning\">Sign-up</button>\n          </div>\n        </div>\n      </div>\n    </header>\n\n    <div class=\"content\">\n      ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n    </div>\n    <div class=\"container\">\n      <footer class=\"d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top\">\n        <div class=\"col-md-4 d-flex align-items-center\">\n          <a href=\"/\" class=\"mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1\">\n            <svg class=\"bi\" width=\"30\" height=\"24\"><use xlink:href=\"#bootstrap\"></use></svg>\n          </a>\n          <span class=\"text-muted\">© 2024 Company, Inc</span>\n        </div>\n        <ul class=\"nav col-md-4 justify-content-end\">\n          <li class=\"nav-item\"><a href=\"https://github.com/HKreoin\" class=\"nav-link px-2 text-muted\">My github</a></li>\n        </ul>\n      </footer>\n    </div>\n    <script src=\"/docs/5.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n  </body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		Content navActive = (Content)params.get("navActive");
		render(jteOutput, jteHtmlInterceptor, content, navActive);
	}
}
