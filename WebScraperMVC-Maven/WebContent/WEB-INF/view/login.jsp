<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"
    />
    <link rel="stylesheet" type="text/css" href="/css/login.css" />
    <link
      href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet"
    />
    <link
      href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans:wght@700&display=swap"
      rel="stylesheet"
    />
    <link
      href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans&display=swap"
      rel="stylesheet"
    />
    <title>Web Scraper</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
  </head>
  <body>
    <div class="header">
      <h2>
        <b>Financial Web Scraper</b>
      </h2>
    </div>

    <div class="row">
      <div class="column"></div>
      <div class="column">
        <form class="col s12 offset-s1">
          <div class="row">
            <div class="input-field col s10">
              <i class="material-icons prefix">email</i>
              <input id="email" type="email" class="validate" />
              <label for="email">Email</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s10">
              <i class="material-icons prefix">https</i>
              <input id="password" type="password" class="validate" />
              <label for="password">Password</label>
            </div>
          </div>
          <div class="row">
            <div class="col s7">
              <button
                class="btn waves-effect waves-light"
                type="submit"
                name="action"
              >
                Login
              </button>
            </div>
          </div>
        </form>
      </div>
      <div class="column"></div>
    </div>

    <div class="footer">
      <p><i>Typed by the fingers of Jim Doyle</i></p>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
  </body>
</html>
