package javalearn;

class Puzzle4b{
	int ivar;
	public int doStuff(int factor){
		if(ivar>0){
			return ivar*factor;
		}else{
			return (ivar*(5-factor));
		}
	}
}