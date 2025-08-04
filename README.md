📘 Book API UDB – Book Management Project
This project is called 📘 Book API UDB, a web application built using Spring Boot. Its goal is to manage a book catalog through a RESTful API, which can be used by any HTTP client such as Postman, a frontend interface, or another system.

✨ Main Features
The API supports the four basic CRUD operations:

➕ Add books
Submit new books with a title, author, and publication year.

📋 List all books
Retrieve all registered books from the database.

🔍 Search books by title
Find books that contain a specific word or phrase in their title.

🗑️ Delete books by ID
Remove a specific book using its unique identifier.

🧱 Project Structure
The project is organized using a layered architecture and package structure:

🧩 Model → Contains the Book class (the data model).

🗃️ Repository → Contains BookRepository (data access using JPA).

🧠 Service → Contains BookService (business logic).

🌐 Controller → Contains BookController (API endpoints).

🛠️ All configuration, including the database and server port, is managed in the application.properties file.

⚙️ Requirements
To run the project, make sure the following are installed:

☕ Java 17 or higher

🧪 Maven

🗄️ MySQL Server

🔧 Postman (optional, for testing)

🚀 How to Run the Project
📥 Clone the GitHub repository:

bash
Copiar
Editar
git clone https://github.com/your-username/bookApiUDB.git
cd bookApiUDB
🗂️ Create a MySQL database named bookdb.

🛠️ Edit the application.properties file with your database credentials:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
spring.datasource.username=root
spring.datasource.password=
▶️ Start the application:

bash
Copiar
Editar
./mvnw spring-boot:run
🔗 The API will be running at:
http://localhost:8081

📬 How to Use the API (with Postman)
➕ Add a book

POST → http://localhost:8081/api/books

Body (JSON):

json
Copiar
Editar
{
  "title": "The Hobbit",
  "author": "J.R.R. Tolkien",
  "publicationYear": 1937
}
📋 List all books

GET → http://localhost:8081/api/books

🔍 Search books by title

GET → http://localhost:8081/api/books/search?title=hobbit

🗑️ Delete a book by ID

DELETE → http://localhost:8081/api/books/1

