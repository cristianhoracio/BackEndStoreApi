# 🛍️ BackEndStoreApi

**API RESTful desarrollada con Spring Boot y MySQL para la gestión integral de productos, clientes y comercios.**  
Este proyecto forma parte de mi portfolio técnico como desarrollador backend.

---

## 🎯 Propósito del proyecto

Esta API simula la gestión comercial de una tienda, permitiendo administrar entidades como productos, clientes y comercios.  
Ideal como base para sistemas de inventario, e-commerce o ERP.

---

## 🧩 Entidades principales

- **Producto**: nombre, precio, stock, categoría, comercio asociado.
- **Cliente**: nombre, email, dirección, historial de compras.
- **Comercio**: nombre, ubicación, lista de productos.

---

## 🚀 Tecnologías utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Maven  
- Postman (testing)

---

## 📦 Funcionalidades

- CRUD completo de productos, clientes y comercios  
- Relaciones entre entidades (por ejemplo, productos asociados a comercios)  
- Persistencia con JPA e Hibernate  
- Validaciones básicas y manejo de errores  
- Pruebas de endpoints con Postman  

---

## 🔗 Endpoints de ejemplo

```http
GET /api/productos  
POST /api/clientes  
PUT /api/comercios/{id}  
DELETE /api/productos/{id}
```

⚙️ Cómo ejecutar
Cloná el repositorio:

bash
git clone https://github.com/cristianhoracio/BackEndStoreApi.git
Configurá la conexión a MySQL en: src/main/resources/application.properties

Ejecutá el proyecto:

bash
mvn spring-boot:run
💼 Sobre mí
Este proyecto fue desarrollado como parte de mi formación en backend con Spring Boot. Lo considero mi proyecto insignia por representar los conceptos clave que domino: persistencia con JPA, arquitectura limpia, pruebas con Postman y uso eficiente de Java.

📫 Contacto
📧 chrisfuturo308@gmail.com 🌐 GitHub - cristianhoracio

"Construyendo soluciones que conectan código con propósito."
