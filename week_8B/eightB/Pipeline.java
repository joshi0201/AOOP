package eightB;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pipeline {
	    public static void main(String[] args) {
	        List<Integer> scores = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40);
	        List<Integer> processedScores = scores.stream()
	                .filter(score -> score % 2 == 0)  
	                .map(score -> score * 2)          
	                .collect(Collectors.toList());    

	        // Print the result
	        System.out.println("Processed scores: " + processedScores);
	    }
	}

