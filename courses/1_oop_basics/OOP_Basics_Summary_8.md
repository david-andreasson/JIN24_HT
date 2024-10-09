# 1. Introduktion till Designmönster

## Föreläsningsmaterial

### Vad är designmönster?

#### 1. Definition och betydelse

- **Introduktion:** Designmönster är återanvändbara lösningar på vanliga problem som uppstår vid objektorienterad
  design. De är inte färdiga koder utan snarare mallar som kan användas för att lösa specifika designproblem på ett
  effektivt sätt.
- **Varför använda designmönster?:**
  - **Återanvändbarhet:** De erbjuder beprövade lösningar som kan återanvändas i olika projekt.
  - **Underlättad kommunikation:** Designmönster ger ett gemensamt språk för utvecklare att använda när de diskuterar
      programvarudesign.
  - **Förbättrad kodkvalitet:** Genom att följa etablerade mönster kan man skriva mer robust, underhållbar och
      lättförståelig kod.

#### 2. Kategorisering av designmönster

- **Skapande mönster (Creational):**
  - Fokuserar på objektinstansiering.
  - Exempel: Singleton, Factory, Builder.
- **Strukturella mönster (Structural):**
  - Handlar om objekt- och klasskompositioner.
  - Exempel: Adapter, Composite, Decorator.
- **Beteendemönster (Behavioral):**
  - Fokuserar på kommunikation mellan objekt.
  - Exempel: Observer, Strategy, Command.

### Exempel på enkla designmönster

#### 1. Singleton-mönstret

- **Problem:** Du vill säkerställa att en viss klass endast har en enda instans, exempelvis för att hantera en
  databasanslutning.
- **Lösning:** Implementera Singleton-mönstret, där konstruktorer är privata, och tillhandahåll en statisk metod för att
  skapa eller returnera den enda instansen.

**Kodexempel i Java:**

```java
public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Privat konstruktor för att förhindra instansiering
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
```

#### 2. Factory-mönstret

- **Problem:** Du behöver skapa objekt utan att specificera den exakta klassen som ska instansieras.
- **Lösning:** Använd Factory-mönstret för att skapa objekt baserat på viss indata eller villkor.

**Kodexempel i Java:**

```java
public interface Animal {
    void makeSound();
}

public class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class AnimalFactory {
    public static Animal createAnimal(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("Cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        return null;
    }
}
```

---

# 2. Builder-mönstret

## Föreläsningsmaterial

### Förstå Builder-mönstret

#### 1. Vad är Builder-mönstret?

- **Introduktion:** Builder-mönstret är ett skapandemönster som används för att konstruera komplexa objekt, steg för
  steg. Det separerar konstruktionen av ett objekt från dess representation, vilket gör det möjligt att skapa olika
  representationer av ett objekt med samma byggprocess.
- **Varför använda Builder-mönstret?:**
  - **Hantera komplexa objekt:** När ett objekt har många obligatoriska och valfria attribut blir konstruktorn svår
      att använda. Builder-mönstret gör det möjligt att bygga objektet på ett mer läsbart och strukturerat sätt.
  - **Flexibilitet:** Det ger flexibilitet att skapa olika variationer av ett objekt utan att skapa flera
      överbelastade konstruktörer.
  - **Förbättrad läsbarhet:** Genom att använda metoder som tydligt beskriver varje steg i objektets konstruktion
      förbättras kodens läsbarhet.

#### 2. Struktur och användning

- **Struktur av Builder-mönstret:**
  - **Builder-klass:** Innehåller metoder för att sätta värden för olika attribut och en `build()`-metod för att skapa
      objektet.
  - **Produktklass (Produkt):** Klassen som vi bygger med hjälp av Builder-mönstret.

- **Exempel:** Skapa en `Car`-klass med Builder-mönstret för att hantera olika attribut som modell, färg, motor, etc.

**Kodexempel i Java:**

