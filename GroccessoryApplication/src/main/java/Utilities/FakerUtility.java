package Utilities;

import com.github.javafaker.Faker;

public class FakerUtility {
	//realistic fake datas like email,ph,random num
	Faker faker=new Faker();
	public String generateName()
	{
		return faker.name().fullName();
	}
	public String generateAddress()
	{
		return faker.address().fullAddress();
	}
	public String generateEmailId()
	{
		return faker.internet().emailAddress();
	}
	public String getPhoneNumber()
	{
        return faker.phoneNumber().cellPhone();  
    }
	public String getRandomCompany()
	{
        return faker.company().name();  
    }

    
    public String getUsername() 
    {
        return faker.name().username();  
    }

    
    public String getText() 
    {
        return faker.lorem().paragraph(); 
    }

    
    public String getDateOfBirth() 
    {
        return faker.date().birthday().toString();  
    }
}
