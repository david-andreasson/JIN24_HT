# 1. Repetition av Grundläggande Programmeringskoncept (25 min)

## 1.1. Introduktion till Objektorienterad Programmering (OOP) - 10 min**

## **Fyra grundläggande principer i OOP:**

Här är en beskrivning av de fyra grundläggande principerna samt bilder som du kan använda för att visualisera dessa
koncept.

1. **Inkapsling (Encapsulation)**

- **Beskrivning:** Inkapsling handlar om att dölja de interna detaljerna i en klass och endast exponera vad som är
  nödvändigt. Det hjälper till att skydda data från otillåten åtkomst och manipulation.
- **Visualisering:** Bilden visar ett objekt (t.ex. en "Bil") med privata variabler (t.ex. hastighet, färg) som endast
  kan ändras genom publika metoder (t.ex. `accelerera()`).

2. **Arv (Inheritance)**

- **Beskrivning:** Arv möjliggör skapandet av en ny klass baserad på en redan existerande klass. Den nya klassen (
  subklassen) ärver egenskaper och beteenden från den gamla klassen (superklassen) men kan också lägga till egna
  egenskaper eller metoder.
- **Visualisering:** Bilden visar en hierarki där en "Bil" är en specifik typ av "Fordon", vilket illustrerar att "Bil"
  ärver egenskaper från "Fordon".

3. **Polymorfism (Polymorphism)**

- **Beskrivning:** Polymorfism gör det möjligt för ett objekt att ta flera former. Det innebär att samma metod kan bete
  sig olika beroende på vilken klass som använder den.
- **Visualisering:** Bilden visar hur en metod som heter `start()` kan fungera på olika sätt beroende på om den anropas
  från en "Bil", en "Cykel" eller en "Båt".

4. **Abstraktion (Abstraction)**

- **Beskrivning:** Abstraktion innebär att man förenklar komplexa system genom att dölja ovidkommande detaljer och
  fokusera på de relevanta delarna. Genom att använda abstrakta klasser och gränssnitt kan man skapa en standardiserad
  uppsättning metoder som kan implementeras på olika sätt av olika klasser.
- **Visualisering:** Bilden visar hur en abstrakt klass "Fordon" kan ha en abstrakt metod `drive()`, som implementeras
  på olika sätt av subklasser som "Bil" och "Cykel".

---

## **1.2. Repetition av Grundläggande Programmeringskoncept - 15 min**

## **1.2.1. Variabler och Datatyper**

- **Vad är en variabel?**
  - En variabel är en lagringsplats för data som kan användas och ändras under programmets gång. Variabler har en
      datatyp som bestämmer vilken typ av data de kan lagra.

- **Exempel på datatyper:**
  - `int`: Heltal (t.ex. 42)
  - `double`: Decimaltal (t.ex. 3.14)
  - `char`: Ett enskilt tecken (t.ex. 'A')
  - `String`: Text (t.ex. "Hej")
  - `boolean`: Sant eller falskt värde (`true` eller `false`)

  ```java
  int age = 25;
  double price = 19.99;
  char grade = 'A';
  String name = "Anna";
  boolean isStudent = true;
  ```

- **Hur man kollar vilken typ något är:**
  - I Java används klassmetoden `.getClass().getName()` eller typen `instanceof` för att kontrollera vilken typ en
      variabel eller ett objekt har.

  ```java
  System.out.println(((Object) age).getClass().getName()); // java.lang.Integer
  System.out.println(name instanceof String); // true
  ```

- **Hur man tar reda på information om variablerna:**
  - Använd metoder som `System.out.println()` för att skriva ut variabelns värde och typ, eller verktyg i IDE:n för
      att inspektera variabler vid debug.

  ```java
  System.out.println("Variabeln name har värdet: " + name + " och är av typen: " + name.getClass().getName());
  ```

## **1.2.2. Operatorer och Uttryck**

- **Aritmetiska operatorer:**
  - `+` (addition): Lägger ihop två tal.
  - `-` (subtraktion): Drar bort ett tal från ett annat.
  - `*` (multiplikation): Multiplicerar två tal.
  - `/` (division): Dividerar ett tal med ett annat.
  - `%` (modulus): Returnerar resten vid division.

  ```java
  int sum = 10 + 5; // 15
  int difference = 10 - 5; // 5
  int product = 10 * 5; // 50
  int quotient = 10 / 2; // 5
  int remainder = 10 % 3; // 1
  ```

