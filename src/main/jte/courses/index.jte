@import org.example.hexlet.dto.courses.CoursesPage
@param CoursesPage page

@template.layout.page(
navActive = @`
          <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
            <li><a href="/" class="nav-link px-2 text-white">Home</a></li>
            <li><a href="/courses" class="nav-link px-2 text-secondary">Courses</a></li>
            <li><a href="/users" class="nav-link px-2 text-white">Users</a></li>
            <li><a href="#" class="nav-link px-2 text-white">FAQs</a></li>
            <li><a href="#" class="nav-link px-2 text-white">About</a></li>
          </ul>
`,
content=@`
  <main role="main" class="container">
  <div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded shadow-sm">
  <div class="my-3 p-3 bg-white rounded shadow-sm">
    <h6 class="border-bottom border-gray pb-2 mb-0">${page.getHeader()}</h6>
    @if(page.getCourses().isEmpty())
      <div class="media text-muted pt-3">
        <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">Пока не добавлено ни одного курса</p>
      </div>
    @else
      @for(var course : page.getCourses())
        <div class="media text-muted pt-3">
          <svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 32x32"><title>Placeholder</title><rect width="100%" height="100%" fill="#6f42c1"></rect><text x="50%" y="50%" fill="#6f42c1" dy=".3em">32x32</text></svg>
          <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
            <strong class="d-block text-gray-dark"><a href="/courses/${course.getId()}">${course.getName()}</a></strong>
            ${course.getDescription()}
          </p>
        </div>
      @endfor
    @endif
    </div>
      </div>
</main>
`
)