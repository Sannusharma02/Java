package question10;

class A{
	
}
class B extends A{
	
}

class c extends B{
	
}

public class Carpet<V extends B> {
	public <X extends V> Carpet<? extends V> method(Carpet<? super X> e) {

}
}
