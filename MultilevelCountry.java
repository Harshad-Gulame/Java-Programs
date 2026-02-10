class Country 
{
	String name ;
	String captil ;
	String language ;
	String pm ;
	long population ;
	double area ;
    
	Country(String name,String captil,String language,String pm,long population,double area)
	{
		this.name = name ;
		this.captil = captil ;
		this.language = language ;
		this.pm = pm ;
		this.population = population ;
		this.area = area ;
	}

	public void getCountryInfo()
	{
		System.out.println("\n Country Information ");
		System.out.println("Name :"+name);
		System.out.println("Captil :"+captil);
		System.out.println("language :"+language);
		System.out.println("PM :"+pm);
		System.out.println("population :"+population);
		System.out.println("Area :"+area);
	}

}

class Distric extends Country
{
	String dname ;
	String muncipalcomm ;
	long pop ;
	double darea ;
	String mp ;

	Distric(String name,String captil,String language,String pm,long population,double area,
			String dname,String muncipalcomm,long pop,double darea,String mp)
	{

		super(name,captil, language, pm, population, area);
		this.dname = dname ;
		this.muncipalcomm = muncipalcomm ;
		this.pop = pop ;
		this.darea = darea ;
		this.mp = mp ;
	}

	public void getDisrict()
	{
		System.out.println("\n Distric Info");
		System.out.println("name :"+dname);
		System.out.println("muncipalcomm :"+muncipalcomm);
		System.out.println("Pop :"+pop);
		System.out.println("Area :"+darea);
		System.out.println("MP :"+mp);

	}
}

class Taluka extends Distric
{
	String tname ;
	double tarea ;
	long tPopulation ;

	Taluka(String name,String captil,String language,String pm,long population,double area,
			String dname,String muncipalcomm,long pop,double darea,String mp,
			String tname,double tarea,long tPopulation)
	{

		super(name,captil,language,pm,population,area,dname,muncipalcomm,pop,darea,mp);
		this.tname = tname ;
		this.tarea =tarea ;
		this.tPopulation = tPopulation ;
	}

	public void getTalukaInfo()
	{
		System.out.println("\n Taluka Information ");
		System.out.println("Name :"+tname);
		System.out.println("Area :"+tarea);
		System.out.println("tPopulation :"+population);
	}
}

class Village extends Taluka
{
	String vname ;
	double varea ;
	long vpopulation ;

	Village(String name,String captil,String language,String pm,long population,double area,
			String dname,String muncipalcomm,long pop,double darea,String mp,
			String tname,double tarea,long tPopulation,
			String vname,double varea,long vpopulation)
	{
		super(name,captil, language, pm, population, area, dname,  muncipalcomm,  pop,  darea,  mp,  tname,  tarea,  tPopulation);
		this.vname = vname ;
		this.varea = varea ;
		this. vpopulation = vpopulation ;
	}

	public void getVillageInfo()
	{
		System.out.println("\n Village Details");
		System.out.println("Name :"+name);
		System.out.println("Area :"+varea);
		System.out.println("Population :"+vpopulation);
	}
}
class MultilevelCountry
{
	public static void main(String[] args) {




		Village obj = new Village("India","Dilhi","Hindi","N-Modi",14567998451318l,2.74,"Solapur","ABC",14565216l,1.4,"XYZ","Pandharpur",1.2,25468l,"Karkamb",1.1,14640l);
		obj.getVillageInfo();
		obj.getTalukaInfo();
		obj.getDisrict();
		obj.getCountryInfo();
		
	}
}