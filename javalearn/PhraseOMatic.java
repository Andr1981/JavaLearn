package javalearn;

public class PhraseOMatic{
	public static void main(String[] args) {
		String[] wordListOne = {"круглосуточный","трех-звенный","30000-футовый","взаимный","обоюдный выигрыш"};
		String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентрированный", "центральный", "распределенный", "фирменный"};
		String[] wordListThree = {"процесс", "пункт разгрузки", "талант"};

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		int rand1 = (int) (Math.random()*oneLength);
		int rand2 = (int) (Math.random()*twoLength);
		int rand3 = (int) (Math.random()*threeLength);

		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		System.out.println("Все что нам нужно, - это " + phrase);
	}
}