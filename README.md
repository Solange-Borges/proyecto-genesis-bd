# 📖 Proyecto Génesis

## 🧩 Descripción

Proyecto Génesis es una plataforma educativa online orientada a la enseñanza bíblica infantil para iglesias, familias y maestros.

El proyecto está dividido en varios módulos: base de datos y aplicación en Java.

---

# 🗄️ Módulo: Base de Datos

## 🎯 Objetivo

Organizar de forma estructurada la información de la plataforma para facilitar:

* Gestión de recursos educativos
* Clasificación por categorías
* Interacción con usuarios y visitantes

## 🛠 Tecnologías utilizadas

* MySQL
* MySQL Workbench

## 📂 Estructura

* `/docs` → documentación del proyecto
* `/diagrams` → diagrama entidad-relación
* `/sql` → scripts SQL

## ⚙️ Ejecución

```sql
CREATE DATABASE proyecto_genesis;
USE proyecto_genesis;
```

Ejecutar en orden:

* create_tables.sql
* inserts.sql
* queries.sql

---

# 💻 Módulo: Programación

## 🧩 Descripción

Aplicación en Java que gestiona los recursos educativos del proyecto mediante conexión a base de datos.

## ⚙️ Funcionalidades

* Ver recursos
* Añadir recursos
* Buscar recursos por edad

## 🗂️ Entidades que gestiona

* Recursos
* Categorías (relacionadas)

## 🔗 Conexión a base de datos

La aplicación se conecta a MySQL mediante JDBC y trabaja con datos reales de la base de datos `proyecto_genesis`.

## 🧱 Estructura del código

* `Main.java` → menú principal
* `ConexionBD.java` → conexión JDBC
* `Recurso.java` → modelo
* `RecursoDAO.java` → acceso a datos

## ▶️ Ejecución

1. Tener MySQL en ejecución
2. Ejecutar los scripts SQL
3. Ejecutar la clase `Main.java`

---

## 💡 Comentario final

Durante el desarrollo he aprendido a diseñar una base de datos y a conectarla con una aplicación Java mediante JDBC, organizando el código en diferentes clases para facilitar su mantenimiento.

---

## 👩‍💻 Autor

Solange Borges
