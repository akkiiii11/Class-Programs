package lab_4;

class Sports
{
	public void play()
	{
		System.out.println("Playing Sports...!!!");
	}
}

class Football extends Sports
{
	public void play()
	{
		System.out.println("Playing Football...");
	}
}

class Basketball extends Sports
{
	public void play()
	{
		System.out.println("Playing Basketball...");
	}
}

class Rugby extends Sports
{
	public void play()
	{
		System.out.println("Playing Rugby...");
	}
}

public class SportMain {

	public static void main(String[] args) {
		
		Sports s = new Sports();
		s.play();
		
		Football sf = new Football();
		sf.play();
		
		Basketball sb = new Basketball();
		sb.play();
		
		Rugby sr = new Rugby();
		sr.play();
		

	}

}
