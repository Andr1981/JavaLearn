class TestArray{
	public static void main(String[] args) {
		int[] index = new int[4];
		String[] islands = new String[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;

		islands[0] = "Бермуды";
		islands[1] = "Фиджи";
		islands[2] = "Азовские острова";
		islands[3] = "Косумэль";

		int ref;
		int y=0;
		
		while(y<4){
			ref = index[y];
			System.out.print("Острова = ");
			System.out.println(islands[ref]);
			y=y+1;
		}
	}
}