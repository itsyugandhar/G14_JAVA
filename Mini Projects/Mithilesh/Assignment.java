Q1- public class ComplexExample1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b;
        System.out.println(a + " " + b + " " + c);
    }
}
Output -
5 3 14

Process finished.

Q2-public class ComplexExample2 {
    public static void main(String[] args) {
        int x = 8;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++;
        System.out.println(x + " " + y + " " + z);
    }
}
Output -
9 2 9
Process finished.
Q3-
public class ComplexExample3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = ++a * b-- + 2 * a++ / --b - a--;
        System.out.println(a + " " + b + " " + c);
    }
}
Output -
6 8 54
Process finished.






Q-4
public class ComplexExample4 {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y--;
        System.out.println(x + " " + y + " " + z);
    }
}
Output -
7 2 13
Process finished.
Q-5
public class ComplexExample5 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c = a-- * --b + 2 * a++ / ++b - a-- + b++;
        System.out.println(a + " " + b + " " + c);
    }
}
Output -
6 3 8
Process finished.
Q6
public class ComplexExample6 {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3;
        System.out.println(x + " " + y + " " + z);
    }
}
Output -
6 1 12
Process finished.
Q-7
public class ComplexExample7 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2;
        System.out.println(a + " " + b + " " + c);
    }
}
Output -
3 4 13
Process finished.
Q-8
public class ComplexExample8 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2;
        System.out.println(x + " " + y + " " + z);
    }
}
Output -
6 2 13
Process finished.

Q-9
public class ComplexExample9 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 - --a;
        System.out.println(a + " " + b + " " + c);
    }
}
Output -
4 4 12
Process finished.

Q-10
public class ComplexExample10 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 - --x;
        System.out.println(x + " " + y + " " + z);
    }
}
Output -
7 1 4
Process finished.
Q-11
public class AdvancedExample1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
        System.out.println(a + " " + b + " " + c);
    }
}
Output -
6 4 26
Process finished.

Q-12
public class AdvancedExample2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
        System.out.println(x + " " + y + " " + z);
    }
}
Output -
5 2 18
Process finished.

Q-13
public class AdvancedExample3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
        System.out.println(a + " " + b + " " + c);
    }
}
Output-
4 4 20
Process finished.
Q-14
public class AdvancedExample4 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
        System.out.println(x + " " + y + " " + z);
    }
}
Output -
7 1 18
Process finished.
Q-15
public class AdvancedExample5 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int c = a-- * ++b + 2 * a++ / --b - a-- + b++ * 4 / 2 + ++a;
        System.out.println(a + " " + b + " " + c);
    }
}
Output -
8 3 35
Process finished.

Q-16
public class AdvancedExample7 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c = a-- * ++b + 2 * a++ / --b - a-- + b++ * 4 / 2 + ++a;
        System.out.println(a + " " + b + " " + c);
    }
}
Output -
7 3 31
Process finished.
Q-19
public class AdvancedExample10 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
        System.out.println(x + " " + y + " " + z);
    }
}
Output -
10 2 31
Process finished.







Q-20
Give the output of this code
int a = 9;
a++;
System.out.println (a);
a -= a – - – a;
System .out.println (a);
Output -
10
8
Process finished.
