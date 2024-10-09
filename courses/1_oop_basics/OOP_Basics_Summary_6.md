# 1. Introduktion till Algoritmer och Sortering (45 min)

## Föreläsningsmaterial

### 1. Vad är en algoritm?

- **Introduktion:**
    - En algoritm är en uppsättning väldefinierade steg eller instruktioner som används för att lösa ett problem eller
      utföra en uppgift.
    - Algoritmer är grundläggande inom datavetenskap och programmering eftersom de ger strukturen för hur problem löses
      på ett effektivt sätt.
    - Varje datorprogram är i grunden en implementering av en eller flera algoritmer.

- **Viktiga egenskaper hos algoritmer:**
    1. **Korrekthet:** Algoritmen måste ge rätt resultat för alla möjliga indata.
    2. **Effektivitet:** Hur snabbt och med hur lite resurser (minne, processorkraft) algoritmen kan utföra sin uppgift.
    3. **Tydlighet:** Algoritmen ska vara lätt att förstå och implementera.
    4. **Generalisering:** Algoritmen ska kunna hantera ett brett spektrum av problem inom sitt område.

- **Exempel på vardagliga algoritmer:**
    - **Kokar en kopp te:** Instruktioner för att värma vatten, lägga en tepåse i en kopp, hälla i vatten, låta dra,
      etc.
    - **Sortera en lista:** En sekvens av steg för att ordna objekt i en viss ordning (t.ex. stigande).

#### 2. Sorteringsalgoritmer

- **Vad är en sorteringsalgoritm?:**
    - En sorteringsalgoritm är en algoritm som tar en osorterad lista av element och arrangerar dem i en specifik
      ordning (vanligtvis stigande eller fallande).
    - Sorteringsalgoritmer är en av de mest studerade och använda typerna av algoritmer eftersom sortering är ett
      grundläggande problem inom databehandling.

- **Bubble Sort:**
    - Bubble Sort är en enkel, men ineffektiv, sorteringsalgoritm som jämför intilliggande element i en lista och byter
      plats på dem om de är i fel ordning.
    - Den största (eller minsta) värdet "bubblar upp" till rätt plats efter varje iteration.
    - **Kodexempel:**

    ```java
    public class BubbleSortExample {
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] data = {5, 1, 4, 2, 8};
            bubbleSort(data);
            System.out.println("Sorted Array: ");
            for (int i : data) {
                System.out.print(i + " ");
            }
        }
    }
    ```

    - **För- och nackdelar med Bubble Sort:**
        - **Fördelar:** Enkel att förstå och implementera.
        - **Nackdelar:** O(n^2) tidskomplexitet, vilket gör den ineffektiv för stora dataset.

- **Selection Sort:**
    - Selection Sort är en annan enkel sorteringsalgoritm som fungerar genom att upprepade gånger välja det minsta (
      eller största) elementet från den osorterade delen av listan och placera det i början.
    - **Kodexempel:**

    ```java
    public class SelectionSortExample {
        public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIdx]) {
                        minIdx = j;
                    }
                }
                // Swap the found minimum element with the first element
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }

        public static void main(String[] args) {
            int[] data = {29, 10, 14, 37, 13};
            selectionSort(data);
            System.out.println("Sorted Array: ");
            for (int i : data) {
                System.out.print(i + " ");
            }
        }
    }
    ```

    - **För- och nackdelar med Selection Sort:**
        - **Fördelar:** Enkelt att förstå, kräver färre byten än Bubble Sort.
        - **Nackdelar:** O(n^2) tidskomplexitet, vilket gör den ineffektiv för stora dataset.

- **Tid- och rumskomplexitet:**
    - Både Bubble Sort och Selection Sort har en tidskomplexitet på O(n^2), vilket innebär att tiden det tar att sortera
      en lista växer kvadratiskt med listans storlek.
    - Dessa algoritmer använder en konstant mängd extra minne, dvs O(1) rumskomplexitet.

---

# 2. Sökalgoritmer (45 min)

## Föreläsningsmaterial

### 1. Introduktion till Sökalgoritmer

- **Vad är en sökalgoritm?**
    - En sökalgoritm är en metod för att hitta ett specifikt element i en datastruktur, som en array eller lista.
    - Sökalgoritmer är grundläggande i många applikationer, från att söka efter en fil på din dator till att söka efter
      information på internet.

- **Viktiga egenskaper hos sökalgoritmer:**
    1. **Korrekthet:** Sökalgoritmen måste kunna hitta rätt element om det finns i datastrukturen.
    2. **Effektivitet:** Hur snabbt algoritmen kan hitta elementet, speciellt i stora datastrukturer.
    3. **Generalisering:** Algoritmen ska kunna hantera olika typer av datastrukturer och storlekar.

