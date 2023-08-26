function Login() {
        var html = '<div class="container mt-5">\n' +
                '    <div class="row justify-content-center">\n' +
                '        <div class="col-md-6">\n' +
                '            <div class="card">\n' +
                '                <div class="card-header">\n' +
                '                    Login\n' +
                '                </div>\n' +
                '                <div class="card-body">\n' +
                '<p id="invalidresponce"></p>' +
                '                    <form>\n' +
                '                        <div class="form-group">\n' +
                '                            <label for="emailId">Username</label>\n' +
                '                            <input type="text" class="form-control" id="emailId" placeholder="Enter username">\n' +
                '                        </div>\n' +
                '                        <div class="form-group">\n' +
                '                            <label for="password">Password</label>\n' +
                '                            <input type="password" class="form-control" id="password" placeholder="Password">\n' +
                '                        </div>\n' +
                '                        <button type="button" class="btn btn-primary btn-block" onclick="loginUser()">Login</button>\n' +
                '                    </form>\n' +
                '                </div>\n' +
                '                <div class="card-footer text-center">\n' +
                '                    Don\'t have an account? <a onclick="clickedButton(\'registration\')">Register here</a>\n' +
                '                </div>\n' +
                '            </div>\n' +
                '        </div>\n' +
                '    </div>\n' +
                '</div>'+
                '<script src="../../../assests/Registration.js"></script>\n'+
                '<script>\n' +
                '    $(document).ready(function () {\n' +
                '    })\n' +
                '</script>';
        return html;
    }

