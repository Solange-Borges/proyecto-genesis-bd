CREATE DATABASE proyecto_genesis;
USE proyecto_genesis;

CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    tipo_usuario VARCHAR(50) NOT NULL
);

CREATE TABLE categorias (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE recursos (
    id_recurso INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    descripcion TEXT,
    edad VARCHAR(20),
    tipo VARCHAR(50),
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria)
);

CREATE TABLE contactos (
    id_contacto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL,
    motivo VARCHAR(100),
    mensaje TEXT NOT NULL
);

CREATE TABLE suscripciones (
    id_suscripcion INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(150) NOT NULL,
    fecha DATE
);

-- INSERTS
INSERT INTO categorias (nombre) VALUES
('Lecciones'),
('Actividades'),
('Guías');

INSERT INTO recursos (titulo, descripcion, edad, tipo, id_categoria) VALUES
('La creación', 'Historia de Génesis 1', '3-5', 'Lección', 1),
('Arca de Noé', 'Actividad para niños', '6-7', 'Actividad', 2),
('Identidad en Dios', 'Enseñanza bíblica', '8-9', 'Guía', 3);

-- CONSULTAS
SELECT * FROM categorias;

SELECT * FROM recursos;

SELECT recursos.titulo, categorias.nombre
FROM recursos
JOIN categorias ON recursos.id_categoria = categorias.id_categoria;

SELECT * FROM recursos
WHERE edad = '3-5';