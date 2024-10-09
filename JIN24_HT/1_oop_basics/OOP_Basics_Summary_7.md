# 1. Introduktion till arv (45 min)

## Vad är arv? (10 min)

### Definition:

- Arv är en grundläggande princip inom objektorienterad programmering (OOP) som gör det möjligt att skapa nya klasser
  baserade på befintliga klasser.
- Genom arv kan en underklass (subclass) ärva egenskaper (attribut) och beteenden (metoder) från en basklass (
  superclass), vilket möjliggör kodåteranvändning och en tydligare struktur.

### Exempel på verklig analogi:

- Tänk på en basklass "Djur" som beskriver generella egenskaper hos djur, såsom "andas" och "äter".
- En underklass "Hund" ärver dessa egenskaper men kan också ha specifika egenskaper som "skäller" och "viftar på
  svansen".
- På detta sätt kan "Hund" använda och utöka de egenskaper som definieras i "Djur".

### Varför är arv viktigt?

- **Återanvändning av kod:** Minskar behovet av att skriva samma kod flera gånger.
- **Klasshierarki:** Ger struktur åt koden och visar relationen mellan olika klasser.
- **Underhåll och uppdatering:** Ändringar i basklassen påverkar alla underklasser, vilket gör det enklare att uppdatera
  och underhålla koden.

## Exempel på arv i Java (15 min)

### Basklass och underklass:

```java
// Basklass (Superclass)
class Animal {
    // Egenskaper
    String name;
    int age;

    // Metod
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Underklass (Subclass)
class Dog extends Animal {
    // Specifik metod för Dog
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Skapa ett objekt av typen Dog
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.age = 3;

        // Anropa metoder
        myDog.eat();  // Ärvs från Animal
        myDog.bark(); // Specifik för Dog
    }
}
```

### Genomgång av koden:

1. **Basklassen "Animal":**
    - Innehåller två egenskaper: `name` och `age`.
    - Har en metod `eat()` som skriver ut att djuret äter.

2. **Underklassen "Dog":**
    - Ärver egenskaperna `name` och `age` samt metoden `eat()` från basklassen "Animal".
    - Introducerar en ny metod `bark()` som är specifik för klassen "Dog".

3. **Skapa och använda objekt:**
    - Ett objekt av typen `Dog` skapas, och både ärvda och specifika metoder kan anropas.

### Diskussion:

- Hur skulle du kunna utöka detta exempel genom att skapa fler underklasser som "Cat" eller "Bird"?
- Vilka andra egenskaper eller metoder skulle vara användbara att lägga till i basklassen?

---

# 2. Polymorfism (45 min)

## Vad är polymorfism? (10 min)

### Definition:

- Polymorfism är en central princip inom objektorienterad programmering (OOP) som tillåter att en metod kan ha flera
  olika former.
- Det innebär att samma metod kan bete sig på olika sätt beroende på vilket objekt den anropas på, eller vilken typ av
  argument som skickas in.

### Typer av polymorfism:

- **Statisk polymorfism (compile-time):** Uppnås genom metodöverlagring (method overloading). Samma metodnamn används
  för olika metoder med olika signaturer (antal eller typ av argument).
- **Dynamisk polymorfism (runtime):** Uppnås genom metodöverskuggning (method overriding). En underklass kan
  tillhandahålla en specifik implementering av en metod som redan är definierad i basklassen.

### Varför är polymorfism viktigt?

- **Flexibilitet:** Gör det möjligt att skriva mer flexibel och återanvändbar kod.
- **Enkelhet:** Gör det enklare att utvidga programvarusystem utan att ändra befintlig kod.
- **Användning av generiska metoder:** Tillåter att en metod kan arbeta med olika datatyper eller objekt utan att behöva
  omskrivas för varje ny typ.

## Exempel på polymorfism i Java (15 min)

### Statisk polymorfism - Metodöverlagring:

```java
class MathOperations {
    // Metodöverlagring - Olika metoder med samma namn men olika signaturer
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations operations = new MathOperations();

        System.out.println("Addition of integers: " + operations.add(5, 10));
        System.out.println("Addition of doubles: " + operations.add(5.5, 10.5));
    }
}
```

### Dynamisk polymorfism - Metodöverskuggning:

```java
class Animal {
    // Metod som kommer att överskuggas
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Överskuggar basklassens sound()-metod
    @Override
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    // Överskuggar basklassens sound()-metod
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Woof
        myCat.sound(); // Meow
    }
}
```

### Diskussion:

- Hur kan du använda statisk och dynamisk polymorfism i dina program för att göra dem mer flexibla och underhållbara?
- När är det lämpligt att använda metodöverlagring respektive metodöverskuggning?

---

# 3. Abstraktion (45 min)

## Vad är abstraktion? (10 min)

### Definition:

- Abstraktion är en objektorienterad princip som går ut på att dölja den komplexa implementationen och bara exponera det
  som är nödvändigt för användaren.
- Det handlar om att skapa en förenklad modell av något komplext genom att fokusera på de viktigaste aspekterna och
  dölja detaljerna.

### Typer av abstraktion:

