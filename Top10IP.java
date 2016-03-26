/**1 1414142144 1.132.33.33 49494
2 3498234823 3.3.32.255

read everyline
regex ipaddress
set 10 size array of rank,ip,count
loop array
check if found ip
display array**/

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */

public class Top10IP {
public static void main (String[] args) throws java.lang.Exception {

String[][] input = new String[][]{{"1332323","2.3.2.3"},{"1332323","2.3.2.3"},{"1332323","2.3.2.3"},
	    {"1332323","2.3.2.3"},{"1332323","2.3.2.3"},{"1332323","2.3.2.3"},
	    {"1332323","2.3.2.3"},{"1332323","2.3.2.3"},{"1332323","2.3.2.3"}
	};


Object[][] output = null;
	int ii = 0, jj = 0, count = 0;
	//args, file, xml, json, string, un structured array, array
	System.out.println(input.length);
	    for(int i=0; i<input.length; i++) {
	        for(int j=0; j<input[i].length; j++) {
	            System.out.print(input[i][j]+",");
	            Arrays.stream(output).flatMapToInt(x -> Arrays.stream(x));
	        }
	        System.out.println();
	    }
	}
	// Top 10 Rank IP Address Count
}