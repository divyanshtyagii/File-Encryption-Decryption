# File-Encryption-Decryption
Overview:
This Java program provides functionality for encrypting and decrypting text files using a basic encryption algorithm. It allows users to choose between encryption and decryption modes, input file names or paths, and generates output files with the processed content.

Usage:
Choose Operation: Run the program and input 'E' for encryption or 'D' for decryption when prompted.
Input File: Enter the name or path of the file you want to encrypt or decrypt.
Output File: The processed content will be saved in a file named "output.txt" in the same directory.
How it Works:
The program uses a BufferedReader to read user input from the console.
After obtaining the user's choice (encryption or decryption) and the file name, it opens the input file for reading and creates an output file for writing.
Each line of the input file is read and processed according to the selected operation.
For encryption, each character in the line is shifted by one ASCII value.
For decryption, each character is shifted back by one ASCII value.
The processed line is written to the output file.
Once all lines are processed, the input and output files are closed.
The user is notified of the success or failure of the operation.
Key Methods:
encrypt(String text): Encrypts the given text by shifting each character's ASCII value by one.
decrypt(String text): Decrypts the given text by shifting each character's ASCII value back by one.
Limitations and Considerations:
This tool provides basic encryption and decryption functionality and may not be suitable for highly sensitive data.
It uses a simple encryption algorithm and does not incorporate advanced cryptographic techniques.
Users should exercise caution when handling encrypted files and ensure the security of encryption keys or methods.
Example Usage:
mathematica
Copy code
$ java FileEncryptionDecryption
Enter 'E' for encryption or 'D' for decryption: E
Enter file name or path: input.txt
File encrypted successfully!
Dependencies:
This program does not have any external dependencies and can be run using the Java Development Kit (JDK).
Contributions:
Contributions and feedback are welcome! Feel free to submit issues or pull requests to improve the functionality or documentation of this tool.
