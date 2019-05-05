public class InsertionSort{
	
	public static void insert1( List_inArraySlots list, int alreadyInserted){
		int valueToInsert = list.get( alreadyInserted);
		int dropIndex = alreadyInserted;
		// for debugging
		//System.out.println( valueToInsert);
		for( int indexToCompare = alreadyInserted - 1; indexToCompare >= 0 && valueToInsert < list.get( indexToCompare); indexToCompare--){
			if ( valueToInsert < list.get( indexToCompare)){
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


	public static void insertionSort( List_inArraySlots list){
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