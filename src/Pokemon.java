
public class Pokemon
{

    private String name, type;
    private int health;
    
    private static int count;
    
    public Pokemon(String name, String type, int health)
    {
        this.name = name;
        this.type = type;
        this.health = health;
        count ++;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getType()
    {
        return type;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public void setHealth(int health)
    {
        this.health = health;
    }
    
    public int howMany()
    {
        return count;
    }

}
