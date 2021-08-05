<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Banco Garcia</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body class="container">
        <div class="content">
            <h1 class="title is-1">Login</h1>

            <form method="POST" action="login">
                
                <div class="field">
            <p class="control has-icons-left has-icons-right">
                <input class="input"  name="rut"  placeholder="Rut">
              <span class="icon is-small is-left">
                <i class="fas fa-envelope"></i>
              </span>
              <span class="icon is-small is-right">
                <i class="fas fa-check"></i>
              </span>
            </p>
          </div>
          <div class="field">
            <p class="control has-icons-left">
              <input class="input" name="clave" type="password" placeholder="Password">
              <span class="icon is-small is-left">
                <i class="fas fa-lock"></i>
              </span>
            </p>
          </div>
                
                <c:if test="${error != null}">
                    <div class="notification is-danger"> ${error} </div> 
                </c:if>
          <div class="field">
            <p class="control">
              <button class="button is-success">
                Entrar
              </button>
            </p>
          </div>
            </form>
        </div>
    </body>
</html>
