function Registration() {
    var html = '<div class="container mt-5">\n' +
        '    <div class="row justify-content-center">\n' +
        '        <div class="col-md-6">\n' +
        '            <div class="card">\n' +
        '                <div class="card-header">\n' +
        '                    Registration\n' +
        '                </div>\n' +
        '                <div class="card-body">\n' +
        '                    <form>\n' +
        '                        <div class="form-row">\n' +
        '                            <div class="form-group col-md-6">\n' +
        '                                <label for="firstName">First Name</label>\n' +
        '                                <input type="text" class="form-control" id="firstName" placeholder="Enter first name">\n' +
        '                            </div>\n' +
        '                            <div class="form-group col-md-6">\n' +
        '                                <label for="lastName">Last Name</label>\n' +
        '                                <input type="text" class="form-control" id="lastName" placeholder="Enter last name">\n' +
        '                            </div>\n' +
        '                        </div>\n' +
        '                        <div class="form-group">\n' +
        '                            <label for="username">Username</label>\n' +
        '                            <input type="text" class="form-control" id="username" placeholder="Enter username">\n' +
        '                        </div>\n' +
        '                        <div class="form-group">\n' +
        '                            <label for="password">Password</label>\n' +
        '                            <input type="password" class="form-control" id="password" placeholder="Password">\n' +
        '                        </div>\n' +
        '                        <div class="form-group">\n' +
        '                            <label for="confirmPassword">Confirm Password</label>\n' +
        '                            <input type="password" class="form-control" id="confirmPassword" placeholder="Confirm password">\n' +
        '                        </div>\n' +
        '                        <button type="submit" class="btn btn-primary btn-block">Register</button>\n' +
        '                    </form>\n' +
        '                </div>\n' +
        '                <div class="card-footer text-center">\n' +
        '                    Already have an account? <a href="#">Login here</a>\n' +
        '                </div>\n' +
        '            </div>\n' +
        '        </div>\n' +
        '    </div>\n' +
        '</div>';
    return html;
}