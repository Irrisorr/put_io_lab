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
3. [Kupujący](#ac2) wygrywa aukcję ([UC3](#uc3), [BR2](#br2))
4. [Kupujący](#ac2) przekazuje należność Sprzedającemu. ([UC4](#uc4))
5. [Sprzedający](#ac1) przekazuje produkt Kupującemu. ([UC5](#uc5))

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

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) zgłasza do systemu chęć kupowania produktu na aukcję.
2. System prosi o podanie danych dla wypełnienia oferty
3. [Kupujący](#ac2) musi wystawić ocenę odpowiednie regułe biznesowej ([BR1](#br1))
4. [Kupujący](#ac2) czeka na koniec aukcję

**Scenariusze alternatywne:** 

2.A. Podane niepoprawne 
* 4.A.1. ...

---

<a id="uc3"></a>
### UC3: Wygrywanie aukcję 

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Scenariusz główny:**
1. ...

**Scenariusze alternatywne:** 

1.A. ...
* 4.A.1. ...

---

<a id="uc4"></a>
### UC4: Przekazywanie należnośći Sprzedającemu

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Scenariusz główny:**
1. ...

**Scenariusze alternatywne:** 

1.A. ...
* 4.A.1. ...

---

<a id="uc5"></a>
### UC5: Przekazywanie produktu Kupującemu

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Scenariusz główny:**
1. ...

**Scenariusze alternatywne:** 

1.A. ...
* 4.A.1. ...

---

## Obiewkty biznesowe (inaczje obiekty dziedzinowe lub informatycjne)

### BO1: Aukcja

Aukcja jest formą zawierania transakcji kupna-sprzedaży, w której Sprzedający określa cenę wywoławczą produktu, natomiast Kupujący mogą oferować własną ofertę zakupu każdorazowo proponując kwotę wyższą od aktualnie oferowanej kwoty. Aukcja kończy się po upływie określonego czasu. Jeśli złożona została co najmniej jedna oferta zakupy produkt nabywa ten Kupujący, który zaproponował najwyższą kwotę. 

### BO2: Produkt

Fizyczny lub cyfrowy obiekt, który ma zostać sprzedany w ramach aukcji.

## Reguły biznesowe

<a id="br1"></a>
### BR1: Złożenie oferty

Złożenie oferty wymaga zaproponowania kwoty wyższej niż aktualnie oferowana o minimum 1,00 PLN.


<a id="br2"></a>
### BR2: Rozstrzygnięcie aukcji

Aukcję wygrywa ten z [Kupujący](#ac2)ch, który w momencie jej zakończenia (upłynięcia czasu) złożył najwyższą ofertę.

## Macierz CRUDL


| Przypadek użycia                                  | Aukcja | Produkt | ... |
| ------------------------------------------------- | ------ | ------- | --- |
| UC1: Wystawienia produktu na aukcję               |  C     |    C    | ... |
| UC2: Oferowanie danych oraz kwotę przez kupującego|  C     |    R    | ... |
| UC3: Przekazywanie należnośći Sprzedającemu       |  D     |    R    | ... |
| UC4: Przekazywanie produktu Kupującemu            |        |    D    | ... |


