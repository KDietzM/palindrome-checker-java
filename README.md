# PalindromeChecker

Example project for CI/CD Sprintwoche of SCDH, written in Java.


## Ein einfaches Java-Projekt zum Prüfen, ob ein gegebener Text ein Palindrom ist.
Das Projekt enthält:
- eine Konsolenanwendung (Palindrome.java)
- unit tests mit JUnit 5
- automatische Testausführung per GitLab CI
 
## Features
- Prüft, ob ein Text ein Palindrom ist
- Ignoriert Groß-/Kleinschreibung (durch separate Hilfsmethoden)
- Entfernt Leerzeichen
- JUnit-Tests
- GitLab CI führt Tests nach jedem Push automatisch aus

## Run
`mvn compile exec:java -Dexec.mainClass="de.ulbms.scdh.spike.git.Palindrome"`

oder 

`javac src/main/java/de/ulbms/scdh/spike/git/Palindrome.java
java -cp src/main/java de.ulbms.scdh.spike.git.Palindrome`

## Authors and License
(c) 2025 Katharina Dietz, Christian Lück
Released under the MIT license.