```java
public class Car {
    private String model;
    private String color;
    private String engine;
    private int seats;

    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.engine = builder.engine;
        this.seats = builder.seats;
    }

    public static class CarBuilder {
        private String model;
        private String color;
        private String engine;
        private int seats;

        public CarBuilder(String model) {
            this.model = model;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", engine=" + engine + ", seats=" + seats + "]";
    }
}
```

#### 3. Användning av Builder-mönstret

- **Byggprocessen:** Skapa en ny bil genom att använda `CarBuilder` och anropa metoder för att sätta olika attribut.
- **Flexibilitet:** Observera hur metoderna kan kedjas för att skapa objektet steg för steg, vilket ger en mycket läsbar
  kod.

**Kodexempel i Java:**

```java
public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("Sedan")
                .setColor("Red")
                .setEngine("V6")
                .setSeats(4)
                .build();

        System.out.println(car);
    }
}
```

---

# 3. Fluent Interface

## Föreläsningsmaterial

### Introduktion till Fluent Interface

#### 1. Vad är Fluent Interface?

- **Introduktion:** Fluent Interface är ett sätt att designa objektorienterade API:er så att metoder kan kedjas samman i
  ett flytande, naturligt språk som underlättar läsbarhet och förståelse. Detta uppnås genom att varje metod i kedjan
  returnerar objektet självt.
- **Varför använda Fluent Interface?:**
  - **Ökad läsbarhet:** Fluent Interface gör koden mer läsbar och lättare att förstå, eftersom metoder kan kedjas
      samman på ett intuitivt sätt.
  - **Tydligare intention:** Kod som använder Fluent Interface uttrycker tydligare vad som händer steg för steg,
      vilket minskar behovet av kommentarer och förklaringar.
  - **Förbättrad användarupplevelse:** Det ger en mer sammanhängande och intuitiv API-design, vilket förbättrar
      utvecklarupplevelsen.

#### 2. Struktur och användning

- **Struktur av Fluent Interface:**
  - Metoder som returnerar objektet självt (`this`) så att metoder kan kedjas samman.
  - Används ofta tillsammans med Builder-mönstret för att skapa komplexa objekt på ett lättläst sätt.

- **Exempel:** Bygg en `Car`-klass med Fluent Interface som möjliggör kedjning av metoder för att sätta olika attribut
  som modell, färg, och motor.

**Kodexempel i Java:**

```java
public class Car {
    private String model;
    private String color;
    private String engine;

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public Car setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", engine=" + engine + "]";
    }
}
```

#### 3. Användning av Fluent Interface

- **Byggprocessen:** Skapa en ny bil genom att använda Fluent Interface och kedja metoder för att sätta olika attribut.
- **Exempel på användning:**

**Kodexempel i Java:**

```java
public class Main {
    public static void main(String[] args) {
        Car car = new Car()
                .setModel("SUV")
                .setColor("Blue")
                .setEngine("V8");

        System.out.println(car);
    }
}
```

- **Fördelar:** Notera hur koden blir mer sammanhängande och lättläst genom att använda Fluent Interface, vilket
  underlättar förståelsen av vad som händer i varje steg.

---

# 4. Kombinera designmönster

## Föreläsningsmaterial

### Användning av flera designmönster tillsammans

#### 1. Varför kombinera designmönster?

- **Introduktion:** I komplexa mjukvarusystem är det ofta nödvändigt att kombinera flera designmönster för att lösa
  olika delar av ett problem. Genom att kombinera mönster kan vi dra nytta av styrkorna hos flera mönster samtidigt,
  vilket resulterar i mer robust, flexibel och underhållbar kod.
- **Exempel på kombinationer:**
    - **Singleton och Factory:** Singleton kan användas för att säkerställa att endast en instans av en fabriksklass
      existerar, medan Factory-mönstret hanterar skapandet av objekt.
    - **Builder och Fluent Interface:** Builder-mönstret kan användas för att konstruera komplexa objekt, medan Fluent
      Interface förbättrar läsbarheten och enkelheten i byggprocessen.

