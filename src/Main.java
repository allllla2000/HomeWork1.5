public class Main {
    public static void main(String[] args) {
        //задание 1
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] arrarr = {1.57, 7.654, 9.986};

        int[] arrayarray = new int[7];
        arrayarray[0] = 11;
        arrayarray[1] = 22;
        arrayarray[2] = 33;
        arrayarray[3] = 44;
        arrayarray[4] = 55;
        arrayarray[5] = 66;
        arrayarray[6] = 77;

        //задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arrarr.length; i++) {
            if (i == arrarr.length - 1) {
                System.out.print(arrarr[i]);
            } else {
                System.out.print(arrarr[i] + ", ");
            }
        }

        System.out.println();


        for (int i = 0; i < arrayarray.length; i++) {
            if (i == arrayarray.length - 1) {
                System.out.print(arrayarray[i]);
            } else {
                System.out.print(arrayarray[i] + ", ");
            }

        }
        System.out.println();
        //задание 3
        System.out.println("Задание 3");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
        for (int i = arrarr.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrarr[i] + ", ");
            } else {
                System.out.print(arrarr[i]);
            }

        }
        System.out.println();

        for (int i = arrayarray.length - 1; i >= 0; i--) {
            if (i > 0) {
                        System.out.print(arrayarray[i] + ", ");
            } else {
                System.out.print(arrayarray[i]);}
        }
        System.out.println();
        //задание 4
        System.out.println("Задание 4");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i] = array[i] + 1);
            }
            
        }



    }

}
