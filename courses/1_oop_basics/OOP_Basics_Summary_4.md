# 1. Repetition av Metoder och Funktioner

## Föreläsningsmaterial

### Översikt av Metoder och Funktioner

#### 1. Vad är en metod?

- **Definition:** En metod är en block av kod som utför en specifik uppgift och kan anropas vid behov. Metoder används
  för att dela upp koden i hanterbara delar, vilket förbättrar återanvändbarhet och läsbarhet.
- **Användning:** Genom att dela upp funktionalitet i metoder kan vi minska kodupprepning och göra det enklare att
  felsöka och underhålla koden. Metoder kan också ta emot indata (parametrar) och returnera ett resultat.

  Exempel:
  ```java
  public int add(int a, int b) {
      return a + b;
  }
  ```

#### 2. Hur skapar och anropar man en metod i Java?

- **Skapa en metod:**
    - Metoder deklareras med en metodsignatur som innehåller åtkomstmodifierare, returtyp, metodnamn och parametrar.
    - Exempel på en enkel metod:
      ```java
      public void sayHello() {
          System.out.println("Hello, World!");
      }
      ```

- **Anropa en metod:**
    - En metod kan anropas från andra delar av koden genom att använda metodens namn och eventuella parametrar.
    - Exempel:
      ```java
      sayHello(); // Anropar metoden som skriver ut "Hello, World!"
      ```

#### 3. Metodsignaturer och deras komponenter

- **Metodsignatur:** Består av metodens namn, returtyp och lista av parametrar. Denna signatur skiljer en metod från
  andra med samma namn (metodöverlagring).
- **Returtyp:** Specificerar vilken typ av värde metoden returnerar. Om ingen data returneras används `void` som
  returtyp.

  Exempel på olika metodsignaturer:
  ```java
  public int multiply(int x, int y) {
      return x * y;
  }

  public void printMessage(String message) {
      System.out.println(message);
  }
  ```

#### 4. Parameteröverföring i metoder

- **Parameteröverföring:** Parametrar till en metod kan överföras som indata när metoden anropas. Dessa parametrar
  fungerar som lokala variabler inuti metoden.
- **Pass-by-value:** I Java överförs alla parametrar genom värde (pass-by-value), vilket innebär att metoden får en
  kopia av värdet, inte själva variabeln.

  Exempel:
  ```java
  public void updateValue(int value) {
      value = value + 10;
  }
  
  public static void main(String[] args) {
      int num = 5;
      updateValue(num);
      System.out.println(num); // Kommer att skriva ut 5, inte 15
  }
  ```

- **Returvärden:** En metod kan returnera ett värde som kan användas av den anropande koden.

  Exempel:
  ```java
  public int square(int number) {
      return number * number;
  }
  
  public static void main(String[] args) {
      int result = square(4); // result kommer att bli 16
      System.out.println(result);
  }
  ```

### 5. Skillnaden mellan metoder och funktioner

- **Metoder vs. Funktioner:** I Java är metoder bundna till objekt och klasser, medan funktioner är oberoende och
  används i andra språk som Python och JavaScript. Java har inga fristående funktioner – alla funktioner är metoder.

#### 6. När ska man använda metoder?

- **Kodåteranvändning:** Använd metoder för att undvika upprepning av kod.
- **Modularitet:** Dela upp stora kodavsnitt i mindre, hanterbara metoder för att öka läsbarheten och underlättar
  felsökning.
- **Enkel felsökning:** Genom att dela upp funktionalitet i metoder kan du enklare isolera och åtgärda fel.

---

# 2. Inkapsling och Åtkomstmodifierare i Java (45 min)

## Föreläsningsmaterial

### Översikt av Inkapsling och Åtkomstmodifierare

#### 1. Vad är Inkapsling?

- **Definition:** Inkapsling är en av de fyra grundläggande principerna i objektorienterad programmering (OOP). Den
  handlar om att dölja en objekts interna tillstånd (data) och att skydda data från otillåten åtkomst och modifiering.
  Detta uppnås genom att göra variabler privata och att ge åtkomst till dessa data genom publika metoder (getters och
  setters).

