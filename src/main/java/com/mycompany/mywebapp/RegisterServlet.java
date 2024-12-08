package com.mycompany.mywebapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    // Lista en memoria para almacenar los registros
    private List<Person> personList = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener datos del formulario
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        // Crear un objeto Person y agregarlo a la lista
        Person person = new Person(name, phone, email);
        personList.add(person);

        // Generar la respuesta HTML estilizada
        response.setContentType("text/html");
        response.getWriter().println(
            "<!DOCTYPE html>" +
            "<html lang=\"en\">" +
            "<head>" +
            "    <meta charset=\"UTF-8\">" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
            "    <title>Registro Exitoso</title>" +
            "    <link rel=\"stylesheet\" href=\"css/style.css\">" +
            "</head>" +
            "<body>" +
            "    <header>" +
            "        <h1>¡Registro Exitoso!</h1>" +
            "    </header>" +
            "    <div class=\"container\">" +
            "        <h2>Detalles del Registro</h2>" +
            "        <p><strong>Nombre:</strong> " + name + "</p>" +
            "        <p><strong>Teléfono:</strong> " + phone + "</p>" +
            "        <p><strong>Correo Electrónico:</strong> " + email + "</p>" +
            "        <a href=\"register.jsp\" class=\"button\">Registrar otra persona</a>" +
            "    </div>" +
            "    <footer>" +
            "        <p>&copy; 2024 Restaurante Gourmet - Todos los derechos reservados</p>" +
            "    </footer>" +
            "</body>" +
            "</html>"
        );
    }
}
