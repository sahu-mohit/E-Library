function  loginUser() {
    var userId = $("#emailId").val();
    var password = $("#password").val();
    var data = {
        'emailId':userId,
        'password':password
    };
    var response ;
    $("#invalidresponce").html("");
    ajaxCallUsingUrlencoded("/rest/login","POST",data,function (response){
        $("#invalidresponce").html(response.message);
    });


}