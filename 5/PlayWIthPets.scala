class Pet(val name: String) {
  override def toString = name
}

class Dog(override val name: String) extends Pet(name)

def workWithPets(pets: Array[Pet]) {}

def playWithPets[T <: Pet](pets: Array[T]) = println("Playing with pets: " + pets.mkString(", "))

val dogs = Array(new Dog("Rover"), new Dog("Comet"))

// workWithPets(dogs) // Compilation ERROR

playWithPets(dogs)
