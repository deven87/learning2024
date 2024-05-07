package mavenlearning.mavenlearning;

import java.io.IOException;
import java.util.Properties;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( AppTest.class );
	}

	/**
	 * Rigourous Test :-)
	 * @throws IOException 
	 */
	public void testApp() throws IOException
	{
		assertTrue( true );
		
		Properties prop = new Properties();

		prop.load(this.getClass().getClassLoader().getResourceAsStream("myfile.properties"));
		
		System.out.println("properties are " );
		
		System.out.println("name " + prop.getProperty("name"));
		
		System.out.println("version " + prop.getProperty("version"));
		
		System.out.println("myProp " + prop.getProperty("myProp"));
		System.out.println("path " + prop.getProperty("path"));
		System.out.println("pathEnvHome " + prop.getProperty("pathEnvHome"));
		System.out.println("baseDir " + prop.getProperty("baseDir"));
		System.out.println("pathbuild " + prop.getProperty("pathbuild"));
		
		
		
		


	}
}
