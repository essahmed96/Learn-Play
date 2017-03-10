import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public  class Account {
	static int ID;
	String name;
	String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getID() {
		return ID;
	}

	public void setID(int string) {
		ID = string;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	boolean Signin(String name, String pass) {
		return false;
	}

	Object SignUp(String name, String pass) {
		return null;
	}

	public static String ShowScore(String name) {
		String text = "";
		File f = new File("Scores.txt");
		try {
			Scanner in = new Scanner(f);
			while (in.hasNextLine()) {
				String[] line = in.nextLine().split(",");
				if (line[0].equals(name) || name.equals("")) {
					if (name.equals(""))
						text += "Student: " + line[0] + " has a Score: "
								+ line[1] + " in game: " + line[2] + "\n";
					else
						text += "Score: " + line[1] + " in game: " + line[2]
								+ "\n";
			
					return line[1];
				}
			}
			
			
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		

		
	}

}