- **Jämförelseoperatorer:**
  - `==` (lika med): Kontrollerar om två värden är lika.
  - `!=` (inte lika med): Kontrollerar om två värden inte är lika.
  - `>` (större än): Kontrollerar om ett värde är större än ett annat.
  - `<` (mindre än): Kontrollerar om ett värde är mindre än ett annat.
  - `>=` (större än eller lika med): Kontrollerar om ett värde är större än eller lika med ett annat.
  - `<=` (mindre än eller lika med): Kontrollerar om ett värde är mindre än eller lika med ett annat.

  ```java
  boolean isEqual = (5 == 5); // true
  boolean isNotEqual = (5 != 4); // true
  boolean isGreater = (5 > 3); // true
  boolean isLesser = (3 < 5); // true
  boolean isGreaterOrEqual = (5 >= 5); // true
  boolean isLesserOrEqual = (3 <= 5); // true
  ```

- **Logiska operatorer:**
  - `&&` (AND): Sant om båda uttrycken är sanna.
  - `||` (OR): Sant om minst ett av uttrycken är sant.
  - `!` (NOT): Vänder ett sant uttryck till falskt och vice versa.

  **Sanningstabeller**

**And:**

|   A   |   B   | A and B |
| :---: | :---: | :-----: |
| true  | true  |  true   |
| true  | false |  false  |
| false | true  |  false  |
| false | false |  false  |

**Or:**

|   A   |   B   | A or B |
| :---: | :---: | :----: |
| true  | true  |  true  |
| true  | false |  true  |
| false | true  |  true  |
| false | false | false  |

**Not:**

|   A   | not A |
| :---: | :---: |
| true  | false |
| false | true  |

**Sammanfattning:**

|   A   |   B   | A and B | A or B | not A |
| :---: | :---: | :-----: | :----: | :---: |
| true  | true  |  true   |  true  | false |
| true  | false |  false  |  true  | false |
| false | true  |  false  |  true  | true  |
| false | false |  false  | false  | true  |

  ```java
  boolean andResult = (5 > 3) && (8 > 6); // true
  boolean orResult = (5 > 3) || (8 < 6); // true
  boolean notResult = !(5 > 3); // false
  ```

- **Uttryck:**
  - Ett uttryck är en kombination av variabler, operatorer och metodanrop som evalueras till ett enda värde.

  ```java
  int result = (10 + 5) * 2; // 30
  boolean comparison = (10 > 5) && (3 < 5); // true
  ```

---

# **2. Repetition av Villkorssatser (25 min)**

## **2.1. If-Else Villkorssatser (15 min)**

### **If-Else:**

- **Vad är en If-Else-sats?**
  - If-Else-satser används för att fatta beslut baserat på ett villkor. Om villkoret är sant (`true`), körs ett
      specifikt kodblock. Om det är falskt (`false`), kan ett annat kodblock köras.

- **Syntax:**

  ```java
  if (condition) {
      // kodblock som körs om condition är sant
  } else {
      // kodblock som körs om inga tidigare villkor är sanna
  }
  ```

- **Exempel:**
  - Detta program kontrollerar om ett tal är större än noll och skriver ut ett meddelande.

  ```java
  int number = 10;
  
  if (number > 10) {
      System.out.println("Talet är större än noll");
  } else {
      System.out.println("Talet är mindre än 1");
  }
  ```

- **Exempel:**
  - Detta program kontrollerar om ett tal är större än eller lika med 18 och skriver ut om personen är myndig.

    ```java
    int age = 20;
  
    if (age >= 18) {
        System.out.println("Personen är myndig");
    } else {
        System.out.println("Personen är inte myndig");
    }
    ```

- **Vad är Else if?**

- **Syntax:**

  ```java
  if (condition) {
      // kodblock som körs om condition är sant
  } else if (anotherCondition) {
      // kodblock som körs om anotherCondition är sant
  } else {
      // kodblock som körs om inga tidigare villkor är sanna
  }
  ```

- **Exempel:**
  - Detta program kontrollerar om ett tal är positivt, negativt, eller noll.

  ```java
  int number = 10;
  
  if (number > 0) {
      System.out.println("Talet är positivt");
  } else if (number < 0) {
      System.out.println("Talet är negativt");
  } else {
      System.out.println("Talet är noll");
  }
  ```

