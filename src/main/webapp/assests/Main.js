function clickedButton(page_name) {
    console.log("Button Cliked");
    if(page_name == "/"){
        $("#dom").append(Navbar());
    }
    else if(page_name == 'login')
    {
        $("#dom").html(Login())
    }
    else if(page_name == 'registration')
    {
        $("#dom").html(Registration())
    }
}