- **Syfte:**
    - **Skydda data:** Förhindra att ett objekt hamnar i ett ogiltigt eller inkonsekvent tillstånd.
    - **Kontroll:** Ger möjlighet att kontrollera hur data ändras, vilket ger bättre felhantering och loggning.
    - **Enkelhet:** Döljer komplexiteten hos objektets interna implementering och exponerar endast vad som behövs för
      användaren av objektet.

- **Exempel:**
    ```java
    public class BankAccount {
        private double balance;

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
    }
    ```

#### 2. Vad är Åtkomstmodifierare?

- **Definition:** Åtkomstmodifierare i Java bestämmer vilken åtkomst andra klasser har till klassens variabler, metoder
  och konstruktorer. De fyra huvudtyperna av åtkomstmodifierare är:
    - **`private`:** Tillåter åtkomst endast inom samma klass. Den mest restriktiva modifieraren.
    - **`default` (ingen modifierare):** Tillåter åtkomst inom samma paket. Kallas även "package-private".
    - **`protected`:** Tillåter åtkomst inom samma paket och till alla underklasser, även om de finns i ett annat paket.
    - **`public`:** Tillåter åtkomst från alla andra klasser.

- **Exempel:**
    ```java
    public class ExampleClass {
        private int privateVar; // Endast åtkomlig inom denna klass
        int defaultVar; // Endast åtkomlig inom detta paket
        protected int protectedVar; // Åtkomlig inom detta paket och i subklasser
        public int publicVar; // Åtkomlig från vilken klass som helst

        public int getPrivateVar() {
            return privateVar; // Åtkomst till privat variabel via publik metod
        }
    }
    ```

#### 3. Implementering av Inkapsling med hjälp av Åtkomstmodifierare

- **Privata variabler:**
    - Genom att använda `private` kan vi säkerställa att ingen utanför klassen kan direkt manipulera dessa variabler.
    - Exempel:
    ```java
    public class Person {
        private String name;
        private int age;

        // Publik metod för att sätta namn
        public void setName(String name) {
            this.name = name;
        }

        // Publik metod för att hämta namn
        public String getName() {
            return name;
        }

        // Publik metod för att sätta ålder
        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            }
        }

        // Publik metod för att hämta ålder
        public int getAge() {
            return age;
        }
    }
    ```

- **Åtkomstkontroll genom metoder:**
    - Genom att använda publika metoder (getters och setters) kan vi kontrollera och validera värden innan de tilldelas.
    - Detta skyddar objektet från att hamna i ett ogiltigt tillstånd.

#### 4. När ska man använda olika åtkomstmodifierare?

- **`private`:**
    - Använd `private` för variabler och metoder som endast ska användas inom den aktuella klassen.
    - Detta är särskilt användbart för att skydda interna data och implementeringsdetaljer.

- **`default` (package-private):**
    - Använd när variabler och metoder ska vara tillgängliga för andra klasser i samma paket, men inte för externa
      paket.
    - Detta är användbart när du har flera relaterade klasser som arbetar tillsammans inom ett paket.

- **`protected`:**
    - Använd när variabler och metoder ska vara tillgängliga i underklasser, även om de finns i ett annat paket.
    - Detta är användbart för att tillåta viss flexibilitet i underklasser samtidigt som det begränsar åtkomst från
      andra klasser.

- **`public`:**
    - Använd `public` för variabler och metoder som ska vara tillgängliga för alla andra klasser.
    - Använd detta sparsamt, eftersom det innebär att du exponerar en del av din kod för omvärlden.

#### 5. Fördelar med Inkapsling och Åtkomstmodifierare

- **Enkelhet och tydlighet:** Genom att dölja interna detaljer görs koden mer hanterbar och lättförståelig för andra
  utvecklare.
- **Säkerhet:** Skyddar viktiga data från otillåten eller oavsiktlig manipulation.
- **Återanvändbarhet:** Möjliggör återanvändning av kod utan att oroa sig för oönskade sidofekter på data.

