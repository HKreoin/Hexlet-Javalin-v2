@template.layout.page(
navActive = @`
          <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
            <li><a href="/" class="nav-link px-2 text-white">Home</a></li>
            <li><a href="/courses" class="nav-link px-2 text-white">Courses</a></li>
            <li><a href="/users" class="nav-link px-2 text-secondary">Users</a></li>
            <li><a href="#" class="nav-link px-2 text-white">FAQs</a></li>
            <li><a href="#" class="nav-link px-2 text-white">About</a></li>
          </ul>
`,
content=@`
  <main role="main" class="container">
    <div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded shadow-sm">
      <div class="my-3 p-3 bg-white rounded shadow-sm">
        <h6 class="border-bottom border-gray pb-2 mb-0">Users</h6>
        <div class="media text-muted pt-3">
          <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">Пока не добавлено ни одного пользователя</p>
        </div>
      </div>
    </div>
  </main>
`
)