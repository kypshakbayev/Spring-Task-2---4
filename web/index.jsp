<%@ page import="java.util.List" %>
<%@ page import="servlets.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TASK MANAGER</title>
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
                </ul>
            </div>
        </div>
    </nav>
    <div style="text-align: center">
        <a class="nav-link" href="/addItem" style="background-color: green; display: inline-block; border-radius: 5px; text-align: center; width: 50%; height: 30px; margin: 10px; color: aliceblue">Добавить задание</a>
    </div>
    <%
        List<Item> itemList = (List<Item>) request.getAttribute("tovary");
    %>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Наименование</th>
            <th scope="col">Крайний срок</th>
            <th scope="col">Выполнено</th>
            <th scope="col">Детали</th>
        </tr>
        </thead>
        <tbody>
        <%
            if(itemList!=null) {
                for(Item item: itemList) {
           %>
        <tr>

            <th scope="row"><%=item.getId()%></th>
            <td><%=item.getName()%></td>
            <td><%=item.getDeadlineDate()%></td>
            <td><%=item.getDescription()%></td>
            <td><a href="/details?nomer=<%=item.getId()%>">Details</a></td>
        </tr>
        <%
                }
            }
        %>
        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
