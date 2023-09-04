# OneWayLetters
Third assignment for algorithms and data structures lab.

Alternatywną implementację list dowiązaniowych jednokierunkowych do tej
przedstawionej na wykładzie są tzw. listy dowiązaniowe ze strażnikiem.
W ogólności strażnikiem (ang. sentinel, guard) nazywamy specjalny, sztuczny
element kolekcji stosowany do uproszczenia implementacji. W przypadku list,
jest on dodatkowym, pustym węzłem umieszczonym w głowie listy. Dzięki temu
wszystkie operacje na listach nie muszą osobno rozpatrywać przypadku dla
pierwszego elementu/pustej listy. Dodatkowo, jako, że strażnik dla zadanej listy
się nigdy nie zmienia, można łatwo porównywać z nim inne węzły za pomocą
adresów (==).

Zaimplementuj i przetestuj klasę OneWayLinkedListWithSentinel<E>
zgodną z interfejsem IList<E> podanym na wykładzie. Podczas
implementacji pomiń metodę iterator(). Podczas sprawdzania
poprawności uwzględnij przypadki: pustej listy, listy jednoelementowej,
listy o parzystej oraz listy o nieparzystej liczbie elementów.
Pamiętaj, że projekt klasy ma mieć na uwadze potrzeby potencjalnego
użytkownika tzn. mają być zgłaszane informatywne komunikaty o błędach
oraz obsługiwane dowolne, poprawne wartości np. null jako elementy na
liście.