- **Djupare förståelse:**
  - Flera `else if`-satser kan användas för att hantera flera olika villkor. Det sista `else`-blocket är valfritt och
      används för att fånga upp alla fall som inte täcks av tidigare villkor.

---

## **2.2. Switch-sats (10 min)**

### **Switch-sats:**

- **Vad är en Switch-sats?**
  - En `switch`-sats är ett alternativ till långa kedjor av `if-else`-satser när man jämför samma variabel mot olika
      värden. Den kan göra koden mer läsbar och organiserad men är inte alltid lämplig för alla situationer.

- **Syntax:**

  ```java
  switch (expression) {
      case value1:
          // kodblock för value1
          break;
      case value2:
          // kodblock för value2
          break;
      // fler case om nödvändigt
      default:
          // kodblock om inget case matchar
          break;
  }
  ```

- **Exempel:**
  - Detta program ger veckodagens namn baserat på ett heltal från 1 till 7.

  ```java
  int day = 3;
  
  switch (day) {
      case 1:
          System.out.println("Måndag");
          break;
      case 2:
          System.out.println("Tisdag");
          break;
      case 3:
          System.out.println("Onsdag");
          break;
      case 4:
          System.out.println("Torsdag");
          break;
      case 5:
          System.out.println("Fredag");
          break;
      case 6:
          System.out.println("Lördag");
          break;
      case 7:
          System.out.println("Söndag");
          break;
      default:
          System.out.println("Ogiltig dag");
          break;
  }
  ```

- **Viktigt att notera:**
  - **`break;`**-satsen används för att avsluta `switch`-satsen efter att ett matchande case har körts. Om `break;`
      utelämnas fortsätter exekveringen till nästa case, vilket sällan är önskvärt.

---

# **3. Repetition av Loopar (25 min)**

## **3.1. For-Loop (10 min)**

### **For-Loop:**

- **Vad är en For-Loop?**
    - En `for`-loop används för att upprepa ett kodblock ett förutbestämt antal gånger. Det är den mest använda typen av
      loop när man vet i förväg hur många gånger man vill iterera.

- **Syntax:**
  ```java
  for (initialization; condition; update) {
      // kodblock som körs så länge condition är sann
  }
  ```
    - **initialization:** En variabel initialiseras (ofta en räknare).
    - **condition:** Loopen körs så länge villkoret är sant.
    - **update:** Räknaren eller variabeln uppdateras efter varje iteration.

- **Exempel:**
    - Detta program skriver ut talen från 0 till 4.

    ```java
    // Skriver ut talen från 0 till 4
    for (int i = 0; i < 5; i++) {
      System.out.println("Värdet av i: " + i);
    }
    
    // Skriver ut talen från 10 till 1 med steg -1
    for (int i = 10; i > 0; i--) {
        System.out.println("Värdet av i: " + i);
    }
    
    // Skriver ut talen från 0 till 8 med steg 2
    for (int i = 0; i < 10; i += 2) {
        System.out.println("Värdet av i: " + i);
    }
    ```

- **Djupare förståelse:**
    - En `for`-loop är särskilt användbar när man vet exakt hur många gånger man vill upprepa en uppgift. Det är vanligt
      att använda en `for`-loop för att iterera över element i en lista eller ett fält.

---

## **3.2. While-Loop och Do-While Loop (15 min)**

### **While-Loop:**

- **Vad är en While-Loop?**
    - En `while`-loop upprepar ett kodblock så länge ett givet villkor är sant. Den används ofta när antalet iterationer
      inte är känt i förväg.

- **Syntax:**
  ```java
  while (condition) {
      // kodblock som körs så länge condition är sann
  }
  ```
    - **condition:** Loopen körs så länge villkoret är sant.

- **Exempel:**
    - Detta program skriver ut talen från 0 till 4 med hjälp av en `while`-loop.

  ```java
    // Skriver ut talen från 0 till 4
    int i = 0;
    while (i < 5) {
      System.out.println("Värdet av i: " + i);
      i++;
    }
  
    // Skriver ut talen från 10 till 1
    int j = 10;
    while (j > 0) {
        System.out.println("Värdet av j: " + j);
        j--;
    }
  
    // Skriver ut talen från 0 till 8 med steg 2
    int k = 0;
    while (k < 10) {
        System.out.println("Värdet av k: " + k);
        k += 2;
    }
  
    // Evigt loop
    while (true) {
        System.out.println("Detta är en evig loop!");
    }
  ```

### **Do-While Loop:**

