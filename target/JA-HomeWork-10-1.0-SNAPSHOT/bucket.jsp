<%--
  Created by IntelliJ IDEA.
  User: livch
  Date: 23.07.2021
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bucket</title>
    <link rel="stylesheet" href="css/bucket.css">
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<div class="container-fluid">
    <input type="text" id="myInput" onkeyup="myFunction()"
           placeholder="Search for names.." title="Type in a name">

    <table id="myTable">
    </table>


</div>


<jsp:include page="footer.jsp"></jsp:include>

<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

<script
        src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script
        src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
        src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="js/header.js"></script>
<script src="js/bucket.js"></script>

</body>
</html>
