package problem4;

public class Dog extends Animal {
	private String breed;

	public Dog(String animalName, String ownerName, int age, String breed) {
		super(animalName, ownerName, age);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", AnimalName=" + getAnimalName() + ", OwnerName=" + getOwnerName()
				+ ", Age=" + getAge() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) return false;
		
		Dog other = (Dog) obj;
		
		return breed.equals(other.breed);
	}
	
}
