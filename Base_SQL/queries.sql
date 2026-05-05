SELECT * FROM recursos;

SELECT recursos.titulo, categorias.nombre
FROM recursos
JOIN categorias ON recursos.id_categoria = categorias.id_categoria;

SELECT * FROM recursos
WHERE edad = '3-5';