- **Exempel på sökscenarion:**
    - **Sök efter ett ord i en textfil.**
    - **Sök efter en kontakt i en telefonbok.**
    - **Sök efter en produkt i en e-handelsdatabas.**

#### 2. Lineär Sökning

- **Vad är Lineär Sökning?**
    - Lineär sökning är den enklaste sökalgoritmen där varje element i en lista eller array kontrolleras sekventiellt
      tills det önskade elementet hittas eller hela listan har sökts igenom.
    - Denna metod fungerar oavsett om listan är sorterad eller osorterad.

- **Kodexempel på Lineär Sökning:**

    ```java
    public class LinearSearchExample {
        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;  // Return the index of the target element
                }
            }
            return -1;  // Return -1 if the target element is not found
        }

        public static void main(String[] args) {
            int[] data = {5, 2, 9, 1, 5, 6};
            int target = 9;
            int result = linearSearch(data, target);

            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found");
            }
        }
    }
    ```

- **För- och nackdelar med Lineär Sökning:**
    - **Fördelar:** Enkel att implementera, fungerar på både sorterade och osorterade listor.
    - **Nackdelar:** Ineffektiv för stora datastrukturer eftersom den har en tidskomplexitet på O(n).

#### 3. Binär Sökning

- **Vad är Binär Sökning?**
    - Binär sökning är en effektivare sökalgoritm som används på sorterade listor. Algoritmen delar listan i halvor och
      jämför mittvärdet med det sökta värdet. Om mittvärdet inte är det sökta värdet, utesluter algoritmen halvan där
      värdet inte kan finnas och fortsätter sökningen i den andra halvan.
    - Algoritmen fortsätter att dela listan på detta sätt tills värdet hittas eller listan inte längre kan delas.

- **Kodexempel på Binär Sökning:**

    ```java
    public class BinarySearchExample {
        public static int binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                // Check if target is present at mid
                if (arr[mid] == target) {
                    return mid;
                }

                // If target greater, ignore left half
                if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    // If target is smaller, ignore right half
                    right = mid - 1;
                }
            }
            return -1;  // Return -1 if the target element is not found
        }

        public static void main(String[] args) {
            int[] data = {1, 2, 5, 7, 9, 12, 15};
            int target = 7;
            int result = binarySearch(data, target);

            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found");
            }
        }
    }
    ```

- **För- och nackdelar med Binär Sökning:**
    - **Fördelar:** Mycket effektivare än lineär sökning, med en tidskomplexitet på O(log n), vilket gör den lämplig för
      stora datastrukturer.
    - **Nackdelar:** Fungerar bara på sorterade listor.

- **Jämförelse mellan Lineär och Binär Sökning:**
    - **Lineär Sökning:** Bra för små eller osorterade listor.
    - **Binär Sökning:** Utmärkt för stora, sorterade listor, men kräver att listan är sorterad innan sökning.

---

# 3. Praktisk Tillämpning av Sortering och Sökning (45 min)

## Föreläsningsmaterial

### 1. Kombinera Sortering och Sökning

- **Introduktion:**
    - I praktiken används ofta sorterings- och sökalgoritmer tillsammans för att lösa komplexa problem effektivt.
    - Ett vanligt scenario är att först sortera data för att sedan använda en effektiv sökalgoritm, såsom binär sökning,
      för att snabbt hitta element i den sorterade listan.

- **Exempel på praktiska tillämpningar:**
    - **Sökmotorer:** Dataindex sorteras för att möjliggöra snabb sökning av specifika nyckelord.
    - **Databashantering:** Sortering används för att organisera data, vilket gör det enklare att snabbt hämta specifik
      information.
    - **Spelutveckling:** Sortering och sökning används för att hantera listor över spelare, nivåer och andra
      spelresurser.

#### 2. Implementering av ett Program för Sortering och Sökning

- **Problemformulering:**
    - Vi ska skapa ett program som hanterar en lista över studentpoäng. Programmet ska sortera poängen i stigande
      ordning och sedan kunna söka efter ett specifikt poäng för att hitta dess position i den sorterade listan.

