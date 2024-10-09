# 1. Introduktion till IntelliJ IDEA

## Föreläsningsmaterial

### Läsmaterial

- Infoklassrum
    - Likabehandlingsplan
    - Studenthandboken

### Översikt av IntelliJ IDEA

#### 1. Vad är IntelliJ IDEA?

- **Introduktion:** IntelliJ IDEA är en av de mest populära och kraftfulla utvecklingsmiljöerna (IDE) för
  Java-utveckling. Den erbjuder många verktyg och funktioner som gör det lättare att skriva, testa och felsöka kod.
- **Varför använda IntelliJ IDEA?:** Den har omfattande stöd för Java, kraftfull kodkomplettering, integration med
  versionhanteringssystem (som GIT), och inbyggda verktyg för att förbättra produktiviteten.

#### 2. Skapa och konfigurera ett Java-projekt

- **Steg-för-steg:**
    1. **Starta IntelliJ IDEA** och välj "New Project" i startskärmen.
    2. Välj "Java" som projektets språk och säkerställ att JDK (Java Development Kit) är korrekt konfigurerat (Corretto
       21).
    3. Ge projektet ett namn och välj var du vill spara det.
    4. Klicka på "Finish" för att skapa projektet.

- **Genomgång av projektstrukturen:**
    - **src-katalogen:** Här ligger all källkod som ni skriver.
    - **External Libraries:** Visar de bibliotek och resurser som är tillgängliga för projektet.

#### 3. Genomgång av grundläggande funktioner

- **Kodinmatning och navigering:**
    - **Kodkomplettering:** IntelliJ erbjuder kraftfull kodkomplettering som kan öka din produktivitet. Testa att börja
      skriva en metod, och IntelliJ kommer att föreslå möjliga avslutningar.
    - **Navigering:** Dubbelklicka på en klass eller metodnamn för att hoppa till dess definition.
    - **Refaktorisering:** Högerklicka på ett element (som en variabel eller metod) och välj "Refactor" för att
      automatiskt byta namn, extrahera metoder eller utföra andra omstruktureringar av koden.

- **Felsökning:**
    - **Breakpoint och Debugging:** Introducera hur man sätter ut breakpoints (klicka till vänster om radnumret) och hur
      man kör programmet i Debug-läge.
    - **Stegvis körning:** Hur man går igenom koden rad för rad för att se hur den körs i realtid.

#### 4. Installera och hantera plugins

- **Vad är plugins?**: Plugins i IntelliJ IDEA tillför extra funktionalitet, allt från stöd för fler programmeringsspråk
  till verktyg för kodanalys.
- **Installation av plugins:**
    1. Gå till `File > Settings > Plugins`.
    2. Sök efter ett plugin i marknadsplatsen, installera följkande plugin:
        - **Obligatoriska:**
            - Key Promoter X
            - Maven Dependency Checker
            - Rainbow Brackets
            - SonarLint
        - **Frivilliga:**
            - Atom Material Icons
            - Indent Rainbow
            - Mario Progress Bar
            - Material Theme UI
    3. Klicka på "Install" och starta om IntelliJ om nödvändigt.

#### 5. Viktiga inställningar och genvägar

- **Korta genomgångar:**
    - **Settings-meny:** Hur man ändrar teman, typsnitt och andra IDE-inställningar.
    - **Genvägar:** Visa vanliga genvägar som `Ctrl + Space` för kodkomplettering, `Shift + Shift` för att söka överallt
      i projektet, och `Ctrl + D` för att duplicera rader.
- `Editor > General > Auto Imports` (klicka i):
    - Add unambiguous imports on the fly
    - Optimize imports on the fly
- `Editor > General > Code Folding` (klicka ur):
    - General:
        - File header
        - Imports
    - Java:
        - one-line methods
        - "Closures" (anonymous classes implementing a...)
        - Generic constructor and method parameters
- `Editor > General > Apperance` (klicka i):
    - Show line numbers
    - Show method separators

---

