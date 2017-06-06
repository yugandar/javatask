public class test {
04

05
    public static void main(String args[]) {
06

07
        // declare a string array with initial size
08
        String[] schoolbag = new String[4];
09

10
        // add elements to the array
11
        schoolbag[0] = "Books";
12
        schoolbag[1] = "Pens";
13
        schoolbag[2] = "Pencils";
14
        schoolbag[3] = "Notebooks";
15

16
        // this will cause ArrayIndexOutOfBoundsException
17
        // schoolbag[4] = "Notebooks";
18

19
        // declare a string array with no initial size
20
        // String[] schoolbag;
21

22
        // declare string array and initialize with values in one step
23
        String[] schoolbag2 = { "Books", "Pens", "Pencils", "Notebooks" };
24

25
        // print the third element of the string array
26
        System.out.println("The third element is: " + schoolbag2[2]);
27

28
        // iterate all the elements of the array
29
        int size = schoolbag2.length;
30
        System.out.println("The size of array is: " + size);
31
        for (int i = 0; i < size; i++) {
32
            System.out.println("Index[" + i + "] = " + schoolbag2[i]);
33
        }
34

35
        // iteration provided by Java 5 or later
36
        for (String str : schoolbag2) {
37
            System.out.println(str);
38
        }
39

40
    }
41

42
}
