1. Vad är huvudsyftet med klasser i objektorienterad programmering?

A) Att skapa databaser  
B) Att fungera som mallar för att skapa objekt  
C) Att hantera nätverkskommunikation  
D) Att optimera minnesanvändning  

**Rätt svar:** B

---

2. Vad är inkapsling i Java?

A) En metod för att komprimera data  
B) En teknik för att öka exekveringshastigheten  
C) Principen om att dölja interna detaljer och ge kontrollerad åtkomst till objektets data  
D) Ett sätt att skapa kopior av objekt  

**Rätt svar:** C

---

3. Vilken åtkomstmodifierare i Java gör en medlem tillgänglig endast inom samma klass?

A) public  
B) private  
C) protected  
D) default  

**Rätt svar:** B

---

4. Vad är huvudsyftet med arv i objektorienterad programmering?

A) Att öka exekveringshastigheten  
B) Att minska minnesanvändningen  
C) Att skapa nya klasser baserade på existerande klasser och främja kodåteranvändning  
D) Att förbättra datasäkerheten  

**Rätt svar:** C

---

5. Vad möjliggör polymorfism i Java?

A) Att skapa oändliga loopar  
B) Att behandla objekt av olika typer på ett enhetligt sätt  
C) Att automatiskt generera dokumentation  
D) Att kompilera kod snabbare  

**Rätt svar:** B

1. Vad är huvudsyftet med JDBC?

A) Att skapa grafiska användargränssnitt  
B) Att möjliggöra interaktion mellan Java-applikationer och relationsdatabaser  
C) Att hantera nätverkskommunikation  
D) Att optimera Java-kod  

**Rätt svar:** B

---

2. Vilken av följande är INTE en fördel med SQLite?

A) Ingen separat serverinstallation krävs  
B) Snabb och effektiv för mindre till medelstora datamängder  
C) Utmärkt för distribuerade system med hög belastning  
D) Hela databasen lagras i en enda fil  

**Rätt svar:** C

---

3. Vilken syntax används för att skapa en SQLite-anslutning i Java?

A) Connection connection = SQLite.connect("database.db");  
B) Connection connection = new SQLiteConnection("database.db");  
C) Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");  
D) Connection connection = SQLiteManager.openConnection("database.db");  

**Rätt svar:** C

---

4. Hur lägger man till SQLite JDBC-drivrutinen i ett Maven-projekt?

A) Genom att manuellt ladda ner JAR-filen och lägga till den i classpath  
B) Genom att lägga till en dependency i pom.xml-filen  
C) Genom att installera SQLite separat på systemet  
D) Genom att använda en speciell Maven-plugin  

**Rätt svar:** B

---

5. Vilket av följande påståenden om JDBC är INTE korrekt?

A) JDBC används för att etablera en säker koppling till databasen  
B) JDBC används för att skicka SQL-frågor till databasen  
C) JDBC hanterar och presenterar data som returneras från databasen  
D) JDBC optimerar automatiskt alla SQL-frågor för bättre prestanda  

**Rätt svar:** D

1. Hur skapas en ny SQLite-databas i Java?

A) Genom att exekvera ett specifikt SQL-kommando  
B) Genom att ansluta till en fil som inte existerar  
C) Genom att använda ett särskilt CREATE DATABASE-kommando  
D) Genom att manuellt skapa en tom databasfil före anslutning  

**Rätt svar:** B

---

2. Vilken är den korrekta syntaxen för att skapa en tabell i SQLite via JDBC?

A) CREATE TABLE tablename (id INTEGER PRIMARY KEY, name TEXT NOT NULL);  
B) CREATE TABLE IF EXISTS tablename (id INTEGER PRIMARY KEY, name TEXT NOT NULL);  
C) CREATE TABLE IF NOT EXISTS tablename (id INTEGER PRIMARY KEY, name TEXT NOT NULL);  
D) NEW TABLE tablename (id INTEGER PRIMARY KEY, name TEXT NOT NULL);  

**Rätt svar:** C

---

3. Vad är huvudfördelen med att använda try-with-resources i JDBC-operationer?

