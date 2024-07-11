# 📝 To-Do Application

A simple and efficient To-Do application developed using Spring Boot for the backend and Thymeleaf for the frontend. This application allows users to manage their tasks effectively with features such as creating, viewing, editing, and deleting tasks.

## Features

- 🗂️ **Task Management**: Create, read, update, and delete tasks.
- 💻 **User-Friendly Interface**: Intuitive and responsive design using HTML, CSS, and Bootstrap.
- 🛠️ **Backend**: Powered by Spring Boot, ensuring a robust and scalable application.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- ☕ Java 8 or higher
- 🐍 Maven 3.6.0 or higher
- 🗄️ MySQL or any other relational database

## Installation

1. **Clone the Repository**

    ```bash
    git clone https://github.com/yourusername/todo-app.git
    ```

2. **Navigate to the Project Directory**

    ```bash
    cd todo-app
    ```

3. **Configure the Database**

    Update the `application.properties` file located in `src/main/resources` with your database configurations:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/todoapp
    spring.datasource.username=yourUsername
    spring.datasource.password=yourPassword
    spring.jpa.hibernate.ddl-auto=update
    ```

4. **Build the Project**

    Use Maven to build the project:

    ```bash
    mvn clean install
    ```

5. **Run the Application**

    ```bash
    mvn spring-boot:run
    ```

6. **Access the Application**

    Open your web browser and go to [http://localhost:8070](http://localhost:8070) to view the application.

## Usage

1. **🏠 Home Page**

    The home page displays a list of all tasks. Each task shows the title, description, and due date. You can add a new task, edit an existing task, or delete a task.

    ![Home Page](screenshots/home_page.png)

2. **➕ Add Task**

    Click on the "Add Task" button to navigate to the add task page. Fill in the required details and submit the form to add a new task.

    ![Add Task](screenshots/add_task.png)

3. **✏️ Edit Task**

    Click on the "Edit" button next to a task to navigate to the edit task page. Update the necessary details and submit the form to save changes.

    ![Edit Task](screenshots/edit_task.png)

4. **🗑️ Delete Task**

    Click on the "Delete" button next to a task to remove it from the list.

## Project Structure

    ```
    todo-app/
    ├── src/
    │   ├── main/
    │   │   ├── java/com/example/todo/
    │   │   │   ├── controller/
    │   │   │   │   └── TaskController.java
    │   │   │   ├── entity/
    │   │   │   │   └── Task.java
    │   │   │   ├── repository/
    │   │   │   │   └── TaskRepository.java
    │   │   │   ├── service/
    │   │   │   │   └── TaskService.java
    │   │   ├── resources/
    │   │   │   ├── static/
    │   │   │   │   └── css/
    │   │   │   │       └── styles.css
    │   │   │   ├── templates/
    │   │   │   │   ├── index.html
    │   │   │   │   ├── add-task.html
    │   │   │   │   └── edit-task.html
    │   │   │   └── application.properties
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── README.md
    ```

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch.
3. Make your changes.
4. Submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries, please contact [Krishn Gopal Sharma](mailto:panditgopal800@gmail.com).

---
