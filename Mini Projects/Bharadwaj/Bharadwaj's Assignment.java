/*

Q1- public class ComplexExample1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b;
        System.out.println(a + " " + b + " " + c);
    }
}

OUTPUT:
5 3 14




Q2-public class ComplexExample2 {
    public static void main(String[] args) {
        int x = 8;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++;
        System.out.println(x + " " + y + " " + z);
    }
}
OUTPUT:
9 2 9



Q3-
public class ComplexExample3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = ++a * b-- + 2 * a++ / --b - a--;
        System.out.println(a + " " + b + " " + c);
    }
}

OUTPUT:
6 8 54



Q-4
public class ComplexExample4 {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y--;
        System.out.println(x + " " + y + " " + z);
    }
}

OUTPUT:
7 2 13



Q-5
public class ComplexExample4 {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y--;
        System.out.println(x + " " + y + " " + z);
    }
}
OUTPUT:
7 2 13



Q-6
public class ComplexExample5 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c = a-- * --b + 2 * a++ / ++b - a-- + b++;
        System.out.println(a + " " + b + " " + c);
    }
}

OUTPUT:
6 3 8




Q7
public class ComplexExample6 {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3;
        System.out.println(x + " " + y + " " + z);
    }
}
OUTPUT:
6 1 12




Q-8
public class ComplexExample7 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2;
        System.out.println(a + " " + b + " " + c);
    }
}
OUTPUT:
3 4 13




Q-9
public class ComplexExample8 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2;
        System.out.println(x + " " + y + " " + z);
    }
}
OUTPUT:
6 2 13




Q-10
public class ComplexExample9 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 - --a;
        System.out.println(a + " " + b + " " + c);
    }
}
OUTPUT:
4 4 12




Q-11
public class ComplexExample10 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 - --x;
        System.out.println(x + " " + y + " " + z);
    }
}
OUTPUT:
7 1 4



Q-12
public class AdvancedExample1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
        System.out.println(a + " " + b + " " + c);
    }
}
OUTPUT:
6 4 26



Q-13
public class AdvancedExample2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
        System.out.println(x + " " + y + " " + z);
    }
}
OUTPUT:
5 2 18



Q-14
public class AdvancedExample3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
        System.out.println(a + " " + b + " " + c);
    }
}
OUTPUT:
4 4 20



Q-15
public class AdvancedExample3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = a++ * --b + 2 * a-- / ++b - a-- + b++ * 4 / 2 + --a;
        System.out.println(a + " " + b + " " + c);
    }
}
OUTPUT:
4 4 20



Q-16
public class AdvancedExample4 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
        System.out.println(x + " " + y + " " + z);
    }
}
OUTPUT:
7 1 18



Q-17
public class AdvancedExample5 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int c = a-- * ++b + 2 * a++ / --b - a-- + b++ * 4 / 2 + ++a;
        System.out.println(a + " " + b + " " + c);
    }
}
OUTPUT:
8 3 35



Q-18
public class AdvancedExample7 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c = a-- * ++b + 2 * a++ / --b - a-- + b++ * 4 / 2 + ++a;
        System.out.println(a + " " + b + " " + c);
    }
}
OUTPUT:
7 3 31




Q-19
public class AdvancedExample10 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int z = x++ * --y + 2 * x-- / ++y - x++ + y-- * 3 / 2 + --x;
        System.out.println(x + " " + y + " " + z);
    }
}

OUTPUT:
10 2 31






Q-20
Give the output of this code
int a = 9;
a++;
System.out.println (a);
a -= a - --a;
System .out.println (a);


OUTPUT:
10
9


*/