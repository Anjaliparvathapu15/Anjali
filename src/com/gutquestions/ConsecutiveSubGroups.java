package com.gutquestions;

public class ConsecutiveSubGroups {

	public static void main(String[] args) {
		String input="00110011";
		int currentGroup=1;
		int previousGroup=0;
		for(int i=0;i<input.length()-1;i++) {
			if(input.charAt(i)==input.charAt(i+1)) {
				currentGroup++;
			}else {
				previousGroup=currentGroup;
				currentGroup=1;
			}
			
		}
		if(currentGroup==previousGroup) {
			System.out.println(currentGroup+previousGroup);
		}

	}

}
