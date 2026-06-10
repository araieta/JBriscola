# Jbriscola Project - Agent Instructions

## IMPORTANT
- LET THE PROGRAMMER THE JOB TO WRITE CODE!!!
## Project Overview
- Java application implementing the Briscola card game
- Follows MVC architectural pattern
- GUI built with AWT and Swing
- Player data stored in CSV format
- Uses design patterns: Singleton, Observer/Observable, Factory, Strategy, Annotation

## Key Constraints
- No external libraries allowed (except standard Java libraries)
- Player data CSV format: nickname, partite_vinte, partite_perse, livello, punteggio_totale
- Must use Maven for build management

## Development Guidelines
- Plan code structure before implementation
- Follow existing package structure under `src/main/java/it/uniroma1/araieta/`
- User will implement the actual code (do not auto-generate)

## Build Commands
- Compile: `mvn compile`
- Run: `mvn exec:java -Dexec.mainClass="it.uniroma1.araieta.Main"`2
- Test: `mvn test` (when tests are added)

## Architecture Notes
- Model: Game logic, player data, card representations
- View: AWT/Swing GUI components
- Controller: Game flow management
- Player registration and data persistence via CSV files
- Design patterns must be properly implemented:
  * Singleton: For game manager/registry classes
  * Observer/Observable: For GUI updates based on model changes
  * Factory: For card/deck creation
  * Strategy: For different game/AI strategies
  * Annotation: For metadata or behavioral markers

## File Structure
```
src/
├── main/
│   ├── java/it/uniroma1/araieta/
│   │   ├── model/       # Game logic, player data
│   │   ├── view/        # GUI components
│   │   ├── controller/  # Game flow control
│   │   └── Main.java     # Entry point
│   └── resources/       # CSV files, images, etc.
└── test/java/           # Unit tests when implemented
```