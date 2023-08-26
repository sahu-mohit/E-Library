function clickedButton(page_name) {
    $("#dom").html("");
    if(page_name === "/"){
        $("#dom").append(Navbar());
        $("#dom").append(Login())
    }
    else if(page_name === 'login')
    {
        $("#dom").append(Navbar());
        $("#dom").append(Login())
    }
    else if(page_name === 'registration')
    {
        $("#dom").append(Navbar());
        $("#dom").append(Registration())
    }
}