A) Det förbättrar prestandan för databasförfrågningar  
B) Det möjliggör användning av PreparedStatements  
C) Det säkerställer automatisk stängning av databasresurser  
D) Det förhindrar SQL-injektion  

**Rätt svar:** C

---

4. Vad är det primära syftet med att använda PreparedStatement i JDBC?

A) Att förbättra läsbarheten av SQL-koden  
B) Att automatiskt skapa databasen om den inte existerar  
C) Att förhindra SQL-injektion och förbättra prestanda  
D) Att möjliggöra skapande av komplexa tabellstrukturer  

**Rätt svar:** C

---

5. Vilken av följande är en korrekt metod för att hantera SQL-fel i Java?

A) Använda en try-catch block och fånga Exception  
B) Ignorera alla SQL-relaterade fel  
C) Använda en try-catch block och fånga SQLException, samt logga relevant felinformation  
D) Kasta alla SQL-fel vidare till JVM:en  

**Rätt svar:** C

1. Vad står CRUD för i sammanhanget av databasoperationer?

A) Create, Rewrite, Update, Delete  
B) Create, Read, Update, Delete  
C) Copy, Read, Utilize, Distribute  
D) Create, Retrieve, Update, Destroy  

**Rätt svar:** B

---

2. Vilket SQL-kommando används för att skapa ny data i en SQLite-databas?

A) CREATE  
B) ADD  
C) INSERT  
D) NEW  

**Rätt svar:** C

---

3. Vilken Java-klass används för att utföra parameteriserade SQL-frågor?

A) Statement  
B) SQLQuery  
C) ResultSet  
D) PreparedStatement  

**Rätt svar:** D

---

4. Vilken metod används för att exekvera en SELECT-fråga med PreparedStatement?

A) execute()  
B) executeQuery()  
C) executeSelect()  
D) executeUpdate()  

**Rätt svar:** B

---

5. Vad returnerar executeUpdate() när den används för INSERT, UPDATE eller DELETE operationer?

A) En boolean som indikerar om operationen lyckades  
B) Ett ResultSet med påverkade rader  
C) Antalet påverkade rader  
D) Ingenting (void)  

**Rätt svar:** C

1. Vad är huvudsyftet med att använda transaktioner i SQLite?

A) Att förbättra sökprestandan  
B) Att säkerställa databasintegritet och atomicitet vid komplexa operationer  
C) Att automatiskt exekvera funktioner när specifika händelser inträffar  
D) Att kombinera data från flera tabeller  

**Rätt svar:** B

---

2. Vilken SQL-syntax används för att skapa ett index i SQLite?

A) CREATE INDEX index_name ON table_name (column1, column2);  
B) CREATE TRIGGER index_name ON table_name;  
C) CREATE JOIN index_name ON table_name (column1, column2);  
D) CREATE TRANSACTION index_name ON table_name;  

**Rätt svar:** A

---

3. Vad är huvudsyftet med att använda joins i SQLite?

A) Att skapa automatiska backups av databasen  
B) Att förbättra prestandan för enskilda tabellsökningar  
C) Att kombinera data från flera tabeller i en enda fråga  
D) Att skapa nya tabeller baserade på befintliga data  

**Rätt svar:** C

---

4. Vad är huvudsyftet med att använda triggers i SQLite?

A) Att förbättra prestandan för databasfrågor  
B) Att kombinera data från flera tabeller  
C) Att säkerställa att alla operationer i en transaktion lyckas eller misslyckas tillsammans  
D) Att automatiskt exekvera funktioner när specifika händelser inträffar i databasen  

**Rätt svar:** D

---

5. Vilken av följande är INTE ett typiskt användningsområde för indexering i SQLite?

A) Att förbättra sökprestandan för ofta använda kolumner  
B) Att automatisera databasoperationer baserat på specifika händelser  
C) Att snabba upp sorteringsoperationer  
D) Att optimera WHERE-klausuler i SQL-frågor  

**Rätt svar:** B

1. Vilka är de huvudsakliga fördelarna med DAO-mönstret enligt materialet?

