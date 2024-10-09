# 1. Repetition av Arrays (45 min)

## Föreläsning (20-25 min)

### Introduktion till Arrays (10 min)

#### Vad är en Array?

En array är en datastruktur som lagrar flera värden av samma datatyp i en enda variabel. Arrays används när vi behöver
hålla en lista av värden, som till exempel en lista av tal eller strängar. Alla värden i en array lagras i följd i
minnet och kan nås med hjälp av ett index.

#### Deklaration och Initialisering av Arrays

För att använda en array i Java, måste vi först deklarera den och sedan initiera den.

Exempel på deklaration:

```java
int[] numbers;
```

Exempel på initialisering:

```java
numbers = new int[5]; // Skapar en array som kan hålla 5 heltal
```

Vi kan också deklarera och initiera en array i ett steg:

```java
int[] numbers = new int[5];
```

### Användning av Arrays (15 min)

#### Tilldela Värden till en Array

Efter att en array har deklarerats och initierats kan vi tilldela värden till dess element genom att använda dess index.

Exempel:

```java
numbers[0]=10;
numbers[1]=20;
numbers[2]=30;
numbers[3]=40;
numbers[4]=50;
```

#### Åtkomst till Element i en Array

För att hämta värden från en array använder vi också index.

Exempel:

```java
System.out.println(numbers[2]); // Output: 30
```

#### Iterera genom en Array

Det är vanligt att använda en loop för att iterera genom alla element i en array.

Exempel med en `for`-loop:

```java
for(int i = 0; i < numbers.length; i++){
        System.out.println(numbers[i]);
}
```

#### Vanliga Operationer på Arrays

- **Beräkna summan av alla element:** Man kan använda en loop för att summera alla värden i en array.
- **Hitta det största/minsta värdet:** En loop kan också användas för att hitta det största eller minsta värdet i en
  array.

Exempel:

```java
int max = numbers[0];
for(int i = 1; i < numbers.length; i++){
    if(numbers[i] > max){
        max =numbers[i];
    }
}
System.out.println("Max value: "+max);
```

### Sammanfattning

- Arrays är en grundläggande datastruktur som används för att lagra flera värden av samma typ.
- Man kan deklarera, initiera, tilldela och hämta värden från arrays med hjälp av index.
- Loopar används ofta för att iterera genom arrays och utföra olika operationer, som att summera värden eller hitta det
  största värdet.

---

# 2. Repetition av Listor

## Föreläsning (20-25 min)

### Introduktion till Listor (10 min)

#### Vad är en Lista?

En lista är en dynamisk datastruktur som, till skillnad från en array, kan ändra storlek under programmets gång. I Java
används ofta `ArrayList` som en implementering av en lista. En `ArrayList` kan lagra element av valfri datatyp och
erbjuder många inbyggda metoder för att hantera elementen.

#### Deklaration och Initialisering av Listor

För att använda en lista i Java måste vi först deklarera och sedan initiera den.

Exempel på deklaration:

```java
List<Integer> numbers;
```

Exempel på initialisering:

```java
numbers =new ArrayList<>();
```

Vi kan också deklarera och initiera en lista i ett steg:

```java
List<Integer> numbers = new ArrayList<>();
```

### Användning av Listor (15 min)

#### Tilldela Värden till en Lista

Vi kan lägga till värden till en lista med hjälp av metoden `add()`.

Exempel:

```java
numbers.add(10);
numbers.add(20);
numbers.add(30);
```

#### Åtkomst till Element i en Lista

För att hämta värden från en lista använder vi metoden `get()` med ett index.

Exempel:

```java
System.out.println(numbers.get(1)); // Output: 20
```

#### Iterera genom en Lista

Precis som med arrays kan vi använda en loop för att iterera genom alla element i en lista.

Exempel med en `for`-loop:

```java
for(int i = 0; i <numbers.size();i++){
    System.out.println(numbers.get(i));
}
```

Vi kan också använda en "enhanced for-loop":

```java
for(int number :numbers){
    System.out.println(number);
}
```

**Förklaring** av "enhanced for-loop": `for(int number : numbers)` betyder att för varje `number` i `numbers`, gör...

