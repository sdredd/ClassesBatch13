package com.syntax.class10;

public class HWGroup11 {

	public static void main(String[] args) {

		String[] names = { "Natalia", "Igor", "Natalia", "Oleg", "Oleg", "Alexia", "Igor" };
		String[] duplName = new String[names.length]; // create array where we will store duplicate names
		int index = 1; // variable index - indicates which index to take in the array "names"
		int indDupl = 0; // duplicate name index variable - indicates which index to take in the array
							// "duplName"

		for (String name : names) { // with this line we iterate over all the words in turn in the array

			for (int i = index; i < names.length; i++) { // in this line we take the next words in the array for
															// comparison (index=1 at the beginning)

				if (name.equals(names[i])) { // compare "name" with "names[i]

					for (int d = 0; d <= indDupl; d++) { // in this line we write which index of array "duplName" to
															// take

						if (name.equals(duplName[d])) { // see if our duplicate name is already in the array "duplName"

							break; // if duplicate name is in the array "duplName" , then break for (in line 18)
									// and goes into for (in line 14)

						} else { // if the duplicate name is not in the array "duplName", you need to add it to
									// the array "duplName"
							duplName[indDupl] = name; // add duplicate name to array"duplName", where "indDupl" - index
														// of array "duplName"
							indDupl++; // since the index of the array with this number is full, you need to add 1 for
										// the following duplicate names
							break; // then break for (in line 18) and goes into for (in line 14)
						}

					}

				}

			}
			index++; // add 1 to index of array "names"
		}

		for (int c = 0; c < indDupl; c++) { // Print out all the values that are in the array "duplName"
			System.out.println(duplName[c]);
		}
	}
}