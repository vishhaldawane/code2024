


class Tiger{
	void jump() {
		System.out.println("Tiger is jumping...");
	}
}
class Lion {
	public static void main(String args[])
	{
		System.out.println("Lion is running...");
		Tiger t = new Tiger();
		t.jump();

		Bear b = new Bear();
		b.eatHoney();
	}
}
class Bear { 
	void eatHoney() {
		System.out.println("Bear is eating honey...");
	}

}

class Hen
{}
class Horse {}
class Dog{ }


class Parrot{}
class Sparrow{}
class Crow{}