- **Abstrakta klasser:** Klasser kan inte instansieras direkt. De kan innehålla både fullständiga metoder och
  abstrakta metoder som måste implementeras av underklasser.
- **Gränssnitt (Interfaces):** Ett kontrakt som klasser kan implementera. Alla metoder i ett gränssnitt är abstrakta (
  utan implementation) och måste implementeras av klassen som använder gränssnittet.

### Varför är abstraktion viktigt?

- **Enkelhet:** Gör programmet enklare att förstå och använda genom att dölja komplexa detaljer.
- **Återanvändbarhet:** Uppmuntrar skapandet av generiska komponenter som kan återanvändas på flera ställen i
  programmet.
- **Flexibilitet:** Tillåter förändringar i implementationen utan att påverka den kod som använder den abstrakta
  komponenten.

## Exempel på abstraktion i Java (15 min)

### Abstrakta klasser:

```java
// Abstrakt klass
abstract class Animal {
    // Abstrakt metod (ingen implementation här)
    abstract void makeSound();

    // Icke-abstrakt metod (fullständig implementation)
    void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Underklass som implementerar den abstrakta metoden
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Woof
        myDog.sleep();     // The animal is sleeping.
    }
}
```

### Gränssnitt:

```java
// Gränssnitt
interface Movable {
    void move(); // Abstrakt metod
}

// Klass som implementerar gränssnittet
class Car implements Movable {
    @Override
    public void move() {
        System.out.println("The car is moving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move(); // The car is moving.
    }
}
```

### Diskussion:

- När skulle du välja att använda en abstrakt klass jämfört med ett gränssnitt?
- Hur kan abstraktion hjälpa dig att strukturera dina program bättre?

---

# 4. Kombinera arv, polymorfism och abstraktion (45 min)

## Introduktion (5 min)

### Översikt

- I den här delen kommer vi att kombinera tre centrala objektorienterade principer: arv, polymorfism och abstraktion.
- Att kombinera dessa principer hjälper till att skapa robusta, flexibla och underhållbara applikationer.

### Kort repetition

- **Arv:** Möjliggör återanvändning av kod genom att en underklass ärver egenskaper och metoder från en basklass.
- **Polymorfism:** Tillåter att metoder kan ha olika former och bete sig olika beroende på vilken typ av objekt som används.
- **Abstraktion:** Fokuserar på att dölja den komplexa implementationen och exponera bara det som är relevant för användaren.

## Exempel: Ett djurhanteringssystem (15 min)

### Basklass och arv

```java
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Abstrakt metod som måste implementeras av underklasser
    abstract void makeSound();

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
```

### Underklasser som implementerar abstrakta metoder

```java
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow");
    }
}
```

### Polymorfism i aktion

```java
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        // Polymorfiskt anrop
        myDog.makeSound(); // Buddy says: Woof
        myCat.makeSound(); // Whiskers says: Meow

        // Använda en metod från basklassen
        myDog.sleep(); // Buddy is sleeping.
        myCat.sleep(); // Whiskers is sleeping.
    }
}
```

### Diskussion

- Hur underklasserna `Dog` och `Cat` ärver egenskaper från basklassen `Animal`.
- Hur polymorfism gör det möjligt att använda basklassens referenser (`Animal`) för att anropa underklassernas metoder (`Dog` och `Cat`).
- Hur abstraktion används för att dölja detaljer om hur ljudet görs och fokusera på vad djuren gör.

---

# 5. Förberedelse för designmönster

## Introduktion till designmönster (10 min)

### Vad är designmönster?

- Designmönster är återanvändbara lösningar på vanliga problem inom programvarudesign.
- De erbjuder en struktur och riktlinjer för hur man kan lösa problem som återkommer i olika kontexter.

### Varför använda designmönster?

- **Återanvändbarhet:** Mönstren är testade och beprövade lösningar som kan användas i många olika projekt.
- **Effektivitet:** Hjälper till att lösa problem snabbare genom att återanvända befintliga lösningar.
- **Kommunikation:** Designmönster ger ett gemensamt språk som utvecklare kan använda för att diskutera lösningar.

### Tre vanliga typer av designmönster:

1. **Skapandemönster:** Hur objekt skapas (t.ex. Singleton, Factory).
2. **Strukturmönster:** Hur klasser och objekt sätts samman (t.ex. Adapter, Decorator).
3. **Beteendemönster:** Hur klasser och objekt interagerar (t.ex. Observer, Strategy).

## Exempel på ett enkelt designmönster: Singleton (15 min)

### Singletonmönstret:

- **Syfte:** Säkerställer att en klass har endast en instans och ger en global åtkomstpunkt till denna instans.

### Exempel på Singleton i Java:

```java
class Singleton {
    // Privat statisk instans av klassen
    private static Singleton instance;

    // Privat konstruktor för att förhindra instansiering
    private Singleton() {
    }

    // Offentlig metod för att få tillgång till den enda instansen
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from the Singleton!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Försök att skapa en instans av Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage(); // Output: Hello from the Singleton!
    }
}
```

### Diskussion:

- Hur säkerställer Singleton-mönstret att bara en instans skapas?
- När skulle du använda Singleton-mönstret i en applikation?

---