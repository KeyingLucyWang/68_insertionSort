import java.util.ArrayList;

public class InsertionSort{
	
	public static void insert1( ArrayList<String> list, int alreadyInserted){
		String valueToInsert = list.get( alreadyInserted);
		int dropIndex = alreadyInserted;
		// for debugging
		//System.out.println( valueToInsert);
		for( int indexToCompare = alreadyInserted - 1; indexToCompare >= 0 && valueToInsert.compareTo( list.get( indexToCompare)) < 0; indexToCompare--){
			if ( valueToInsert.compareTo(list.get( indexToCompare)) < 0){
				dropIndex = indexToCompare;
				if( indexToCompare == 0){
					list.set(1, list.get( 0));
					list.set( 0, valueToInsert);
				}
				else
					list.set( indexToCompare + 1, list.get( indexToCompare));
			}
		}
		// for debugging
		//System.out.println( dropIndex);
		list.set( dropIndex, valueToInsert);
	}


	public static void insertionSort( ArrayList<String> list){
		// for debugging
		for( int indexToSort = 1; indexToSort < list.size(); indexToSort++){
			insert1( list, indexToSort);
			System.out.println( "    dbg: "
  			+ "after inserting element " + indexToSort
  			+ " elements: " + list
  			);
		}
	}
}
