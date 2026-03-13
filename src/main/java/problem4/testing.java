package problem4;

public class testing {

	public static void main(String[] args) {
//		Animal bird = new Animal("bird","Nijat",-20);
		Dog dog = new Dog("puppy","Nijat",2,"whitedoggy");
		Animal human = new Animal("george","Nijat",20);
		System.out.println(dog.getAnimalName());
		System.out.println(dog.getBreed());
		System.out.println(human.toString());
		System.out.println(dog.toString());

	}

}
