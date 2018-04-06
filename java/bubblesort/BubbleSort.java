import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class BubbleSort {
    public int[] readInput (String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String[] itemsString = br.readLine().split(" ");
            int[] items          = new int[itemsString.length];

            for (int n = 0; n < items.length; n++) {
                items[n] = Integer.parseInt(itemsString[n]);
            }
            return items;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void writeOutput (String fileName, int[] items) {
        try {
            File file = new File(fileName);
            if (!file.exists()) file.createNewFile();
            FileWriter fw     = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i=0; i<items.length; i++) {
                bw.write(items[i] + "\n");
            }

            bw.close();
        } catch (IOException e) e.printStackTrace();
    }

    public void swap (int i, int j, int[] items) {
        int temp  = items[i];
        items[i]  = items[j];
        items[j]  = temp;
    }

    public int[] bubbleSort (int[] items) {
        for (int k=0; k<items.length-k; k++) {
            for (int j=0; j<items.length-1; j++) {
                if (items[j] > items[j+1]) {
                    this.swap(j, j+1, items);
                }
            }
        }
        return items;
    }

    public static void main (String[] args) {
        BubbleSort myObj = new BubbleSort();
        if (args.length == 1) {
            int[] itemsList = myObj.readInput(args[0]);
            itemsList       = myObj.bubbleSort(itemsList);
            myObj.writeOutput("output.txt", itemsList);
        } else {
            System.out.println("please provide the input file.");
        }
    }
}