# 2. Repetition av Klasser och Objekt (45 min)

## Föreläsningsmaterial

### Repetition av Klasser och Objekt

#### 1. Vad är en klass och ett objekt?

- **Definition av en klass:**
    - En klass är en mall eller en blueprint för att skapa objekt. Den beskriver vilka attribut (variabler) och
      beteenden (metoder) ett objekt kommer att ha.
    - Exempel: En klass kan representera en bil, där attributen kan vara märke, modell och år, och beteendena kan vara
      att starta bilen, köra den och stanna.

- **Definition av ett objekt:**
    - Ett objekt är en instans av en klass. Det är en konkret representation av klassen med specifika värden för dess
      attribut.
    - Exempel: Om "Car" är klassen, kan ett objekt vara en specifik bil, t.ex. en Tesla Model S från 2021.

- **Varför använda klasser och objekt?:**
    - Fördelar med att använda klasser och objekt inkluderar ökad modularitet, kodåteranvändning och en bättre struktur
      för att hantera komplexa program.

#### 2. Skapa en klass och ett objekt i Java

- **Skapa en klass:**
    - Visa ett enkelt exempel på hur man skapar en klass i Java.
  ```java
  public class Car {
      String brand;
      String model;
      int year;

      void startEngine() {
          System.out.println("Engine started.");
      }
  }
  ```
    - Gå igenom klassens komponenter: attribut (brand, model, year) och metoder (startEngine).

- **Skapa ett objekt av klassen:**
    - Förklara hur man skapar ett objekt av en klass och tilldelar värden till dess attribut.
  ```java
  public class Main {
      public static void main(String[] args) {
          Car myCar = new Car();
          myCar.brand = "Tesla";
          myCar.model = "Model S";
          myCar.year = 2021;

          myCar.startEngine();
      }
  }
  ```
    - Diskutera hur objektet `myCar` representerar en specifik bil och hur man använder dess metoder.

#### 3. Användning av fält och metoder

- **Fält (attribut):**
    - Fält lagrar objektets tillstånd. Diskutera hur man deklarerar och initialiserar fält.
    - Exempel: `String brand = "Tesla";` är ett fält som lagrar bilmärket.

- **Metoder:**
    - Metoder definierar objektets beteende. Förklara hur metoder fungerar och varför de är viktiga.
    - Exempel: `startEngine()` är en metod som representerar beteendet att starta bilens motor.

#### 4. Sammanhang och exempel

- **Använda klasser och objekt tillsammans:**
    - Visa hur man kan skapa flera objekt från samma klass och hur varje objekt kan ha olika värden för sina fält.
  ```java
  Car car1 = new Car();
  car1.brand = "Toyota";
  car1.model = "Corolla";
  car1.year = 2020;

  Car car2 = new Car();
  car2.brand = "Honda";
  car2.model = "Civic";
  car2.year = 2019;
  ```
    - Förklara att även om både `car1` och `car2` är objekt av klassen `Car`, representerar de två olika bilar med olika
      tillstånd.

- **Exempel med metodanrop:**
    - Låt studenterna förstå hur metodanrop fungerar i praktiken genom att visa fler exempel.
    - Exempel: Lägg till en metod `drive()` i klassen `Car` som skriver ut en enkel text, t.ex. `"The car is driving"`.

---

# 3. Konstruktorer i Java

## Föreläsningsmaterial

### Konstruktorer i Java

#### 1. Vad är en konstruktor?

- **Definition:**
    - En konstruktor är en speciell metod i en klass som anropas när ett objekt av klassen skapas. Den används för att
      initialisera objektet.
    - Konstruktorer har samma namn som klassen och har ingen returtyp, inte ens `void`.

- **Syfte med konstruktorer:**
    - Huvudsyftet med en konstruktor är att sätta upp initialvärden för objektets fält när objektet skapas.
    - Exempel: Om vi har en klass `Car` med fält för `brand`, `model`, och `year`, kan vi använda en konstruktor för att
      ställa in dessa värden direkt när vi skapar en ny bil.