#### Vanliga Operationer på Listor

- **Lägga till element:** Vi kan lägga till ett element i slutet av listan med `add()`.
- **Ta bort element:** Vi kan ta bort ett element från listan med `remove()`.
- **Hitta storleken på listan:** Använd `size()` för att få antalet element i listan.

Exempel:

```java
numbers.remove(1); // Tar bort elementet vid index 1
System.out.println("List size: "+numbers.size());
```

### Sammanfattning

- Listor är dynamiska datastrukturer som kan ändra storlek under körning.
- `ArrayList` är en vanlig implementering av en lista i Java.
- Vi kan använda olika inbyggda metoder för att lägga till, hämta och ta bort element i en lista.

---

# 3. Vanliga operationer på Datastrukturer (45 min)

## Föreläsning (20-25 min)

### Introduktion till Vanliga Operationer (5 min)

#### Vad är Vanliga Operationer?

Vanliga operationer på datastrukturer inkluderar sortering, sökning och modifiering av data. Dessa operationer är
grundläggande för att hantera och bearbeta data effektivt i programmering. Genom att förstå hur man utför dessa
operationer kan man förbättra programmets prestanda och effektivitet.

### Sortering av Datastrukturer (10 min)

#### Introduktion till Sorteringsalgoritmer

Sortering är en av de mest grundläggande operationerna på datastrukturer. Det finns många olika sorteringsalgoritmer,
men några av de enklaste och mest använda är `Bubble Sort` och `Selection Sort`.

#### Exempel på Bubble Sort

Bubble Sort är en enkel algoritm där varje element jämförs med det nästa, och de byts plats om de är i fel ordning.
Processen upprepas tills hela strukturen är sorterad.

Exempel:

```java
private static int[] bubbleSort(int[] array){
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                // Byt plats
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
    return array; // Returnera den sorterade arrayen
}
```

### Sökning i Datastrukturer (10 min)

#### Introduktion till Sökalgoritmer

Sökning är processen att hitta ett specifikt element i en datastruktur. Den vanligaste och enklaste sökalgoritmen är
`Linjära Sökning`.

#### Exempel på Linjära Sökning

Linjära sökning innebär att man går igenom varje element i datastrukturen tills man hittar det element man söker.

Exempel:

```java
public static int linearSearch(int[] array, int key) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == key) {
            return i; // Returnerar indexet där elementet finns
        }
    }
    return -1; // Om elementet inte hittas
}
```

### Modifiering av Datastrukturer (5 min)

#### Modifiering av Element

Att modifiera ett element i en datastruktur innebär att man ändrar värdet på ett specifikt element vid ett givet index.
Detta kan göras både i arrays och listor.

Exempel:

```java
int[] numbers = {10, 20, 30, 40, 50};
numbers[2] = 100; // Ändrar värdet på index 2 till 100
```

### Sammanfattning

- Sortering och sökning är grundläggande operationer på datastrukturer som hjälper till att organisera och hitta data
  effektivt.
- Bubble Sort och Linjära Sökning är enkla och grundläggande algoritmer som är bra att börja med.
- Modifiering av element är en vanlig operation som används för att uppdatera data i både arrays och listor.

Körbar kod för att visa vanliga operationer på datastrukturer:

```java
private static void generalOperators() {
    System.out.println("Vanliga operatorer");
    int[] numbers = {10, 30, 30, 4, 50};
    int[] sortedNumbers = bubbleSort(numbers);

    // Skriver ut den sorterade arrayen
    for (int i = 0; i < sortedNumbers.length; i++) {
        System.out.println(sortedNumbers[i]);
    }

    // Använder linearSearch på den sorterade arrayen
    int search = linearSearch(sortedNumbers, 4);
    System.out.println("searched number is on index: " + search);
}

private static int[] bubbleSort(int[] array){
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                // Byt plats
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
    return array; // Returnerar den sorterade arrayen
}

public static int linearSearch(int[] array, int key) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == key) {
            return i; // Returnerar indexet där elementet finns
        }
    }
    return -1; // Om elementet inte hittas
}
```

