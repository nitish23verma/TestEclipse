package com.aphabetsequence;

import java.util.Scanner;

public class AlphabetSeq {
	int inputLength = 0;
	int inputCount = 0;

	public int[] inputAlphabetSequence() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input to transform into alps: ");
		inputLength = scanner.nextInt();
		inputCount = scanner.nextInt();
		int[] intArray = new int[5];
		// for (int i = 0; i < intArray.length; i++) {
		intArray[0] = inputLength;
		intArray[1] = inputCount;
		// }
		scanner.close();
		return intArray;
	}

	public static void main(String[] args) {
		AlphabetSeq alphs = new AlphabetSeq();

		int inputRepetition = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("No. of repetitions: ");
		inputRepetition = scanner.nextInt();

		// System.out.println(inputRepetition + " : " + inputLength + " : " +
		// inputCount);

		for (int i = 0; i <= inputRepetition; i++) {
			// int[] intInput =
			alphs.inputAlphabetSequence();
			// System.out.println(intInput[0]);
			// System.out.println(intInput[1]);
		}

		scanner.close();

	}
}
