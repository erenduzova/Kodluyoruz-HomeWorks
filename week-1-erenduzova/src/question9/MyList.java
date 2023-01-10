package question9;

import java.util.Arrays;
import java.util.Objects;

public class MyList {

	private int capacity;
	private int addNextIndex;
	private String[] myArr;

	public MyList() {
		this.addNextIndex = 0;
		this.capacity = 5;
		this.myArr = new String[capacity];
	}

	public void add(String newString) {
		
		newString = newString.toUpperCase();
		// is newString startsWith 'C'
		if (!(newString.startsWith("C"))) {
			System.out.println("C ile başlamıyor");
			return;
		}

		// is myList full
		if (addNextIndex == capacity) {
			this.incCap();
		}

		this.myArr[addNextIndex] = newString;
		addNextIndex++;
	}

	public void incCap() {
		this.capacity += 7;
		String[] tmpArr = new String[capacity];
		for (int i = 0; i < myArr.length; i++) {
			tmpArr[i] = myArr[i];
		}
		this.myArr = tmpArr;

	}

	@Override
	public String toString() {

		return Arrays.toString(Arrays.stream(myArr).filter(Objects::nonNull).toArray());
		
		// You can use this return for checking capacity and see array with null elements
		//return Arrays.toString(myList);
	}

}