#### 6. Exempel på inkapsling och användning av åtkomstmodifierare

- Exempel på en korrekt inkapslad klass:
    ```java
    public class Employee {
        private String name;
        private double salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary > 0) {
                this.salary = salary;
            }
        }
    }
    ```
- Exempel på ett typiskt användningsfall:
    ```java
    public class Main {
        public static void main(String[] args) {
            Employee emp = new Employee();
            emp.setName("John Doe");
            emp.setSalary(50000);

            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee Salary: " + emp.getSalary());
        }
    }
    ```

---

# 3. Användning av Konstruktorer i Java

## Föreläsningsmaterial

### Översikt av Konstruktorer i Java

#### 1. Vad är en Konstruktor?

- **Definition:** En konstruktor är en speciell typ av metod som används för att skapa (instansiera) objekt från en
  klass. Till skillnad från vanliga metoder har en konstruktor samma namn som klassen och ingen returtyp, inte ens
  `void`.
- **Syfte:** Konstruktorer används för att initialisera objektets tillstånd genom att tilldela startvärden till dess
  variabler.

- **Exempel:**
    ```java
    public class Person {
        private String name;
        private int age;

        // Konstruktor som initialiserar name och age
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Person person = new Person("Alice", 30);
            person.displayInfo(); // Output: Name: Alice, Age: 30
        }
    }
    ```

#### 2. Typer av Konstruktorer

- **Standardkonstruktor (default constructor):**
    - En standardkonstruktor är en konstruktor utan parametrar. Om ingen konstruktor definieras i klassen, skapar Java
      automatiskt en standardkonstruktor.
    - Exempel:
    ```java
    public class Car {
        private String model;

        // Standardkonstruktor
        public Car() {
            model = "Unknown";
        }

        public String getModel() {
            return model;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Car car = new Car();
            System.out.println("Model: " + car.getModel()); // Output: Model: Unknown
        }
    }
    ```

- **Parametriserad konstruktor:**
    - En parametriserad konstruktor är en konstruktor som tar en eller flera parametrar. Dessa parametrar används för
      att initialisera objektets variabler.
    - Exempel:
    ```java
    public class Car {
        private String model;

        // Parametriserad konstruktor
        public Car(String model) {
            this.model = model;
        }

        public String getModel() {
            return model;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Car car = new Car("Toyota");
            System.out.println("Model: " + car.getModel()); // Output: Model: Toyota
        }
    }
    ```

#### 3. Konstruktoröverlagring (Constructor Overloading)

- **Vad är Konstruktoröverlagring?:**
    - Konstruktoröverlagring innebär att man har flera konstruktorer i samma klass med olika parametrar. Detta tillåter
      skapandet av objekt på olika sätt beroende på vilka initialvärden som behövs.

- **Exempel på Konstruktoröverlagring:**
    ```java
    public class Rectangle {
        private double length;
        private double width;

        // Standardkonstruktor
        public Rectangle() {
            this.length = 1.0;
            this.width = 1.0;
        }

        // Parametriserad konstruktor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double calculateArea() {
            return length * width;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Rectangle rect1 = new Rectangle(); // Använder standardkonstruktorn
            Rectangle rect2 = new Rectangle(5.0, 3.0); // Använder parametriserad konstruktor

            System.out.println("Area of rect1: " + rect1.calculateArea()); // Output: Area of rect1: 1.0
            System.out.println("Area of rect2: " + rect2.calculateArea()); // Output: Area of rect2: 15.0
        }
    }
    ```

#### 4. Skillnaden mellan Metoder och Konstruktorer

- **Konstruktorer:**
    - Har samma namn som klassen.
    - Har ingen returtyp.
    - Anropas automatiskt vid skapandet av ett objekt.
    - Används för att initialisera objektets tillstånd.

