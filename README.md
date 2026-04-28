E-Learning System Ontology Project Overview

This project presents a basic ontology model that structures the core components of an e-learning platform, including students, instructors, courses, modules, assignments, submissions, and grades. The ontology is developed using the OWL/RDF format and implemented in Protégé. It ensures logical consistency and supports basic academic queries.

Team Members and Contributions:
This project was developed collaboratively by a team of four members:

Haydar Mehdizade (220315091) — Specification Writer (Member A): Responsible for writing the main documentation, including Purpose, Scope, Intended Uses, and End-User definitions.
Jalil Guliyev (220315102) — Ontology Architect (Member B): Designed the class hierarchy and defined the core concepts and “is-a” relationships.
Fatma Alsaghir (220315105) — Lead Ontology Engineer (Member C): Defined object and data properties, developed competency questions, and ensured logical consistency.
Mahammadali Aliyev (220315090) — GitHub, Instances, and Glossary Manager (Member D): Managed the GitHub repository, prepared the README, created example instances, and contributed to the glossary.


Core Classes:

Person: Includes Student and Instructor.
AcademicContent: Includes Course and Module.
Assessment: Includes Assignment.
Submission: Modeled as a separate class representing student submissions.
Evaluation: Includes Grade.


Logical Properties and Features:

Transitivity: The hasPrerequisite property is transitive, allowing inference across prerequisite chains.
Inverse Relationships: The ontology includes inverse properties such as enrolledIn ↔️ hasStudent and teaches ↔️ isTaughtBy.
Functional Properties: Certain data properties (e.g., submissionDate, courseCode) are defined as functional to ensure a single value per instance.


Example Data:
The ontology includes example instances to demonstrate functionality, such as:

A sample course and instructor.
Students enrolled in the course.
Assignments and related submissions.
Grades assigned to submissions.


How to Use:
Download the ontology file (E-Learning_Ontology.rdf) from the repository.
Open Protégé and load the file.
Explore the class hierarchy in the Classes tab and instances in the Individuals tab.
Run a reasoner (e.g., HermiT) to verify logical consistency.


Files:
E-Learning_Ontology.rdf — Ontology file.
E-Learning_Ontology_Document.docx — Specification document.


Tools Used:
Protégé
OWL/RDF


Created On:
April 25, 2026
