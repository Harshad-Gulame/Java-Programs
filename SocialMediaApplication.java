import java.util.*;
class Profile
{
	private String profilePhoto ;
	private String bio ;
	private String nickName ;

	Profile(String profilePhoto,String bio)
	{
		this(profilePhoto,bio,"");
	}

	Profile(String profilePhoto,String bio,String nickName)
	{
		this.profilePhoto = profilePhoto ;
		this.bio = bio ;
		this.nickName = nickName ;

	}
	public void getProfileInfo()
	{
		System.out.println("\n Profile Inforamtion ");
		System.out.println("Profile Photo :"+profilePhoto);
		System.out.println("Bio :"+bio);
		System.out.println("Nickname :"+nickName);
	}
}

class Comment
{
	private String comment ;
	private User user ;
	Comment(String comment,User user)
	{
		this.comment = comment ;
		this. user =user ;
	}

	public void getCommentInfo()
	{
		System.out.println(user.getUserName()+":"+comment);
	}
}

class Post
{
	private String media ;
	private String type ;
	private String location ;
	private String caption ;

	ArrayList<Comment> commentList = new ArrayList<Comment>();

	// Post(String media ,String type)
	// {
	// 	this(media,type,"NOT AVAIL");
	// }
	// Post(String media ,String type,String Location)
	// {
	// 	this(media,type,location,"No AVAIL");
	// }
	Post(String media, String type,String location,String caption)
	{
		this.media = media ;
		this.type = type ;
		this.location = location ;
		this.caption = caption ;

	}
	public void getPostInfo(){
		System.out.println("\n POST INFOR");
		System.out.println("Media :"+media);
		System.out.println("Type :"+type);
		System.out.println("Location :"+location);
		System.out.println("Caption :"+caption);

		if (commentList.size()==0) {
			System.out.println("\n No Coment \n");
			return ;
		}

		for (Comment comment :commentList )
		 {
			comment.getCommentInfo();
		}

		System.out.println("__________________________POST END______________________________");
	}
	public void addComment(Comment newComment)
	{
		commentList.add(newComment);

	}
}

class User
{
	private String name ;
    private long contact ;
    private String email ;
    private Profile profile ;
    private ArrayList<Post> postList = new ArrayList<Post>();

    User(String name,long contact ,String email,Profile profile)
    {
    	this.name =name ;
    	this.contact = contact ;
    	this.email = email ;
    	this.profile = profile ;
    }
    public void getUserInfo()
    {
    	System.out.println("\n User Info \n");
    	System.out.println("name :"+name);
    	System.out.println("Contact :"+contact);
    	System.out.println("Email :"+email);
    }
    public Profile getProfile(){
    	return profile ;
    }
    public void addPost(Post newPost)
    {
    	postList.add(newPost);
    }
    public ArrayList<Post> getPostList()
    {
    	return postList;
    }
    public String getUserName()
    {
    	return name ;
    }
}
class Group
{
	private String name ;
	private ArrayList<User> userList = new ArrayList<User>();
	int index = 0;
	Group(String name,User user)
	{
		this.name = name ;
		this.userList.add(user);
	}
	public void getGroupList()
	{
		System.out.println("Name :"+name);
		System.out.println("UserName :"+userList.get(index++).getUserName());
	}

	public void getGroupInfo()
	{
		System.out.println("Name :"+name);
		System.out.println("UserName :"+userList.get(index++).getUserName());
	}
}
class SocialMedia
{
	private String name ;
	private ArrayList<User> userList = new ArrayList<User>();
	private ArrayList<Group> groupList = new ArrayList<Group>();

	SocialMedia(String name)
	{
		this.name = name ;
	}

	public void launchApplication()
	{
		System.out.println("---------Welcome-----------");
	}
	public void addUser(User newUser)
	{
		userList.add(newUser);
	}
	public ArrayList<User> getUserList()
	{
		return userList ;
	}
	public void addGroup(ArrayList<User> userList,String groupname)
	{
		for (User user : userList)
		 {
			groupList.add(new Group(groupname,user));
		}
	}
	public ArrayList<Group> getGroupList(){
		return groupList ;
	}
}
class SocialMediaApplication
{
	public static void main(String[] args) 
	{
		
		SocialMedia app = new SocialMedia("Instagram");
		app.launchApplication();

		Profile profile1 = new Profile("Ramesh.jpeg","Java Developer","Maa Ka Ladala");
		User user1 = new User("Ramesh kumar",9876543210l,"ramesh@gmail.com",profile1);
		app.addUser(user1);

		Profile profile2 = new Profile("suresh.jpeg","self lover","Its Suryaaa");
		User user2 = new User("Suresh kumar",7894561230l,"suresh@gmail.com",profile2);
		app.addUser(user2);

		Profile profile3 = new Profile("sakshi.jpeg","Living in my own world","Attitude_Quuen");
		User user3 = new User("Sakshi kumari",9632587410l,"ramesh@gmail.com",profile3);
		app.addUser(user3);

		ArrayList<User> userList = app.getUserList();
		System.out.println("*******************************List of User****************************************");
		for (User element : userList )
		 {
			element.getUserInfo();
			element.getProfile().getProfileInfo();
			System.out.println("-------------------------------------------------------------------");
		}

		System.out.println("\n ***************************************User Post*****************************************");

		Post post1 = new Post("abc.mp4","reel","Something on Earth","No Caption Needed") ;
		Post post2 = new Post("ramesh.jpg","Post","Lonavala: hill Station","In the arm of Neature");
		user1.addPost(post1);
		user2.addPost(post2);

		Post post3 = new Post("Sakshi.jpg","post","out of range","Parri hun main");
		user3.addPost(post3);

		ArrayList<User> userList1 = app.getUserList();
		for (User user : userList1 )
		 {
			user.getUserInfo();
			user.getProfile().getProfileInfo();
			ArrayList<Post> posts = user.getPostList();
			for (Post post :posts )
			 {
				post.getPostInfo();
			}
			System.out.println("__________________________Next User Profile________________________________");
		}
		System.out.println("______________________________Affter Adding Comments_________________________________________");
		ArrayList<Post> postListSakshi = user3.getPostList();
		Post sakshiPost1 = postListSakshi.get(0);
		sakshiPost1.addComment(new Comment("Nice Pic",user1));
		sakshiPost1.addComment(new Comment("Chand Dharati Par",user2));
		sakshiPost1.addComment(new Comment("@ramesh : tahnku Dada",user3));
		sakshiPost1.addComment(new Comment("hehehehehe",user1));

		sakshiPost1.getPostInfo();

		ArrayList<User> groupList = new ArrayList<User>();
		groupList.add(user1);
		groupList.add(user2);
		groupList.add(user3);
		app.addGroup(groupList,"MAD OF MADNESS");

		System.out.println("_____________________Group List________________________");
		ArrayList<Group> groupLists = app.getGroupList();

		for (Group group : groupLists )
		 {
			group.getGroupInfo();
		}

	}
}
