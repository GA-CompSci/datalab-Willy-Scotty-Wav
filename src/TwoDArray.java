public class TwoDArray {
    public static void main(String[] args) {
        
        // PART 1: Creating multiple 1D arrays and combining them
        // Create three separate int arrays representing student scores
        int[] scores1 = {99,55,66,62};
        int[] scores2 = {69,65,67,32};
        int[] scores3 = {79,15,96,100};

        
        // Combine these arrays into a single 2D array called allScores
        int [][] mindBlowingCollectionOfScores = {scores1, scores2, scores3};
        
        
        // PART 2: Creating a 2D array directly with initialization
        int[][] differentCollection = new int[3][4];

        
        // Create a 3x4 2D array of integers
        // Populate it with values (row * 10 + column)
        for (int row = 0; row < differentCollection.length; row++){
            for (int col = 0; col< differentCollection[0].length; col++){
                differentCollection[row][col] = row * 10 + col;
            }
        } 
        
        
    
        
        
        
        
        // PART 4: Traversing a 2D array
        // Print out all values in the grades array
          for (int [] row : differentCollection){
            for (int num : row){
                System.out.println(num);
            }
        } 
        
        
        
        // PART 5: Display row-centric (standard approach)
        // Display each row on its own line
        System.out.println("\nRow-centric display:");
        for (int [] row : differentCollection){
            for (int num : row){
                System.out.print(num + " " );
                
            }
            System.out.println();
        } 
        
        //quiz pratice
        //traverse first array, how many grades less than 60
        int count = 0;
           for (int [] row : mindBlowingCollectionOfScores){
            for (int num : row){
                if (num < 60){
                    count ++;
                }
               
            }
            System.out.println();
        } 
        System.out.println(count + " Students Failed"); 
        
        
        // PART 6: Display column-centric (unusual - not recommended!)
        // WARNING: This is not the typical way to work with 2D arrays
        // Most 2D arrays are stored and accessed row-by-row
        System.out.println("\nColumn-centric display (unusual):");
        
        
        
    }
}