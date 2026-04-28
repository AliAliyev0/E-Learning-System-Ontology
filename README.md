🎓 E-Learning System Ontology Project
Overview
This project is a sophisticated modeling study that structures the core components of an e-learning platform—including students, instructors, courses, assignments, and grades. Developed using the OWL/RDF format and verified via Protégé, the ontology ensures logical consistency and supports complex academic queries.  

👥 Meet the Team
We are a team of four collaborators who structured this system:

Haydar Mehdizade (220315091) — Specification Writer (Member A): Authored the foundational documentation, including the Purpose, Scope, Intended Uses, and End-User definitions.  
Jalil Guliyev (220315102) — Ontology Architecture Expert (Member B): Established the core taxonomy and hierarchy, defining the "is-a" relationships between classes like Person, AcademicContent, and Assessment.  
Fatma Alsaghir (220315105) — Lead Ontology Engineer (Member C): Defined the functional requirements through Competency Questions and engineered the Object/Data Properties while ensuring logical consistency.  
Mahammadali Aliyev (220315090) — GitHub, Instances & Glossary Manager (Member D): Managed the GitHub repository and README, prepared the pre-glossary of terms, and populated the ontology with practical instances (individuals).  

🛠 Technical Features
Core Classes

Person: Subclasses include Student and Instructor.  
Academic Content: Includes Course and Module.  
Assessment: Covers Assignment and Submission.  
Evaluation: Specifically the Grade class.  


Logical Properties & Rules

Transitivity: The hasPrerequisite property is transitive; if Course A requires B, and B requires C, the system infers that A requires C.  
Inverse Relationships: Bidirectional navigation is supported through inverse properties like enrolledIn ↔ hasStudent and teaches ↔ isTaughtBy.  
Functionality: Constraints ensure data integrity, such as ensuring a Submission is linked to exactly one Grade.  

🚀 Sample Data & Testing
The ontology is pre-populated with a sample environment to demonstrate its capabilities:
Active Course: CS-550: Knowledge Engineering and Ontologies taught by Dr. Alan Smith.  
Student Instances: All team members are enrolled in the system.  
Sample Assessment: A specific submission for the GitHubRepo assignment is recorded for Fatma Alsaghir, featuring a score of 100.0.  

📊 How to Use
Download the E-Learning_Ontology.rdf file from this repository.

Open Protégé and load the file.
Navigate to the Entities tab to explore the hierarchy or the Individuals tab to see the team and course data.  
Run a Reasoner (e.g., HermiT or Pellet) to verify logical consistency.  

Created on: April 25, 2026
