# 🎓 E-Learning System Ontology Project

Hi there! This project is a modeling study that connects the core components of an e-learning platform—such as students, instructors, courses, assignments, and grades. We built the ontology using the **OWL/RDF** format and verified everything using **Protégé** to ensure logical consistency.

## 👥 Meet the Team

We are a team of four classmates who collaborated on this project:

* **Fatma Alsaghir (220315105) — Content & Scope Writer**
    * Defined the purpose and boundaries of the system; documented what the ontology covers and what it leaves out.
* **Jalil Guliyev (220315102) — Structure & Hierarchy Designer**
    * Established the core classes (Student, Instructor, Course, etc.) and their hierarchical "is-a" relationships.
* **Mahammadali Aliyev (220315090) — Relationship & Rules Architect**
    * Defined the rules like "Which instructor teaches which course?" and implemented logical properties such as Transitive and Functional constraints.
* **Heydar Mehdizade (220315091) — Instance & GitHub Manager**
    * Managed the GitHub repository, prepared the documentation, and added the team members and a sample course (Job Safety) as "instances" into the ontology.

## 🛠 What's Inside?

* **Classes:** Person (Student, Instructor), Academic Content (Course, Module), Assessment (Assignment, Submission), and Evaluation (Grade).
* **Relationships:** Enrollment (`enrolledIn`), Teaching (`teaches`), Prerequisites (`hasPrerequisite`), and Grading (`hasGrade`).
* **Sample Data:** All team members are defined as students; additionally, our presentation topic "Job Safety Course (SAFE101)" is active in the system.

## 🚀 How to Use

1.  Download the **.rdf** file from this repository.
2.  Open **Protégé** and load the file.
3.  You can explore the hierarchy in the **Entities** tab and see our names in the **Individuals** tab.

---
*Created on: April 25, 2026*