A) Förbättrar databasens prestanda och minskar svarstider  
B) Möjliggör enklare testning och isolerar databaslogik från affärslogik  
C) Automatiserar databasmigrering och versionshantering  
D) Hanterar användarautentisering och behörigheter  

**Rätt svar:** B

---

2. Vad är huvudsyftet med Connection Pool enligt materialet?

A) Att kryptera databasanslutningar  
B) Att logga alla databasoperationer  
C) Att minska overhead vid databasanslutningar och hantera resurser effektivt  
D) Att automatiskt rensa gamla databaskopplingar  

**Rätt svar:** C

---

3. Hur implementeras Singleton-mönstret i DatabaseConnectionPool-klassen?

A) Genom en publik konstruktor  
B) Genom en statisk getInstance()-metod och privat konstruktor  
C) Genom dependency injection  
D) Genom en abstrakt fabriksmetod  

**Rätt svar:** B

---

4. Vilken typ returnerar findById-metoden i UserDAO-gränssnittet?

A) User  
B) Optional<User>  
C) List<User>  
D) void  

**Rätt svar:** B

---

5. Vilka konfigurationsparametrar sätts för HikariCP i exemplet?

A) Endast JDBC URL och användaruppgifter  
B) Endast pool-storlek och timeout  
C) JDBC URL, användaruppgifter, maximala pool-storlek, minimum idle och connection timeout  
D) Endast JDBC URL och connection timeout  

**Rätt svar:** C

1. Vad är den huvudsakliga skillnaden mellan DAO och Repository?

A) DAO hanterar flera tabeller medan Repository fokuserar på en tabell  
B) DAO arbetar på tabellnivå medan Repository hanterar större helheter av information  
C) Repository hanterar endast CRUD-operationer medan DAO hanterar affärslogik  
D) DAO och Repository är samma sak med olika namn  

**Rätt svar:** B

---

2. Vilken är en av huvudfördelarna med Factory Pattern för databashantering?

A) Det gör databasen snabbare  
B) Det förbättrar säkerheten i databasen  
C) Det möjliggör byte av databastyp utan att ändra applikationskoden  
D) Det optimerar SQL-frågor automatiskt  

**Rätt svar:** C

---

3. När är Adapter Pattern lämpligt att använda enligt materialet?

A) När man vill öka databasens prestanda  
B) När man behöver kryptera data  
C) När man vill integrera legacy-system  
D) När man vill skapa nya tabeller  

**Rätt svar:** C

---

4. Vad är ett kännetecken för Repository-mönstret?

A) Det hanterar endast en databastabell  
B) Det fokuserar endast på CRUD-operationer  
C) Det kan innehålla avancerad logik för att bearbeta och kombinera data  
D) Det kommunicerar direkt med databasen utan mellanlager  

**Rätt svar:** C

---

5. Hur fungerar DAO enligt materialet?

A) Det hanterar komplex affärslogik  
B) Det fungerar som en central samlingspunkt för all databaslogik  
C) Det hanterar den direkta kommunikationen med databasen  
D) Det hanterar endast cachning av data  

**Rätt svar:** C

1. Vad är ett huvudsyfte med att använda UML för databaser?

A) Att göra koden mer effektiv  
B) Att visualisera systemets struktur innan kodning påbörjas  
C) Att förbättra databasens prestanda  
D) Att automatiskt generera databastabeller  

**Rätt svar:** B

---

2. Vilket påstående är korrekt gällande relationen mellan Customer och Order i klassdiagrammet?

A) En kund kan ha exakt en order  
B) En order kan ha flera kunder  
C) En kund kan ha flera ordrar  
D) En order måste ha minst två kunder  

**Rätt svar:** C

---

3. Hur representeras en one-to-many relation i Java-koden mellan Customer och Order?

A) @OneToOne  
B) @ManyToMany  
C) @OneToMany och @ManyToOne  
D) @ManyToOne och @OneToOne  

**Rätt svar:** C

---

4. Vilken typ av diagram används för att visa hur objekt interagerar över tid?

