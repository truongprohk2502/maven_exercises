<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 27-Mar-19
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chuyển đổi tiền tệ</title>
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
            width: 200px;
        }
    </style>
</head>
<body>
<h1>Chuyển đổi từ USD sang VND</h1>
<form method="post">
    <table align="center">
        <tr>
            <td class="title_tr">Tỉ giá 1 USD/VND</td>
            <td><input type="text" name="exchangeRate" value="${exchange_rate}" placeholder="Nhập tỉ giá USD/VND"></td>
        </tr>
        <tr>
            <td class="title_tr"></td>
            <td style="color: red">${rate_error}</td>
        </tr>
        <tr>
            <td class="title_tr">Số tiền bằng USD</td>
            <td><input type="text" name="money" value="${money}" placeholder="Nhập số tiền bằng USD"></td>
        </tr>
        <tr>
            <td class="title_tr"></td>
            <td style="color: red">${money_error}</td>
        </tr>
        <tr>
            <td class="title_tr">Số tiền bằng VND</td>
            <td><input type="text" value="${covert_money}" placeholder="Số tiền bằng VND tương ứng" disabled></td>
        </tr>
        <tr>
            <td class="title_tr"></td>
            <td><input type="submit" value="Chuyển đổi"></td>
        </tr>
    </table>
</form>
</body>
</html>
