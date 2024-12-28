<%@ page import="java.util.List" %>
<%@ page import="servlets.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TM - Детали</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand" href="/task1">TASK MANAGER</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="/task1">Все задания</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/addItem">Добавить задание</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
        <%
            Item item = (Item) request.getAttribute("tovar");
            if(item != null) {
        %>
    <form method="post" action="/save">
        <label class="form-label">Наименование</label>
        <input type="hidden" value="<%=item.getId()%>" name="idshka">
        <input class="form-control" type="text" name="name" value="<%=item.getName()%>">
        <label class="form-label">Описание</label>
        <input class="form-control" type="text" name="opisanie" value="<%=item.getOpisanie()%>">
        <label class="form-label">Крайний срок</label>
        <input class="form-control" type="text" name="deadlineDate" value="<%=item.getDeadlineDate()%>">
        <label class="form-label">Выполнено</label>
        <select class="form-control" name="description" value="<%=item.getDescription()%>">
            <option>Да</option>
            <option>Нет</option>
        </select>
        <br>
        <button class="btn btn-success">Сохранить</button>
        <br>
        <br>
    </form>
        <form method="post" action="/delete">
            <input type="hidden" value="<%=item.getId()%>" name="idshka">
            <button class="btn btn-danger">Удалить</button>
        </form>
        <%
            }
        %>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