A) Klassdiagram  
B) ER-diagram  
C) Sekvensdiagram  
D) Flödesdiagram  

**Rätt svar:** C

---

5. Vad är syftet med EntityManager i OrderRepository?

A) Att hantera databasens säkerhet  
B) Att optimera SQL-queries  
C) Att hantera persistens och databastransaktioner  
D) Att generera UML-diagram  

**Rätt svar:** C

1. Vad är huvudsyftet med Single Responsibility Principle (SRP) i databaskontexten?

A) Att minimera antalet databasanslutningar  
B) Att en klass ska ha endast ett ansvar och därmed bara en anledning att ändras  
C) Att maximera prestandan i databaskoden  
D) Att centralisera all databaslogik i en enda klass  

**Rätt svar:** B

---

2. Hur implementeras Open/Closed Principle (OCP) bäst i databaskontexten?

A) Genom att låsa databaskoden efter implementation  
B) Genom att modifiera befintlig kod för varje ny funktionalitet  
C) Genom användning av interface och abstrakta klasser  
D) Genom att skapa nya databastabeller för varje ny funktion  

**Rätt svar:** C

---

3. Vad är syftet med Liskov Substitution Principle (LSP) i databashantering?

A) Att förhindra att subklasser skapas  
B) Att säkerställa att endast en typ av databas används  
C) Att objekt av en superklass ska kunna ersättas med objekt av dess subklasser utan att påverka programmets korrekthet  
D) Att tvinga alla databasoperationer att vara identiska  

**Rätt svar:** C

---

4. Vilket är huvudsyftet med Interface Segregation Principle (ISP) i databaskontexten?

A) Att samla alla databasoperationer i ett enda interface  
B) Att klienter inte ska tvingas bero av interface de inte använder  
C) Att skapa så många interface som möjligt  
D) Att eliminera alla interface i databaskoden  

**Rätt svar:** B

---

5. Vad säger Dependency Inversion Principle (DIP) om databashantering?

A) Att all databaskod måste vara beroende av konkreta implementationer  
B) Att endast en databas får användas i systemet  
C) Att högre nivåmoduler ska bero av lägre nivåmoduler  
D) Att affärslogik ska bero av abstrakta databasinterface snarare än konkreta implementationer  

**Rätt svar:** D

1. Vad är den huvudsakliga skillnaden mellan DAO och Repository i deras samverkan?

A) DAO hanterar affärslogik medan Repository hanterar dataåtkomst  
B) Repository tillför affärslogik och validering medan DAO hanterar ren dataåtkomst  
C) DAO och Repository har exakt samma ansvar  
D) Repository hanterar endast cachning medan DAO hanterar validering  

**Rätt svar:** B

---

2. Hur hanterar DatabaseConnectionFactory nya anslutningar för olika databastyper?

A) Den skapar nya anslutningar direkt utan pool  
B) Den använder en statisk pool för alla databastyper  
C) Den skapar en ny pool för varje anslutning  
D) Den skapar en pool per databastyp om den inte redan existerar  

**Rätt svar:** D

---

3. Vilken funktionalitet tillhandahåller CachingOrderRepository?

A) Den ersätter helt OrderRepository  
B) Den implementerar endast cache-invalidering  
C) Den fungerar som en wrapper runt OrderRepository med cache-funktionalitet  
D) Den hanterar endast databasanslutningar  

**Rätt svar:** C

---

4. Hur konfigureras cache i exemplet med CachingOrderRepository?

A) Ingen konfiguration, använder standardvärden  
B) Maximal storlek 100 entries, ingen tidsgräns  
C) Maximal storlek 1000 entries och 10 minuters utgångstid  
D) Obegränsad storlek med 5 minuters utgångstid  

**Rätt svar:** C

---

5. Hur hanterar DatabaseConnectionFactory konfigurationsdata?

A) Hämtar direkt från databas  
B) Använder hårdkodade värden  
C) Läser från en properties-fil via ClassLoader  
D) Tar emot konfiguration som parameter  

**Rätt svar:** C

1. Vad är huvudsyftet med SLF4J i Java-applikationer?

