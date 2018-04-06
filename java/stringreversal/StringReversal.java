import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class StringReversal {
    public String[] readInput (String fileName) {
        try {
        	(BufferedReader br = new BufferedReader(new FileReader(fileName))) 

            String[] itemsString = br.readLine().split(" ");
            String[] items          = new String[itemsString.length];

            for (int n = 0; n < items.length; n++) {
                items[n] = itemsString.charAt(n);
            } 
         } catch (IOException e) {
        	e.printStackTrace();
        	return null;
        }
    }

    public void writeOutput (String fileName, String[] items) {
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

    public void swap (int i, int j, String[] items) {
        String temp  = items[i];
        items[i]  = items[j];
        items[j]  = temp;
    }

    public int[] stringReversal (String[] items) {
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
        StringReversal myObj = new StringReversal();
        if (args.length == 1) {
            String[] itemsList = myObj.readInput(args[0]);
            itemsList       = myObj.stringReversal(itemsList);
            myObj.writeOutput("output.txt", itemsList);
        } else {
            System.out.println("please provide the input file.");
        }
    }
}