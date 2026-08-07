# Hibernate Practice

This repository contains my hands-on practice and learning journey with **Hibernate ORM** using Java.

I am building different examples to understand how Hibernate works with databases, entity mappings, CRUD operations, queries, and other important ORM concepts.

## Technologies Used

* Java
* Hibernate ORM
* Maven
* MySQL
* JDBC
* IntelliJ IDEA / Eclipse
* Git & GitHub

## Topics Covered

| Topic                | Description                                      |
| -------------------- | ------------------------------------------------ |
| Hibernate Setup      | Basic Hibernate configuration and project setup  |
| CRUD Operations      | Create, Read, Update and Delete operations       |
| One-to-One Mapping   | Mapping between two entities                     |
| One-to-Many Mapping  | Mapping one entity with multiple entities        |
| Many-to-One Mapping  | Mapping multiple entities to one entity          |
| Many-to-Many Mapping | Mapping multiple entities with multiple entities |
| HQL                  | Hibernate Query Language                         |
| JPQL                 | Java Persistence Query Language                  |
| Fetching             | Eager and Lazy fetching                          |
| Cascading            | Cascade operations between entities              |

## Project Structure

```text
Hibernate/
│
├── oneToMany/
│   ├── App.java
│   ├── Customer.java
│   ├── CustomerDetails.java
│   └── Orders.java
│
└── README.md
```

More Hibernate concepts and examples will be added as I continue learning.

## Current Practice

### One-to-Many Mapping

The `oneToMany` example demonstrates a relationship where one entity can be associated with multiple entities.

Example:

```text
Customer
   |
   ├── Order 1
   ├── Order 2
   └── Order 3
```

This example helps understand entity relationships and Hibernate annotations used for mapping entities.

## Purpose

The main purpose of this repository is to:

* Practice Hibernate concepts through hands-on examples.
* Understand ORM and entity relationships.
* Improve Java backend development skills.
* Maintain a record of my learning progress.
* Build a reference for future Spring Boot and JPA development.

## Future Learning

I will continue adding examples covering:

* Advanced Hibernate mappings
* HQL and JPQL
* Transactions
* Fetch strategies
* Cascading
* Hibernate caching
* JPA
* Spring Data JPA

---

**Learning and practicing Java Backend Development with Hibernate.**