- **Metoder:**
    - Kan ha vilket namn som helst (utom klassens namn).
    - Måste ha en returtyp (inklusive `void`).
    - Måste anropas explicit för att utföras.
    - Används för att definiera objektets beteende.

- **Exempel som belyser skillnaden:**
    ```java
    public class Dog {
        private String name;

        // Konstruktor
        public Dog(String name) {
            this.name = name;
        }

        // Metod
        public void bark() {
            System.out.println(name + " says Woof!");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog("Buddy"); // Anropar konstruktorn
            dog.bark(); // Anropar metoden
        }
    }
    ```

#### 5. Användning av `this`-nyckelordet i Konstruktorer

- **Vad är `this`?**
    - `this` är ett nyckelord som refererar till det aktuella objektet. Det används ofta i konstruktorer och metoder för
      att differentiera mellan klassens variabler och parametrar med samma namn.

- **Exempel:**
    ```java
    public class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name; // 'this.name' refererar till klassens variabel
            this.salary = salary;
        }

        public void displayDetails() {
            System.out.println("Name: " + this.name + ", Salary: " + this.salary);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Employee emp = new Employee("John Doe", 50000);
            emp.displayDetails(); // Output: Name: John Doe, Salary: 50000.0
        }
    }
    ```

---

# 4. Fortsatt användning av ChatGPT som hjälpmedel (45 min)

## Föreläsningsmaterial

### Översikt av ChatGPT som ett Programmeringsverktyg

#### 1. Vad är ChatGPT?

- **Definition:** ChatGPT är en AI-driven språkmodell utvecklad av OpenAI. Den är tränad på en stor mängd textdata och
  kan generera text, svara på frågor och ge rekommendationer inom en mängd olika ämnen, inklusive programmering.
- **Syfte:** Som programmeringshjälp kan ChatGPT användas för att förstå kod, få kodexempel, felsöka problem, generera
  idéer och mycket mer. Det kan fungera som en personlig assistent för programmeringsrelaterade uppgifter.

- **Exempel på användningsområden:**
    - **Förklara kod:** Be ChatGPT att förklara vad en specifik kodsnutt gör.
    - **Felsökning:** Få hjälp med att identifiera och lösa fel i koden.
    - **Kodexempel:** Generera exempel på hur man implementerar en viss funktionalitet.

#### 2. Använda ChatGPT för Kodförslag och Felsökning

- **Kodförslag:**
    - ChatGPT kan användas för att generera kodsnuttar baserat på dina behov. Till exempel kan du beskriva en funktion
      du vill implementera, och ChatGPT kan ge ett förslag på hur det kan göras.
    - **Exempel:**
    ```plaintext
    "Hur kan jag skriva en metod i Java som beräknar summan av tre tal?"
    ```
    - ChatGPT svarar:
    ```java
    public int addThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }
    ```

- **Felsökning:**
    - Du kan beskriva ett fel eller en bugg i din kod och be ChatGPT om hjälp med att identifiera problemet. ChatGPT kan
      ge förslag på vad som kan vara fel och hur det kan åtgärdas.
    - **Exempel:**
    ```plaintext
    "Jag får ett NullPointerException i Java, vad kan orsaka detta?"
    ```
    - ChatGPT svarar:
    ```plaintext
    "Ett NullPointerException uppstår när du försöker använda en referens som ännu inte har blivit instansierad. Kontrollera att alla objekt är korrekt instansierade innan du försöker använda dem."
    ```

#### 3. Optimering av Kod med ChatGPT

- **Kodoptimering:**
    - ChatGPT kan ge förslag på hur du kan optimera din kod för bättre prestanda eller renare struktur. Du kan be om
      förbättringar av specifika delar av koden.
    - **Exempel:**
    ```plaintext
    "Kan du optimera den här loop-konstruktionen för att göra den mer effektiv?"
    ```
    - ChatGPT kan då ge förslag som att använda en `for-each`-loop istället för en `for`-loop, eller att minimera
      antalet beräkningar inom loopen.

