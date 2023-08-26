function viewopen(url)
{
    window.location = url;
}

function ajaxCallUsingUrlencoded(callUrl, methodType, senddata,callback) {
    $.ajax(
        {
            url: callUrl,
            type: methodType,
            contentType: "application/json",
            // contentType:"application/x-www-form-urlencoded",
            data: JSON.stringify(senddata),
            success: callback
        }
    )
}

