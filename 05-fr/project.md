# System aukcyjny

## Wprowadzenie

Specyfikacja wymagań funkcjonalnych w ramach informatyzacji procesu sprzedaży produktów w oparciu o mechanizm aukcyjny. 

## Procesy biznesowe

---
<a id="bc1"></a>
### BC1: Sprzedaż aukcyjna 

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Opis:** Proces biznesowy opisujący sprzedaż za pomocą mechanizmu aukcyjnego. |

**Scenariusz główny:**
1. [Sprzedający](#ac1) wystawia produkt na aukcję. ([UC1](#uc1))
2. [Kupujący](#ac2) oferuje kwotę za produkt wyższą od aktualnie najwyższej oferty.  ([UC2](#uc2), [BR1](#br1))
3. [Kupujący](#ac2) wygrywa aukcję ([BR2](#br2))
4. [Kupujący](#ac2) przekazuje należność Sprzedającemu. ([UC3](#uc3))
5. [Sprzedający](#ac1) przekazuje produkt Kupującemu. ([UC4](#uc4))

**Scenariusze alternatywne:** 

2.A. Oferta Kupującego została przebita, a [Kupujący](#ac2) pragnie przebić aktualnie najwyższą ofertę.
* 2.A.1. Przejdź do kroku 2.

3.A. Czas aukcji upłynął i [Kupujący](#ac2) przegrał aukcję. ([BR2](#br2))
* 3.A.1. Koniec przypadku użycia.

---

## Aktorzy

<a id="ac1"></a>
### AC1: Sprzedający

Osoba oferująca towar na aukcji.

<a id="ac2"></a>
### AC2: Kupujący

Osoba chcąca zakupić produkt na aukcji.


## Przypadki użycia poziomu użytkownika

### Aktorzy i ich cele

[Sprzedający](#ac1):
* [UC1](#uc1): Wystawienie produktu na aukcję
* [UC2](#uc2): Przekazuje produkt Kupującemu

[Kupujący](#ac2)
* [BR1](#br1): Oferuje kwotę za produkt wyższą od aktualnie najwyższej oferty
* [BR2](#br2): Wygrywa aukcję
* [BR3](#br3): Przekazuje należność Sprzedającemu

---
<a id="uc1"></a>
### UC1: Wystawienie produktu na aukcję

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:**
1. [Sprzedający](#ac1) zgłasza do systemu chęć wystawienia produktu na aukcję.
2. System prosi o podanie danych produktu i ceny wywoławczej.
3. [Sprzedający](#ac1) podaje dane produktu oraz cenę wywoławczą.
4. System weryfikuje poprawność danych.
5. System informuje o pomyślnym wystawieniu produktu na aukcję.

**Scenariusze alternatywne:** 

4.A. Podano niepoprawne lub niekompletne dane produktu.
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.

---

<a id="uc2"></a>
### UC2: Oferowanie danych oraz kwotę przez kupującego 

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) zgłasza do systemu chęć kupowania produktu na aukcję.
2. System prosi o podanie danych dla wypełnienia oferty
3. [Kupujący](#ac2) musi wystawić kwotę odpowiednie regułe biznesowej ([BR1](#br1))
4. System weryfikuje poprawność danych.
5. [Kupujący](#ac2) czeka na koniec aukcję

**Scenariusze alternatywne:** 

4.A. Podane niepoprawne dane 
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.

5.A. Kwota kupującego została przebita przez innego kupującego
* 5.A.1. System informuje o możliwości przegrania aukcji.
* 5.A.2. Przejdź do kroku 3.


---

<a id="uc3"></a>
### UC3: Przekazywanie należnośći Sprzedającemu

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) wygrywa aukcję i mu przechodzi o tym wiadomość
2. [Sprzedający](#ac1) otrzyma wiadomość o ukończenie aukcji
3. System wysyła wygraną kwotę sprzedającemu
4. [Sprzedający](#ac1) albo system zamyka aukcję

**Scenariusze alternatywne:** 

3.A. Kwota jest wypłacana po spotkaniu
* 3.A.1. [Sprzedający](#ac1) przygotowuje produkt do spotkania

---

<a id="uc4"></a>
### UC4: Przekazywanie produktu Kupującemu

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Scenariusz główny:**
1. [Sprzedający](#ac1) przygotowuje produkt do wysyłki
2. [Kupujący](#ac2) otrzymuje i sprawdza produkt
3. [Kupujący](#ac2) odpisuje sprzedającemu

**Scenariusze alternatywne:** 

2.A. Produkt niezgodny z opisem lub uszkodzony
* 2.A.1. [Kupujący](#ac2) wysyła odwrotnie produkt i prosi o zwrot pieniędzy 

---

## Obiewkty biznesowe (inaczje obiekty dziedzinowe lub informatycjne)

### BO1: Aukcja

Aukcja jest formą zawierania transakcji kupna-sprzedaży, w której Sprzedający określa cenę wywoławczą produktu, natomiast Kupujący mogą oferować własną ofertę zakupu każdorazowo proponując kwotę wyższą od aktualnie oferowanej kwoty. Aukcja kończy się po upływie określonego czasu. Jeśli złożona została co najmniej jedna oferta zakupy produkt nabywa ten Kupujący, który zaproponował najwyższą kwotę. 

### BO2: Produkt

Fizyczny lub cyfrowy obiekt, który ma zostać sprzedany w ramach aukcji.

### BO3: Przesyłka 

Rzecz opatrzona oznaczeniem adresata i adresem, przedłożona do przyjęcia lub przyjęta przez operatora pocztowego w celu przemieszczenia i doręczenia adresatowi

## Reguły biznesowe

<a id="br1"></a>
### BR1: Złożenie oferty

Złożenie oferty wymaga zaproponowania kwoty wyższej niż aktualnie oferowana o minimum 1,00 PLN.


<a id="br2"></a>
### BR2: Rozstrzygnięcie aukcji

Aukcję wygrywa ten z [Kupujący](#ac2)ch, który w momencie jej zakończenia (upłynięcia czasu) złożył najwyższą ofertę.

## Macierz CRUDL


| Przypadek użycia                                      | Aukcja | Produkt | Przesyłka |
| -------------------------------------------------     | ------ | ------- | --------- |
| UC1: Wystawienia produktu na aukcję                   |  C     |    C    |           |
| UC2: Oferowanie danych oraz kwotę przez kupującego    |  U     |    R    |           |
| UC3: Przekazywanie należnośći Sprzedającemu           |  D     |    R    |           |
| UC4: Przekazywanie produktu Kupującemu                |        |    D    |     C     |