---

# 4. Användning av Datastrukturer i Objektorienterad Programmering (45 min)

## Föreläsning (20-25 min)

### Introduktion till Datastrukturer i OOP (5 min)

#### Vad är Objektorienterad Programmering (OOP)?

Objektorienterad programmering (OOP) är en programmeringsparadigm som bygger på konceptet av "objekt", vilket är
instanser av klasser. Klasser kan innehålla data (attribut) och metoder (funktioner) som opererar på dessa data. OOP gör
det möjligt att organisera och hantera program genom att kapsla in data och funktionalitet i objekt.

#### Användning av Datastrukturer i OOP

I OOP används datastrukturer som arrays och listor för att hantera grupper av objekt. Dessa datastrukturer möjliggör
lagring och manipulation av flera objekt inom en klass, vilket är användbart när man behöver hantera flera instanser av
en viss typ.

### Användning av Arrays i OOP (10 min)

#### Arrays i Klasser

En array är en datastruktur som kan lagra flera objekt av samma typ. När vi använder arrays i en klass, kan vi hantera
en fast mängd objekt. Detta är praktiskt när vi vet i förväg hur många objekt vi kommer att hantera.

Exempel:

```java
public class Classroom {
    private Student[] students;
    private int studentCount;

    // Konstruktor som initierar arrayen och sätter den maximala storleken
    public Classroom(int size) {
        students = new Student[size];
        studentCount = 0;
    }

    // Metod för att lägga till en student i klassrummet
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Classroom is full!");
        }
    }

    // Metod för att lista alla studenter i klassrummet
    public void listStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getName());
        }
    }
}

// Student-klassen
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

I detta exempel:

- `Classroom`-klassen använder en array för att lagra `Student`-objekt.
- Konstruktoren tar ett `size`-argument som anger det maximala antalet studenter som kan lagras.
- Metoden `addStudent` lägger till en student i arrayen om det finns plats.
- Metoden `listStudents` itererar genom arrayen och skriver ut namnen på alla studenter.

### Användning av Listor i OOP (10 min)

#### Listor i Klasser

En `ArrayList` är en dynamisk datastruktur som kan ändra storlek vid behov. Detta gör den mycket flexibel för att lagra
och hantera objekt, särskilt när vi inte vet i förväg hur många objekt vi kommer att behöva lagra.

Exempel:

```java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Konstruktor som initierar listan
    public Library() {
        books = new ArrayList<>();
    }

    // Metod för att lägga till en bok i biblioteket
    public void addBook(Book book) {
        books.add(book);
    }

    // Metod för att lista alla böcker i biblioteket
    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}

