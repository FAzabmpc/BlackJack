# 🃏 Java Blackjack Engine

[![Java](https://img.shields.io/badge/Java-8%2B-orange.svg)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A clean, object-oriented implementation of the classic Blackjack card game built in Java. Designed with strict adherence to OOP principles, clean code structure, and realistic game state management.

---

## 📋 Executive Summary

This project demonstrates core backend development capabilities in Java, focusing on structured program design, state handling, and interactive command-line interfaces. It translates standard casino rules into a reliable, modular application.

### Key Technical Highlights
- **Object-Oriented Architecture**: Clear segregation of domain entities (`Card`, `Deck`, `Hand`, `Player`, `Dealer`, `Game`).
- **Encapsulated State**: Game loop manages player interaction, dealer AI logic, and score calculations without tight coupling.
- **Dynamic Score Evaluation**: Ace values ($1$ or $11$) calculate continuously based on current hand totals to prevent unnecessary busts.

---

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK)**: Version 8 or higher installed on your system.
- **Git** (optional for cloning).

### Installation & Running the Game

#### Method 1: Command Line / Terminal
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/FAzabmpc/BlackJack.git](https://github.com/FAzabmpc/BlackJack.git)
   cd BlackJack
2. **Compile the Java source files:**
   ```bash
   javac -d bin $(find src -name "*.java")
3. **Run the Application**
   ```bash
   java -cp bin Main 
   
