E-Learning System Ontology (v2)
This project presents a formal ontology model structured to represent core components of an e-learning platform. The architecture has been refactored in Version 2 to follow professional Knowledge Engineering standards.

🏗 Architectural Design: TBox vs. ABox Separation
In this version, we have decoupled the conceptual schema from the individual data to ensure a modular and scalable system architecture.

elearning-tbox.ttl (Schema Layer): Contains the core classes (e.g., Person, Course), properties (e.g., hasPrerequisite), and logical axioms/restrictions. This layer defines the "rules" of the domain.

elearning-abox.ttl (Data Layer): Contains the individuals (instances) and their specific relationships. This layer represents the "knowledge base" populated with real-world data.

Technical Advantages
Modularity: The schema can be reused across different educational datasets without modification.

Data Independence: The ABox can be programmatically updated (e.g., via LLM-based population) without affecting the core logic.

Reasoning Efficiency: Separating assertions from axioms allows for cleaner consistency checks using OWL reasoners (HermiT/Pellet).

🛠 Technical Stack
Language: OWL 2 (Turtle Syntax)

Editor: Protégé 5.x

Reasoning: Transitive property chains and Cardinality restrictions for automated inference.

Documentation: Generated via Widoco.
