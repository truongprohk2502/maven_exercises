<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 29-Mar-19
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ứng dụng từ điển</title>
    <style type="text/css">
        body {
            text-align: center;
        }
        h1 {
            color: green;
            padding: 30px;
        }
        td {
            padding: 10px;
        }
        input {
            padding: 5px;
            width: 200px;
        }
        input[type=submit] {
            float: right;
            width: 100px;
            cursor: pointer;
        }
        .title_tr {
            width: 130px;
        }
    </style>
</head>
<body>
<h1>Từ điển Anh Việt</h1>
<form method="post">
    <table align="center">
        <tr>
            <td class="title_tr">Từ tiếng Anh</td>
            <td><input type="text" name="english_word" value="${english_word}" placeholder="Nhập từ tiếng Anh"></td>
        </tr>
        <tr>
            <td class="title_tr"></td>
            <td style="color: red">${blank_error}</td>
        </tr>
        <tr>
            <td class="title_tr">Từ tiếng Việt</td>
            <td><input type="text" value="${vietnamese_word}" placeholder="Từ tiếng Việt tương ứng" disabled></td>
        </tr>
        <tr>
            <td class="title_tr"></td>
            <td style="color: red">${translate_error}</td>
        </tr>
        <tr>
            <td class="title_tr"></td>
            <td><input type="submit" value="Dịch"></td>
        </tr>
    </table>
</form>
</body>
</html>
