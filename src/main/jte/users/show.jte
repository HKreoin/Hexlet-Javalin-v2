@param String page

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
  content = @`
  <div class="px-4 py-5 my-5 text-center">
    <h1 class="display-5 fw-bold">User</h1>
    <div class="col-lg-6 mx-auto">
      <p class="lead mb-4">${page}</p>
      <div class="d-grid gap-2 justify-content-sm-center">
        <button type="button" class="btn btn-primary btn-lg px-4 gap-3">Previous</button>
        <button type="button" class="btn btn-primary btn-lg px-4 gap-3">Next</button>
      </div>
    </div>
  </div>
  `
)