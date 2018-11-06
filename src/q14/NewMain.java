
package q14;

import java.io.*; 
  
public class NewMain 
{ 
    public static void main(String[] args) throws IOException 
    { 
        File file = new File("C:\\Users\\ayush\\IdeaProjects\\javaAssigmnet\\src\\q14\\ayush.txt");
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 

        FileReader fileReader= new FileReader("C:\\Users\\ayush\\IdeaProjects\\javaAssigmnet\\src\\q14\\ayush.txt");
        
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
        int paragraphCount = 1; 
        int whitespaceCount = 0; 
          
        
        while((line = reader.readLine()) != null) 
        { 
            if(line.equals("")) 
            { 
                paragraphCount++; 
            } 
            if(!(line.equals(""))) 
            { 
                  
                characterCount += line.length(); 
                  
                
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length; 
                whitespaceCount += countWord -1; 
                  
                
                String[] sentenceList = line.split("[!?.:]+"); 
                  
                sentenceCount += sentenceList.length; 
            } 
        } 
        String str = "";
        str+="Total word count = " + countWord; 
        str+="\n Total number of sentences = " + sentenceCount; 
        str+="\n Total number of characters = " + characterCount; 
        str+="\n Number of paragraphs = " + paragraphCount; 
        str+="\n Total number of whitespaces = " + whitespaceCount; 

        System.out.println(str);
  
        
        FileWriter fw=new FileWriter("C:\\Users\\ayush\\IdeaProjects\\javaAssigmnet\\src\\q14\\ayush2.txt");
  
       
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
  
        
        fw.close(); 
    } 
} 