#### 2. Kombinera Singleton och Factory

- **Scenario:** Du har en `DatabaseConnectionFactory` som använder Singleton-mönstret för att säkerställa att endast en
  instans av fabriken finns. Fabriken använder Factory-mönstret för att skapa och hantera olika typer av
  databasanslutningar.

**Kodexempel i Java:**

```java
public class DatabaseConnection {
    private String connectionString;

    private DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public static class DatabaseConnectionFactory {
        private static DatabaseConnectionFactory instance;

        private DatabaseConnectionFactory() {
        }

        public static DatabaseConnectionFactory getInstance() {
            if (instance == null) {
                instance = new DatabaseConnectionFactory();
            }
            return instance;
        }

        public DatabaseConnection createConnection(String type) {
            if ("SQL".equalsIgnoreCase(type)) {
                return new DatabaseConnection("SQL Connection String");
            } else if ("NoSQL".equalsIgnoreCase(type)) {
                return new DatabaseConnection("NoSQL Connection String");
            }
            return null;
        }
    }
}
```

Implementering i main-metoden:

```java
public class Main {
    public static void main(String[] args) {
        DatabaseConnection.DatabaseConnectionFactory factory = DatabaseConnection.DatabaseConnectionFactory.getInstance();

        DatabaseConnection sqlConnection = factory.createConnection("SQL");
        System.out.println("SQL Connection String: " + sqlConnection.getConnectionString());

        DatabaseConnection noSqlConnection = factory.createConnection("NoSQL");
        System.out.println("NoSQL Connection String: " + noSqlConnection.getConnectionString());
    }
}
```

I `singFac` paket:

```java
public class Main {
    public static void main(String[] args) {
        singFac.DatabaseConnection.DatabaseConnectionFactory factory = singFac.DatabaseConnection.DatabaseConnectionFactory.getInstance();

        singFac.DatabaseConnection sqlConnection = factory.createConnection("SQL");
        System.out.println("SQL Connection String: " + sqlConnection.getConnectionString());

        singFac.DatabaseConnection noSqlConnection = factory.createConnection("NoSQL");
        System.out.println("NoSQL Connection String: " + noSqlConnection.getConnectionString());
    }
}
```

- **Fördelar:** Genom att kombinera Singleton och Factory får du en globalt tillgänglig fabrik som ansvarar för
  skapandet av specifika databasanslutningar, vilket gör hanteringen av dessa anslutningar både säker och flexibel.

#### 3. Kombinera Builder och Fluent Interface

- **Scenario:** Du bygger en `VacationPackage`-klass som använder Builder-mönstret för att hantera konstruktionen av
  komplexa semesterpaket. Fluent Interface används för att göra byggprocessen mer intuitiv och lättläst.

**Kodexempel i Java:**

```java
public class VacationPackage {
    private String destination;
    private int nights;
    private boolean includeFlights;
    private boolean includeHotel;
    private boolean includeMeals;

    private VacationPackage(VacationPackageBuilder builder) {
        this.destination = builder.destination;
        this.nights = builder.nights;
        this.includeFlights = builder.includeFlights;
        this.includeHotel = builder.includeHotel;
        this.includeMeals = builder.includeMeals;
    }

    public static class VacationPackageBuilder {
        private String destination;
        private int nights;
        private boolean includeFlights;
        private boolean includeHotel;
        private boolean includeMeals;

        public VacationPackageBuilder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public VacationPackageBuilder setNights(int nights) {
            this.nights = nights;
            return this;
        }

        public VacationPackageBuilder includeFlights(boolean includeFlights) {
            this.includeFlights = includeFlights;
            return this;
        }

        public VacationPackageBuilder includeHotel(boolean includeHotel) {
            this.includeHotel = includeHotel;
            return this;
        }

        public VacationPackageBuilder includeMeals(boolean includeMeals) {
            this.includeMeals = includeMeals;
            return this;
        }

        public VacationPackage build() {
            return new VacationPackage(this);
        }
    }

    @Override
    public String toString() {
        return "VacationPackage [destination=" + destination + ", nights=" + nights +
                ", includeFlights=" + includeFlights + ", includeHotel=" + includeHotel +
                ", includeMeals=" + includeMeals + "]";
    }
}
```

