USE EjercicioClase13;

CREATE TABLE ventas (
id_venta INT PRIMARY KEY AUTO_INCREMENT,
id_cliente INT,
fecha DATE,
total DECIMAL(20,2),
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);