<html>
<head>
    <title id="title"></title>

    <script src="../../../assests/common/CommonTableView"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script src="//cdn.datatables.net/1.13.6/js/jquery.dataTables.min.js"></script>
    <script src="//cdn.datatables.net/1.13.6/css/jquery.dataTables.min.css"></script>
</head>
<body>
<script>
    $(document).ready(function() {
        setTableView();
    });
    $("#tableid").dataTable();
</script>

<h1 id="viewname">
</h1>

<div id="commontable"></div>
<input id="restApi" name="restApi" type="hidden" value="<%=request.getAttribute("restApi")%>">
</body>
</html>