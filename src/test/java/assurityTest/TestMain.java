package assurityTest;

import com.google.gson.Gson;
import com.google.gson.*;
import org.junit.*;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;


public class TestMain {

    Gson gson;
    AssurityEntry assurityEntry;

    @Before
    public void SetUp() {

        try {
            //Read file in
            String testFilePath = "./AssurityAPI.json";
            File testJsonFile = new File(testFilePath);
            Scanner scanner = new Scanner(testJsonFile);
            StringBuilder fileStringBuilder = new StringBuilder();

            //Convert file to string
            while(scanner.hasNextLine()) {
                fileStringBuilder.append(scanner.nextLine());
            }
            String fileString = fileStringBuilder.toString();

            //Pass file string for json deserialisation.
            gson = new GsonBuilder().setPrettyPrinting().create();
            assurityEntry = gson.fromJson(fileString, AssurityEntry.class);

        }catch(FileNotFoundException e){
            System.err.println( "File not Found : " + e);
            System.exit(1);
        }


    }
        
    @Test
    public void testAssertionOne(){
        String targetString = "Badges";
        assertEquals("Entry name does not match target", targetString, assurityEntry.getName());
    }

    @Test
    public void testAssertionTwo(){
        assertFalse("Expected canListClassifieds to be false.",assurityEntry.isCanListClassifieds());
    }

    @Test
    public void testAssertionThree(){
        String targetCharityDescription = "Plunket";
        String targetCharityTagline = "well child health services";
        Charity targetCharity = null;

        //Search through charities to find target matching description
        for(Charity c : assurityEntry.getCharities()){
            if (c.getDescription().equals(targetCharityDescription)){
                targetCharity = c;
                break;
            }
        }

        assertNotNull("No charity found with that description", targetCharity);

        //Search target charity for target tagline text.
        assertTrue("Target charity does not contain specified tagline",targetCharity.getTagline().contains(targetCharityTagline));

    }

    public void printJavaToJSON(){
        String assurityEntryJsonString = gson.toJson(assurityEntry);
        System.out.println(assurityEntryJsonString);

    }

}