// Book-klassen
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
```

I detta exempel:

- `Library`-klassen använder en `ArrayList` för att lagra `Book`-objekt.
- `addBook`-metoden lägger till ett nytt `Book`-objekt i listan.
- `listBooks`-metoden itererar genom listan och skriver ut titlarna på alla böcker i biblioteket.

### Sammanfattning och Fördjupning (5 min)

#### Arrays vs Listor i OOP

- **Arrays** är lämpliga när vi vet det exakta antalet objekt vi behöver hantera. De har fast storlek, vilket kan vara
  begränsande, men de är också enkla och effektiva när det gäller minneshantering.
- **Listor (ArrayLists)** är mer flexibla eftersom de kan växa och krympa dynamiskt. Detta gör dem idealiska för
  situationer där antalet objekt inte är känt på förhand eller kan förändras.

#### Användning i Praktiska Program

Genom att kombinera arrays och listor med OOP-principer kan vi skapa kraftfulla och flexibla program som kan hantera
dynamiska data. Detta är grundläggande för att bygga skalbara applikationer, såsom system för hantering av studenter,
böcker, eller andra objekt i verkliga scenarier.

---

# 5. Förberedelse för kommande inlämningsuppgift (45 min)

## Föreläsning (20-25 min)

### Introduktion till Inlämningsuppgiften (5 min)

#### Översikt

Den kommande inlämningsuppgiften är utformad för att integrera de koncept vi har lärt oss hittills i kursen, inklusive
användning av klasser, objekt, arrays, listor, och grundläggande operationer som sortering och sökning. Uppgiften är att
bygga ett program som hanterar en enkel applikation med dessa element, vilket kommer att hjälpa dig att konsolidera din
förståelse av objektorienterad programmering och datastrukturer.

#### Mål med Inlämningsuppgiften

- **Användning av klasser och objekt:** Du kommer att designa och implementera klasser som representerar olika delar av
  applikationen.
- **Hantera samlingar av objekt:** Du kommer att använda datastrukturer som arrays eller listor för att lagra och
  manipulera objekt.
- **Implementera funktionalitet:** Programmet ska kunna utföra grundläggande operationer som att lägga till, ta bort och
  söka efter objekt.

### Struktur och Krav (10 min)

#### Krav på Applikationen

1. **Applikationens Koncept:** Du ska skapa ett program som hanterar en samling av objekt, till exempel ett
   bibliotekssystem, en skolhanteringsapplikation, eller en enkel inventariehanterare.
2. **Klasser och Objekt:** Minst två klasser ska skapas som representerar de viktigaste objekten i applikationen. Dessa
   klasser ska ha lämpliga attribut och metoder.
3. **Datastrukturer:** Använd en array eller lista för att hantera en samling av objekt. Programmet ska kunna lägga
   till, ta bort och lista dessa objekt.
4. **Grundläggande Operationer:** Programmet ska implementera grundläggande operationer som att sortera objekten efter
   ett specifikt attribut och att söka efter ett objekt baserat på ett attribut.

#### Exempel på en Applikation

Låt oss ta ett exempel på ett bibliotekssystem:

- **Klasser:** Du har en klass `Book` som representerar en bok, och en klass `Library` som hanterar samlingen av böcker.
- **Attribut och Metoder:** `Book` har attribut som `title`, `author`, och `year`. `Library` har metoder för att lägga
  till böcker, ta bort böcker, lista böcker och söka efter böcker.
- **Datastrukturer:** `Library` använder en `ArrayList` för att lagra alla `Book`-objekt.
- **Operationer:** `Library` kan sortera böckerna efter titel och söka efter en bok baserat på titel eller författare.

### Design och Planering (10 min)

#### Designprocessen

1. **Identifiera Klasser och Attribut:** Börja med att identifiera de klasser du behöver och de attribut varje klass ska
   ha. Fundera på vilken information varje objekt måste innehålla och vilka operationer som ska kunna utföras på denna
   information.

2. **Välj Datastrukturer:** Välj om du ska använda en array eller en lista för att hantera dina objekt. Tänk på att en
   `ArrayList` är mer flexibel än en array om du behöver kunna lägga till och ta bort objekt dynamiskt.

3. **Planera Funktionaliteten:** Bestäm vilka metoder du behöver implementera. Fundera på vilka operationer ditt program
   ska kunna utföra och hur dessa operationer kommer att interagera med dina datastrukturer.

#### Exempel på Planering

- **Klasser:** `Book` (attribut: `title`, `author`, `year`), `Library` (metoder: `addBook()`, `removeBook()`,
  `listBooks()`, `searchBook()`).
- **Datastruktur:** `ArrayList<Book>` i `Library` för att lagra alla böcker.
- **Funktionalitet:** Metoder för att lägga till och ta bort böcker, lista alla böcker i alfabetisk ordning, och söka
  efter en bok baserat på titel eller författare.

### Tips och Bästa Praxis (5 min)

#### Tips för Att Lyckas

- **Modularisera:** Håll dina metoder enkla och fokuserade på en enda uppgift. Detta gör din kod lättare att förstå och
  underhålla.
- **Kommentera:** Lägg till kommentarer i din kod för att förklara vad varje del gör, särskilt om koden är komplex.
- **Testa Din Kod:** Testa varje del av din kod när du implementerar den för att säkerställa att den fungerar som
  förväntat innan du går vidare till nästa del.
- **Använd ChatGPT för Hjälp:** Om du stöter på problem eller behöver förklaringar, använd verktyg som ChatGPT för att
  få hjälp med att förstå koncept eller felsöka kod.

---