# Inlämningsuppgift: Fordonsfabriken

## Översikt

Du ska skapa en enkel fordonsfabriken i Java som kan skapa och hantera olika typer av fordon. Applikationen ska använda
objektorienterade principer med arv, polymorfism och interfaces. Du kommer att få färdiga interfaces som du ska
implementera i olika fordon.

Du ska implementera 2 modeller av fordon, bil och motorcykel samt en fabrik för varje fordon.

## Krav

### 1. Skapa följande klasser

- I `models` package:
  - **CarImpl.java**
  - **MotorcycleImpl.java**
- I `factories` package:
  - **CarFactory.java**
  - **MotorcycleFactory.java**

**Implementera alla metoder från interfaces.**
_Ni ska inte ändra på interface definitionerna, utan endast implementera dem._

Skapa lämpliga privata variabler i klasserna för att hålla reda på fordonens olika egenskaper.

Utifrån att du ska implementera interfacet `Car` i klassen `CarImpl.java` samt interfacet `Motorcycle` i klassen `MotorcycleImpl.java`, dessa ska ligga i mappen `models`. Dessa ska du sedan använda för att skapa två fabriker för att kunna skapa olika fordon. Fabrikerna `CarFactory.java` och `MotorcycleFactory.java` ska ligga i mappen `factories`.

### 2. Main

`Main.java` finns med färdig exempel kod som du kan använda dig utav.

Du kan modifiera `Main.java` för att testa de olika fordonen under utvecklingen.

`Main.java` kommer inte att testas av systemet, detta endast för att du ska kunna testa dina fordon.

Implementera dina klasser så att de ger korrekt resultat för exempelkoden i `Main.java`.

### 3. Exempel på förväntad utdata

Med den här koden i `Main.java`:

```Java
package se.dsve;

import se.dsve.factories.CarFactory;
import se.dsve.factories.MotorcycleFactory;
import se.dsve.models.CarImpl;
import se.dsve.models.MotorcycleImpl;

public class Main {

    public static void main(String[] args) {
        // Instantiate the specific factories
        CarFactory carFactory = new CarFactory();
        MotorcycleFactory motorcycleFactory = new MotorcycleFactory();

        // Create a car using the CarFactory
        CarImpl car = carFactory.createCar("Toyota", "Corolla", 2020, 15000, 4);
        System.out.println(car);
        car.startEngine();
        System.out.println("Car engine status: " + (car.isEngineOn() ? "On" : "Off"));
        car.stopEngine();
        System.out.println("Car engine status: " + (car.isEngineOn() ? "On" : "Off"));
        System.out.println("Car doors: " + car.getDoors());
        car.setDoors(5);
        System.out.println("Car doors: " + car.getDoors());

        // Create a motorcycle using the MotorcycleFactory
        MotorcycleImpl motorcycle = motorcycleFactory.createMotorcycle("Harley Davidson", "Sportster", 2019, 5000, "V-Twin");
        System.out.println(motorcycle);
        motorcycle.startEngine();
        System.out.println("Motorcycle engine status: " + (motorcycle.isEngineOn() ? "On" : "Off"));
        motorcycle.stopEngine();
        System.out.println("Motorcycle engine status: " + (motorcycle.isEngineOn() ? "On" : "Off"));
        System.out.println("Motorcycle engine type: " + motorcycle.getEngineType());
        motorcycle.setEngineType("Inline-4");
        System.out.println("Motorcycle engine type: " + motorcycle.getEngineType());
    }
}
```

Förväntas följande utdata från `Main.java`:

```Shell
Car: Toyota Corolla (2020), Doors: 4, Mileage: 15000.0
Car engine status: On
Car engine status: Off
Car doors: 4
Car doors: 5
Motorcycle: Harley Davidson Sportster (2019), Engine: V-Twin, Mileage: 5000.0
Motorcycle engine status: On
Motorcycle engine status: Off
Motorcycle engine type: V-Twin
Motorcycle engine type: Inline-4
```

---

## Krav på Dokumentation

1. **Kommentera i din kod**: Använd korta och relevanta kommentarer som förklarar vad dina metoder gör.
2. **Dokumentation i Markdown**: Fyll i svar på frågorna i `personal_reflections.md` för att reflektera över din
   inlärningsprocess.
3. **Versionshantering med GIT**:

- Använd GIT för att spåra dina ändringar under utvecklingens gång.
- Se till att göra frekventa commit-meddelanden med beskrivande namn.

---

## Steg-för-steg Arbetsgång

1. Implementera klasserna `CarImpl` och `MotorcycleImpl` med alla metoder från interfacet `Car` och `Motorcycle`.
2. Implementera klasserna `CarFactory` och `MotorcycleFactory` med en metod för att skapa fordonen.
3. Testa att skapa fordon med hjälp av fabrikerna.
4. Testa att starta och stoppa motorerna på fordonen.
5. Testa att ändra egenskaper på fordonen.

---

## Bästa Praxis

- **Clean Code:** Använd tydliga och beskrivande namn på klasser, metoder och variabler. Håll dina metoder korta och
  fokuserade på en enda uppgift.
- **Modularisering:** Se till att varje klass har sitt eget ansvar. Kunden bör t.ex. inte känna till kontots interna
  funktionalitet.
- **Kommentera kod:** Lägg till kommentarer som beskriver vad dina metoder gör, särskilt för mer komplexa delar.
- **Testa ofta:** Testa varje funktion när du implementerar den för att säkerställa att allt fungerar korrekt.
- **Versionshantering:** Använd GIT genom hela processen och gör frekventa commits med beskrivande meddelanden. Använd
  funktioner som `branching` för att hantera olika versioner av din kod.

---

## Inlämningskrav

- Applikationen ska vara komplett och körbar.

---

## Bedömningskriterier (VG-nivå)

Den studerande kan:

- använder relevanta datastrukturer i olika situationer och motiverar sina val.
- utveckla välstrukturerade och väldokumenterade applikationer som följer principerna för clean code, och reflektera över sitt kodflöde för att optimera kodens prestanda och modularitet.
