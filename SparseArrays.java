package epamtask4;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArrays {

    static int[] matchingStrings(String[] strings, String[] queries)
   {
        int query_count[]=new int[queries.length];/* creating array for storing the queries frequency count*/
        int frequency_count=0,k=0;/* initializing k(starting index of array) and count to zero */
        for(int i=0;i<queries.length;i++)
        {
            for(int j=0;j<strings.length;j++)
            {
                if(queries[i].equals(strings[j]))/* checking if the ith query equals to strings or not */
                {
                    frequency_count++;/* if equals we are incrementing the frequency count */
                }
            }
            query_count[k++]=frequency_count;/* pushing the particular queries's to array */
            frequency_count=0;

}
        return query_count;
   }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
