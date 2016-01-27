import java.util.List;

public class QueryBuilder {
	StringBuilder query;
	
	public QueryBuilder() {
		query = new StringBuilder();
	}
	
	public QueryBuilder select() {
		query.append("select * from");
		return this;
	}
	
	public QueryBuilder select(List columns) {
		query.append("select ");
		for (int i = 0; i < columns.size() ; i++)
		{
			query.append(columns.get(i));
			if(i < columns.size() - 1) {
				query.append(", ");
			}
		}
		query.append(" from");
		return this;
	}

	public QueryBuilder table(String tableName) {
		query.append(" ");
		query.append(tableName);
		return this;
	}
	
	public QueryBuilder where() {
		query.append(" ");
		query.append("where");
		return this;
	}
	
	public QueryBuilder and() {
		query.append(" ");
		query.append("and");
		return this;
	}
	
	public QueryBuilder columnValueEqual(String column, String value) {
		query.append(" ");
		query.append(column);
		query.append(" = ");
		query.append("'");
		query.append(value);
		query.append("'");
		return this;
	}
	
	public QueryBuilder columnValueEqual(String column, int value) {
		query.append(" ");
		query.append(column);
		query.append(" = ");
		query.append(value);
		return this;
	}
	
	public QueryBuilder columnIsNull(String column) {
		query.append(" ");
		query.append(column);
		query.append(" ");
		query.append("is null");
		return this;
	}
	
	public String toString() {
		return query.toString();
	}
}
