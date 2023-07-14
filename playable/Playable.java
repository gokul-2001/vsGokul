package playable;

public interface Playable {
	public void play();

}
class Guitar implements Playable
{

	@Override
	public void play() {
		System.out.println("Playing Guitar");
		
	}
	 
}
class Piano implements Playable
{

	@Override
	public void play() {
		System.out.println("Playing piano");
		
	}
	
}