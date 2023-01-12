<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Добавить заметку</title>
</head>
<body>
<a href="/notes">Все заметки</a>
<form action="/notes" method="post">
    <label>Название
        <input type="text" name="title" placeholder="Введите название">
    </label>
    <label>Текст
        <input type="text" name="text" placeholder="Введите тескт">
    </label>
    <input type="submit" value="Добавить">
</form>
</body>
</html>