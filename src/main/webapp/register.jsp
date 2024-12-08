<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro de Contacto - Restaurante</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header>
        <h1>Contacto para Ventas</h1>
        <p>Proporcione sus datos para que podamos atender su solicitud</p>
    </header>
    
    <div class="container">
        <h2>Formulario de Registro</h2>
        <form action="register" method="post">
            <label for="name">Nombre:</label>
            <input type="text" id="name" name="name" placeholder="Escribe tu nombre" required>
            
            <label for="phone">Teléfono:</label>
            <input type="text" id="phone" name="phone" placeholder="Escribe tu teléfono" required>
            
            <label for="email">Correo Electrónico:</label>
            <input type="email" id="email" name="email" placeholder="Escribe tu correo electrónico" required>
            
            <button type="submit">Registrar</button>
        </form>
    </div>

    <footer>
        <p>&copy; 2024 Restaurante Gourmet - Todos los derechos reservados</p>
    </footer>
</body>
</html>
