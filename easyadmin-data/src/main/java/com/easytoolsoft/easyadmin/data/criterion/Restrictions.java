package com.easytoolsoft.easyadmin.data.criterion;

import com.easytoolsoft.easyadmin.data.SortType;
import com.easytoolsoft.easyadmin.data.criterion.operands.AndConjOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.BetweenOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.Bracket;
import com.easytoolsoft.easyadmin.data.criterion.operands.BracketOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.ClauseOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.EqualOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.GreaterThanOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.GreaterThanOrEqualOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.GroupByOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.InOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.LessThanOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.LessThanOrEqualOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.LikeOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.NoneOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.NotEqualOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.NotInOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.NotLikeOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.OrConjOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.OrderByOperand;
import com.easytoolsoft.easyadmin.data.criterion.operands.SqlClause;

/**
 *
 * @author Tom Deng
 */
public class Restrictions {

	public static final NoneOperand None = new NoneOperand();
	public static final AndConjOperand And = new AndConjOperand();
	public static final OrConjOperand Or = new OrConjOperand();

	public static BetweenOperand between(String columnName, Object lowerValue, Object higherValue) {
		return new BetweenOperand(columnName, lowerValue, higherValue);
	}

	public static BracketOperand bracket(Bracket bracket) {
		return new BracketOperand(bracket);
	}

	public static EqualOperand equal(String columnName, Object columnValue) {
		return new EqualOperand(columnName, columnValue);
	}

	public static ClauseOperand clause(SqlClause sqlClause) {
		return new ClauseOperand(sqlClause);
	}

	public static GreaterThanOperand greaterThan(String columnName, Object columnValue) {
		return new GreaterThanOperand(columnName, columnValue);
	}

	public static GreaterThanOrEqualOperand greaterThanOrEqual(String columnName, Object columnValue) {
		return new GreaterThanOrEqualOperand(columnName, columnValue);
	}

	public static InOperand in(String columnName, Object columnValue) {
		return new InOperand(columnName, columnValue);
	}

	public static LessThanOperand lessThan(String columnName, Object columnValue) {
		return new LessThanOperand(columnName, columnValue);
	}

	public static LessThanOrEqualOperand lessThanOrEqual(String columnName, Object columnValue) {
		return new LessThanOrEqualOperand(columnName, columnValue);
	}

	public static LikeOperand like(String columnName, Object columnValue) {
		return new LikeOperand(columnName, columnValue);
	}

	public static NotEqualOperand notEqual(String columnName, Object columnValue) {
		return new NotEqualOperand(columnName, columnValue);
	}

	public static NotInOperand notIn(String columnName, Object columnValue) {
		return new NotInOperand(columnName, columnValue);
	}

	public static NotLikeOperand notLike(String columnName, Object columnValue) {
		return new NotLikeOperand(columnName, columnValue);
	}

	public static OrderByOperand orderBy(SortType sortType, String... columnNames) {
		return new OrderByOperand(sortType, columnNames);
	}

	public static GroupByOperand groupBy(String... columnNames) {
		return new GroupByOperand(columnNames);
	}
}
