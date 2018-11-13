# Pierwszy projekt z PIO

Zastosowałem tu trochę nietypowy sposób pracy z repozytorium. Kolejne wersje znajdują się w osobnych gałęziach. Pierwsza, najprostsza implementacja znajduje się w gałęzi _step-1_, kolejna wersja (po stworzeniu klasy `Player`) -- w gałęzi _step-2_ itd.

**Spis wersji**

- [step-1](https://github.com/oleklamza/pio-game/tree/step-1): Pierwsza, najprostsza implementacja, wszystko w metodzie `main()`.
- [step-2](https://github.com/oleklamza/pio-game/tree/step-2): Dodana klasa `Player` reprezentująca gracza. W klasie tylko jedna metoda int `guess()`.
- [step-3](https://github.com/oleklamza/pio-game/tree/step-3): Do klasy `Player` dodane pole imienia (`name`). Dodany seter sprawdzający poprawność danych (na razie wykluczenie `null` i łańcucha pustego).
- [step-4](https://github.com/oleklamza/pio-game/tree/step-4): Konstruktory w klasie `Player`.
- [step-5](https://github.com/oleklamza/pio-game/tree/step-5): Dodana klasa `PlayerHuman`, która dziedziczy po `Player` i wprowadza inny sposób odgadywania.
- [step-6](https://github.com/oleklamza/pio-game/tree/step-6): Poprawiona struktura klas graczy: abstrakcyjna klasa bazowa `Player` z abstrakcyjną metodą `guess()`. Wprowadzona klasa `PlayerComp`.
- [step-7](https://github.com/oleklamza/pio-game/tree/step-7): W przypadku przekazania do settera `setName()` klasy `Player` nieprawidłowego imienia, rzucany jest wyjątek `IllegalArgumentException`.
- [step-8](https://github.com/oleklamza/pio-game/tree/step-8): Poprawność imienia sprawdzamy za pomocą wyrażenia regularnego.



