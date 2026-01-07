package org.example.introducingObjects


//  Public:
/**
 Public is the default and as such it is not needed to declare it explicitly, but you can choose to
This means your declaration is available everywhere:
public class Example
 */

// Private:
/**
 hidden and only accessible by other members within the same class.
 The private class itself is not visible outside the file.


fun main() {
    val person = PersonS(name = "Spencer")
    // person.nickname // Error as nickname is private and not available outside the class/object

    person.getTheName() // Works as the values are being accessed within their private member class
    person.getTheNickName() // Works as the values are being accessed within their private member class
}

private class PersonS(private val name: String) {
    private val nickname = "Nickname"

    fun getTheName() { // This function is public by default
    println("Public: $name")
    }

    fun getTheNickName() {
    println("Public: $nickname")
    }

}
 */

// Protected
/**
It is inside the same as private but is also visible in the subclasses as well.
No example given here as concept of hierarchy needs to be introduced first.
*/

// Internal
/**
It is accessible only inside the module where it is defined.
It is between Private and Public. No example given here.
*/


fun main() {

}