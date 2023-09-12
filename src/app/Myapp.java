package app;

import java.awt.*;
import java.awt.event.*;

//Simple Registration Form

class App extends Frame{
	
	Label lTittle,lName,lFather,lAge,lGender,lCourse,lHobbies,lAddress;
	TextField tfName,tfFather,tfAge;
	TextArea tAddress;
	Checkbox checkMale,checkFemale,hobbies1,hobbies2,hobbies3,hobbies4;
	CheckboxGroup cbg;
	Choice Course;
	Button bSave,bClear;
		
	public App() {
		super("User Registration Form");
		setSize(1000,600);//w,h
		setLayout(null);
		setVisible(true);
		Color formColor=new Color(50,60,78);
		setBackground(formColor);
		
		Font tittleFont=new Font("arial",Font.BOLD,25);
		Font labelFont=new Font("arial",Font.PLAIN,18);
		Font textFont=new Font("arial",Font.PLAIN,15);
		
		lTittle=new Label("Registration Form");
		lTittle.setBounds(250,40,300,50);
		lTittle.setFont(tittleFont);
		lTittle.setForeground(Color.YELLOW);
		add(lTittle);
		
		lName=new Label("NAME");
		lName.setBounds(250,100,150,30);
		lName.setFont(labelFont);
		lName.setForeground(Color.WHITE);
		add(lName);
		
		tfName=new TextField();
		tfName.setBounds(400,100,400,30);
		tfName.setFont(textFont);
		add(tfName);
		
		lFather=new Label("FATHER");
		lFather.setBounds(250,150,150,30);
		lFather.setFont(labelFont);
		lFather.setForeground(Color.WHITE);
		add(lFather);
		
		tfFather=new TextField();
		tfFather.setBounds(400,150,400,30);
		tfFather.setFont(textFont);
		add(tfFather);
		
		lAge=new Label("AGE");
		lAge.setBounds(250,200,150,30);
		lAge.setFont(labelFont);
		lAge.setForeground(Color.WHITE);
		add(lAge);
		
		tfAge=new TextField();
		tfAge.setBounds(400,200,40,30);
		tfAge.setFont(textFont);
		add(tfAge);
		
		lGender=new Label("GENDER");
		lGender.setBounds(250,250,150,30);
		lGender.setFont(labelFont);
		lGender.setForeground(Color.WHITE);
		add(lGender);
		
		cbg =new CheckboxGroup();
		checkMale=new Checkbox("Male",cbg,true);
		checkMale.setBounds(400,250,100,30);
		checkMale.setFont(labelFont);
		checkMale.setForeground(Color.WHITE);
		add(checkMale);
		
		
		checkFemale=new Checkbox("Female",cbg,false);
		checkFemale.setBounds(500,250,100,30);
		checkFemale.setFont(labelFont);
		checkFemale.setForeground(Color.WHITE);
		add(checkFemale);
		
		
		lCourse=new Label("COURSE");
		lCourse.setBounds(250,300,150,30);
		lCourse.setFont(labelFont);
		lCourse.setForeground(Color.WHITE);
		add(lCourse);
		
		Course=new Choice();
		Course.setFont(labelFont);
		Course.setBounds(400,300,400,50);
		Course.add("Java");
		Course.add("Css");
		Course.add("C++");
		Course.add("C");
		Course.add("Python");
		add(Course);
		
		lHobbies=new Label("HOBBIES");
		lHobbies.setBounds(250,350,150,30);
		lHobbies.setFont(labelFont);
		lHobbies.setForeground(Color.WHITE);
		add(lHobbies);
		
		cbg =new CheckboxGroup();
		hobbies1=new Checkbox("Reading");
		hobbies1.setBounds(400,350,100,30);
		hobbies1.setFont(labelFont);
		hobbies1.setForeground(Color.WHITE);
		add(hobbies1);
		
		hobbies2=new Checkbox("Playing");
		hobbies2.setBounds(500,350,100,30);
		hobbies2.setFont(labelFont);
		hobbies2.setForeground(Color.WHITE);
		add(hobbies2);
		
		hobbies3=new Checkbox("Singing");
		hobbies3.setBounds(600,350,100,30);
		hobbies3.setFont(labelFont);
		hobbies3.setForeground(Color.WHITE);
		add(hobbies3);
		
		hobbies4=new Checkbox("Dancing");
		hobbies4.setBounds(700,350,100,30);
		hobbies4.setFont(labelFont);
		hobbies4.setForeground(Color.WHITE);
		add(hobbies4);
		
		lAddress=new Label("ADDRESS");
		lAddress.setBounds(250,400,150,30);
		lAddress.setFont(labelFont);
		lAddress.setForeground(Color.WHITE);
		add(lAddress);
		
		tAddress=new TextArea(10,30);
		tAddress.setBounds(400,400,400,100);
		tAddress.setFont(labelFont);
		add(tAddress);
		
		bSave=new Button("Save Details");
		bSave.setBounds(400,530,150,30);
		bSave.setFont(labelFont);
		bSave.setBackground(Color.BLUE);
		bSave.setForeground(Color.WHITE);
		add(bSave);
		
		bClear=new Button("Clear Details");
		bClear.setBounds(560,530,150,30);
		bClear.setFont(labelFont);
		bClear.setBackground(Color.RED);
		bClear.setForeground(Color.WHITE);
		add(bClear);
		
		
				
		//Close Button Code
		
		this.addWindowListener(new WindowListener() {
			
			public void windowClosing(WindowEvent we) {
				System.exit(0);
				
			}
		});
	}
}

public class Myapp {

	public static void main(String[] args) {
		App frm=new App();
		
	}
}
