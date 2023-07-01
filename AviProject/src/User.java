/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DS76
 */
class User {
    private String name,college,gender,language,stream;
    private byte[] picture;
    public User(String name,String college,String gender,String language,String stream,byte[]image)
    {
        this.name=name;
        this.college=college;
        this.gender=gender;
        this.language=language;
        this.stream=stream;
        this.picture=image;
    }
    public String getname()
    {
        return name;
    }
    public String getcollege()
    {
        return college;
    }
    public String getgender()
    {
        return gender;
    }
    public String getlanguage()
    {
        return language;
    }
    public String getstream()
    {
        return stream;
    }
    public byte[] getImage()
    {
        return picture;
    }
}
