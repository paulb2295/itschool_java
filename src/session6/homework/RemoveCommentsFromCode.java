package session6.homework;

import java.util.ArrayList;

public class RemoveCommentsFromCode {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("""
                #include <stdio.h>
                #include <stdlib.h>

                int main()
                {
                    /*For this example
                    the array
                    is already initialized
                    and the  array length is 6
                    */
                    int numbersArray[] = {1, 23, 44, 7, 3, 90};
                    int sum = 0;
                    //looping array elements using pointers
                    for(int i = 0; i< 6; i++ ){
                        sum += *(numbersArray+i);
                    }
                    //printing sum
                    printf("Sum of array elements = %d ", sum);
                    /* in C and C++
                    main functions returns 0
                    if successful
                    */
                    return 0;
                }
                                """);

        stringBuilder = cPlusPlusComRemover(stringBuilder.toString());
        cComRemover(stringBuilder);
        System.out.println(stringBuilder);
    }

    public static void cComRemover(StringBuilder code) {
        int[] commentIndexes = new int[2];
        for (int index = 0; index < code.length(); index++) {
            if (code.charAt(index) == '/'
                    && code.charAt(index + 1) == '*') {
                commentIndexes[0] = index;
                index += 2;
                while (index + 1 < code.length()
                        && code.charAt(index) != '*'
                        && code.charAt(index + 1) != '/') {
                    index++;
                }
                commentIndexes[1] = index + 2;
                code.delete(commentIndexes[0], commentIndexes[1]);
                index = 0;
            }

        }
    }

    public static StringBuilder cPlusPlusComRemover(String code) {
        String[] lines = code.split("\n");
        StringBuilder noCommentCode = new StringBuilder();
        for (String line : lines) {
            if (!line.trim().startsWith("//")) {
                noCommentCode.append(line).append("\n");
            }
        }
        return noCommentCode;
    }

}
