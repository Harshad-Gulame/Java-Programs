class Driver
{
	String name ;
	String type ;
	String fileSystem ;
	double totalCapacity ;
	double usedSpace ;
	double freeSpace ;

	Driver(String name,String type,String fileSystem,double totalCapacity,double usedSpace,double freeSpace)
	{
		this.name = name ;
		this.type = type ;
		this.fileSystem =fileSystem ;
		this.totalCapacity = totalCapacity ;
		this.usedSpace =usedSpace ;
		this.freeSpace = freeSpace ;
	}

	public void getDriver()
	{
		System.out.println("\n Driver Information");
		System.out.println("Name :"+name);
		System.out.println("Type :"+type);
		System.out.println("fileSystem :"+fileSystem);
		System.out.println("totalCapacity :"+totalCapacity);
		System.out.println("usedSpace :"+usedSpace);
		System.out.println("freeSpace :"+freeSpace);
	}
}

class Folder extends Driver
{
	String fname ;
	String ftype ;
	double space ;
	int subFolder ;
	String created ;

	Folder(String name,String type,String fileSystem,double totalCapacity,double usedSpace,double freeSpace,
			String fname,String ftype,double space, int subFolder,String created)
	{
		super(name,type,fileSystem,  totalCapacity,  usedSpace,  freeSpace);
		this.fname =fname ;
		this.ftype =ftype ;
		this.space =space;
		this.subFolder =subFolder ;
		this.created =created ;
	}

	public void getFolder()
	{
		System.out.println("\n Folder Information ");
		System.out.println("fname :"+fname);
		System.out.println("ftype :"+ftype);
		System.out.println("space :"+space);
		System.out.println("Sub Folder :"+subFolder);
		System.out.println("created :"+created);
	}
}

class File extends Folder
{
	String fileType ;
	String size ;
	String openwith ;
	String attribiutes ;

	File(String name,String type,String fileSystem,double totalCapacity,double usedSpace,double freeSpace,
			String fname,String ftype,double space, int subFolder,String created,
			String fileType,String size,String openwith,String attribiutes)
	{
		super(  name,  type,  fileSystem,  totalCapacity,  usedSpace,  freeSpace,
			  fname,  ftype,  space,   subFolder,  created);
		this.fileType = fileType ;
		this. size =size ;
		this.openwith =openwith ;
		this.attribiutes =attribiutes;
	}

	public void getFile()
	{
		System.out.println("\n File Information ");
		System.out.println("File Type :"+fileType);
		System.out.println("size :"+size);
		System.out.println("openwith :"+openwith);
		System.out.println("attribiutes :"+attribiutes);
	}

}
class MultilevelEx
{
	public static void main(String[] args) {


		File obj = new File("C Drive","local disk","NTFS",2.48,1.2,1.46,"XAMPP","file Folder",895,20000,"2/02/2022","photo","2mb","Photos","Hidden");
		obj.getFile();
		obj.getFolder();
		obj.getDriver();
		
	}
}