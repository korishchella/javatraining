<html>
<head>
<style type="text/css">
form {
    text-align: center;
}
input {
    background-color: rgb(0, 255, 180);
    color: red;
    margin: 5px;
}
</style>
</head>
<body>
<form action="signup" method="POST" onsubmit="submituser()">
    UserName : <input type="text" id="uName" name="userName" required />
    <br/>
    Password : <input type="password" id="password" name="password" required />
    <br/>
    <input type="submit" value="Create User">
</form>

<script type="text/javascript">
function submituser() {
    var uName = document.getElementById("uName").value;
    alert("Submitting user: " + uName);
}
</script>
</body>
</html>