- **Vad är en Do-While Loop?**
    - En `do-while`-loop liknar en `while`-loop, men med skillnaden att kodblocket alltid körs minst en gång, eftersom
      villkoret kontrolleras efter att kodblocket körts.

- **Syntax:**
  ```java
  do {
      // kodblock
  } while (condition);
  ```
    - **condition:** Loopen fortsätter så länge villkoret är sant.

- **Exempel:**
    - Detta program skriver ut talen från 0 till 4 med hjälp av en `do-while`-loop.

  ```java
  // Skriver ut talen från 0 till 4
  int i = 0;
  do {
      System.out.println("Värdet av i: " + i);
      i++;
  } while (i < 5);
  
    // Skriver ut talen från 10 till 1
    int j = 10;
    do {
        System.out.println("Värdet av j: " + j);
        j--;
    } while (j > 0);
  
    // Skriver ut talen från 0 till 8 med steg 2
    int k = 0;
    do {
        System.out.println("Värdet av k: " + k);
        k += 2;
    } while (k < 10);
  
    // Evigt loop
    do {
        System.out.println("Detta är en evig loop!");
    } while (true);
  ```

- **Djupare förståelse:**
    - Använd en `while`-loop när du inte vet hur många gånger loopen ska köras men vet att det beror på ett villkor.
      Använd en `do-while`-loop om du vill säkerställa att kodblocket körs åtminstone en gång oavsett villkoret.

### Läsa in data från användaren

- **Scanner:** För att läsa in data från användaren kan vi använda `Scanner`-klassen i Java. Här är ett exempel på hur du
  kan använda `Scanner` för att läsa in ett heltal från användaren:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ett heltal: ");
        int number = scanner.nextInt();
        System.out.println("Du angav: " + number);
        scanner.close();
    }
}
```

---

# 4. Objektorienterad Programmering (25 min)

## 4.1. Klasser och Objekt (15 min)

### Vad är en Klass?

- **Definition:**
    - En klass är en mall eller ett blueprint för att skapa objekt. Den definierar vilka attribut (variabler) och
      metoder (funktioner) ett objekt kommer att ha.

- **Syntax:**
  ```java
  public class Car {
      String color;
      int speed;
      
      void accelerate() {
          speed += 10;
      }
  }
  ```
    - Här definieras en klass `Car` med två attribut, `color` och `speed`, samt en metod `accelerate()`.

- **Beskrivning:**
    - **Attribut:** Data som lagras i ett objekt (t.ex. `color`, `speed`).
    - **Metoder:** Funktioner som utför operationer på objektet (t.ex. `accelerate()`).

### Vad är ett Objekt?

- **Definition:**
    - Ett objekt är en instans av en klass. När du skapar ett objekt från en klass, har objektet alla attribut och
      metoder som klassen definierar.

- **Skapa ett Objekt:**
  ```java
  Car myCar = new Car();
  myCar.color = "Red";
  myCar.accelerate();
  ```
    - Här skapas ett objekt `myCar` av klassen `Car`. Attributet `color` sätts till "Red", och metoden `accelerate()`
      anropas.

### Konstruktorer

- **Vad är en Konstruktor?**
    - En konstruktor är en speciell metod som körs när ett objekt skapas. Den används ofta för att initialisera
      objektets attribut.

- **Syntax:**
  ```java
  public Car(String color, int speed) {
      this.color = color;
      this.speed = speed;
  }
  ```

- **Exempel:**
    - Genom att använda en konstruktor kan vi skapa objekt med fördefinierade värden:

  ```java
  Car myCar = new Car("Blue", 50);
  ```

---

## 4.2. Egenskaper och Metoder (10 min)

### Egenskaper (Attribut)

- **Vad är Egenskaper?**
    - Egenskaper eller attribut är variabler som är deklarerade i en klass och beskriver objektets tillstånd.

- **Exempel:**
    - I klassen `Car` är `color` och `speed` exempel på attribut.

  ```java
  public class Car {
      String color;
      int speed;
  }
  ```

### Metoder

- **Vad är Metoder?**
    - Metoder är funktioner som definieras i en klass och beskriver vad objektet kan göra.

- **Exempel:**
    - I klassen `Car` är `accelerate()` en metod som ökar objektets hastighet.

  ```java
  public void accelerate() {
      speed += 10;
  }
  ```

- **Åtkomstmodifierare:**
    - **`public`:** Kan nås från andra klasser.
    - **`private`:** Kan endast nås inom den klass där den är deklarerad.

---

# 5. Användning av ChatGPT som hjälpmedel (25 min)

## 5.1. Introduktion till ChatGPT (10 min)

### Vad är ChatGPT?

- **Definition:**
    - ChatGPT är en AI-driven språkmodell utvecklad av OpenAI som kan generera text och svara på frågor i naturligt
      språk. Modellen är tränad på en stor mängd data och kan hjälpa till med allt från att förklara koncept till att
      skriva kod.

### Hur kan ChatGPT hjälpa med programmering?

- **Exempel på användningsområden:**
    - **Kodförklaring:** Be ChatGPT att förklara hur en viss kodsnutt fungerar.
    - **Felsökning:** Be om hjälp att hitta och åtgärda buggar i din kod.
    - **Kodgenerering:** Be ChatGPT att skriva en viss funktion eller klass baserat på en beskrivning.
    - **Resurser:** Få rekommendationer om resurser, dokumentation, och tutorials.

### Bästa praxis för att använda ChatGPT

- **Var tydlig och specifik:**
    - Formulera dina frågor så specifikt som möjligt för att få mer relevanta och användbara svar.
    - Exempel: Istället för att fråga "Hur skriver man en for-loop?" kan du fråga "Hur skriver man en for-loop i Java
      som itererar över en array?"

- **Ställ följdfrågor:**
    - Om svaret inte är klart, tveka inte att ställa följdfrågor för att få mer information.

- **Dubbelkolla informationen:**
    - Även om ChatGPT kan ge användbara svar, är det alltid en bra idé att dubbelkolla informationen, särskilt när det
      gäller komplex kod eller nya koncept.

### Exempel på startprompt för ChatGPT

```text
Du är en erfaren Java-utvecklare som fungerar som en mentor till en nybörjare. När du svarar på frågor, var så tydlig
och pedagogisk som möjligt för att hjälpa dem att förstå koncepten bättre. Var beredd att ge förklaringar och exempel 
för att underlätta inlärningen.
Ge inte bara svar utan förklara också varför det är rätt och hur det fungerar. Ge vägledning genom att bryta ner
problem i mindre delar och visa steg-för-steg-lösningar. Du kan visa små legobitar av kod som exempel för att hjälpa dem
att förstå koncepten bättre eller ge dem Pseudokod för att hjälpa dem att tänka på lösningen innan de skriver riktig kod.
Legobitarna ska vara enkla och lätta att förstå för en nybörjare. Applicera Uncle Bob's regler för att skriva ren kod 
och förklara varför det är viktigt att skriva kod på detta sätt.

