# 📌 ToDo Desktop Application  
### (Java Swing + Spring Boot + Hibernate + MySQL)

A simple desktop application to manage tasks using a combination of  
**Java Swing for UI**, **Spring Boot for backend**, and **Hibernate/JPA for ORM**.

The application supports full **CRUD operations**:
- ✅ Create  
- ✅ Read  
- ✅ Update  
- ✅ Delete  

---

## 🛠️ Teknologi yang Dipakai

| Teknologi | Keterangan |
|----------|-------------|
| Java Swing | UI Desktop |
| Spring Boot | Backend framework |
| Hibernate / JPA | ORM untuk database |
| MySQL | Database |
| Maven | Dependency management |

---

## 🧩 Fitur Aplikasi

- Tambah tugas (Title, Description, Deadline)  
- Ubah tugas  
- Hapus tugas  
- Melihat seluruh tugas  
- Klik baris → deskripsi tampil penuh  
- **Deadline wajib format `yyyy-MM-dd`**
>Contoh valid:
~2025-12-31
~2024-01-01

---

## 📥 Requirement

Pastikan sudah terinstall:

- Java 22  
- NetBeans (atau IDE lain)  
- MySQL  
- Maven  

---

## 🗃️ Setup Database

1. Buka MySQL  
2. Buat database: todo_db

---

**Then update the DB configuration inside:**
src/main/resources/application.properties

>Example:
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
⚠️ **Pastikan nama database sama seperti yang ada di file.**


**STRUKTUR PROJECT:**
main/
 ├─ ToDoApp.java               → Main class (Spring + Swing launcher)
 ├─ model/
 │    ├─ ToDo.java             → Entity
 │    └─ ModelTableToDo.java   → Table model Swing
 ├─ repository/
 │    └─ ToDoRepository.java
 ├─ service/
 │    └─ ToDoService.java
 ├─ controller/
 │    └─ ToDoController.java
 └─ view/
      └─ ToDoView.java        → UI Swing
