import publications.java;
import Authors.java;

public class Faculty{
    public String Name;
    public String Position;
    public Publication publications;

    public String GetName(){
        return Name;
    }

    public String GetPosition(){
        return Position;
    }

    public Publication GetPublications(){
        return publications;
    }
}
