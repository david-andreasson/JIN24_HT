### Projektplan för enkel To-Do-lista applikation i Java

#### 1. **Projektbeskrivning**
Applikationen ska vara en enkel konsolbaserad to-do-lista där användaren kan lägga till, ta bort och visa uppgifter. Den ska också kunna markera uppgifter som "klara" samt spara uppgifter till en fil så att de kan läsas in vid ett senare tillfälle. Applikationen kommer byggas i Java, vilket innebär användning av grundläggande OOP-koncept (objektorienterad programmering) som klasser och metoder.

#### 2. **Huvudfaser i projektet**
Nedan listas huvudfaserna i projektet och deras uppskattade tidsåtgång:

##### 2.1. **Fas 1: Planering och design (ca 4–6 timmar)**
- Definiera de funktionella kraven (lägga till uppgift, visa uppgift, markera som klar, ta bort uppgift, spara/ladda från fil).
- Rita en enkel klassdiagram för att bestämma de objekt som behövs (t.ex. `Task`, `TaskManager`).
- Bestämma vilka metoder och attribut varje klass behöver.

##### 2.2. **Fas 2: Grundläggande implementation (ca 8–10 timmar)**
- Implementera `Task` klassen som hanterar individuella uppgifter.
    - Attribut som titel, beskrivning och status (klar/inte klar).
    - Metoder för att ändra status och visa information.
- Implementera `TaskManager` klassen som hanterar en lista av uppgifter.
    - Metoder för att lägga till, ta bort och visa alla uppgifter.
    - Lagra uppgifterna i en `ArrayList<Task>`.

##### 2.3. **Fas 3: Användargränssnitt (ca 4–6 timmar)**
- Skapa ett simpelt konsolbaserat användargränssnitt där användaren kan interagera med applikationen.
    - Menyval för att lägga till, ta bort, visa och markera uppgifter.
    - Läs in användarens input och utför rätt åtgärder baserat på valet.

##### 2.4. **Fas 4: Filhantering (ca 6–8 timmar)**
- Implementera funktionalitet för att spara uppgifter till en fil och läsa in uppgifter från en fil.
    - Använd klasser som `FileWriter` och `BufferedReader` för filhantering.
    - Skapa metoder i `TaskManager` för att spara och ladda uppgifter.

##### 2.5. **Fas 5: Testning och felsökning (ca 4–6 timmar)**
- Testa alla funktioner för att säkerställa att applikationen fungerar korrekt.
- Identifiera och åtgärda buggar.

##### 2.6. **Fas 6: Dokumentation och avslut (ca 3–4 timmar)**
- Skriv enkel dokumentation som beskriver hur applikationen fungerar och hur den kan användas.
- Kommentera viktig kod och förklara metoder och klasser.

#### 3. **Potentiella risker och hantering**
- **Förståelse för Java och OOP-koncept**: Eftersom detta är ditt första Java-projekt kan det vara utmanande att förstå koncept som klasser, objekt och metoder. **Hantering**: Läs på om grundläggande OOP i Java och använd exempel för att förstå hur objektorientering fungerar.

- **Filhantering kan vara svår**: Att hantera filer för att spara och läsa data kan vara utmanande om du inte har gjort det tidigare. **Hantering**: Använd enkla exempel från dokumentation eller handledningar för att förstå hur Java hanterar filin- och utmatning.

- **Tidsuppskattning**: Tidsuppskattningen kan variera beroende på svårigheter att förstå koncept och implementera lösningar. **Hantering**: Var flexibel och ta dig tid att förstå varje fas innan du går vidare till nästa. Ta hjälp av handledare eller forum vid problem.

- **Buggar och felsökning**: Det kan uppstå buggar som är svåra att hitta. **Hantering**: Använd `System.out.println` för att skriva ut värden och steg för att spåra buggar. Gör små förändringar och testa ofta.

#### 4. **Sammanfattad tidsplan**
| Fas                     | Uppskattad tidsåtgång |
|--------------------------|-----------------------|
| 1. Planering och design   | 4–6 timmar            |
| 2. Grundläggande implementation | 8–10 timmar          |
| 3. Användargränssnitt     | 4–6 timmar            |
| 4. Filhantering           | 6–8 timmar            |
| 5. Testning och felsökning| 4–6 timmar            |
| 6. Dokumentation och avslut| 3–4 timmar            |
| **Total tidsåtgång**      | **29–40 timmar**       |