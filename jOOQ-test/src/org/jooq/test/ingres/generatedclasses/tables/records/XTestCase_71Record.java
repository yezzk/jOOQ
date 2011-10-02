/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class XTestCase_71Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = -1495406360;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_71.test_case_64_69_id]
	 * REFERENCES x_test_case_64_69 [test.x_test_case_64_69.id]
	 * </pre></code>
	 */
	public void setTestCase_64_69Id(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_71.test_case_64_69_id]
	 * REFERENCES x_test_case_64_69 [test.x_test_case_64_69.id]
	 * </pre></code>
	 */
	public java.lang.Integer getTestCase_64_69Id() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_71.test_case_64_69_id]
	 * REFERENCES x_test_case_64_69 [test.x_test_case_64_69.id]
	 * </pre></code>
	 */
	public org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_64_69Record fetchXTestCase_64_69() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.ingres.generatedclasses.tables.XTestCase_64_69.ID.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}

	/**
	 * Create an attached XTestCase_71Record
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public XTestCase_71Record(org.jooq.Configuration configuration) {
		super(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, configuration);
	}
}
