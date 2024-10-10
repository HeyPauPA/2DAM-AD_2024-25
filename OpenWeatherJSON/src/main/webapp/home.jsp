<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">

<head>
    <title>OpenWeather</title>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

    <!-- Bootstrap CSS v5.2.1 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous" />
</head>

<body>
    <div class="container shadow">
        <header class="bg-info p-0 px-3">
            <div class="row justify-content-between align-items-center">
                <div class="col">
                    <img src="img/logo.png" alt="" width="220">
                </div>
                <div class="col text-end">
                    <img src="img/logo2.png" alt="" width="220">
                </div>
            </div>
        </header>
        <main>
            <div class="row justify-content-center">
            	<c:forEach items="${dias}" var="dia">
	                <div class="col-md-6 col-xl-4 my-3 d-flex">
	                    <div class="card flex-fill">
	                        <div class="row">
	                            <div class="col-4"><img class="card-img-top" src="http://openweathermap.org/img/wn/${dia.icoProno[0].icon}@2x.png" alt="Title" /></div>
	                            <div class="col-8">
	                                <div class="card-body"></div>
	                                <h4 class="card-title">${dia.fecha}</h4>
	                                <h3>${dia.icoProno[0].prono}</h3>
	                                <p class="card-text">Min: ${dia.temps.temp_min} Max: ${dia.temps.temp_max}</p>
	                                <p>${(dia.pop)*100} %</p>
	                            </div>
	                        </div>
	                    </div>
	                </div>
                </c:forEach>
            </div>
        </main>
        <footer>
            <h2 class="text-white text-center bg-info p-3">
                &copy; Paco Pulido
            </h2>
        </footer>
    </div>

    <!-- Bootstrap JavaScript Libraries -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
        integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
        crossorigin="anonymous"></script>
</body>

</html>