# Solar System Simulation

A real-time 2D solar system simulation built in Java to demonstrate object-oriented design, graphical rendering, and animation fundamentals.

## Overview

**Why this matters:**
- Designed and implemented a complete OOP class hierarchy from scratch (7 classes, 150+ objects)
- Built a custom animation loop rendering at 50 FPS with thread-safe operations
- Applied mathematical modeling (trigonometry, polar-to-Cartesian transforms) to create realistic orbital mechanics

**Key skills demonstrated:**
Java • Object-Oriented Programming • Swing/AWT • Graphics2D • Mathematical Modeling • Clean Architecture

Built to strengthen my understanding of object-oriented design, graphical programming, and real-time systems beyond coursework. Demonstrates concepts directly transferable to game development, UI programming, and frontend animation work.

---

## Technical Highlights

### Object-Oriented Design
- **Inheritance Hierarchy**: `Sun` → `Planet` → `Moon`/`Asteroid` with proper encapsulation and polymorphism
- **Smart Architecture**: Created separate `Planet` and `Planet2` classes for different rotation speeds instead of conditional logic
- **150+ Objects**: Efficiently manages 9 planets, 4 moons, 144 asteroids, rendered simultaneously

### Graphics & Animation
- **Real-Time Rendering**: 50 FPS animation loop with synchronized drawing operations
- **Coordinate Mathematics**: Polar-to-Cartesian transformations for accurate orbital positioning
- **Nested Orbits**: Moons orbit planets that orbit the sun using relative coordinate systems
- **Visual Polish**: Anti-aliasing, double-buffering, layered rendering (Saturn's rings, sun flare effect)

### Code Quality
- Comprehensive JavaDoc documentation for all classes and methods
- Clean separation of concerns (each celestial type in its own class)
- Thread-safe rendering with synchronized blocks
- Follows SOLID principles (especially Open/Closed for extensibility)

---

## Quick Start
```bash
javac *.java
java Driver
```

Opens a 1050x1050 window with animated solar system. Close window to exit.

---

## Project Structure
```
Sun (base class)
├── Planet (standard rotation)
│   ├── Moon (orbits planets)
│   └── Asteroid (asteroid belt)
└── Planet2 (faster rotation variant)
```

- `Driver.java` — Main entry point, initializes all objects and animation loop
- `Sun.java` — Base class with distance, angle, diameter, color properties
- `Planet.java` / `Planet2.java` — Orbital mechanics with different rotation speeds
- `Moon.java` — Orbits planets using relative positioning
- `Asteroid.java` — Procedurally generated asteroid belt (144 objects)
- `SolarSystem.java` — Graphics engine (provided framework)

---

## Technologies

**Core:** Java SE 8+, Swing/AWT, Java 2D Graphics API

**Concepts:** OOP (inheritance, polymorphism, encapsulation), multi-threading, trigonometry, coordinate systems, real-time rendering, event loops

---

## Key Implementation Details

### Coordinate Transformation
Converts polar coordinates (distance, angle) to screen coordinates (x, y):
```
x = centerX + distance × sin(angle) - diameter/2
y = centerY + distance × cos(angle) - diameter/2
```

### Animation Loop
```java
while (true) {
    // Draw all objects at calculated positions
    // Increment angles for rotation
    // Repaint buffer (20ms delay = 50 FPS)
    // Clear for next frame
}
```

### Asteroid Belt Generation
Programmatically generated 144 asteroids in two staggered rings between Mars and Jupiter using nested loops with 5° angular spacing.

---

## What I Learned

- **OOP Design**: When to use inheritance vs composition, designing extensible class hierarchies
- **Graphics Programming**: Double-buffering, rendering pipelines, coordinate transformations
- **Performance**: Thread synchronization, frame timing, efficient object management
- **Math in Practice**: Applying trigonometry to solve real visual problems

---

## Requirements

- Java JDK 8+
- Any OS (Windows/Mac/Linux)

---

<details>
<summary><strong>Technical Details (Expand for deep dive)</strong></summary>

### Celestial Objects Configuration

**Planets:**
- Mercury through Neptune at scaled distances (115 to 450 units)
- Color-coded with hex values matching actual planet colors
- Varying sizes (15px for Mercury, 55px for Jupiter)

**Moons:**
- Earth (1 moon), Mars (2 moons), Jupiter (1 moon)
- Independent rotation around parent planets

**Special Effects:**
- Dual-layer sun (yellow flare + red core)
- Saturn's ring system (separate white ring object)
- 144-asteroid belt (two orbital rings at 265/270 units)

### Performance Characteristics
- 50 FPS (20ms frame time)
- Thread-safe with synchronized rendering
- Up to 1000 objects per frame supported
- Automatic cleanup prevents memory leaks

</details>

---

*This project demonstrates proficiency in Java, OOP design patterns, mathematical modeling, and real-time graphics — skills directly applicable to software engineering roles.*
