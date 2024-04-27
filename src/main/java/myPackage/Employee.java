package myPackage;

class Employee
{


	private int id;
	private String fName, lName;
	private double salary;
	private String title;
	private int leaveBalance;
	private int daysRequested;
	private double currentBalance;
	private boolean type;
	private double attScore;
	private double appScore;
	private double workScore;
	private double behScore;
	private String pass;
	private int currentLeave;

	public Employee(){}

	public Employee(int id, String fName, String lName, double salary, String title, int leaveBalance)
	{
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
		this.title = title;
		this.leaveBalance = leaveBalance;
		this.daysRequested = 0;
		this.currentBalance = 0;
		this.attScore = 0;
		this.appScore = 0;
		this.workScore = 0;
		this.behScore = 0;
	}
	public Employee(int id, String fName, String lName, double salary, String title, int leaveBalance,
					double currentBalance, double attScore, double appScore, double behScore, double workScore, boolean admin, String pass, int daysRequested, int currLeave)
	{
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
		this.title = title;
		this.leaveBalance = leaveBalance;
		this.daysRequested = daysRequested;
		this.currentBalance = currentBalance;
		this.attScore = attScore;
		this.appScore = appScore;
		this.workScore = workScore;
		this.behScore = behScore;
		this.pass = pass;
		this.type = admin;
		this.currentLeave= currLeave;
	}


	public  int getId() {
		return this.id;

	}

	public String getfName() {
		return this.fName;
	}

	public String getlName() {
		return this.lName;
	}

	public double getSalary() {
		return this.salary;
	}

	public String getTitle() {
		return this.title;
	}

	public int getLeaveBalance() {
		return this.leaveBalance;
	}

	public int getDaysRequested() {
		return this.daysRequested;
	}

	public double getCurrentBalance() {return this.currentBalance;
	}

		public int getCurrentLeave() {
			return this.currentLeave;
		}

		public boolean getType() {return this.type;
		}

			public double getAttScore() {
				return this.attScore;

			}

			public double getAppScore() {
				return this.appScore;

			}

			public double getBehScore() {
				return this.behScore;

			}

			public double getWorkScore() {
				return this.workScore;

			}

			public String getPassword() {
				return this.pass;
			}

			public void setSalary(double salary) {
				this.salary = salary;
			}

			public void setCurrentLeave(int currentLeave) {
				this.currentLeave = currentLeave;
			}

			public void setfName(String name) {
				this.fName = name;
			}

			public void setlName(String name) {
				this.lName = name;
			}

			public void setID(int id) {
				this.id = id;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public void setLeaveBalance(int days) {
				this.leaveBalance = days;
			}

			public void addLeave(int days) {
				this.leaveBalance += days;
			}

			public void setDaysRequested(int daysRequested) {
				this.daysRequested = daysRequested;
			}

			public void setCurrentBalance(double balance) {
				this.currentBalance = balance;
			}

			public void setType(boolean type) {
				this.type = type;
			}

			public void addBehavior(double beh) {
				this.behScore += beh;

			}

			public void addAttendance(double att) {
				this.attScore += att;

			}

			public void addAppearance(double app) {
				this.appScore += app;
			}

			public void addWork(double work) {
				this.workScore += work;
			}

			public void setPassword(String pass) {
				this.pass = pass;
			}

		}