A) Att förbättra prestandan i Java-applikationer  
B) Att erbjuda ett abstraktionslager för loggning som separerar kod från implementationer  
C) Att ersätta alla andra loggningsramverk  
D) Att skapa JSON-formaterade loggar  

**Rätt svar:** B

---

2. Vilken loggnivå bör användas för att logga viktiga händelser i normal drift?

A) ERROR  
B) WARN  
C) INFO  
D) DEBUG  

**Rätt svar:** C

---

3. Vad är MDC (Mapped Diagnostic Context) i loggningssammanhang?

A) Ett verktyg för att mäta prestanda  
B) En metod för att kryptera loggmeddelanden  
C) Ett system för att hantera databasanslutningar  
D) Ett verktyg för att lägga till kontextuell information till loggmeddelanden  

**Rätt svar:** D

---

4. Hur implementeras lazy evaluation i SLF4J?

A) Genom att cache:a alla loggmeddelanden  
B) Genom att bara utvärdera loggmeddelanden när de faktiskt ska loggas  
C) Genom att komprimera loggmeddelanden  
D) Genom att schemalägga loggning till mindre upptagna tider  

**Rätt svar:** B

---

5. Vad är huvudsyftet med LogstashEncoder i Logback-konfigurationen?

A) Att komprimera loggmeddelanden  
B) Att kryptera känslig information  
C) Att formatera loggar som JSON för enklare parsing och analys  
D) Att filtrera bort onödiga loggmeddelanden  

**Rätt svar:** C

1. Vilka är de främsta fördelarna med H2 som databas för utveckling och testning?

A) Kräver omfattande installation och har begränsat SQL-stöd  
B) Kan endast köras i minnet och är svår att konfigurera  
C) Är långsam men har bra säkerhet  
D) Kan köras både i minnet och på disk, är snabb och lätt att konfigurera  

**Rätt svar:** D

---

2. Vad är huvudsyftet med Connection Pooling genom HikariCP?

A) Att skapa nya databasanslutningar för varje förfrågan  
B) Att återanvända databasanslutningar för att minimera overhead och förbättra prestanda  
C) Att begränsa antalet samtidiga användare i databasen  
D) Att kryptera databasanslutningar  

**Rätt svar:** B

---

3. Vad är syftet med Repository-mönstret enligt materialet?

A) Att blanda dataåtkomstlogik med affärslogik  
B) Att skapa direkta kopplingar mellan databas och användargränssnitt  
C) Att separera dataåtkomstlogik från affärslogik och standardisera CRUD-operationer  
D) Att eliminera behovet av databasanslutningar  

**Rätt svar:** C

---

4. Hur hanteras transaktioner enligt flödesdiagrammet i materialet?

A) Transaktioner hanteras automatiskt utan möjlighet till rollback  
B) Endast genom manuell commit utan felhantering  
C) Genom att starta transaktion, utföra operationer och sedan antingen commit vid lyckat resultat eller rollback vid misslyckande  
D) Transaktioner kan endast användas i minnesbaserade databaser  

**Rätt svar:** C

---

5. Vilken typ av JDBC-URL ska användas för att konfigurera en minnesbaserad H2-databas?

A) jdbc:h2:file:./data/mydb  
B) jdbc:h2:mem:mydb  
C) jdbc:h2:mysql:mydb  
D) jdbc:h2:postgres:mydb  

**Rätt svar:** B

1. Vilket av följande påståenden är korrekt angående H2-databasen?

A) Kan endast köras i filläge  
B) Kan köras i minnesläge, filläge och serverläge  
C) Använder minimal minnesanvändning  
D) Är optimerad för mobila enheter  

**Rätt svar:** B

---

2. Vilken är den huvudsakliga fördelen med SQLite jämfört med H2?

A) Har inbyggt webbgränssnitt  
B) Stödjer avancerade SQL-funktioner  
C) Minimal minnesanvändning  
D) Kan köras som serverinstans  

**Rätt svar:** C

---

3. Hur skiljer sig syntaxen för primärnycklar mellan H2 och SQLite i kodexemplen?

