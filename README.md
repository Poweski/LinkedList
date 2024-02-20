# LinkedList

### OneWayLinkedList
An alternative implementation of one-way link lists are the so-called attachment letters with a guard.
In general, a sentinel is a special, artificial element of a collection used to simplify implementation. In the case of lists,
it is an additional, empty node placed in the head of the list. Thanks to this
all list operations do not have to separately consider the case for
first item/empty list. Additionally, as a gatekeeper for a given list
never changes, you can easily compare other nodes with it using
addresses (==).

### TwoWayLinkedList
The TwoWayLinkedList<E> class implements a list:
- two-way,
- without a guard,
- without a head, but with a tail (reference to the last element),
- cyclical.