#### 2. Standardkonstruktor

- **Vad är en standardkonstruktor?:**
    - Om ingen konstruktor är definierad i en klass, tillhandahåller Java automatiskt en standardkonstruktor som inte
      tar några parametrar och inte gör något.
    - Exempel:
      ```java
      public class Car {
          String brand;
          String model;
          int year;
  
          // Ingen konstruktor är definierad, så Java tillhandahåller en standardkonstruktor
      }
      
      public class Main {
          public static void main(String[] args) {
              Car myCar = new Car(); // Anropar standardkonstruktorn
          }
      }
      ```

#### 3. Anpassad konstruktor

- **Vad är en anpassad konstruktor?:**
    - En anpassad konstruktor är en konstruktor som du själv definierar för att ta emot parametrar och använda dem för
      att initialisera objektets fält.
    - Exempel:
      ```java
      public class Car {
          String brand;
          String model;
          int year;
  
          // Anpassad konstruktor
          public Car(String brand, String model, int year) {
              this.brand = brand;
              this.model = model;
              this.year = year;
          }
      }
      
      public class Main {
          public static void main(String[] args) {
              Car myCar = new Car("Tesla", "Model S", 2021); // Anropar anpassad konstruktor
              System.out.println(myCar.brand + " " + myCar.model + " " + myCar.year);
          }
      }
      ```

- **Fördelar med att använda en anpassad konstruktor:**
    - Du kan säkerställa att alla objekt har korrekt initialiserade värden direkt vid skapandet.
    - Du kan ha flera konstruktörer i samma klass (överlagrade konstruktörer) som tillåter olika sätt att skapa ett
      objekt.

#### 4. Överlagrade konstruktörer

- **Vad är överlagrade konstruktörer?:**
    - Överlagrade konstruktörer är flera konstruktörer i samma klass som har olika parametrar. Detta ger flexibilitet
      vid skapandet av objekt.
    - Exempel:
      ```java
      public class Car {
          String brand;
          String model;
          int year;
  
          // Konstruktor 1
          public Car(String brand, String model, int year) {
              this.brand = brand;
              this.model = model;
              this.year = year;
          }
  
          // Konstruktor 2
          public Car(String brand, String model) {
              this(brand, model, 2020); // Använder den första konstruktorn för att sätta standardvärde för year
          }
  
          // Konstruktor 3
          public Car() {
              this("Unknown", "Unknown", 0); // Sätter standardvärden för alla fält
          }
      }
      
      public class Main {
          public static void main(String[] args) {
              Car car1 = new Car("Tesla", "Model S", 2021);
              Car car2 = new Car("Ford", "Mustang");
              Car car3 = new Car();
          }
      }
      ```

- **Användning av `this` för att kalla på andra konstruktörer:**
    - `this()` kan användas för att anropa en annan konstruktor i samma klass. Detta hjälper till att undvika
      kodupprepning.

#### 5. Konstruktorer och inkapsling

- **Konstruktorers roll i inkapsling:**
    - Konstruktorer kan användas tillsammans med inkapsling för att kontrollera hur objekt skapas och för att
      säkerställa att de är i ett giltigt tillstånd.
    - Exempel: Du kan lägga till validering i en konstruktor för att säkerställa att inga ogiltiga värden tilldelas
      objektets fält.

---

# 4. Användning av Objektreferenser och Metodanrop

## Föreläsningsmaterial

### Användning av Objektreferenser och Metodanrop

#### 1. Vad är en objektreferens?

- **Definition:**
    - En objektreferens är en variabel som pekar på ett objekt i minnet. Den refererar till det faktiska objektet som
      skapats i minnet när vi använder `new`-operatorn.
    - Exempel: När vi skapar ett objekt av en klass, som `Car myCar = new Car();`, så är `myCar` en referens till
      objektet i minnet.