A) H2 använder AUTO_INCREMENT medan SQLite använder AUTOINCREMENT  
B) H2 använder INT medan SQLite använder INTEGER  
C) Både A och B är korrekta  
D) Det finns inga skillnader  

**Rätt svar:** C

---

4. När är H2 det bästa valet enligt materialet?

A) För mobila applikationer  
B) När minnesanvändning är kritisk  
C) För utveckling och testning  
D) När enkel distribution är viktigt  

**Rätt svar:** C

---

5. Vilket påstående är sant om SQLite?

A) Kräver en serverinstans  
B) Behöver mycket minnesutrymme  
C) Perfekt för mobila enheter och kräver ingen server  
D) Har inbyggt webbgränssnitt  

**Rätt svar:** C

1. Vad är ett av huvudsyftena med Clean Code enligt materialet?

A) Att optimera prestandan i koden  
B) Att minimera antalet rader kod  
C) Att göra koden lätt att underhålla  
D) Att eliminera alla kommentarer  

**Rätt svar:** C

---

2. Vilken princip beskrivs som den första nivån av dokumentation och kommunikation i kod?

A) Kommentarer  
B) Funktionsnamn  
C) Namngivning  
D) DRY-principen  

**Rätt svar:** C

---

3. När ska kommentarer användas enligt materialet?

A) För att förklara all kod  
B) För att dokumentera variabelnamn  
C) För att förklara komplexa algoritmer  
D) För att beskriva klassnamn  

**Rätt svar:** C

---

4. Vad är ett av kraven för funktioner enligt materialet?

A) De ska vara minst 50 rader långa  
B) De ska vara maximalt 20-30 rader kod  
C) De måste innehålla kommentarer  
D) De ska alltid ha minst tre parametrar  

**Rätt svar:** B

---

5. Hur implementeras DRY-principen enligt materialet?

A) Genom att skriva många kommentarer  
B) Genom att skapa långa funktioner  
C) Genom att identifiera upprepade mönster  
D) Genom att använda många variabelnamn  

**Rätt svar:** C

1. Vad är huvudsyftet med refactoring?

A) Att ändra kodens funktionalitet  
B) Att förbättra kodens struktur utan att ändra dess funktionalitet  
C) Att optimera kodens prestanda  
D) Att lägga till ny funktionalitet  

**Rätt svar:** B

---

2. Vilket är det huvudsakliga syftet med Extract Method pattern?

A) Att skapa nya klasser  
B) Att optimera prestanda  
C) Att bryta ut kod till separata, namngivna metoder  
D) Att hantera olika implementationer av samma beteende  

**Rätt svar:** C

---

3. Vad är huvudsyftet med Strategy Pattern?

A) Att extrahera metoder till nya klasser  
B) Att förenkla villkorssatser  
C) Att förbättra kodstruktur  
D) Att hantera olika implementationer av samma beteende  

**Rätt svar:** D

---

4. Vad är huvudsyftet med Replace Nested Conditional with Guard Clauses?

A) Att öka antalet villkorssatser  
B) Att hantera specialfall tidigt i koden  
C) Att skapa mer komplex kod  
D) Att implementera polymorfism  

**Rätt svar:** B

---

5. Vad är huvudsyftet med Extract Class pattern?

A) Att dela upp klasser med för många ansvarsområden  
B) Att skapa fler metoder  
C) Att optimera prestanda  
D) Att hantera olika implementationer  

**Rätt svar:** A

1. Vilket är det huvudsakliga syftet med SOLID-principerna inom mjukvaruutveckling?

A) Att öka prestandan i systemet  
B) Att göra koden mer kompakt och kortfattad  
C) Att skapa kod som är lätt att underhålla och utöka  
D) Att minimera användningen av interfaces  

**Rätt svar:** C

---

2. Vad innebär Single Responsibility Principle (SRP)?

A) En klass ska ha så många funktioner som möjligt  
B) En klass ska ha exakt ett ansvar och syfte  
C) En klass ska innehålla all relaterad funktionalitet  
D) En klass ska implementera flera interfaces  