Implementering i main-metoden:

```java
public class Main {
    public static void main(String[] args) {
        VacationPackage.VacationPackageBuilder builder = new VacationPackage.VacationPackageBuilder()
                .setDestination("Paris")
                .setNights(7)
                .includeFlights(true)
                .includeHotel(true)
                .includeMeals(true);

        VacationPackage vacationPackage = builder.build();
        System.out.println(vacationPackage);
    }
}
```

- **Fördelar:** Kombinationen av Builder och Fluent Interface ger en flexibel och lättläst lösning för att bygga
  komplexa objekt, där varje steg i byggprocessen är tydligt och begripligt.

---

# 5. Reflektion och diskussion

## Föreläsningsmaterial

### Diskutera bästa praxis för designmönster

#### 1. När ska man använda designmönster?

- **Introduktion:** Designmönster är kraftfulla verktyg, men de bör användas med eftertanke. Att använda ett mönster
  bara för sakens skull kan leda till överkomplicerad kod. Det är viktigt att förstå när ett designmönster är den rätta
  lösningen och när det är bättre att hålla sig till enklare, mer direkt kodningstekniker.
- **Rätt tidpunkt att använda designmönster:**
  - **Komplexitet:** När ett problem blir tillräckligt komplext att hantera utan ett systematiskt tillvägagångssätt.
  - **Återanvändbarhet:** När du utvecklar en lösning som sannolikt kommer att återanvändas i andra projekt eller
      delar av ett projekt.
  - **Underhållbarhet:** När en lösning behöver vara lätt att förstå och underhålla över tid, särskilt av andra
      utvecklare.

#### 2. När ska man undvika designmönster?

- **Överanvändning av designmönster:**
  - **YAGNI (You Aren't Gonna Need It):** Om ett mönster inte direkt löser ett aktuellt problem kan det vara bäst att
      inte använda det. Försök undvika att implementera designmönster för funktioner eller problem som inte är kritiska
      eller inte existerar än.
  - **Enkelhet framför komplexitet:** Om en enklare lösning finns, som uppfyller kraven på ett tillfredsställande
      sätt, bör den föredras framför ett mer komplext mönster.
  - **Lär dig känna igen "design över-engineering":** Överdriven användning av designmönster kan göra koden svår att
      läsa, underhålla och förstå, särskilt för mindre erfarna utvecklare.

#### 3. Hur man väljer rätt designmönster

- **Förstå problemet:**
  - Analysera problemet noggrant innan du bestämmer vilket (om något) designmönster som är mest lämpligt.
  - Använd mönster som direkt adresserar det problem du försöker lösa, istället för att anpassa problemet till ett
      favoritmönster.

- **Kombination av mönster:**
  - Det är inte ovanligt att kombinera flera designmönster för att lösa komplexa problem. Lär dig att känna igen när
      det är lämpligt att göra detta och hur olika mönster kan komplettera varandra.

#### 4. Reflektion: Hur designmönster påverkar kodkvalitet

- **Förbättrad kodkvalitet:**
  - Designmönster hjälper till att skapa kod som är mer modulär, återanvändbar och lättare att testa.
  - Mönster främjar goda designprinciper som Single Responsibility Principle (SRP), Open/Closed Principle (OCP), och
      Dependency Inversion Principle (DIP).

- **Risker med designmönster:**
  - Om designmönster används felaktigt kan de leda till onödigt komplex kod.
  - Det kan också leda till att man "låser" sig till en viss designstrategi som kan visa sig vara olämplig när kraven
      förändras.

---