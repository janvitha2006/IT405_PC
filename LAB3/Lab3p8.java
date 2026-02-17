import java.lang.*;
import java.util.Scanner;
abstract Tiger extends Lion{

	@Override
	public void behave(){
	System.out.println("Tiger jumps");
	}

	@Override
	public void sound(){
	System.out.println("Tiger sounds");
	}

	public static void main(String...args){
	System.out.println("Tiger class");
	Tiger t=new Tiger();
	t.sound();
	t.behave();

	}
}