- **Steg för steg-implementering:**

    1. **Sortering:**
        - Använd en sorteringsalgoritm, som Selection Sort, för att ordna studentpoängen i stigande ordning.

        - **Kodexempel:**

        ```java
        public class StudentScoreSorter {
            public static void selectionSort(int[] arr) {
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                    int minIdx = i;
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < arr[minIdx]) {
                            minIdx = j;
                        }
                    }
                    // Swap the found minimum element with the first element
                    int temp = arr[minIdx];
                    arr[minIdx] = arr[i];
                    arr[i] = temp;
                }
            }

            public static void main(String[] args) {
                int[] scores = {88, 55, 78, 92, 66, 81, 74};
                selectionSort(scores);
                System.out.println("Sorted Scores: ");
                for (int score : scores) {
                    System.out.print(score + " ");
                }
            }
        }
        ```

    2. **Sökning:**
        - Efter sortering kan vi använda binär sökning för att snabbt hitta ett specifikt poäng och avgöra dess position
          i listan.

        - **Kodexempel:**

        ```java
        public class StudentScoreSearcher {
            public static int binarySearch(int[] arr, int target) {
                int left = 0;
                int right = arr.length - 1;

                while (left <= right) {
                    int mid = left + (right - left) / 2;

                    // Check if target is present at mid
                    if (arr[mid] == target) {
                        return mid;
                    }

                    // If target greater, ignore left half
                    if (arr[mid] < target) {
                        left = mid + 1;
                    } else {
                        // If target is smaller, ignore right half
                        right = mid - 1;
                    }
                }
                return -1;  // Return -1 if the target element is not found
            }

            public static void main(String[] args) {
                int[] scores = {55, 66, 74, 78, 81, 88, 92};
                int targetScore = 81;
                int result = binarySearch(scores, targetScore);

                if (result != -1) {
                    System.out.println("Score found at index: " + result);
                } else {
                    System.out.println("Score not found");
                }
            }
        }
        ```

    3. **Kombination:**
        - Slutligen, kombinera sorterings- och sökalgoritmerna i ett program som både sorterar studentpoängen och sedan
          söker efter ett specifikt poäng.

        - **Kodexempel:**

        ```java
        public class StudentScoreManager {
            public static void selectionSort(int[] arr) {
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                    int minIdx = i;
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < arr[minIdx]) {
                            minIdx = j;
                        }
                    }
                    // Swap the found minimum element with the first element
                    int temp = arr[minIdx];
                    arr[minIdx] = arr[i];
                    arr[i] = temp;
                }
            }

            public static int binarySearch(int[] arr, int target) {
                int left = 0;
                int right = arr.length - 1;

                while (left <= right) {
                    int mid = left + (right - left) / 2;

                    // Check if target is present at mid
                    if (arr[mid] == target) {
                        return mid;
                    }

                    // If target greater, ignore left half
                    if (arr[mid] < target) {
                        left = mid + 1;
                    } else {
                        // If target is smaller, ignore right half
                        right = mid - 1;
                    }
                }
                return -1;  // Return -1 if the target element is not found
            }

            public static void main(String[] args) {
                int[] scores = {88, 55, 78, 92, 66, 81, 74};

                // Sort the scores
                selectionSort(scores);
                System.out.println("Sorted Scores: ");
                for (int score : scores) {
                    System.out.print(score + " ");
                }
                System.out.println();

                // Search for a specific score
                int targetScore = 81;
                int result = binarySearch(scores, targetScore);

                if (result != -1) {
                    System.out.println("Score found at index: " + result);
                } else {
                    System.out.println("Score not found");
                }
            }
        }
        ```

    - **Diskussion:**
        - Diskutera fördelarna med att först sortera data innan man söker, särskilt när man hanterar stora datamängder.
        - Förklara hur denna kombination av sortering och sökning kan tillämpas i olika typer av program och system.

---

# 4. Introduktion till Rekursion (45 min)

## Föreläsningsmaterial

### 1. Vad är Rekursion?

- **Definition:**
    - Rekursion är en teknik där en funktion anropar sig själv för att lösa ett problem genom att dela upp det i mindre,
      enklare delproblem.
    - Varje rekursivt anrop bör närma sig ett basfall, som är det enklaste fallet som kan lösas direkt utan ytterligare
      rekursiva anrop.

- **Viktiga koncept i rekursion:**
    1. **Basfall:** Det villkor som stoppar rekursionen och förhindrar att den går oändligt. Ett basfall är ett fall där
       problemet kan lösas direkt utan att anropa sig själv.
    2. **Rekursivt fall:** Det fall där funktionen anropar sig själv med ett delproblem som är närmare basfallet.

- **Exempel på rekursiva problem:**
    - **Fakultet:** Beräkningen av fakulteten av ett tal n (n!) är ett klassiskt exempel på ett rekursivt problem.
    - **Fibonacci-sekvensen:** Beräkningen av Fibonacci-tal där varje tal är summan av de två föregående talen.

#### 2. Implementering av Rekursion: Fakultet

- **Fakultet:** Fakulteten av ett tal n är produkten av alla positiva heltal mindre än eller lika med n. Matematisk
  notation: n! = n * (n-1) * (n-2) * ... * 1.
    - **Exempel:** 5! = 5 * 4 * 3 * 2 * 1 = 120.

- **Rekursiv implementering av fakultet i Java:**

    ```java
    public class Factorial {
        public static int factorial(int n) {
            if (n == 0) { // Basfall
                return 1;
            } else { // Rekursivt fall
                return n * factorial(n - 1);
            }
        }

        public static void main(String[] args) {
            int number = 5;
            int result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }
    ```

