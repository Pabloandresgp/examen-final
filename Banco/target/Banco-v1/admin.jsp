<!DOCTYPE html>
<jsp:include page="header.jsp"/>
        <div class="content">
            <h1 class="title is-1">ADMIN</h1>

            <div class="notification is-info">
                Bienvenido a su Banco ${cliente.nombre}
            </div>
            <a href="logout.jsp" class="button is-danger">LOGOUT</a>
        </div>
    </body>
</html>
