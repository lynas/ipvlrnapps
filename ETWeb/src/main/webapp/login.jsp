<%--
  Created by IntelliJ IDEA.
  User: LynAs
  Date: 12/31/2014
  Time: 9:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form name="f" action="" method="post">
  <input type="text" id="username" name="username" />
  <input type="password" id="password" name="password" />

  <button type="submit" class="btn" >Log in</button>
  <input type="hidden" name="${_csrf.parameterName}"
         value="${_csrf.token}" />
</form>

</body>
</html>
