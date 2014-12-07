Tandemsort
==========

A collection of tandem sorting algorithms in Java.

Tandem sorting is useful when one must maintain a record of an array's original ordering after it has been sorted. A
common use might be when sorting an array of values `[ i_1, i_2, ... i_n ]` in tandem with its identity array `[1 ... n]`.
By sorting both in tandem, the identity array becomes an index of permutations, allowing the original value array to be
reconstitute fully in `O(n)` time, or to simply look up a value's natural ordering in `O(1)` time.
