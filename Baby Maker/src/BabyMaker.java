import java.util.ArrayList;

public class BabyMaker
	{

		public static void main(String[] args)
			{
				ArrayList <Baby> nursery = new ArrayList <Baby>();
				nursery.add(new Baby("female", 6.3));
				nursery.add(new Baby ("male", 6.7));
				nursery.add(new Baby ("female", 5.8));
				System.out.println(nursery.get(0).getWeight());
				nursery.get(0).setWeight(7.3);
				System.out.println(nursery.get(0).getWeight());
			}

	}
