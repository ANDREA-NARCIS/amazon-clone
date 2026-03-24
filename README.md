# 🛒 Amazon Clone (Spring Boot Project)

## 📌 Overview

This project is a **full-stack Amazon Clone web application** built using **Spring Boot, Thymeleaf, and H2 Database**. It replicates core e-commerce functionalities such as product listing, cart management, user authentication, and order placement.

---

## 🚀 Features

* 🔐 **User Authentication** (Register & Login)
* 🏠 **Home Page with Product Listings**
* 🛍️ **Add to Cart / Remove from Cart**
* 📦 **Place Orders (Checkout System)**
* 📜 **My Orders Section**
* 👤 **User Profile Management**
* 🖼️ **Product Image Display**
* 💾 **Persistent Database using H2 (File-based)**

---

## 🛠️ Tech Stack

**Backend:**

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Spring Security

**Frontend:**

* Thymeleaf
* HTML, CSS

**Database:**

* H2 Database

**Tools:**

* IntelliJ IDEA
* Git & GitHub

---

## 📂 Project Structure

```
src/
 ├── main/
 │   ├── java/com/ecommerce/amazon_clone/
 │   │   ├── controller/
 │   │   ├── model/
 │   │   ├── repository/
 │   │   ├── service/
 │   ├── resources/
 │   │   ├── templates/
 │   │   ├── static/
 │   │   ├── application.properties
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/ANDREA-NARCIS/amazon-clone.git
cd amazon-clone
```

### 2️⃣ Run the Application

* Open project in IntelliJ
* Run `AmazonCloneApplication.java`

---

## 🌐 Access the Application

* App URL: [http://localhost:8080](http://localhost:8080)
* H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

**H2 DB Credentials:**

* JDBC URL: `jdbc:h2:file:./data/testdb`
* Username: `sa`
* Password: *(leave empty)*

---

## 🧪 Functional Flow

1. New user → Register
2. Existing user → Login
3. Browse products
4. Add items to cart
5. Checkout → Place order
6. View orders in **My Orders**

---

## 📸 Screenshots (Add Later)

* Login/Register Page
  
<img width="733" height="543" alt="image" src="https://github.com/user-attachments/assets/848fa92a-5f3e-4baa-8048-73dfa9f48c24" />

* Home Page

<img width="1919" height="864" alt="image" src="https://github.com/user-attachments/assets/939249ae-aed2-4a41-a871-df954882bb55" />

* Cart Page

<img width="1919" height="734" alt="image" src="https://github.com/user-attachments/assets/220ae9b6-166a-4d45-879f-a79a23a71457" />

* Order Placed

<img width="1007" height="483" alt="image" src="https://github.com/user-attachments/assets/3f6d4a4f-9557-4f15-8c6a-6e8673d532f6" />

* Profile Page

<img width="664" height="472" alt="image" src="https://github.com/user-attachments/assets/36163166-229c-4e62-8884-56a1be0f71f7" />

* Orders Page

<img width="1919" height="578" alt="image" src="https://github.com/user-attachments/assets/ddedb263-2bc4-4d0b-923f-c973902e3b12" />


---

## 🔮 Future Enhancements

* 💳 Payment Integration (Razorpay/Stripe)
* 🔍 Product Search & Filters
* ⭐ Product Reviews & Ratings
* 📦 Order Tracking System
* 🧑‍💼 Admin Panel for Product Management

---


## 👨‍💻 Author
**Andrea Narcis**

---

⭐ If you like this project, give it a star on GitHub!
