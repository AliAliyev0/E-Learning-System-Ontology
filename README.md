# 🎓 E-Learning System Ontology Project

Hi there! This project is a modeling study that connects the core components of an e-learning platform—such as students, instructors, courses, assignments, and grades. [cite_start]We built the ontology using the **OWL/RDF** format and verified everything using **Protégé** to ensure logical consistency.

## 👥 Meet the Team

[cite_start]We are a team of four classmates who collaborated on this project[cite: 23, 24, 25, 26]:

* **Fatma Alsaghir (220315105) — Content & Scope Writer**
    * [cite_start]Defined the purpose and boundaries of the system; documented what the ontology covers and what it leaves out.
* **Jalil Guliyev (220315102) — Structure & Hierarchy Designer**
    * [cite_start]Established the core classes (Student, Instructor, Course, etc.) and their hierarchical "is-a" relationships[cite: 1, 19, 21, 30].
* **Mahammadali Aliyev (220315090) — Relationship & Rules Architect**
    * [cite_start]Defined the rules like "Which instructor teaches which course?" and implemented logical properties such as Transitive and Functional constraints[cite: 4, 6, 15, 30].
* **Heydar Mehdizade (220315091) — Instance & GitHub Manager**
    * [cite_start]Managed the GitHub repository, prepared the documentation, and added us (the team members) and a sample course (Job Safety) as "instances" into the ontology[cite: 32, 42].

## 🛠 What's Inside?

* [cite_start]**Classes:** Person (Student, Instructor), Academic Content (Course, Module), Assessment (Assignment, Submission), and Evaluation (Grade)[cite: 17, 18, 19, 21, 30].
* [cite_start]**Relationships:** Enrollment (`enrolledIn`), Teaching (`teaches`), Prerequisites (`hasPrerequisite`), and Grading (`hasGrade`)[cite: 2, 3, 5, 9, 30].
* [cite_start]**Sample Data:** All team members are defined as students; additionally, our presentation topic "Job Safety Course (SAFE101)" is active in the system[cite: 32, 42].

## 🚀 How to Use

1.  Download the **.rdf** file from this repository.
2.  Open **Protégé** and load the file.
3.  You can explore the hierarchy in the **Entities** tab and see our names in the **Individuals** tab.

---
[cite_start]*Created on: April 25, 2026 [cite: 27]*