- **Hur objektreferenser fungerar:**
    - Objektreferenser håller inte objektet självt utan pekar på var objektet finns i datorns minne.
    - Flera referenser kan peka på samma objekt. Detta innebär att om en referens modifierar objektet, så ser alla
      referenser den förändringen.
    - Exempel:
      ```java
      Car myCar = new Car("Tesla", "Model S", 2021);
      Car anotherCar = myCar; // anotherCar pekar på samma objekt som myCar
      anotherCar.year = 2022; // Ändring via anotherCar påverkar också myCar
      System.out.println(myCar.year); // Utskrift: 2022
      ```

#### 2. Vad händer i minnet?

- **Minneslayout:**
    - När ett objekt skapas, allokeras minne för objektets fält. Referensen tilldelas en adress till detta minne.
    - Referenser är som pekare i C/C++ men hanteras automatiskt av JVM (Java Virtual Machine).

- **Garbage Collection:**
    - När ett objekt inte längre har några referenser, blir det tillgängligt för Garbage Collection, vilket betyder att
      minnet kan frigöras.

#### 3. Metodanrop på objekt

- **Vad är metodanrop?:**
    - Ett metodanrop innebär att du använder en objektreferens för att anropa en metod som är definierad i klassen.
    - Exempel:
      ```java
      Car myCar = new Car("Tesla", "Model S", 2021);
      myCar.startEngine(); // Anropar metoden startEngine() på myCar-objektet
      ```

- **Passering av objektreferenser till metoder:**
    - När du skickar en objektreferens till en metod som parameter, skickar du inte själva objektet, utan en referens
      till objektet.
    - Exempel:
      ```java
      public class Mechanic {
          public void upgradeCar(Car car) {
              car.year = 2023;
          }
      }
      
      public class Main {
          public static void main(String[] args) {
              Car myCar = new Car("Tesla", "Model S", 2021);
              Mechanic mechanic = new Mechanic();
              mechanic.upgradeCar(myCar); // myCar år blir nu 2023
              System.out.println(myCar.year); // Utskrift: 2023
          }
      }
      ```

- **Returnera objektreferenser från metoder:**
    - Metoder kan också returnera objektreferenser.
    - Exempel:
      ```java
      public class CarFactory {
          public Car createCar(String brand, String model, int year) {
              return new Car(brand, model, year);
          }
      }
      
      public class Main {
          public static void main(String[] args) {
              CarFactory factory = new CarFactory();
              Car myCar = factory.createCar("Ford", "Mustang", 2022);
              System.out.println(myCar.model); // Utskrift: Mustang
          }
      }
      ```

#### 4. Objektreferenser och likhet (`==` och `.equals()`)

- **Skillnaden mellan `==` och `.equals()`:**
    - `==` kontrollerar om två referenser pekar på samma objekt i minnet.
    - `.equals()` kontrollerar om två objekt är lika i värde (beroende på hur metoden är implementerad).
    - Exempel:
      ```java
      Car car1 = new Car("Tesla", "Model S", 2021);
      Car car2 = new Car("Tesla", "Model S", 2021);
      Car car3 = car1;
  
      System.out.println(car1 == car2); // Utskrift: false
      System.out.println(car1.equals(car2)); // Utskrift: true (förutsatt att equals() är korrekt implementerad)
      System.out.println(car1 == car3); // Utskrift: true
      ```

#### 5. Sammanfattning och viktiga punkter

- **Objektreferenser är kraftfulla och flexibla, men kräver förståelse för att undvika vanliga fel, som att oavsiktligt
  ändra objekt via flera referenser.**
- **Att förstå skillnaden mellan `==` och `.equals()` är kritiskt när man jämför objekt.**

---

# 5. Sammanfattning av Klasser och Objekt

## Föreläsningsmaterial

### Sammanfattning av Klasser och Objekt

#### 1. Recap: Vad är en klass och ett objekt?

- **Definition av en klass:**
    - En klass är en blueprint för objekt som beskriver deras attribut och beteenden. Den definierar fält (variabler)
      och metoder (funktioner) som objekt skapade från klassen kommer att ha.
    - Exempel: Klassen `Car` kan ha attribut som `brand`, `model`, och `year`, samt metoder som `startEngine()` och
      `stopEngine()`.

