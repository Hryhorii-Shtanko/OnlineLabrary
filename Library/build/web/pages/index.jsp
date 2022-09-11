<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Online Library: Entrance</title>
        <link href="css/style_index.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <div class="main">

            <div class="content">
                <p class="title"><span class="text"><img src="images/lib.png" width="76" height="77" hspace="10" vspace="10" align="middle"></span></p>
                <p class="title">Online Library</p>
                <p class="text">Welcome to the online Library, where you can find whatever book you whant. Data search is available, there is a flexible system of filters, sorting is well thought out.</p>
                <p class="text">Currently, the project in development. So mast be updated soon.</p>
                <p class="text">For cooperation please contact <a href="mailto:gregory.shtanko@yahoo.com">gregory.shtanko@yahoo.com
                    </a></p>
                <p>&nbsp;</p>

            </div>

            <div class="logo">
                <p class="title">Type the nickname to use for log:</p>
                <form class="login_form" name="username" action="pages/main.jsp" method="POST">
                    Your name: <input type="text" name="username" value="" size="20" />
                    <input type="submit" value="Enter" />
                </form>

            </div>

            <div class="footer">
                 designed by Hryhorii Shtanko, 2022
            </div>
        </div>


    </body>
</html>
