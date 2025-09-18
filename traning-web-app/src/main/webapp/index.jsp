<html>
<head>
<style type ="text/css">

input{
align : center;
}
</style>
</head>
<body>
 <form action="signup" method="POST">
    UserName : <input type ="text" id="uName" name="userName">
    Password : <input type ="password" id="password" name="password">
    <input type= "submit" value = "create user">
 </form>

 <script type ="text/javascript">
 function submituser(){
 var uName = document.getElementById("uName").value;
 var pass = document.getElementById("password").value;
 alert(uName);
 }
 </script>
</body>
</html>
