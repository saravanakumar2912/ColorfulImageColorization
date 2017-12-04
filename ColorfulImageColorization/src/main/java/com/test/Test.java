package com.test;

import com.algorithmia.*;
import com.algorithmia.algo.*;

public class Test {

	public static void main(String[] args) {
		String input = "{"
				 + "  \"image\": \"data://saravanakumar2912/example_data/cat.jpg\""
				 + "}";
		try {
			AlgorithmiaClient client = Algorithmia.client("simanSpHbcCUAKpWd6T8hrjgCX/1");
			
			Algorithm algo = client.algo("deeplearning/ColorfulImageColorization/1.1.7");
			AlgoResponse result = algo.pipeJson(input);
			System.out.println(result.asJsonString());
		} catch (APIException e) {
            e.printStackTrace();
        } catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
