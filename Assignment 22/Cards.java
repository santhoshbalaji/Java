import java.util.Random;
enum Rank{
	Ace,King,Queen,Jack,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten;
}
enum Suit{
	Spade,Diamond,Heart,Club;
}

class Card{
	final Suit suit;
	final Rank rank;
	public Card(Suit suit,Rank rank){
		this.suit = suit;
		this.rank = rank;
	}
	public Suit getSuit(){
		return this.suit;
	}
	public Rank getRank(){
		return this.rank;
	}
	public String toString(){
		return getSuit()+" "+getRank();
	}
}
class Deck{
	Random n = new Random();
	static Card[] cards = new Card[52];
	public Deck(){
		int i = 0;
		for(Suit s:Suit.values()){
			for(Rank r:Rank.values()){
				cards[i] = new Card(s,r);
				i++;
			}
		}
	}
	public void display(){
		for(int i = 0; i < 52; i++){
			System.out.println(cards[i]);
		}
	}
	public void Shuffle(){
		for(int i = 0; i < 52; i++){
			int random = n.nextInt(52);
			Card temp = cards[i];
			cards[i] = cards[random];
			cards[random] = temp;
		}
		display();
	}
	public static void main(String[] args) {
		Deck g = new Deck();
		g.Shuffle();
	}
}