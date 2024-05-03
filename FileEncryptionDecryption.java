import java.io.*;

public class FileEncryptionDecryption {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter 'E' for encryption or 'D' for decryption: ");
            char choice = reader.readLine().charAt(0);
            
            System.out.print("Enter file name or path: ");
            String fileName = reader.readLine();
            
            BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
            
            BufferedWriter outputFile = new BufferedWriter(new FileWriter("output.txt"));
            
            String line;
            while ((line = inputFile.readLine()) != null) {
                String processedLine = "";
                if (choice == 'E') {
                    processedLine = encrypt(line);
                } else if (choice == 'D') {
                    processedLine = decrypt(line);
                }
                outputFile.write(processedLine + "\n");
            }
            inputFile.close();
            outputFile.close();
            
            System.out.println("File " + (choice == 'E' ? "encrypted" : "decrypted") + " successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    private static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encryptedText.append((char) (c + 1));
        }
        return encryptedText.toString();
    }
    
    private static String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            decryptedText.append((char) (c - 1));
        }
        return decryptedText.toString();
    }
}
