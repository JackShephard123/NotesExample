<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Заметки</title>
</head>
<body>
<a href="/notes/add">Добавить заметку</a>
<br>
<table>
    <tr>
        <th>Дата</th>
        <th>Название</th>
    </tr>
    <#list notes as note>
        <tr>
            <td>${note.date}</td>
            <td><a href="notes/${note.id}">${note.title}</a></td>
        </tr>
    </#list>
</table>
</body>
</html>