- **Förklaring:**
    - Om n är 0, returneras 1 (basfall).
    - Annars multipliceras n med fakulteten av n-1 (rekursivt fall), och processen upprepas tills n är 0.

#### 3. Implementering av Rekursion: Fibonacci-sekvensen

- **Fibonacci-sekvensen:** I Fibonacci-sekvensen är varje tal summan av de två föregående talen. Sekvensen börjar med 0
  och 1.
    - **Exempel:** 0, 1, 1, 2, 3, 5, 8, 13, ...

- **Rekursiv implementering av Fibonacci i Java:**

    ```java
    public class Fibonacci {
        public static int fibonacci(int n) {
            if (n <= 1) { // Basfall
                return n;
            } else { // Rekursivt fall
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        public static void main(String[] args) {
            int number = 6;
            int result = fibonacci(number);
            System.out.println("Fibonacci of " + number + " is: " + result);
        }
    }
    ```

- **Förklaring:**
    - Om n är 0 eller 1, returneras n (basfall).
    - Annars returneras summan av de två föregående Fibonacci-talen (rekursivt fall).

- **Diskussion:**
    - Diskutera skillnaderna mellan rekursiva och iterativa lösningar, inklusive fördelar och nackdelar med rekursion.
    - Förklara begreppet "stack overflow", som kan inträffa om rekursionen är för djup eller om basfallet inte är
      korrekt definierat.

#### 4. Fördelar och Nackdelar med Rekursion

- **Fördelar:**
    - Enkla och eleganta lösningar för problem som kan delas upp i delproblem (t.ex. trädstrukturer, graftraversering).
    - Kan leda till kod som är lättare att förstå och underhålla.

- **Nackdelar:**
    - Kan leda till ineffektivitet om inte implementerad korrekt, särskilt för problem med överlappande delproblem (
      t.ex. Fibonacci).
    - Risk för stack overflow om rekursionen blir för djup.

- **När ska man använda rekursion?**
    - Använd rekursion när problemet kan delas upp naturligt i mindre delproblem, och när en iterativ lösning skulle
      vara mer komplex eller svår att förstå.

---

# 5. Rekursion i Sorteringsalgoritmer (45 min)

## Föreläsningsmaterial

### 1. Vad är rekursiv sortering?

- **Definition:**
    - Rekursiv sortering är en metod där en sorteringsalgoritm delar upp problemet i mindre delar och använder rekursion
      för att sortera dessa delar innan de kombineras igen.
    - Två vanliga rekursiva sorteringsalgoritmer är Merge Sort och Quick Sort.

- **Fördelar med rekursiv sortering:**
    - Kan vara mer effektiv än iterativa metoder, särskilt för stora dataset.
    - Utnyttjar divide-and-conquer-teknik för att bryta ner problemet i enklare delar.

#### 2. Implementering av Merge Sort

- **Merge Sort:**
    - Merge Sort är en stabil och effektiv rekursiv sorteringsalgoritm med en tidskomplexitet på O(n log n).
    - Den delar upp arrayen i två halvor, sorterar varje halv med rekursion och sammanfogar (mergar) sedan de två
      sorterade halvorna.

- **Kodexempel på Merge Sort i Java:**

    ```java
    public class MergeSort {
        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;

                // Sortera första och andra halvan
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);

                // Mergar de två sorterade halvorna
                merge(arr, left, mid, right);
            }
        }

        public static void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            for (int i = 0; i < n1; i++)
                leftArray[i] = arr[left + i];
            for (int j = 0; j < n2; j++)
                rightArray[j] = arr[mid + 1 + j];

            int i = 0, j = 0;
            int k = left;

            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k] = leftArray[i];
                    i++;
                } else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = leftArray[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }

        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6, 7};
            mergeSort(arr, 0, arr.length - 1);

            System.out.println("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
    ```

#### 3. Implementering av Quick Sort

- **Quick Sort:**
    - Quick Sort är en annan effektiv rekursiv sorteringsalgoritm som också har en genomsnittlig tidskomplexitet på O(n
      log n).
    - Algoritmen väljer ett "pivot"-element och partitionerar arrayen runt detta pivot så att element mindre än pivot
      hamnar till vänster och större element till höger.

- **Kodexempel på Quick Sort i Java:**

    ```java
    public class QuickSort {
        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);

                // Rekursiv sortering av delarna före och efter partition
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }

        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = (low - 1);
            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;

                    // Byt arr[i] och arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // Byt arr[i + 1] och arr[high] (eller pivot)
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }

        public static void main(String[] args) {
            int[] arr = {10, 7, 8, 9, 1, 5};
            quickSort(arr, 0, arr.length - 1);

            System.out.println("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
    ```

---