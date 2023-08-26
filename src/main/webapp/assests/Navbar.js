function Navbar() {
    var html = "<div style='{\n" +
        "        position :'fixed',\n" +
        "        width:'100%',\n" +
        "        top:'0',\n" +
        "        left:'0',\n" +
        "    }'>\n" +
        "        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n" +
        "          <div class=\"container-fluid\">\n" +
        "            <a class=\"navbar-brand\" href=\"/\">\n" +
        "              Meri Kitab\n" +
        "            </a>\n" +
        "            <button\n" +
        "              class=\"navbar-toggler\"\n" +
        "              type=\"button\"\n" +
        "              data-bs-toggle=\"collapse\"\n" +
        "              data-bs-target=\"#navbarSupportedContent\"\n" +
        "              aria-controls=\"navbarSupportedContent\"\n" +
        "              aria-expanded=\"false\"\n" +
        "              aria-label=\"Toggle navigation\"\n" +
        "            >\n" +
        "              <span class=\"navbar-toggler-icon\"></span>\n" +
        "            </button>\n" +
        "            <div\n" +
        "              class=\"collapse navbar-collapse\"\n" +
        "              id=\"navbarSupportedContent\"\n" +
        "            >\n" +
        "              <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n" +
        "                <li class=\"nav-item\">\n" +
        "                  <a class=\"nav-link active\" aria-current=\"page\" href=\"/\">\n" +
        "                    Home\n" +
        "                  </a>\n" +
        "                </li>\n" +
        "                <li class=\"nav-item dropdown\">\n" +
        "                  <a\n" +
        "                    class=\"nav-link dropdown-toggle\"\n" +
        "                    href=\"/\"\n" +
        "                    id=\"navbarDropdown\"\n" +
        "                    role=\"button\"\n" +
        "                    data-bs-toggle=\"dropdown\"\n" +
        "                    aria-expanded=\"false\"\n" +
        "                  >\n" +
        "                    Book Type\n" +
        "                  </a>\n" +
        "                  <ul\n" +
        "                    class=\"dropdown-menu\"\n" +
        "                    aria-labelledby=\"navbarDropdown\"\n" +
        "                  >\n" +
        "                    <li>\n" +
        "                      <a class=\"dropdown-item\" href=\"/\">\n" +
        "                        Motivational Book\n" +
        "                      </a>\n" +
        "                    </li>\n" +
        "                    <li>\n" +
        "                      <a class=\"dropdown-item\" href=\"/\">\n" +
        "                        Comic Book\n" +
        "                      </a>\n" +
        "                    </li>\n" +
        "                    <li>\n" +
        "                      <a class=\"dropdown-item\" href=\"/\">\n" +
        "                      Horror Books\n" +
        "                      </a>\n" +
        "                    </li>\n" +
        "                    <li>\n" +
        "                      <a class=\"dropdown-item\" href=\"/\">\n" +
        "                      Biography\n" +
        "                      </a>\n" +
        "                    </li>\n" +
        "                    <li>\n" +
        "                      <a class=\"dropdown-item\" href=\"/\">\n" +
        "                      Historical Fiction\n" +
        "                      </a>\n" +
        "                    </li>\n" +
        "                  </ul>\n" +
        "                </li>\n" +
        "                <li class=\"nav-item\">\n" +
        "                  <a class=\"nav-link\" href=\"/\">\n" +
        "                    About Us\n" +
        "                  </a>\n" +
        "                </li>\n" +
        "                <li class=\"nav-item\">\n" +
        "                  <a class=\"nav-link\" href=\"/\">\n" +
        "                    Contact Us\n" +
        "                  </a>\n" +
        "                </li>\n" +
        "              </ul>\n" +
        "              <form class=\"d-flex\">\n" +
        "                <input\n" +
        "                  class=\"form-control me-2\"\n" +
        "                  type=\"search\"\n" +
        "                  placeholder=\"Search\"\n" +
        "                  aria-label=\"Search\"\n" +
        "                />\n" +
        "                <button class=\"btn btn-outline-success\" type=\"submit\">\n" +
        "                  Search\n" +
        "                </button>\n" +
        "              </form>\n" +
        "              <a href=\"/login\"><h3 style={{color:'white',marginLeft: '15px',textDecoration:'inherit'}}>Login</h3></a>\n" +
        "            </div>\n" +
        "          </div>\n" +
        "        </nav>\n" +
        "      </div>"
    return html;
}