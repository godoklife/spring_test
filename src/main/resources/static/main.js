alert("js test");

// ajax를 사용하려면 jquery CDN이 필요!!!
$.ajax({
    url:"getdata",
    success:function (re) {
        alert("통신확인"+re);
        $("#divbox").html(re);
    }
});