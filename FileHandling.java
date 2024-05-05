import java.io.*;

public class FileHandling {

    public static void main(String[] args) {
        // Create a new file
        createFile("devansh.txt");
        System.out.println("");


        // Check if file is readable
        System.out.println("file readable? : " + isReadable("example.txt"));
        System.out.println("");

        // Check if file is writable
        System.out.println("file writable? : " + isWritable("example.txt"));
        System.out.println("");

        // Get absolute path of the file
        System.out.println("Absolute path : " + getAbsolutePath("example.txt"));
        System.out.println("");

        // Get path of the file
        System.out.println("Path : " + getPath("example.txt"));
        System.out.println("");

        // List all files in the current directory
        listFilesInDirectory(".");
        System.out.println("");
        
        // Delete the file
        deleteFile("devansh.txt");
        System.out.println("");

    }

    // Create a new file
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Delete a file
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted: " + fileName);
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    // Check if a file is readable
    public static boolean isReadable(String fileName) {
        File file = new File(fileName);
        return file.canRead();
    }

    // Check if a file is writable
    public static boolean isWritable(String fileName) {
        File file = new File(fileName);
        return file.canWrite();
    }

    // Get the absolute path of a file
    public static String getAbsolutePath(String fileName) {
        File file = new File(fileName);
        return file.getAbsolutePath();
    }

    // Get the path of a file
    public static String getPath(String fileName) {
        File file = new File(fileName);
        return file.getPath();
    }

    // List all files in a directory
    public static void listFilesInDirectory(String directory) {
        File folder = new File(directory);
        File[] files = folder.listFiles();
        if (files != null) {
            System.out.println("Files in directory " + directory + ":");
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
