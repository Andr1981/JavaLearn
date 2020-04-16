package javalearn;

public class BeerSong{
	public static void main(String[] args) {
		int beernum=99;
		String word = "бутыл";
		String end1 = "ок";
		String end2 = "ки";
		String end3 = "ка";
		while(beernum>0){
			if(beernum%10==4|beernum%10==3|beernum%10==2){
				System.out.println(beernum + " " + word + end2 + " пива на стене!");
				beernum=beernum-1;
			}else if (beernum%10==1){
				System.out.println(beernum + " " + word + end3 + " пива на стене!");
				beernum=beernum-1;
			} else{
				System.out.println(beernum + " " + word + end1 + " пива на стене!");
				beernum=beernum-1;
			}
				
		}
			System.out.println("Нет бутылок пива на стене\nНет бутылок пива\nПойди в магазин и купи еще\n99 бутылок пива на стене!");
		
		
	}
}