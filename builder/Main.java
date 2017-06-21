import java.util.ArrayList;
import java.util.List;

public class Main {
	/*
	* This Pattern helps to create a dynamic query based on your inputs.
	*/
	public static void main(String[] args) {
		QueryBuilder qb = new QueryBuilder();
		qb.select().table("employee").where().columnValueEqual("employee_id", 12345);
		System.out.println(qb.toString());
		
		qb = new QueryBuilder();
		List columns = new ArrayList();
		columns.add("employee_id");
		columns.add("employee_name");
		columns.add("employee_contact");
		qb.select(columns)
			.table("employee")
			.where()
			.columnValueEqual("employee_id", "12345")
			.and()
			.columnValueEqual("employee_name", "Navein")
			.and()
			.columnIsNull("employee_contact");
			
		System.out.println(qb.toString());
	}
}