- **Refaktorering:**
    - Du kan använda ChatGPT för att refaktorera kod, vilket innebär att omstrukturera koden för att göra den mer läsbar
      och underhållbar utan att ändra dess funktionalitet.
    - **Exempel:**
    ```plaintext
    "Kan du hjälpa mig att refaktorera denna metod för att göra den mer modulär?"
    ```
    - ChatGPT kan ge förslag på hur du kan bryta ner stora metoder i mindre, mer hanterbara metoder.

#### 4. Bästa Praxis för Användning av ChatGPT i Programmering

- **Formulera tydliga frågor:**
    - När du använder ChatGPT, var så specifik som möjligt med dina frågor. Ju tydligare och mer detaljerad din fråga
      är, desto mer användbart kommer svaret att vara.
    - **Exempel:**
    ```plaintext
    "Hur kan jag sortera en lista av strängar i Java?" är bättre än "Hur sorterar jag?"
    ```

- **Granska och förstå koden:**
    - Det är viktigt att du alltid granskar och förstår den kod som genereras av ChatGPT. Använd ChatGPT som ett stöd,
      men se till att du verkligen förstår koden och kan förklara den om det behövs.

- **Experimentera och lär:**
    - Använd ChatGPT för att utforska olika sätt att lösa problem. Testa olika lösningar som föreslås och lär dig av de
      olika tillvägagångssätten.
    - **Exempel:** Om ChatGPT ger flera sätt att sortera en lista, försök implementera dem alla och jämför resultaten.

- **Förstå begränsningar:**
    - Var medveten om att ChatGPT, trots sina möjligheter, inte alltid ger felfria eller optimala lösningar. Den kan
      göra fel, särskilt när frågorna är vaga eller för komplexa.

#### 5. Praktiska Exempel och Interaktiv Användning av ChatGPT

- **Interaktivt exempel:**
    - Låt oss säga att du har en metod som beräknar Fibonacci-tal och du vill förbättra dess effektivitet. Du kan fråga
      ChatGPT:
    ```plaintext
    "Hur kan jag förbättra prestandan på en metod som beräknar Fibonacci-tal i Java?"
    ```
    - ChatGPT kan då föreslå en mer effektiv lösning som memoization eller användning av en iterativ metod istället för
      en rekursiv.

- **Integrering i arbetsflödet:**
    - Använd ChatGPT som en del av ditt dagliga arbetsflöde för att lösa problem snabbare och få nya perspektiv på hur
      du kan närma dig en uppgift. Du kan också använda det som en del av din inlärningsprocess genom att ställa frågor
      om saker du inte förstår.

---

# 5. Fördjupning i Metoder och Funktioner med Fokus på Rekursion (45 min)

## Föreläsningsmaterial

### Översikt av Rekursion

#### 1. Vad är Rekursion?

- **Definition:** Rekursion är en teknik där en metod anropar sig själv för att lösa ett problem. En rekursiv metod
  löser ett problem genom att bryta ner det i mindre, mer hanterbara delproblem som liknar det ursprungliga problemet.
- **Struktur av en rekursiv metod:** En rekursiv metod har alltid två huvuddelar:
  - **Basfall:** En enkel situation där rekursionen avslutas, och metoden inte längre anropar sig själv.
  - **Rekursivt fall:** Ett fall där metoden anropar sig själv med en modifierad parameter för att närma sig
      basfallet.

- **Exempel på enkel rekursion:**
  - Beräkning av fakultet (`n!`):

    ```java
    public int factorial(int n) {
        if (n == 0) {
            return 1; // Basfall
        } else {
            return n * factorial(n - 1); // Rekursivt fall
        }
    }
    ```

  - **Vad är fakultet?:**
    - Fakultet av ett tal `n` är produkten av alla positiva heltal upp till `n`.
    - Exempel: `5! = 5 * 4 * 3 * 2 * 1 = 120`

#### 2. Hur fungerar rekursion?

