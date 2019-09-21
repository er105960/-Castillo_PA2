import java.util.Scanner;
public class Prob_3 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

        // Topics array
        String[] topics = {"Anime", "Music", "Money", "Sports", "Food"};

        // Ratings array
        int [][] ratings = new int [topics.length][];
        
        int i;
        int j;
        int people;
        int rating;

        // Initialize the ratings array values to 0

        for(i=0; i<ratings.length; i++){
               ratings[i] = new int[10];
               
               for(j=0; j<ratings[i].length; j++) {
                      ratings[i][j] = 0;
               }
        }

        // Enter number of people completing the survey

        System.out.print("Enter the number of people participating in the survey : ");
        people = scnr.nextInt();

        // Loop to allow user to rate each topic

        for(i=0; i<people; i++) {
               System.out.println("Rate each of the 5 topics from a scale of 1-10.");

               for(j=0; j<topics.length; j++) {
                      System.out.print(topics[j] + ": ");
                      rating = scnr.nextInt();

                      // Invalid entry

                      while(rating < 1 || rating > 10){
                            System.out.println("Sorry, invalid entry. Please try again...");
                            System.out.print(topics[j] + ": ");
                            rating = scnr.nextInt();
                      }
                      ratings[j][rating-1]++; // increment the corresponding rating entry
               }
        }
        
        // create array for storing average rating
        int avgRating[] = new int[topics.length];
        String highestPointIssue=""; 
        String lowestPointIssue="";
        int highestPointTotal = 0;
        int lowestPointTotal= 0;

        // loop to calculate the average rating, lowest/highest point totals

        for(i=0; i<ratings.length; i++){
               avgRating[i] = 0;

               for(j=0; j<ratings[i].length; j++) {
                      avgRating[i]+=(ratings[i][j] * (j+1));
               }
              
               if(i == 0) { // for first entry initialize the variables
                      highestPointTotal = avgRating[i];
                      lowestPointTotal= avgRating[i];
                      highestPointIssue = topics[i];
                      lowestPointIssue = topics[i];
               }
               else {
                      if(avgRating[i] > highestPointTotal){
                            highestPointIssue = topics[i];
                            highestPointTotal = avgRating[i];
                      }
                      
                      if(avgRating[i] < lowestPointTotal){
                            lowestPointIssue = topics[i];
                            lowestPointTotal= avgRating[i];
                      }
               }  
               avgRating[i] = avgRating[i]/people;
        }      

        // Tabular Report
        System.out.printf("\n%-20s","");

        for(i=0;i<10;i++) {
               System.out.printf("%-10d",(i+1));
        }
        
        System.out.printf("%20s","Average Rating");
        System.out.println();

        for(i=0;i<ratings.length;i++) {
               System.out.printf("\n%-20s",topics[i]);

               for(j=0;j<ratings[i].length;j++) {
                      System.out.printf("%-10d",ratings[i][j]);
               }
               
               System.out.printf("%20d",avgRating[i]);
        }
        
        // Show the topics with highest and lowest point totals
        System.out.println("\n\nHighest Point total: " + highestPointIssue +" with " + highestPointTotal);
        System.out.println("Lowest Point total: " + lowestPointIssue+" with " + lowestPointTotal);
        scnr.close();
  }
}