Är detta förstått? Svara Ja eller Nej och inget annat.
```

---

## 5.2. Bästa praxis vid användning av AI-verktyg (15 min)

### Hur man formulerar bra frågor

- **Var tydlig med vad du behöver hjälp med:**
    - Beskriv ditt problem eller din fråga noggrant. Ju mer kontext du ger, desto bättre kan ChatGPT hjälpa dig.
    - Exempel: "Jag försöker implementera en binär sökträd i Java. Kan du visa mig en enkel implementation?"

- **Använd kodblock:**
    - När du visar kod eller frågar om kod, omge koden med kodblock för att göra den lättare att läsa och förstå.

  ```java
  // Exempel på kodblock
  public class Example {
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
  ```

- **Specifik återkoppling:**
    - Om ChatGPT ger ett svar som inte löser problemet, specificera vad som saknas eller vad som behöver förbättras.

### Fördelar och Begränsningar

- **Fördelar:**
    - **Snabbhet:** Du kan få snabba svar och kodförslag utan att behöva söka i dokumentation eller forum.
    - **Mångsidighet:** ChatGPT kan hjälpa till med en mängd olika programmeringsspråk och koncept.
    - **Lärande:** Genom att få förklaringar och exempel kan du lära dig nya koncept och tekniker snabbare.

- **Begränsningar:**
    - **Felaktiga svar:** AI-modeller är inte perfekta och kan ge felaktiga eller ineffektiva lösningar.
    - **Kontextberoende:** ChatGPT kan ha svårt att förstå komplex kontext om frågan inte är tillräckligt detaljerad.
    - **Etik:** Det är viktigt att använda AI-verktyg ansvarsfullt och inte förlita sig blint på deras svar.
    - **GDPR:** Var försiktig med att dela känslig information, kod eller personuppgifter med AI-modeller.

---