**Rätt svar:** B

---

3. Vad är det centrala konceptet i Open/Closed Principle (OCP)?

A) Klasser ska vara stängda för all modifiering  
B) Kod ska vara öppen för alla typer av ändringar  
C) Klasser ska vara öppna för utökning men stängda för modifiering  
D) Interfaces ska alltid vara slutna  

**Rätt svar:** C

---

4. Vad är huvudsyftet med Interface Segregation Principle (ISP)?

A) Att skapa så stora interfaces som möjligt  
B) Att samla all funktionalitet i ett interface  
C) Att tvinga klasser att implementera all funktionalitet  
D) Att skapa små, specifika interfaces som klienter kan välja mellan  

**Rätt svar:** D

---

5. Vad är huvudsyftet med Dependency Inversion Principle (DIP)?

A) Att skapa direkta beroenden mellan klasser  
B) Att eliminera alla beroenden i systemet  
C) Att programmera mot abstraktioner istället för konkreta implementationer  
D) Att göra alla klasser beroende av varandra  

**Rätt svar:** C

1. Vad är det huvudsakliga syftet med Clean Architecture?

A) Att optimera prestandan i applikationen  
B) Att separera kod baserat på ansvar för bättre underhåll och testbarhet  
C) Att minimera antalet kodlinjer  
D) Att maximera användningen av externa ramverk  

**Rätt svar:** B

---

2. Vilket lager i Clean Architecture innehåller företagets grundläggande affärsregler och datastrukturer?

A) Interface Adapters  
B) Frameworks & Drivers  
C) Use Cases  
D) Entities  

**Rätt svar:** D

---

3. Vad är huvudsyftet med Interface Adapters i Clean Architecture?

A) Att implementera affärslogik  
B) Att definiera grundläggande datastrukturer  
C) Att konvertera data mellan use cases och externa format  
D) Att hantera användargränssnittet  

**Rätt svar:** C

---

4. Varför implementerar man domänlagret först i Clean Architecture?

A) För att det är enklast att implementera  
B) För att det ger bäst prestanda  
C) För att det utgör grunden för hela applikationen och innehåller kärnlogiken  
D) För att det är beroende av andra lager  

**Rätt svar:** C

---

5. Vad är huvudsyftet med Use Cases i Clean Architecture?

A) Att hantera databaskopplingar  
B) Att representera applikationens faktiska funktionalitet och koordinera mellan domänobjekt  
C) Att definiera databasscheman  
D) Att hantera användargränssnittet  

**Rätt svar:** B

1. Vad är ett huvudsyfte med code review enligt materialet?

A) Att öka utvecklingshastigheten  
B) Att hitta buggar tidigt i utvecklingsprocessen  
C) Att minska antalet utvecklare som behövs  
D) Att automatisera all testning  

**Rätt svar:** B

---

2. Vilken av följande är en god praxis vid förberedelse för code review?

A) Skicka så mycket kod som möjligt för granskning  
B) Vänta med att lägga till tester tills efter granskningen  
C) Hålla ändringarna små och fokuserade  
D) Låta granskarna själva leta upp relevant dokumentation  

**Rätt svar:** C

---

3. Vad är ett exempel på god kodstruktur enligt materialet?

A) Att ha all logik i en stor metod för enkelhetens skull  
B) Att undvika dependency injection  
C) Att använda statiska databaskopplingar  
D) Att dela upp komplex logik i mindre, väldefinierade delar  

**Rätt svar:** D

---

4. Vilken aspekt ingår i vanliga fokusområden för code review enligt materialet?

A) Antalet kodrader per fil  
B) Utvecklarnas kodningshastighet  
C) Input validering under säkerhet  
D) Antal kommentarer per metod  

**Rätt svar:** C

---

5. Vilket av följande är ett exempel på god namngivning enligt materialet?

A) Använda förkortade variabelnamn som 'd' för documents  
B) Använda beskrivande namn som 'printDocuments'  
C) Blanda svenska och engelska i namngivningen  
D) Undvika metodnamn längre än ett ord  

**Rätt svar:** B