- **Stack-baserad exekvering:**
  - När en rekursiv metod anropas, lagras det aktuella tillståndet (parameter, lokala variabler) på stacken. Metoden
      anropar sedan sig själv med nya parametrar. Varje anrop lagras på stacken tills basfallet uppnås.
  - När basfallet uppnås, börjar metoden att avveckla sig själv, dvs. den hoppar tillbaka genom stacken och returnerar
      resultatet till föregående anrop.

- **Visualisering av rekursion:**
  - För att förstå rekursion är det ofta hjälpsamt att visualisera stacken och hur varje anrop läggs till och tas bort
      från stacken.

- **Exempel med visualisering:**
  - Låt oss ta ett exempel på en rekursiv metod som beräknar Fibonacci-tal:

    ```java
    public int fibonacci(int n) {
        if (n <= 1) {
            return n; // Basfall
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Rekursivt fall
        }
    }
    ```

  - För att beräkna `fibonacci(4)`:
    - `fibonacci(4)` anropar `fibonacci(3)` och `fibonacci(2)`
    - `fibonacci(3)` anropar `fibonacci(2)` och `fibonacci(1)`
    - Detta fortsätter tills basfallen `fibonacci(1)` och `fibonacci(0)` nås, som returnerar sina värden och
          möjliggör avvecklingen av stacken.

#### 3. Rekursion vs. Iteration

- **Jämförelse mellan Rekursion och Iteration:**
  - **Rekursion:** Använder metodanrop för att bryta ner problemet. Det är mer naturligt för problem som är rekursiva
      i naturen, t.ex. traversering av träd eller grafstrukturer.
  - **Iteration:** Använder loopar (t.ex. `for`, `while`) för att repetera ett block av kod tills ett villkor är
      uppfyllt.

- **När ska man använda Rekursion?**
  - Rekursion är ofta enklare och mer intuitivt för problem där lösningen naturligt bryts ner i liknande delproblem,
      såsom:
    - Beräkning av fakultet, Fibonacci-tal
    - Traversering av träd och grafer
    - Sökning och sortering (t.ex. QuickSort, MergeSort)
  - Iteration är generellt mer effektivt för enklare repetitiva uppgifter eftersom det inte har samma overhead som
      rekursion med stackdjup och metodanrop.

- **Exempel på Iteration vs. Rekursion:**
  - Beräkning av fakultet med iteration:

    ```java
    public int iterativeFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    ```

  - Samma problem löst med rekursion (som visat tidigare):

    ```java
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    ```

#### 4. Fördelar och Nackdelar med Rekursion

- **Fördelar:**
  - **Enkelhet och Läsbarhet:** Rekursiva lösningar kan vara enklare att förstå och implementera för problem som
      naturligt bryts ner i liknande delproblem.
  - **Naturlig Passform för Vissa Problem:** Vissa algoritmer, såsom traversering av trädstrukturer eller problem med
      upprepade mönster, är enklare att implementera rekursivt.

- **Nackdelar:**
  - **Prestanda:** Rekursion kan vara mindre effektivt än iteration på grund av overhead från metodanrop och
      stackhantering.
  - **Stack Overflow:** Om rekursionen är för djup (t.ex. på grund av dåligt definierade basfall), kan det leda till
      ett stack overflow-fel.

- **När ska man undvika Rekursion?**
  - För mycket djupa rekursioner eller när det finns en enkel iterativ lösning som är mer effektiv.

#### 5. Praktiska Exempel på Rekursion

- **Exempel 1: Beräkning av Fakultet**
  - Fakultet av ett tal `n` är produkten av alla positiva heltal upp till `n`.

    ```java
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    ```

- **Exempel 2: Fibonacci-serien**
  - Fibonacci-serien är en sekvens där varje tal är summan av de två föregående talen.

    ```java
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    ```

- **Exempel 3: Traversering av ett binärt träd**
  - Besök alla noder i ett binärt träd rekursivt.

    ```java
    class Node {
        int value;
        Node left, right;

        Node(int item) {
            value = item;
            left = right = null;
        }
    }

    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.value + " ");
            inorderTraversal(node.right);
        }
    }
    ```

---