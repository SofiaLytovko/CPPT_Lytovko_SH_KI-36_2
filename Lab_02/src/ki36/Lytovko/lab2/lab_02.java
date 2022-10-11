package ki36.Lytovko.lab2;

import java.io.*;
import java.util.*;

/**
 * Клас lab_02 реалізує код до лабораторної роботи №2
 *
 * @author Sofia Lytovko
 * @version 1.0
 * @since version 1.0
 */


public class  lab_02 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;

        String filler;
        Scanner in = new Scanner(System.in);

        File dataFile = new File("lab2.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Enter the size of the square matrix: ");
        nRows = in.nextInt();
        in.nextLine();
        int a = nRows % 2 == 0 ? 1 : 0;
        char[][] arr = new char[nRows][nRows];

        System.out.print("\nEnter a placeholder character: ");
        filler = in.nextLine();

        if(filler.length() != 1)
        {
            System.out.println("The placeholder character was entered incorrectly");
            System.exit(1);
        }

        int topRows = nRows % 2 == 0 ? nRows / 2 : nRows / 2 + 1;
        exit:
        for (int i = 1; i <= topRows; i++) {
            int rowIndex = i - 1;
            for (int j = 1; j <= nRows; j++) {
                int columnJndex = j - 1;
                if(j <= i || j >= nRows - i + 1){
                    arr[rowIndex][columnJndex] = (char) filler.codePointAt(0);
                }else{
                    arr[rowIndex][columnJndex] = (char) "  ".codePointAt(0);
                }
            }
        }
        for(int x = 0; x <= topRows - 2; x++)
        {
            arr[topRows + x] = arr[topRows - 2 - x];
        }
        for (int i = 0; i < nRows - a; i++) {
            for (int j = 0; j < nRows; j++) {
                System.out.print(arr[i][j] + " ");
                fout.print(arr[i][j] + " ");
            }
            fout.print("\n");
            System.out.print("\n");
        }
        fout.flush();
        fout.close();
    }
}