- **Definition av ett objekt:**
    - Ett objekt är en instans av en klass. När du skapar ett objekt, reserveras minne för objektets attribut, och
      metoderna blir tillgängliga för att användas.
    - Exempel: Ett objekt av klassen `Car` kan vara en specifik bil som har värden för `brand = "Tesla"`,
      `model = "Model S"`, och `year = 2021`.

#### 2. Konstruktorer och initialisering

- **Konstruktorer:**
    - En konstruktor är en speciell metod som körs när ett objekt skapas. Dess huvudsyfte är att initialisera objektets
      attribut.
    - Exempel:
      ```java
      public class Car {
          String brand;
          String model;
          int year;
  
          // Konstruktor
          public Car(String brand, String model, int year) {
              this.brand = brand;
              this.model = model;
              this.year = year;
          }
      }
      ```

- **Överlagrade konstruktörer:**
    - Du kan ha flera konstruktörer i en klass med olika parametrar för att ge flexibilitet vid skapandet av objekt.
    - Exempel:
      ```java
      public class Car {
          String brand;
          String model;
          int year;
  
          // Konstruktor 1
          public Car(String brand, String model, int year) {
              this.brand = brand;
              this.model = model;
              this.year = year;
          }
  
          // Konstruktor 2
          public Car(String brand, String model) {
              this(brand, model, 2020); // Standardvärde för year
          }
      }
      ```

#### 3. Metoder och metodanrop

- **Metoder:**
    - Metoder definierar objektets beteenden. De kan manipulera objektets fält och utföra beräkningar eller andra
      operationer.
    - Exempel:
      ```java
      public class Car {
          String brand;
          String model;
          int year;
  
          public void startEngine() {
              System.out.println("Engine started.");
          }
      }
      ```

- **Metodanrop:**
    - När du anropar en metod på ett objekt, utförs den kod som definieras i metoden på det specifika objektet.
    - Exempel:
      ```java
      Car myCar = new Car("Tesla", "Model S", 2021);
      myCar.startEngine(); // Anropar metoden startEngine() på myCar-objektet
      ```

#### 4. Objektreferenser och deras användning

- **Vad är en objektreferens?:**
    - En objektreferens är en variabel som pekar på ett objekt i minnet. Alla operationer på objektet görs via
      referensen.
    - Exempel:
      ```java
      Car myCar = new Car("Tesla", "Model S", 2021);
      Car anotherCar = myCar; // anotherCar är en referens till samma objekt som myCar
      ```

- **Passera objektreferenser till metoder:**
    - När du skickar en objektreferens till en metod, skickas inte en kopia av objektet utan en pekare till det. Alla
      ändringar som görs på objektet inom metoden påverkar det ursprungliga objektet.
    - Exempel:
      ```java
      public void repaintCar(Car car, String newColor) {
          car.color = newColor; // Ändrar färgen på det refererade objektet
      }
      ```

#### 5. Praktisk tillämpning: Klasser, objekt, och deras samspel

- **Skapa och använda objekt i praktiken:**
    - En typisk applikation kommer att ha många klasser och objekt som samverkar. Att förstå hur objekt skapas,
      manipuleras, och interagerar är kärnan i objektorienterad programmering (OOP).
    - Exempel på en enklare applikation: Tänk på ett bibliotekssystem där klasser som `Book`, `Library`, och `Member`
      interagerar för att hantera boklån och returer.

#### 6. Viktiga koncept att ta med sig

- **Sammanfattning av viktiga begrepp:**
    - Klasser och objekt är fundamentala byggstenar i Java.
    - Konstruktorer används för att skapa objekt och initialisera deras tillstånd.
    - Metoder definierar objektens beteenden och kan manipuleras via objektreferenser.
    - Objektreferenser tillåter dig att arbeta med och modifiera objekt genom att peka på deras minnesplatser.

---