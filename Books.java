class Books{
	String title;
	String author;

	public static void main(String[] args) {
		Books[] myBooks = new Books[3];
		int x=0;
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();

		myBooks[0].title = "Плоды Java";
		myBooks[1].title = "Java Гетсби";
		myBooks[2].title = "Сборник рецептов"; 

		while(x<myBooks.length){
			System.out.println(myBooks[x].title);
			x=x+1;
		}
	}
}