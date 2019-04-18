
**Lessons learned:**

1) When an integer is signed, one of its bits becomes the sign bit, meaning that the maximum magnitude
of the number is halved. (So an unsigned 32-bit int can store up to 2^32-1, whereas its signed counterpart
has a maximum positive value of 2^31-1.)
*In Java, all integer types are signed (except char).*

2) A switch does not work with long values. 
